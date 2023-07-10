package Hierarchical_Inheritance;

class f1Soft {
    void companyName() {
        System.out.println("F1Soft Internationals");
    }
}

class Department extends f1Soft {
    void DepartmentName() {
        System.out.println("Department is F1Soft Internationals");
    }
}

class Status extends f1Soft {
    void companyStatus() {
        System.out.println("The company status is making exceptional softwares");
    }
}

class Test {
    public static void main(String[] args) {
        Status status = new Status();
        status.companyStatus();
        status.companyName();

        Department department = new Department();
        department.DepartmentName();
        department.companyName();
    }
}