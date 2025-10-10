import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class  Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🏦 Welcome to A Simple Banking App 🏦");

        // Step 1: Create an account
        System.out.print("Enter your ID number(NUMBER ONLY): ");
        int id = sc.nextInt();
        sc.nextLine(); // clear newline

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        System.out.print("Enter your national identity number: ");
        String identity = sc.nextLine();

        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dobInput = sc.nextLine();
        LocalDate dob = LocalDate.parse(dobInput);

        System.out.print("Enter your desired account number: ");
        String accountNumber = sc.nextLine();

        // Create account (balance starts at 0)
        Account acc = new Account(id, name, identity, dob, accountNumber);

        System.out.println("\n✅ Account created successfully!");
        System.out.println(acc);

        // Step 2: Menu
        boolean running = true;
        while (running) {
            System.out.println("\n==============================");
            System.out.println("🏦 Banking Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Show Account Details");
            System.out.println("5. Exit");
            System.out.println("==============================");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    BigDecimal depAmt = sc.nextBigDecimal();
                    acc.deposit(depAmt);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    BigDecimal wAmt = sc.nextBigDecimal();
                    acc.withdraw(wAmt);
                    break;

                case 3:
                    System.out.println("💰 Current balance: " + acc.getBalance());
                    break;

                case 4:
                    System.out.println(acc);
                    break;

                case 5:
                    System.out.println("👋 Thank you for using Simple Banking App!");
                    running = false;
                    break;

                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
