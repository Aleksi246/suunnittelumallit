package t3;

public class Employee extends Component{
    private double salary;

    public Employee(String name, double salary){
        super(name);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void display(String indent){
        System.out.println(indent + "<Employee name=" + this.name + "><Employee>");
    }

    

    @Override
    public void add(Component component){
         throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public void remove(Component component){
         throw new UnsupportedOperationException("Not supported in leaf.");
    }
}
