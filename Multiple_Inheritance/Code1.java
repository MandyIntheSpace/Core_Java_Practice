package Multiple_Inheritance;

class f1Soft {
    void companyAmbition() {
        System.out.println("To connect people to financial services in simple, secure and affordable ways");
    }
}

class Department extends f1Soft {
    void departmentName() {
        System.out.println("Head Department");
    }
}

class CodingDepartment extends Department {
    void roleOfDepartment() {
        System.out.println("HR Department is meant for the strategic management of an company");
    }
}

class Test {
    public static void main(String[] args) {
        CodingDepartment codingDepartment = new CodingDepartment();
        codingDepartment.roleOfDepartment();
        codingDepartment.departmentName();
        codingDepartment.companyAmbition();
    }
}