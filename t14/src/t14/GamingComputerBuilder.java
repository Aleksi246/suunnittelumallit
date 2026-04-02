package t14;

public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder(){
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor(){
        this.computer.setProcessor("quad core thread ripper");
    }

    @Override
    public void buildRAM(){
        this.computer.setRam("8gb ddr3");
    }

    @Override
    public void buildHardDrive(){
        this.computer.setHarddrive("512 GB ssd");
    }
    @Override
    public void buildGPU(){
        this.computer.setGpu("NVIDIA g force 400");
    }
    @Override
    public void buildOS(){
        this.computer.setOs("windows");
    }
    @Override
    public Computer getComputer(){
        return this.computer;
    }


}
