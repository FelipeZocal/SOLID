package src.domains;

import src.repositories.MarkTaskInterface;
import src.repositories.PrintTaskInterface;

/*
    Single Responsibility Principle
        A classe tem a responsabilidade exclusiva de representar a entidade Task e seus métodos fundamentais.

    Open/Closed Principle
        A classe Task já possui suas funcionalidades e atributos bem definidos.
        Como é utilizada por outras classes, como TaskPrinter e TaskManager, qualquer modificação pode gerar problemas de compatibilidade.
        No entanto, ela permanece aberta para extensão, permitindo a adição de novas funcionalidades em classes derivadas sem impactar seu uso nas classes existentes.
*/

public class Task implements MarkTaskInterface, PrintTaskInterface {
    private String description;
    private String priority;
    private boolean status;

    public Task(String description, String priority) {
        this.description = description;
        this.priority = priority;
        this.status = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public void markTaskAsDone() {
        this.status = true;
    }

    @Override
    public void print() {
        System.out.println("[" + (status ? "X" : " ") + "] " + description + " (Prioridade: " + priority + ")");
    }

}
