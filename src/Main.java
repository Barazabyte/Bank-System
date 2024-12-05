import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaration of useful variables
            double amount;
            int choice;
            double balance = 0D;
            String newPassword;
            String password = "1234";
            String inputPassword;

        BankAccount account = new BankAccount();

        // Loop for repeat display
            do {
                // Creating a Print on Screen
                System.out.println("\n");
                System.out.println("+----------------------------------------------+");
                System.out.println("\t WELCOME TO BARAZA'S BANK SYSTEM ");
                System.out.println("+----------------------------------------------+");

                System.out.println("   0. Register New Account");
                System.out.println("   1. Check Balance");
                System.out.println("   2. Withdraw Money");
                System.out.println("   3. Deposit Money");
                System.out.println("   4. Change Password");
                System.out.println("   5. Exit");

                System.out.println("+----------------------------------------------+");
                System.out.print(" Choice : ");
                choice = input.nextInt();

                switch (choice) {
                    case 0:
                        System.out.print(" Account new Balance : ");
                        balance = input.nextDouble();
                        account.setBalance(balance);

                        System.out.print(" Account Password : ");
                        password = input.next();
                        account.setPassword(password);
                        System.out.println(" Created Successively");
                        break;

                    case 1:
                        System.out.print(" Password : ");
                        inputPassword = input.next();
                            if(inputPassword.equals(account.getPassword())) {
                                System.out.println(" Account Balance : " + account.getBalance());
                            } else {
                                System.out.println(" Account Password Incorrect");
                            }
                        break;

                    case 2:
                        System.out.print(" Account Password : ");
                        inputPassword = input.next();
                            if(inputPassword.equals(account.getPassword())) {
                                System.out.println(" Available Cash : " + account.getBalance());
                                System.out.print(" Amount : ");
                                amount = input.nextDouble();
                                account.withDraw(amount);
                            }
                        break;

                    case 3:
                        System.out.print(" Password : ");
                        inputPassword = input.next();
                            if(inputPassword.equals(account.getPassword())) {
                                System.out.print(" Deposit Amount : ");
                                amount = input.nextDouble();
                                account.deposit(amount);
                            } else {
                                System.out.println(" Account Password Incorrect");
                            }
                        break;

                    case 4:
                        System.out.print(" Old Password : ");
                        inputPassword = input.next();
                            if(inputPassword.equals(account.getPassword())) {
                                System.out.print(" New Password : ");
                                newPassword = input.next();
                                account.setPassword(newPassword);
                                newPassword = account.getPassword();
                                account.changePass(newPassword);
                            }
                            break;

                    default:
                        System.out.println(" ");

                }

            } while(choice != 5 || choice < 0 || choice > 5);



    }
}