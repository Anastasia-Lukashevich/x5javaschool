package homework5.task2;

public class GraphicsCard {
    private final String manufacturer;
    private final int memory;
    private final String memoryType;
    private final CoolingType cooling;

    public GraphicsCard(String manufacturer, int memory, String memoryType, CoolingType cooling) {
        this.manufacturer = manufacturer;
        this.memory = memory;
        this.memoryType = memoryType;
        this.cooling = cooling;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getMemory() {
        return memory;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public CoolingType getCooling() {
        return cooling;
    }

    public void renderGraphics() {
        cooling.cool();
    }
}
