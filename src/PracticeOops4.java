import java.util.ArrayList;

public class PracticeOops4 {

    public static void main(String[] args) {

    Bank bank= new Bank();
    Account A1= new Account("Ashish1",1000.00,11);
    Account A2= new Account("Ashish2",1000.00,12);
    Account A3= new Account("Ashish3",1000.00,13);

    bank.addAccount(A1);
    bank.addAccount(A2);
    bank.addAccount(A3);



    ArrayList<Account> acc= bank.getAccounts();
    for(Account a: acc){
        System.out.println(a.getAcDetails());
    }
    bank.depositMoney(A1,11);
    bank.withdrawMoney(A3,99);

        for(Account a: acc){
            System.out.println(a.getAcDetails());
        }

    }

}
class Bank{
    ArrayList<Account> accounts= new ArrayList<>();

    public Bank() {
        accounts= new ArrayList<Account>();

    }
    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void depositMoney(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdrawMoney(Account account, double amount) {
        account.withdraw(amount);
    }

    public ArrayList < Account > getAccounts() {
        return accounts;
    }
}
class Account {

    String accountHolderName;
    double money;
    int accountNo;
    ArrayList<Account> acDetails= new ArrayList<>();

    public Account(String accountHolderName, double money, int accountNo) {
        this.accountHolderName = accountHolderName;
        this.money = money;
        this.accountNo = accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public void deposit(double amount) {
        money += amount;
    }
    public void withdraw(double amount) {
        money -= amount;
    }
    public String getAcDetails() {
        return ("Name "+ accountHolderName +" Balance:" +money + " Account Number: "+ accountNo);

    }

    public void setAcDetails(ArrayList<Account> acDetails) {
        this.acDetails = acDetails;
    }
}