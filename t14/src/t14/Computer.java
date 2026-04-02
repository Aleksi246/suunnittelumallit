package t14;

public class Computer {
    private String processor;
    private String ram;
    private String harddrive;
    private String gpu;
    private String os;

    public Computer(){

    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setHarddrive(String harddrive) {
        this.harddrive = harddrive;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setOs(String os) {
        this.os = os;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", harddrive='" + harddrive + '\'' +
                ", gpu='" + gpu + '\'' +
                ", os='" + os + '\'' +
                '}';
    }

}
