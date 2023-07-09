

package Protected_Access_Modifier;

import Protected_Access_Modifier.Employee;

public class Esewa extends Employee {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.departmentName(); //This line will cause error

        Esewa esewa = new Esewa();
        esewa.departmentName(); //This line will not cause an error
    }
}
