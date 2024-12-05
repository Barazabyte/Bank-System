public class BankAccount {
    // Declaration of Class attributes
    private String password;
    private double balance;

    // set Balance
    public double setBalance( double balance ) {
        this.balance = balance;
        return this.balance;
    }

    // set Password
    public void setPassword( String pass ) {
        this.password = pass;
    }

    // get getBalance
    public double getBalance() {
        return balance;
    }

    // get Password
    public String getPassword() {
        return password;
    }

    // Declaration of withdraw Function
    public void withDraw(double amount) {
        if(this.balance > amount) {
            double netCash = this.balance -= amount;
            System.out.println(" " + amount + " have been withDrawn, new Balance = " + netCash);

        }
        else {
            System.out.println(" Out Of Balance ");
        }

    }

    // Declaration of Deposit Function
    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
            System.out.println(" Deposited Successively, new Balance = " + this.balance);

        } else {
            System.out.println(" Too small Deposit Balance ");
        }

    }

    // Declaration of Change Password function
    public void changePass(String newPass) {
        String oldPass = this.password;
        this.password = newPass;
        System.out.println(" Password Changed Password to " + this.password);
    }

};