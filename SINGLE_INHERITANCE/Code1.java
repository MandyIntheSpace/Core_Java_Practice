package SINGLE_INHERITANCE;

class Department {
    void departmentName() {
        System.out.println("Head Department");
    }
}

class CodingDepartment extends Department {
    void roleOfDepartment() {
        System.out.println("HR Department is meant for strateic management of an organization");
    }
}

class Company {
    public static void main(String[] args) {
        CodingDepartment codingDepartment = new CodingDepartment();
        codingDepartment.departmentName();
        codingDepartment.roleOfDepartment();
    }
}