public class Todo extends Task {
    Todo(String taskName) {
        super(taskName);
    }

    public String toSaveString() {
        return "T@@" + (this.isDone() ? "1@@" : "0@@") + this.name;
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}