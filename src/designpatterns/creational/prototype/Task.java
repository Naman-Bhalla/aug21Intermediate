package designpatterns.creational.prototype;

public class Task {
    TaskType type;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAssignee() {
        return assignee;
    }

    public int getPoints() {
        return points;
    }

    private String title;
    private String description;
    private String assignee;
    private int points;

    public Task clone() {
        Task copy = new Task();
        copy.type = this.type;
        copy.assignee = this.assignee;
        copy.points = this.points;

        return copy;
    }
}
