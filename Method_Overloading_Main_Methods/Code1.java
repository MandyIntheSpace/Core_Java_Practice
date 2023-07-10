package Method_Overloading_Main_Methods;

public class Code1 {
    public static void main(String[] args) {
        System.out.println("Main method with string array");
    }

    public static void main(String args) {
        System.out.println("Main method with string only");
    }

    public static void main() {
        System.out.println("Main method without args");
    }

}
