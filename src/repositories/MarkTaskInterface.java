package src.repositories;

/*
    Open/Closed Principle
        A interface MarkTask já possui suas funcionalidades abstratas definidas.
        Como é utilizada por outras classes, qualquer alteração pode forçá-las a implementar métodos desnecessários.
        Por isso, a interface permanece aberta para extensão, permitindo a adição de novos métodos abstratos sem impactar as classes existentes.

    Interface Segregation Principle
        Interface com métodos relacionados a manipulação do status das tarefas
*/

public interface MarkTaskInterface {
    void markTaskAsDone();
}
