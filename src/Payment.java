
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import java.util.Random;
import java.util.Scanner;


public class Payment {
public void debitcard() throws InterruptedException {
	
	System.out.println("enter card number");
	Scanner input=new Scanner(System.in);
	Integer cardNumber=input.nextInt();
	//debitcard.setCardNumber(cardNumber);
	System.out.println("enter cvv number");
	Integer cvvNumber=input.nextInt();
	//debitcard.setCvv(cvvNumber);
	System.out.println("enter Date");
	String Date=input.next();
	//debitcard.setDate(Date);
	System.out.println("                ");
	System.out.println("TRANSACTION LOADING :::::::");
	Thread.sleep(3000);
	System.out.println("                ");
	System.out.println("verifying OTP :::::::");
	Thread.sleep(5000);
	System.out.println("                ");
	System.out.println("::::::::Transaction Successfull::::::::");
	System.out.println("                ");
	System.out.println("                ");
	DebitCard debitcard=new DebitCard(cardNumber,cvvNumber,Date);
	//List<DebitCard> array=new ArrayList<>();
	//array.add(debitcard);
Bill bl=new Bill(2000);
   // System.out.println(bl.getBillamount());
Random random = new Random();
int num = random.nextInt(100000);
String formatted = String.format("%05d", num);
//int randomInt = ThreadLocalRandom.current().nextInt();
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
LocalDateTime now = LocalDateTime.now();
	System.out.println("Transaction Details:::: "+"\n"+"\n"+"TransactionDate= "+dtf.format(now)+"\n"+"TransactionID="+formatted+"\n"+"cardNumber= "+debitcard.getCardNumber()+"\n"+" Bill Ammount = "+bl.getBillamount());
}
public void creditcard() throws InterruptedException {
	System.out.println("enter card number");
	Scanner input=new Scanner(System.in);
	Integer cardNumber=input.nextInt();
	//debitcard.setCardNumber(cardNumber);
	System.out.println("enter cvv number");
	Integer cvvNumber=input.nextInt();
	//debitcard.setCvv(cvvNumber);
	System.out.println("enter Date");
	String Date=input.next();
	//debitcard.setDate(Date);
	System.out.println("                ");
	System.out.println("TRANSACTION LOADING :::::::");
	Thread.sleep(3000);
	System.out.println("                ");
	System.out.println("verifying OTP :::::::");
	Thread.sleep(5000);
	System.out.println("                ");
	System.out.println("::::::::;Transaction Successfull::::::::");
	System.out.println("                ");
	CreditCard creditcard=new CreditCard(cardNumber,cvvNumber,Date);
	//List<DebitCard> array=new ArrayList<>();
	//array.add(debitcard);
Bill bl=new Bill(3000);
   // System.out.println(bl.getBillamount());
Random random = new Random();
int num = random.nextInt(100000);
String formatted = String.format("%05d", num);
//int randomInt = ThreadLocalRandom.current().nextInt();
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
LocalDateTime now = LocalDateTime.now();
	System.out.println("Transaction Details:::: "+"\n"+"\n"+"TransactionDate= "+dtf.format(now)+"\n"+"TransactionID="+formatted+"\n"+"cardNumber= "+creditcard.getCardNumber()+"\n"+" Bill Ammount = "+bl.getBillamount());
}
public void upiPayment() throws InterruptedException {
	System.out.println("Enter upiID ");
	Scanner obj=new Scanner(System.in);
	String upid=obj.next();

	UpiPayment upi=new UpiPayment(upid);
	Bill bl=new Bill(4000);
	Random random = new Random();
	int num = random.nextInt(100000);
	String formatted = String.format("%05d", num);
	//int randomInt = ThreadLocalRandom.current().nextInt();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	LocalDateTime now = LocalDateTime.now();
	System.out.println("                ");
	System.out.println("TRANSACTION LOADING :::::::");
	Thread.sleep(3000);
	System.out.println("                ");
	System.out.println("verifying OTP :::::::");
	Thread.sleep(5000);
	System.out.println("                ");
	System.out.println("::::::::;Transaction Successfull::::::::");
	System.out.println("                ");
	System.out.println("                ");
	System.out.println("Transaction Details::::"+"\n"+"\n"+"TransactionDate= "+dtf.format(now)+"\n"+"TransactionID="+formatted+"\n"+"UpiID="+upi.getUpiID()+"\n"+"BillAmount="+bl.getBillamount());
}
}
