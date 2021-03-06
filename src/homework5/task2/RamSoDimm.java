package homework5.task2;

public class RamSoDimm implements Ram {
    private final String manufacturer = "IBM";
    private final int memory = 900;
    private final int frequency = 670;
    private final String memoryType = "SO-DIMM";

    public RamSoDimm () {
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
