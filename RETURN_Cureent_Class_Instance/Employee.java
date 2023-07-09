package RETURN_Cureent_Class_Instance;

public class Employee {
    Employee getEmployee() {
        return this;
    }

    void displayInformation() {
        System.out.println("Welcome");
    }
}

class Test {
    public static void main(String[] args) {
        new Employee().getEmployee().displayInformation();
    }
}
