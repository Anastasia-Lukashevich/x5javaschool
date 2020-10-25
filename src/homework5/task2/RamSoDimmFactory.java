package homework5.task2;

public class RamSoDimmFactory implements RamFactory {

    @Override
    public Ram createRam() {
        return new RamSoDimm();
    }
}
