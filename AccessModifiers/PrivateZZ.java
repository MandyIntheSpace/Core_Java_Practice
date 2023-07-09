package AccessModifiers;

class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class PrivateZZ {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("F1Soft");
        System.out.println(employee.getName());
    }
}
