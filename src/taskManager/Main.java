package src.taskManager;

import src.domains.Task;
import src.repositories.TaskPrinterInterface;
import src.services.TaskManager;
import src.services.TaskPrinter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        /*
            Dependence Inversion Principle
            Na classe Main, as chamadas dependem das abstrações da interface TasksPrinterInterface.
            Isso reduz o acoplamento entre as classes, tornando a aplicação mais flexível.
            Dessa forma, é possível realizar modificações nas classes sem risco de quebrar o código.
         */
        TaskPrinterInterface taskPrinterInterface = new TaskPrinter();

        do {
            System.out.println("\n===== MENU DE TAREFAS =====");
            System.out.println("Escolha a tarefa desejada:" +
                    "\n1. Criar tarefa" +
                    "\n2. Listar tarefas" +
                    "\n3. Concluir tarefa" +
                    "\n4. Filtrar tarefa" +
                    "\n0. Sair");
            int taskOption = scanner.nextInt();
            scanner.nextLine();

            if (taskOption == 1) {
                System.out.println("\n===== CRIANDO TAREFA =====");
                System.out.println("Descrição da Tarefa: ");
                String taskDescription = scanner.nextLine();
                System.out.println("Prioridade da tarefa: ");
                String taskPriority = scanner.nextLine();
                taskManager.addNewTask(new Task(taskDescription, taskPriority));
            } else if (taskOption == 2) {

                //Aplicação de Polimorfismo e Inversão de Dependência

                System.out.println("===== LISTA DE TAREFAS =====");
                taskPrinterInterface.printTasks(taskManager.getAllTasks());
            } else if (taskOption == 3) {

                //Aplicação de Polimorfismo e Inversão de Dependência

                System.out.println("===== CONCLUIR TAREFAS =====");
                taskPrinterInterface.printTasks(taskManager.getAllTasks());
                System.out.print("Digite o número da tarefa finalizada: ");
                int index = scanner.nextInt();
                if (index >= 0 && index < taskManager.getAllTasks().size()) {
                    taskManager.getAllTasks().get(index).markTaskAsDone();
                } else {
                    System.out.println("Número inválido");
                }
            } else if (taskOption == 4) {
                System.out.println("===== FILTRO DE TAREFAS =====");
                System.out.print("Digite a prioridade filtrada: ");
                String taskFilter = scanner.nextLine();

                //Aplicação de Polimorfismo e Inversão de Dependência

                taskPrinterInterface.printTasks(taskManager.filterTaskByPriority(taskFilter));
            } else if (taskOption == 0) {
                System.out.println("Serviço Encerrado");
                return;
            } else {
                System.out.println("Opção não disponivel. Escolha novamente.");
            }
        } while (true);

    }
}

