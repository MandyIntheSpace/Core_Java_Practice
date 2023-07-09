package PrivateAccessModifiers;


//For example this will be the error code as 
//we are trying to access the private access modifiers code

class Employee {
    private String name;
}

public class PrivateZ{
    public static void main(String[] args) {
        Employee employee = new Employee();
        //Since name variable with the private modifiers
        employee.name = "F1Soft";
    }
}


