package ExceptionHandling_Using_Throw;

public class Demo {
    public static void divideByZero() {
        throw new ArithmeticException("Trying to divide with zero");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.divideByZero();
    }
}
