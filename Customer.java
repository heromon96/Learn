import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Customer {
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter your name");
		String name=s.next();
		System.out.println("Enter your phone number");
		long phno=s.nextLong();
		System.out.println("If you have accountno type yes or if you want create new accunt type no");
		String yn=s.next();
		if(yn.equalsIgnoreCase("yes")) {
			System.out.println("Enter your account number");
			long accNo=s.nextLong();
			System.out.println("Enter your last four digits of your account number");
			int lastFour=s.nextInt();
		if(lastFour==4567) {
			new Savings_Account().savingAccountDetails(accNo);
		}
		else {
			new Current_Account().currentAccountDetails(accNo);
		}
		}
		else {
			new Create_Account().addCustomer(name,phno);
		}
		
	}
}
class Create_Account{
	public void addCustomer(String n,long no) {
		System.out.println("If you want to create saving account type saving or If you want to create current account type current");
		Scanner s=new Scanner(System.in);
		String type=s.next();
		long Accno=0;
		System.out.println ("name="+n);
		System.out.println ("ph="+no);
		if(type.equalsIgnoreCase("saving")) {
			Accno=1254567;
		}
		else {
			Accno=1258901;
		}
		System.out.println("Accno="+Accno);
		SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
		Date date=new Date();
		System.out.println("date of opening="+f.format(date));
	}
}
class Savings_Account{
	public void savingAccountDetails(long num) {
		System.out.println("min_balance="+500);
		if(num==1234567) {
		System.out.println("Date_of_Opening="+12+"-"+01+"-"+2020);
		}
		else if(num==1244567) {
			System.out.println("Date_of_Opening="+02+"-"+01+"-"+2020);
		}
		new Account().accountDetails(num);
	}
}
class Current_Account{
	public void currentAccountDetails(long num) {
		System.out.println("interest_rate="+2+"%");
		if(num==1238901) {
			System.out.println("Date_of_Opening="+12+"-"+01+"-"+2020);
		}
		else if(num==1248901) {
			System.out.println("Date_of_Opening="+02+"-"+01+"-"+2020);
		}
		new Account().accountDetails(num);
	}
}
class Account{
	public void accountDetails(long n) {
		int Balance=0;
		if(n==1234567) {
			Balance=bal(n);
			Balance=Balance+500;
			System.out.println("balance="+Balance);
		}
		else if(n==1244567) {
			Balance=bal(n);
			Balance=Balance+500;
			System.out.println("balance="+Balance);
		}
		else if(n==1238901) {		
			Balance=bal(n);
			System.out.println("balance="+Balance);
		}
		else if(n==1248901) {
			Balance=bal(n);
			System.out.println("balance="+Balance);
		}
	}
	public int bal(long n) {
		int Balance=0;
		System.out.println("Acc_No="+n);
		Balancedetails b=new Balancedetails();
		Balance=b.balance();
		return Balance;
	}
}
class Balancedetails{
	public int balance() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the amount you want to withdraw");
		int withdraw=s.nextInt();
		System.out.println("enter the amount you want to deposit");
		int deposit=s.nextInt();
		int res=0;
		res=res+deposit;
		res=res-withdraw;
		return res;
	}
}
