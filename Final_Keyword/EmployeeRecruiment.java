package Final_Keyword;

//Final Variable
public class EmployeeRecruiment {
    final int minimumAgeLimit = 14;

    void ageEligibility() {
        minimumAgeLimit = 15; // -----> Compile error: cannot assign a value to final variable
                              // 'minimumAgeLimit'
    }

    public static void main(String[] args) {
        EmployeeRecruiment employeeRecruiment = new EmployeeRecruiment();
        employeeRecruiment.ageEligibility();
    }
}
