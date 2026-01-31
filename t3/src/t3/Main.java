package t3;

public class Main {

    public static void main(String[] args) {
        Component dep1 = new Department("dep1");
        Component dep2 = new Department("dep2");
        Component dep3 = new Department("dep3");
        Component dep4 = new Department("dep4");
        Component dep5 = new Department("dep5");

        Component emp1 = new Employee("emp1", 1);
        Component emp2 = new Employee("emp2", 2);
        Component emp3 = new Employee("emp3", 3);
        Component emp4 = new Employee("emp4", 4);
        Component emp5 = new Employee("emp5", 5);

        dep5.add(emp5);
        dep5.add(emp4);

        dep3.add(dep5);
        dep3.add(dep4);

        dep1.add(dep3);
        dep1.add(dep2);

        dep2.add(emp2);
        dep2.add(emp3);

        dep1.add(emp1);

        System.out.println(dep1.getSalary());

        dep1.display("");

        dep3.remove(dep5);

        System.out.println(dep1.getSalary());

        dep1.display("");
    }
    
}
