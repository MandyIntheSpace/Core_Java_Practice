package Final_Keyword;

//Java final class
final class finalBank {
    void fixedAccount() {
        System.out.println("You cannot withdraw money!!");
    }
}

class BankAccount extends finalBank {
    void fixedAccount() {
        System.out.println("You can withdraw your money after fixed mentioned time");
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.fixedAccount();
    }
}
