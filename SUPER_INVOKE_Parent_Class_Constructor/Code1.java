package SUPER_INVOKE_Parent_Class_Constructor;

class F1Soft {
    public F1Soft() {
        System.out.println("Develope softwrae for Nepelese banks for finance comapnies");
    }
}

class CodingDepartment extends F1Soft {
    CodingDepartment() {
        super();
        System.out.println("Code to develope software");
    }
}

public class Code1 {
    public static void main(String[] args) {
        CodingDepartment codingDepartment = new CodingDepartment();
    }
}

/*
 * Note :
 * super() is addedd in each class constructor automatically by compiler
 * if there is no super() or this()
 */
