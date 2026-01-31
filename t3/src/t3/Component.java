package t3;

public abstract class Component {
    protected String name;

    public Component(String name){
        this.name = name;
    }

    public abstract void display(String indent);

    public abstract double getSalary();

    public abstract void add(Component component);

    public abstract void remove(Component component);

}
