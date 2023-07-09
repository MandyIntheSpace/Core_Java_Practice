package Final_Keyword;

//final method
public class Bank {
    final void fixedAccount() {
        System.out.println("You cannot withdraw money");
    }
}
class BankAccount extends Bank {
    void fixedAccount() { //Here we will get complile error
        System.out.println("You can withdraw after fixed mentioned tome!!");
    }
    public static void main(String[] args) {
        BankAccount bankaccount =  new BankAccount();
        bankaccount.fixedAccount();
    }
}
