public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("Account Holder");
        System.out.println(myAccount.getOwner());
        System.out.println(myAccount.getBalance());

        BankAccount richAccount = new BankAccount("Account Holder", 400);
        System.out.println(richAccount.getOwner());
        System.out.println(richAccount.getBalance());

        richAccount.deposit(50);
        System.out.println(richAccount.getBalance());
        richAccount.withdraw(50);
        System.out.println(richAccount.getBalance());

        richAccount.withdraw(-20);

        richAccount.deposit(-20);

        richAccount.withdraw(60000);



    }


}
