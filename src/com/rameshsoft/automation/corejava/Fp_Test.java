package com.rameshsoft.automation.corejava;

class Fp_Men
{
	public void login() {
		//30 lines of code
		System.out.println("login()");
	}
	public void clothes() {
		//250 lines of code
		System.out.println("clothes()");
	}
	public void logout() {
		//20 lines of code
		System.out.println("logout()");
    }
}

class Fp_Women extends Fp_Men
{
	public void jewelleryGold() {
		//250 lines of code
		System.out.println("jewelleryGold()");
	}
}
class Fp_Kids extends Fp_Women
{
	public void toys() {
		//450 lines of code
		System.out.println("clothes()");
	}
}

public class Fp_Test {
public static void main(String[] args) {

	//1. creating parent class object
	/*Fp_Men fp_Men = new Fp_Men();
	fp_Men.login();
	fp_Men.clothes();
	fp_Men.logout();*/
	//fp_Men.jewelleryGold();
	
	
	//2. creating child class object
	/*Fp_Women fp_Women = new Fp_Women();
	fp_Women.login();
	fp_Women.clothes();
	fp_Women.jewelleryGold();
	fp_Women.logout();*/
	
	//3. By using parent class reference creating child class object
	Fp_Men fp_Men = new Fp_Women();
	fp_Men.login();
	fp_Men.clothes();
	fp_Men.logout();
	
	
	//4. creating parent class object using child class reference
	//Fp_Women fp_Women = new Fp_Men();
	
	
}
}




