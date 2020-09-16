package homework5.task2;

public class Monitor {
    private final int screenDiagonal;
    private final int performance;

    public Monitor(int screenDiagonal, int performance) {
        this.screenDiagonal = screenDiagonal;
        this.performance = performance;
    }

    public int getScreenDiagonal() {
        return screenDiagonal;
    }

    public int getPerformance() {
        return performance;
    }
}
