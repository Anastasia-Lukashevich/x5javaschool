package homework5.task2;

public class StorageDevice {
    private final String manufacturer;
    private final int memory;
    private final String memoryType;
    private final DeviceType deviceType;
    private final String formFactor;

    public StorageDevice(String manufacturer, int memory, String memoryType, DeviceType deviceType, String formFactor) {
        this.manufacturer = manufacturer;
        this.memory = memory;
        this.memoryType = memoryType;
        this.deviceType = deviceType;
        this.formFactor = formFactor;
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

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public String getFormFactor() {
        return formFactor;
    }
}
