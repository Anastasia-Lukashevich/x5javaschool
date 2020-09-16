package homework5.task2;

public class Ram {
    private final String manufacturer;
    private final int memory;
    private final int frequency;
    private final String memoryType;

    public Ram(String manufacturer, int memory, int frequency, String memoryType) {
        this.manufacturer = manufacturer;
        this.memory = memory;
        this.frequency = frequency;
        this.memoryType = memoryType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getMemory() {
        return memory;
    }

    public int getFrequency() {
        return frequency;
    }

    public String getMemoryType() {
        return memoryType;
    }
}
