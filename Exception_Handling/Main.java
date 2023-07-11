package Exception_Handling;

public class Main {
    public static void main(String[] args) {
        try {
            int divide = 5 / 0;
            System.out.println("Handling Exception");
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("AirthematicException => " + e.getMessage());

        }
    }
}
