package src.services;

import src.domains.Task;
import src.repositories.TaskPrinterInterface;

import java.util.List;

/*
    Single Responsibility Principle
        A classe tem a responsabilidade exclusiva de manipular métodos relacionados à impressão de tarefas.
        Dessa forma, ela só precisa ser alterada quando houver mudanças na exibição de objetos do tipo Task.

    Open/Closed Principle
        A classe de serviço TaskPrinter possui suas funcionalidades e características bem definidas.
        Ela está aberta para extensão, permitindo a adição de novas funcionalidades específicas sem comprometer seu uso por outras classes.
*/

public class TaskPrinter implements TaskPrinterInterface {

    /*
       Single Responsibility Principle
       Metodo possui responsabilidade única de imprimir Listas de Tasks

       Liskov Substitution Principle
            A Classe TaskPrinter define um contrato com a TasksPrinterInterface
            O metodo implementado segue as regras do princípio de Liskov
            Os parâmetros utilizados no métodos são identicos a sua superclasse
            Não possui pré ou poós condições adicionais
            Não quebra o código ao ser realizado a substituição

       Interface Segregation Principle
            Implementação do metodo da interface TasksPrinterInterface
            Sem necessidade de implementar métodos desnecessários

       Dependence Inversion Principle
            Implementação da Interface TasksPrinterInterface
            Inverte a dependência das Classes de alto nível e baixo nivel

   */

    @Override
    public void printTasks(List<Task> tasks) {
        for (Task task : tasks) {
            task.print();
        }
    }
}