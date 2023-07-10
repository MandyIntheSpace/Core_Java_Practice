package Method_Overloading_changing_data_type_of_arguments;

class Employee {
    static int totalSalary(int salary, int bonus) {
        return salary + bonus;
    }

    static double totalSalary(double salary, double bonus) {
        return salary + bonus;
    }

}

class Test {
    public static void main(String[] args) {
        System.out.println(Employee.totalSalary(20000, 300000));
        System.out.println(Employee.totalSalary(10000, 30000));
    }
}