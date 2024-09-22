package AccountOld;

import java.text.NumberFormat;

public class Account_old
{
    public final double RATE = 0.035;

    public long acctNumber;
    public double balance;
    public String name;


    public Account_old(String owner, long account, double initial)
    {
        this.name = owner;
        this.acctNumber = account;
        this.balance = initial;
    }

    public double deposit (double amount)  {
        if (amount > 0)
            balance = balance + amount;return balance;
    }


    public double withdraw (double amount)  {
        if (amount <= balance) balance = balance - amount ;
        return balance;
    }


    public double getBalance ()
    {
        return balance;
    }
    public void Dismiss(Account_old p) {
        p.balance=this.balance;this.balance=0;
    }

    public String toString ()
    {NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
    }


}


