package homework5.task2;

public class RamDimmFactory implements RamFactory {

    @Override
    public Ram createRam() {
        return new RamDimm();
    }
}
