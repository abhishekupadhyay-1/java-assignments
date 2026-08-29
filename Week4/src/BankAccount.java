public class BankAccount {
  class Account {
    private String accNo;
    private String accHolder;
    private double balance;

    Account(String accNo, String accHolder) {
      this.accNo = accNo;
      this.accHolder = accHolder;
      balance = 0;
    }

    Account(String accNo, String accHolder, double balance) {
      this.accNo = accNo;
      this.accHolder = accHolder;
      if (balance < 0) {
        System.err.println("Opening balance cannot be negative");
        this.balance = 0;
      } else {
        this.balance = balance;
      }
    }

    public boolean deposit(double amount) {
      if (amount <= 0) {
        return false;
      }
      balance += amount;
      return true;
    }

    public boolean withdrawl(double amount) {
      if (amount <= 0 || amount > balance) {
        return false;
      }
      balance -= amount;
      return true;
    }

    public String getAccountNumber() {
      return accNo;
    }

    public String getOwnerName() {
      return accHolder;
    }

    public double getBalance() {
      return balance;
    }

    public String toString() {
      return "Account Number: " + accNo +
          ", Owner: " + accHolder +
          ", Balance: " + balance;
    }
  }

  public void BankAccount_func() {

    Account acc1 = new Account("001", "Abhishek Daddy Pandat");
    Account acc2 = new Account("454", "Blue man", 1000);

    System.out.println("Account 1 -> " + acc1);
    System.out.println("Account 2 -> " + acc2);

    System.out.println("\nDepositing 500: " + acc1.deposit(500) +
        "\nDepositing 0: " + acc1.deposit(0) +
        "\nDepositing -100: " + acc1.deposit(-100));

    System.out.println("\nWithdrawing 200: " + acc1.withdrawl(200) +
        "\nWithdrawing 1000: " + acc1.withdrawl(1000));

    System.out.println("\nFinal accounts:");
    System.out.println(acc1 + "\n" + acc2);

    acc2.deposit(500);

    System.out.println("\nAfter depositing 500 into account 2:");
    System.out.println(acc1 + "\n" + acc2);
  }
}