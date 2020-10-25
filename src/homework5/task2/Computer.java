package homework5.task2;

public class Computer {
    private final Cpu cpu;
    private final RamFactory ram;
    private final GraphicsCard graphicsCard;
    private final Monitor monitor;
    private final StorageDevice storageDevice;

    public Computer(Cpu cpu, RamFactory ram, GraphicsCard graphicsCard, Monitor monitor, StorageDevice storageDevice) {
        this.cpu = cpu;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.monitor = monitor;
        this.storageDevice = storageDevice;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public RamFactory getRam() {
        return ram;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public StorageDevice getStorageDevice() {
        return storageDevice;
    }

    public void work() {
        graphicsCard.renderGraphics();
    }
}
