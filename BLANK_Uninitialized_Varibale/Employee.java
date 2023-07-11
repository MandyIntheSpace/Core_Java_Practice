package BLANK_Uninitialized_Varibale;

public class Employee {
    public static final String SSN = null;
    int empid;
    String empName;
    final String PAN_CARD_NUMBER; // if we do not initialized the value it will show the compile error
    public String name;
    public String address;
    public String number;

    public Employee(String number) {
        this.PAN_CARD_NUMBER = number; // if we directly initialize the value or by initializing the value in the
                                       // constructoor then there will be no compile error
    }
}
