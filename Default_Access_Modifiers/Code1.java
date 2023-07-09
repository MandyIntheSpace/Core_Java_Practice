package Default_Access_Modifiers;

public class Code1 {
    String vertical;

    void departmentName() {
        System.out.println("This is the F1Soft department");
    }
}

class F1Soft {
    public static void main(String[] args) {
        Code1 code = new Code1();
        code.departmentName();
    }
}