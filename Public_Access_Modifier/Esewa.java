package Public_Access_Modifier;

public class Esewa {
    public static void main(String[] args) {
        Employee e = new Employee();
        //This give the value of the vertical in the employee class
        System.out.println(e.vertical); 
        //This will give the value of the department name which is in the emoloyee class
        e.departmentName();
    }
}
