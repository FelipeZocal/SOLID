package src.repositories;

import src.domains.Task;

import java.util.List;

public interface TaskPrinterInterface {
    void printTasks(List<Task> tasks);
}

