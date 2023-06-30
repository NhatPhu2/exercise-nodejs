import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Account phuAccount = new Account("09857465743","Phu",3000000d);
        Account baoAccount = new Account("09857465742","Bao",4000000d);
        Account linhAccount = new Account("09857465741","Linh",30000d);
        Map<String,Account> listAccount = new HashMap<>();
        listAccount.put("09857465743",phuAccount);
        listAccount.put("09857465742",baoAccount);
        listAccount.put("09857465741",linhAccount);
        ATM atm = new ATM(listAccount);
        atm.addBalance(30000000D);
        listAccount.forEach((key,value) -> {
            System.out.println("Account: " + key);
            System.out.println("Balance: " + value.getBalance());
        });
//        System.out.println();
//        atm.deposit("09857465743",3000000d);
//        System.out.println("After deposit");
//        listAccount.forEach((key,value) -> {
//            System.out.println("Account: " + key);
//            System.out.println("Balance: " + value.getBalance());
//        });
//        System.out.println();
//        atm.transfer("09857465743","09857465742",2000000D);
//        System.out.println("After transfer");
//        listAccount.forEach((key,value) -> {
//            System.out.println("Account: " + key);
//            System.out.println("Balance: " + value.getBalance());
//        });
        System.out.println();
        atm.withDraw("09857465743",3500000D);
        System.out.println("After withdraw");
        listAccount.forEach((key,value) -> {
            System.out.println("Account: " + key);
            System.out.println("Balance: " + value.getBalance());
        });
    }
}
