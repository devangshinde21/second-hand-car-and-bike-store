package onlinestore;

import java.util.ArrayList;
import java.util.Scanner;

class y2016 extends vehiclesecondhand

{
	void year2016() {
		System.out.println("choose Twowheeler2016(1) or Fourwheeler2016(2)");
		Scanner scan = new Scanner(System.in);
		int choose = scan.nextInt();
		if (choose == 1) {
			Twowheeler2016 poi = new Twowheeler2016();
			poi.call1();
		} else if (choose == 2) {
			Fourwheeler2016 poi = new Fourwheeler2016();
			poi.call2();
		} else {
			System.out.println("Inalid Input");
		}
	}
}

class Twowheeler2016 extends y2016 {
	void call1() {
		System.out.println("Year 2016 Bikes");
		ArrayList view = new ArrayList();
		view.add("1.Yamaha_r3_2016");
		view.add("2.Yamaha_r1_2016");
		view.add("3.SUZKUKI_GIXXER250_2016");
		view.add("4.Toyota_Fortuner_2016");
		view.add("5.Suzkuki_hayabusa_2016");
		view.add("6.Suzkuki_hayabusa1000_2016");
		view.add("7.Yamaha_r15_2016");
		view.add("8.Suzuki_xsr1000_2016");
		view.add("9.Yamaha_rx100_2016");
		view.add("10.Magane_k200_2016");
		System.out.println("Choose Game you want Buy" + view);
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		switch (a) {
			case 1:
				Yamaha_r3_2016 t0 = new Yamaha_r3_2016("Yamaha_r3_2016");
				break;
			case 2:
				Yamaha_r1_2016 t = new Yamaha_r1_2016("Yamaha_r1_2016");
				break;
			case 3:
				SUZKUKI_GIXXER250_2016 t1 = new SUZKUKI_GIXXER250_2016("SUZKUKI_GIXXER250_2016");
				break;
			case 4:
				Toyota_Fortuner_2016 t2 = new Toyota_Fortuner_2016("Toyota_Fortuner_2016");
				break;
			case 5:
				Suzkuki_hayabusa_2016 t3 = new Suzkuki_hayabusa_2016("Suzkuki_hayabusa_2016");
				break;
			case 6:
				Suzkuki_hayabusa1000_2016 t4 = new Suzkuki_hayabusa1000_2016("Suzkuki_hayabusa1000_2016");
				break;
			case 7:
				Yamaha_r15_2016 t5 = new Yamaha_r15_2016("Yamaha_r15_2016");
				break;
			case 8:
				Suzuki_xsr1000_2016 t6 = new Suzuki_xsr1000_2016("Suzuki_xsr1000_2016");
				break;
			case 9:
				Yamaha_rx100_2016 t7 = new Yamaha_rx100_2016("Yamaha_rx100_2016");
				break;
			case 10:
				Magane_k200_2016 t8 = new Magane_k200_2016("Magane_k200_2016");
				break;

		}
	}
}

class Fourwheeler2016 extends y2016 {
	void call2() {
		System.out.println("Year 2016 Cars");
		ArrayList view1 = new ArrayList();
		view1.add("1.Mahindra_bolero_2016");
		view1.add("2.Mahindra_scorpio_2016");
		view1.add("3.Mahindra_xuv700_2016");
		view1.add("4.Tata_tiagos_2016");
		view1.add("5.Tata_tigar_2016");
		view1.add("6.ford_Mustang_2016");
		view1.add("7.Toyota_Fortuner_2016");
		view1.add("8.Suzuki_vitara_2016");
		view1.add("9.Toyota_innova_2016");
		view1.add("10.Toyota_innovacrista_2016");
		System.out.println("Choose Game you want Buy" + view1);
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();

		switch (b) {
			case 1:
				Mahindra_bolero_2016 t0 = new Mahindra_bolero_2016("Mahindra_bolero_2016");
				break;
			case 2:
				Mahindra_scorpio_2016 t = new Mahindra_scorpio_2016("Mahindra_scorpio_2016");
				break;
			case 3:
				Mahindra_xuv700_2016 t1 = new Mahindra_xuv700_2016("Mahindra_xuv700_2016");
				break;
			case 4:
				Tata_tiagos_2016 t2 = new Tata_tiagos_2016("Tata_tiagos_2016");
				break;
			case 5:
				Tata_tigar_2016 t3 = new Tata_tigar_2016("Tata_tigar_2016");
				break;
			case 6:
				ford_Mustang_2016 t4 = new ford_Mustang_2016("ford_Mustang_2016");
				break;
			case 7:
				Toyota_Fortuner_2016 t5 = new Toyota_Fortuner_2016("Toyota_Fortuner_2016");
				break;
			case 8:
				Suzuki_vitara_2016 t6 = new Suzuki_vitara_2016("Suzuki_vitara_2016");
				break;
			case 9:
				Toyota_innova_2016 t7 = new Toyota_innova_2016("Toyota_innova_2016");
				break;
			case 10:
				Toyota_innovacrista_2016 t8 = new Toyota_innovacrista_2016("Toyota_innovacrista_2016");
				break;
		}
	}
}

// ===========================================================================================================
class Yamaha_r3_2016 extends Twowheeler2016 {
	public Yamaha_r3_2016(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Yamaha_r1_2016 extends Twowheeler2016 {
	public Yamaha_r1_2016(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1800000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Mahindra_bolero_2016 extends Fourwheeler2016 {
	public Mahindra_bolero_2016(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class SUZKUKI_GIXXER250_2016 extends Twowheeler2016 {
	public SUZKUKI_GIXXER250_2016(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 120000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Mahindra_scorpio_2016 extends Fourwheeler2016 {
	public Mahindra_scorpio_2016(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Toyota_Fortuner_2016 extends Twowheeler2016 {
	public Toyota_Fortuner_2016(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 2000000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Mahindra_xuv700_2016 extends Fourwheeler2016 {
	public Mahindra_xuv700_2016(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Suzkuki_hayabusa_2016 extends Twowheeler2016 {
	public Suzkuki_hayabusa_2016(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 150000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class Suzkuki_hayabusa1000_2016 extends Twowheeler2016 {
	public Suzkuki_hayabusa1000_2016(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class Yamaha_r15_2016 extends Twowheeler2016 {
	public Yamaha_r15_2016(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Suzuki_xsr1000_2016 extends Twowheeler2016 {
	public Suzuki_xsr1000_2016(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 90000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Yamaha_rx100_2016 extends Twowheeler2016 {
	public Yamaha_rx100_2016(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 200000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Magane_k200_2016 extends Twowheeler2016 {
	public Magane_k200_2016(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 150000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class ford_Mustang_2016 extends Twowheeler2016 {
	public ford_Mustang_2016(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 5200000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class Suzuki_vitara_2016 extends Twowheeler2016 {
	public Suzuki_vitara_2016(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}


class Toyota_innova_2016 extends Twowheeler2016 {
	public Toyota_innova_2016(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1300000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Toyota_innovacrista_2016 extends Twowheeler2016 {
	public Toyota_innovacrista_2016(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 800000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}



class Tata_tigar_2016 extends Fourwheeler2016 {
	public Tata_tigar_2016(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}


class ferrari extends Twowheeler2016 {
	public ferrari(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class tvs extends Twowheeler2016 {
	public tvs(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100020);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}
