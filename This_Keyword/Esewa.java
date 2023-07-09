package This_Keyword;

public class Esewa {
    int empid;
    String name;
    float salary;

    public Esewa(int empid, String name, float salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    void valuechecker() {
        System.out.println("This is :" + this.empid);
    }

    void displayInfo() {
        System.out.println("Employee id:" + empid + "Employee name:" + name +
                "Employee salary:" + salary);
    }
}

class Test {
    public static void main(String[] args) {
        Esewa esewa = new Esewa(1, "Mandip Timsina", 180000);
        Esewa esewa1 = new Esewa(2, "F1Soft Internationals", 200000);
        esewa.displayInfo();
        esewa1.displayInfo();

    }
}
