import java.util.Objects;

public class Task {
    private int a;
    private int b;

    public Task(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return a == task.a && b == task.b || b==task.a && a== task.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a)+Objects.hash(b);
    }

    @Override
    public String toString() {
        return a +"*"+ b;
    }
}
