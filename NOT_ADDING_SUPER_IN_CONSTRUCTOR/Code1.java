package NOT_ADDING_SUPER_IN_CONSTRUCTOR;

class f1Soft {
    f1Soft() {
        System.out.println("Coding for development of the country");
    }
}

class codingDepartment extends f1Soft {
    codingDepartment() {
        System.out.println("All companies need code in someway");
    }
}

public class Code1 {
    public static void main(String[] args) {
        codingDepartment codingDepartment = new codingDepartment();
    }
}
