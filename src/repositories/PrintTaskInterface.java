package src.repositories;

/*
    Open/Closed Principle
        A interface PrintTask já possui suas funcionalidades abstratas definidas.
        Como é utilizada por outras classes, qualquer modificação pode obrigá-las a implementar métodos que não são necessários.
        Por isso, a interface está aberta para extensão, permitindo a adição de novos métodos abstratos conforme necessário, sem impactar as classes existentes.

    Interface Segregation Principle
        Interface com métodos relacionados a exibição de interfaces de texto para cada tarefa
*/

public interface PrintTaskInterface {
    void print();
}
