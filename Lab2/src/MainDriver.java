import java.util.Scanner;

public class MainDriver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BankAccount[] accounts = new BankAccount[3];

        System.out.println("=== BANK ACCOUNT SYSTEM ===");

        for (int i = 0; i < accounts.length; i++) {

            while (accounts[i] == null) {

                try {
                    System.out.println("\nCreate Account " + (i + 1));

                    System.out.print("Enter account number (at least 9 digits): ");
                    String accountNumber = input.nextLine();

                    System.out.print("Enter account holder name: ");
                    String name = input.nextLine();

                    System.out.print("Enter initial balance: $");
                    double balance = Double.parseDouble(input.nextLine());

                    accounts[i] =
                            new BankAccount(accountNumber, name, balance);

                    System.out.println("Account created successfully.");

                } catch (NumberFormatException e) {

                    System.out.println(
                            "Error: Balance must be a valid number.");

                } catch (IllegalArgumentException e) {

                    System.out.println(
                            "Error: " + e.getMessage());
                }
            }
        }

        for (int i = 0; i < accounts.length; i++) {

            System.out.println(
                    "\n=== Transactions for Account "
                    + accounts[i].getAccountNumber() + " ===");

            try {

                System.out.print("Enter deposit amount: $");
                double depositAmount =
                        Double.parseDouble(input.nextLine());

                accounts[i].deposit(depositAmount);

                System.out.printf(
                        "Deposit successful. New balance: $%.2f%n",
                        accounts[i].getBalance());

            } catch (NumberFormatException e) {

                System.out.println(
                        "Error: Please enter a valid number.");

            } catch (IllegalArgumentException e) {

                System.out.println(
                        "Error: " + e.getMessage());

            } finally {

                System.out.println(
                        "Deposit transaction has been processed.");
            }

            try {

                System.out.print("Enter withdrawal amount: $");
                double withdrawalAmount =
                        Double.parseDouble(input.nextLine());

                accounts[i].withdraw(withdrawalAmount);

                System.out.printf(
                        "Withdrawal successful. New balance: $%.2f%n",
                        accounts[i].getBalance());

            } catch (NumberFormatException e) {

                System.out.println(
                        "Error: Please enter a valid number.");

            } catch (IllegalArgumentException e) {

                System.out.println(
                        "Error: " + e.getMessage());

            } catch (InsufficientFundsException e) {

                System.out.println(
                        "Banking Error: " + e.getMessage());

            } finally {

                System.out.println(
                        "Withdrawal transaction has been processed.");
            }
        }

        System.out.println("\n=== FINAL ACCOUNT INFORMATION ===");

        for (BankAccount account : accounts) {

            account.displayAccount();
            System.out.println();
        }

        input.close();

        System.out.println("Program completed.");
    }
}