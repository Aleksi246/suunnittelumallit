package t14;

public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder(){
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor(){
        this.computer.setProcessor("dual core intel");
    }

    @Override
    public void buildRAM(){
        this.computer.setRam("4gb ddr2");
    }

    @Override
    public void buildHardDrive(){
        this.computer.setHarddrive("1024 GB hdd");
    }
    @Override
    public void buildGPU(){
        this.computer.setGpu("Radeon 9550");
    }
    @Override
    public void buildOS(){
        this.computer.setOs("linux");
    }
    @Override
    public Computer getComputer(){
        return this.computer;
    }
    
}
