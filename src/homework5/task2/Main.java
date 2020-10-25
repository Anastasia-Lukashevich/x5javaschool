package homework5.task2;

public class Main {
    public static void main(String[] args) {
        RamFactory factory = new RamDimmFactory();
        Computer computer1 = new Computer(
                new Cpu(10, 15, 500, "Intel Core", "Intel"),
                factory,
                new GraphicsCard("NVIDEA", 900, "GDDR3", CoolingType.ACTIVE),
                new Monitor(18, 1000),
                new StorageDevice("Samsung", 500, "NAND", DeviceType.SSD, "XT"));

        Computer computer2 = new Computer(
                new Cpu(10, 15, 500, "Intel Core", "Intel"),
                factory,
                new GraphicsCard("NVIDEA", 900, "GDDR3", CoolingType.PASSIVE),
                new Monitor(18, 1000),
                new StorageDevice("Samsung", 500, "NAND", DeviceType.SSD, "XT"));

        computer1.work();
        computer2.work();

    }


}
