package Exception_Handling.ExceptionHandling_Using_Finally;

public class Main {
    public static void main(String[] args) {
        try {
            int divide = 5 / 0;
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("AirthematicException => " + e.getMessage());

        } finally {
            System.out.println("This is the finally block");
        }
    }
}
