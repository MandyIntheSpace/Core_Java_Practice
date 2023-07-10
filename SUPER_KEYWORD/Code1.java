package SUPER_KEYWORD;

class F1Soft {
    String department = "HR Department";
}

class CodingDepartment extends F1Soft {
    String department = "Coding Department";

    public void displayDepartement() {
        System.out.println(department);
        System.out.println(super.department);
    }
}

public class Code1 {
    public static void main(String[] args) {
        CodingDepartment codingDepartment = new CodingDepartment();
        codingDepartment.displayDepartement();
    }
}
