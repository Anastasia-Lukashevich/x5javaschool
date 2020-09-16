package homework5.task2;

public class Cpu {
    private final int clockFrequency;
    private final int numOfCores;
    private final int cacheMemory;
    private final String name;
    private final String manufacturer;

    public Cpu(int clockFrequency, int numOfCores, int cacheMemory, String name, String manufacturer) {
        this.clockFrequency = clockFrequency;
        this.numOfCores = numOfCores;
        this.cacheMemory = cacheMemory;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public int getClockFrequency() {
        return clockFrequency;
    }

    public int getNumOfCores() {
        return numOfCores;
    }

    public int getCacheMemory() {
        return cacheMemory;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
