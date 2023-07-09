package This_Keyword;

public class Employee {
    int empid;
    String name;
    float salary;

    public Employee(int empid, String name, float salary) {
        // Int this code here we cannot distinguished between the local varibale and
        // instance varibale
        // so the we do not get any error but we also do not get any approproate result
        empid = empid;
        name = name;
        salary = salary;
    }

    void displayInfo() {
        System.out.println("EmployeeId:" + empid + "Employee name:" + name +
                "Employee salary:" + salary);
    }

}

class Test {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Mandip Timsina", 180000);
        Employee employee1 = new Employee(2, "F1Soft Department", 2000000);
        employee.displayInfo();
        employee1.displayInfo();
    }
}
