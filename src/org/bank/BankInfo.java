package org.bank;

public class BankInfo extends AxisBank {
private void savings() {
	// TODO Auto-generated method stub
System.out.println("SAVINGS 6%");
}private void fixed() {
	// TODO Auto-generated method stub
System.out.println("FIXED 6%");
}private void deposit() {
	// TODO Auto-generated method stub
System.out.println("DEPOSIT 7%");
}public static void main(String[] args) {
	BankInfo b=new BankInfo();
	b.savings();
	b.fixed();
	b.deposit();
}
}
