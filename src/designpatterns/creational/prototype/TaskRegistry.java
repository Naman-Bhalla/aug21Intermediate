package designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class TaskRegistry {
    Map<TaskType, Task> tasks = new HashMap<>();

    void register(TaskType type, Task task) {
        tasks.put(type, task);
    }

    Task get(TaskType type) {
        return tasks.get(type);
    }
}
