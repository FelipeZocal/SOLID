package src.services;

import src.domains.Task;

import java.util.ArrayList;
import java.util.List;

/*
    Single Responsibility Principle
        A classe tem a responsabilidade exclusiva de fornecer métodos para gerenciar o controle de tarefas.
        Dessa forma, ela só precisa ser modificada quando houver alterações relacionadas à gestão de objetos do tipo Task.

    Open/Closed Principle
        A classe de serviço TaskManager possui suas funcionalidades e características bem definidas.
        Ela está aberta para extensão, permitindo a adição de novas funcionalidades específicas sem impactar seu uso por outras classes.
*/

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    /*
        Single Responsibility Principle
        - Metodo responsavel por adiocionar novas Tasks em grupos de Tasks
    */

    public void addNewTask(Task task) {
        tasks.add(task);
    }

    /*
        Single Responsibility Principle
        - Metodo responsavel por retornar um agrupamento de objetos do tipo Task
    */

    public List<Task> getAllTasks() {
        return tasks;
    }

    /*
        Single Responsibility Principle
        - Metodo responsavel por retornar um agrupamento de objetos do tipo Task com  um filtro de acordo com a prioridade escolhida nos objetos
    */

    public List<Task> filterTaskByPriority(String priority) {
        List<Task> filterList = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getPriority().equalsIgnoreCase(priority)) {
                filterList.add(task);
            }
        }
        return filterList;
    }
}
