package onlinestore;

import java.util.Scanner;

public class vehiclesecondhand {

	static {
		System.out.println("Welcome Rider");
	}

	public static void main(String[] args) {

		System.out.println("Please Enter Login id and Password");
		login1 ref1 = new gamelogin1();
		ref1.login();

		Scanner scan = new Scanner(System.in);
		System.out.println("Choose a  release year for vehicle ");
		System.out.println("For year 2020 vehicle press:1");
		System.out.println("For year 2019 vehicle  press:2");
		System.out.println("For year 2018 vehicle  press:3");
		System.out.println("For year 2017 vehicle  press:4");
		System.out.println("For year 2016 vehicle  press:5");
		System.out.println("For year 2015 vehicle  press:6");
		System.out.println("for support press:10");

		int a = scan.nextInt();
		if (a == 1) {
			y2020 ref = new y2020();
			ref.year2020();
		} else if (a == 2) {
			y2019 ref = new y2019();
			ref.year2019();
		} else if (a == 3) {
			y2018 ref = new y2018();
			ref.year2018();
		} else if (a == 4) {
			y2017 ref = new y2017();
			ref.year2017();
		} else if (a == 5) {
			y2016 ref = new y2016();
			ref.year2016();
		} else if (a == 6) {
			y2015 ref = new y2015();
			ref.year2015();
		} else if (a == 10) {
			p1 ret = new p1();
			System.out.println(ret.toString());
		} else {
			throw new Invalid_Option_Exception();
		}

	}
}

// ========================================================================================================
// EXCEPTION
class Invalid_Option_Exception extends RuntimeException {
}

class Incorrect_login extends RuntimeException {
}

// ========================================================================================================
// POLYMORPHISM
class p1 {
	public String toString() {
		return "contact no:7798392508";
	}
}

// ========================================================================================================
// ABSTRACTION AND INTERFACE(login eg)

interface login1 {
	void login();
}

class gamelogin1 implements login1 {
	public void login() {
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		int c = scan.nextInt();
		if (b == 1111 && c == 8879) {
			System.out.println("welcome");
		} else {
			throw new Incorrect_login();
		}
		

	}
}
