package SUPER_INVOKE_PARENT_CLASS;

class f1Soft {
    void ambition() {
        System.out.println("To connect people to financial services in simple, secure and affordable ways");
    }
}

class HRDepartment extends f1Soft {
    void ambition() {
        System.out.println("Encourage consistent employee engagement and support strong company culture");
    }

    void role() {
        System.out.println(
                "Maintain productivity by providing the company witn an adequate number of skilled and efficient workers");
    }

    void work() {
        super.ambition();
        role();
    }
}

public class Code1 {
    public static void main(String[] args) {
        HRDepartment hrdepartment = new HRDepartment();
        hrdepartment.work();
    }
}
