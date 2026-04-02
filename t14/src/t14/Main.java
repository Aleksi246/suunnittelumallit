package t14;

public class Main {
    public static void main(String[] args) {
        
        // Gaming PC
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector director1 = new ComputerDirector(gamingBuilder);

        director1.ConstructComputer();
        System.out.println(gamingBuilder.getComputer());

        // Office PC
        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        ComputerDirector director2 = new ComputerDirector(officeBuilder);

        director2.ConstructComputer();
        System.out.println(officeBuilder.getComputer());
    }
}
