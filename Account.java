package GuviTask2;

    public class Account {
        private double balance;

        // No-argument constructor (default balance 0)
        public Account() {
            this.balance = 0.0;
        }

        // Constructor with argument (initial balance)
        public Account(double initialBalance) {
            this.balance = initialBalance;
        }

        // Method to deposit amount to the account
        public void deposit(double amount) {
            if (amount > 0) {
                this.balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        // Method to withdraw amount from the account
        public void withdraw(double amount) {
            if (amount > 0 && amount <= this.balance) {
                this.balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else if (amount > this.balance) {
                System.out.println("Insufficient balance.");
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        }

        // Method to display the balance
        public void displayBalance() {
            System.out.println("Current balance: " + this.balance);
        }

        public static void main(String[] args) {
            // Demonstrate no-argument constructor
            Account account1 = new Account();
            account1.displayBalance(); // Should show 0.0

            // Deposit and withdraw
            account1.deposit(1000.0);
            account1.displayBalance(); // Should show 1000.0
            account1.withdraw(500.0);
            account1.displayBalance(); // Should show 500.0

            // Demonstrate constructor with argument
            Account account2 = new Account(2000.0);
            account2.displayBalance(); // Should show 2000.0
            account2.deposit(300.0);
            account2.displayBalance(); // Should show 2300.0
            account2.withdraw(2500.0); // Insufficient, should remain 2300.0
            account2.displayBalance();
        }
    }
