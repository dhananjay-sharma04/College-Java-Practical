import java.sql.Time;

abstract class Account
{
	long accNo=0; 
	double balance=0.0;
	Account()
	{
		this.accNo=0; 
		this.balance=0.0;
	}
	Account(long x, double y)
	{
		this.accNo=x; 
		this.balance=y;		
	}
	public abstract void checkBalance();			
}
class saving extends Account{
    double interest = 0.0;
    final int minBalance = 15000;
    saving(){
        this.accNo = 0;
        this.balance=0;
        this.interest = 4.0;
    }
    saving(int a, int b , double i){
        this.accNo = a;
        this.balance = b;
        this.interest = i;
    }
    @Override
    public void checkBalance() {
        // TODO Auto-generated method stub
        System.out.println("Your balance is =" + this.balance);
        
    }
    public void deposit( double i){
        this.balance = this.balance + i;
    }
    public void withdrawl(double i){
        if(this.balance >=this.minBalance){
            this.balance = this.balance - i;
        }
        else{
            System.out.println("insufficiant balance");
            System.out.println("your balance is = " + this.balance);
        }
    }
    
}
class current extends Account{
    double overdraftlimit;
    double overdraft;
    current(){
        this.accNo=0;
        this.balance=0.0;
        this.overdraftlimit=100000;
        this.overdraft=0.0;
    }
    current(int a, double b,double o){
        this.accNo=a;
        this.balance = b;
        this.overdraftlimit=o;
        this.overdraft=0;

    }
    @Override
    public void checkBalance() {
        // TODO Auto-generated method stub
        System.out.println("Your balance is =" + this.balance);
    }
    public void depositBalance(double x)
	{
		this.balance=this.balance+x;
	}
	public void withdrawBalance(double x)
	{
		if((this.balance-x) >= 0)
		{
			this.balance=this.balance-x;
		}
		else
		{		
			System.out.println("insufficiante balance");
			System.out.println("current balance : "+this.balance);			
		}
	}
    public void takeOverDraft(double x)
	{
		//under development
		if((this.balance-x) >= 0)
		{
			this.balance=this.balance-x;
		}
		else
		{
				
			System.out.println("insufficiante balance");
			System.out.println("current balance : "+this.balance);			
			
		}
	}   
}
public class q8 {
    public static void main(String[] args) {
        current c = new current(1,1000,100000);
        c.checkBalance();
        c.withdrawBalance(100);
        c.checkBalance();

        saving s = new saving(1,20000,2.2);
        c.checkBalance();
        c.withdrawBalance(1000);
        c.checkBalance();

    }
}
/*
 * PS F:\java\clg practical> cd "f:\java\clg practical\" ; if ($?) { javac q8.java } ; if ($?) { java q8 }
Your balance is =1000.0
Your balance is =900.0
Your balance is =900.0
insufficiante balance
current balance : 900.0
Your balance is =900.0
 */