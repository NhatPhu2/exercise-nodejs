import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ATM implements Transaction {
    private Double balance = 0D;
    private Map<String, Account> listAccount = new HashMap<>();

    public ATM() {
    }

    public ATM(Map<String, Account> listAccount) {
        this.listAccount = listAccount;
    }

    public Double getBalance() {
        return balance;
    }

    public void addBalance(Double balance) {
        this.balance += balance;
    }

    @Override
    public Double withDraw(String accountId, Double price) {
        if (listAccount.get(accountId) != null) {
            Account account = listAccount.get(accountId);
            if (price <= 0) {
                System.out.println("Price is not valid");
                return 0.0;
            }
            if (account.getBalance() < price) {
                System.out.println("Insufficient balance");
                return 0.0;
            }
            if (balance < price) {
                System.out.println("ATM do not have enough money");
                System.out.println("You can withdraw maximum " + balance + " VNĐ");
                System.out.println("Please try again");
                return 0.0;
            }
            this.balance -= price;
            Double bl = account.getBalance() - price;
            account.setBalance(bl);
            System.out.println("Your account "+ accountId + " just withdraw -" + price);
            System.out.println("Your balance is " + bl);
            return account.getBalance();
        } else {
            System.out.println("Account is not valid");
            return 0.0;
        }

    }

    @Override
    public Double deposit(String accountId, Double price) {
        if (listAccount.get(accountId) != null) {
            Account account = listAccount.get(accountId);
            if (price <= 0) {
                System.out.println("Price is not valid");
                return 0.0;
            }
            this.balance += price;
            Double depo = account.getBalance() + price;
            account.setBalance(depo);
            System.out.println("Your account " + accountId + " just got +" + price + " VNĐ");
            System.out.println("Your balance is " + depo);
            return account.getBalance();
        } else {
            System.out.println("Account is not valid");
            return 0.0;
        }
    }

    @Override
    public void transfer(String accountIdFrom, String accountIdTo, Double price) {
        if (listAccount.get(accountIdFrom) != null
                && listAccount.get(accountIdTo) != null
        ) {
            Account accountTrans = listAccount.get(accountIdFrom);
            if (price <= 0) {
                System.out.println("Price is not valid");
                return;
            }
            if (accountTrans.getBalance() < price) {
                System.out.println("insufficient balance");
                System.out.println("Please try again");
                return;
            }
            Account accountGotDeposit = listAccount.get(accountIdTo);
            Double accountTransBalance = accountTrans.getBalance() - price;
            Double accountReceiveDeposit = accountGotDeposit.getBalance() + price;
            accountGotDeposit.setBalance(accountReceiveDeposit);
            accountTrans.setBalance(accountTransBalance);
        } else {
            System.out.println("Account is not valid");
        }
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Map<String, Account> getListAccount() {
        return listAccount;
    }

    public void setListAccount(Map<String, Account> listAccount) {
        this.listAccount = listAccount;
    }
}

class Account {
    private String accountId;
    private String name;
    private Double balance;

    public Account(String accountId, String name, Double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    public Account() {
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

}

interface Transaction {
    Double withDraw(String accountId, Double price);

    Double deposit(String accountId, Double price);

    void transfer(String accountIdFrom, String accountIdTo, Double price);
}
