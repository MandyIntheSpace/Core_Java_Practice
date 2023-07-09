package Static_Keyword;

public class ITCompany {
    int empid;
    String empName;
    static String companyName = "F1Soft"; // Static variable get memory once

    public ITCompany(int empid, String empName) {
        this.empid = empid;
        this.empName = empName;
    }

    void display() {
        System.out.println("Employee id:" + this.empid + "Employee name:" + this.empName
                + "Company Name:" + this.companyName);
    }

    public static void main(String[] args) {
        ITCompany itcompany = new ITCompany(1, "Mandip Timsina");
        ITCompany itcompany2 = new ITCompany(2, "Rewon Timsina");
        itcompany.display();
        itcompany2.display();
    }
}
