package AccountNew;

public class Test_Account_new {
    public static void main(String[] args) {


        Account_new a1 = new Account_new("Muhammad Rizwan", 1, 999.99);
        Account_new a2 = new Account_new("Babar Azam", 2, 18888999.99);
        Account_new a3 = new Account_new("Virat Kohli", 3, 77777);

        a1.deposit(1000);
        a2.withdraw(1000);
        a1.transferBalanceTo(a2);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
