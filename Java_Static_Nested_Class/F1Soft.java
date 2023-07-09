package Java_Static_Nested_Class;

public class F1Soft {
    class FoneLoanDepartment {
        public void displayInfo() {
            System.out.println("I am from loan department");
        }
    }

    static class HRDepartment {
        public void displayInfo() {
            System.out.println("I am from HR department");
        }
    }
}

class company {
    public static void main(String[] args) {
        // object creation of the outer class
        F1Soft f1soft = new F1Soft();
        // Object creation of the non-static class
        F1Soft.FoneLoanDepartment fn = f1soft.new FoneLoanDepartment();
        fn.displayInfo();
        // object creation of static nested class
        F1Soft.HRDepartment hr = new F1Soft.HRDepartment();
        hr.displayInfo();
    }
}
