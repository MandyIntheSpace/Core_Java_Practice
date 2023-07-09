package Final_Keyword;

public class FinalMethodOverriding {
    final void fixedAccount() {
        System.out.println("You cannot withdraw money");
    }
}

class BankAccount extends FinalMethodOverriding {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.fixedAccount();
    }
}