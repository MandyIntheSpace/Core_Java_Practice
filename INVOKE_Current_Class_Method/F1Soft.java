package INVOKE_Current_Class_Method;

import java.util.Date;

public class F1Soft {
    Date joinDate;
    String name;
    String Department;
    int workingHours;

    public F1Soft(Date joinDate, String name, int WorkingHours) {
        this.joinDate = joinDate;
        this.name = name;
        this.workingHours = workingHours;
    }

    public F1Soft(Date joinDate, String name, String department, int workingHours) {
        this(joinDate, name, workingHours);
        this.Department = Department;
    }

    void displayInfo() {
        System.out.println(
                "Employee Name:" + name + "Employee Joining date:" + joinDate + "Working hours" + workingHours +
                        "Employee department: " + Department);
    }

    class EmployeeDetails {
        public static void main(String[] args) {
            F1Soft f1soft = new F1Soft(new Date(), "Mandip Timsina", 2);
            F1Soft f1soft1 = new F1Soft(new Date(), "F1Soft Internationals", 8);
            f1soft.displayInfo();
            f1soft1.displayInfo();
        }
    }

}
