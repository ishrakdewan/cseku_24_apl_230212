package AccountOld;

public class Test_Account_old {
    public static void main(String[] args) {
        Account_old a1 = new Account_old("Muhammad Rizwan", 1 , 999.99 );
        Account_old a2 = new Account_old("Babar Azam",2,18888999.99);
        Account_old a3 = new Account_old("Virat Kholi",3, 77777);
        a1.deposit(1000);
        a2.withdraw(1000);
        a1.Dismiss(a2);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
