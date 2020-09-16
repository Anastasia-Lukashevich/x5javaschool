package homework5.task2;

public enum CoolingType {
    ACTIVE {
        @Override
        public void cool() {
            System.out.println("Active cooling.");
        }
    }, PASSIVE {
        @Override
        public void cool() {
            System.out.println("Passive cooling.");
        }
    };

    public abstract void cool();
}
