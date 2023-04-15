package com.rameshsoft.automation.corejava;

interface BankDetails
{
	void details();
}

interface BankAtm extends BankDetails
{
	String bankName = "AXIS BANK"; //public static final
	
	void miniStmt(); //public abstract
	void balEnq();
	public abstract void cashwithDraw();
	public abstract void pinChange();
}
abstract class BankAtmImpl implements BankAtm
{
	@Override
	public void miniStmt() {
		System.out.println("MS");
	}
	@Override
	public void cashwithDraw() {
		System.out.println("CWD");
	}
	@Override
	public void pinChange() {
		System.out.println("PC");
	}
	public void hardwork() {
		System.out.println("HARDWORK");
	}
}
class BankAtmImplOne extends BankAtmImpl
{
	@Override
	public void balEnq() {
		System.out.println("BE");
	}
	public void job() {
		System.out.println("JOB");
	}
	@Override
	public void details() {
		System.out.println("DETAILS");
	}
}
public class InterfaceDemo {
public static void main(String[] args) {
	//BankAtm atm = new BankAtm();
	//BankAtmImpl atm = new BankAtmImpl();
	/*BankAtmImplOne atm = new BankAtmImplOne();
	atm.balEnq();
	atm.cashwithDraw();
	atm.hardwork();
	atm.job();
	atm.miniStmt();
	atm.pinChange();*/
	/*BankAtmImpl atm = new BankAtmImplOne();
	atm.balEnq();
	atm.cashwithDraw();
	atm.hardwork();
	//atm.job();
	atm.miniStmt();
	atm.pinChange();
	*/
	BankAtm atm = new BankAtmImplOne();
	atm.balEnq();
	atm.cashwithDraw();
	atm.miniStmt();
	atm.pinChange();
	
}
}
