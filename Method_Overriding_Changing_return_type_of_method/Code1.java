package Method_Overriding_Changing_return_type_of_method;

class Employee {
    static int totalSalary(int salary, int bonus) {
        return salary + bonus;
    }
    static double totalSalary(int salary, int bonus) {
        return salary + bonus;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(Employee.totalSalary(2000, 30000));
    }
}

