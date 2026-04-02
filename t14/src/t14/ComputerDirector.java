package t14;

public class ComputerDirector {
    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }
    
    public void ConstructComputer(){
        builder.buildProcessor();
        builder.buildRAM();
        builder.buildHardDrive();
        builder.buildGPU();
        builder.buildOS();
    }
}
