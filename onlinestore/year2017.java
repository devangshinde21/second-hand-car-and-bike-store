package onlinestore;

import java.util.ArrayList;
import java.util.Scanner;

class y2017 extends vehiclesecondhand

{
	void year2017() {
		System.out.println("choose Twowheeler2017(1) or Fourwheeler2017(2)");
		Scanner scan = new Scanner(System.in);
		int choose = scan.nextInt();
		if (choose == 1) {
			Twowheeler2017 poi = new Twowheeler2017();
			poi.call1();
		} else if (choose == 2) {
			Fourwheeler2017 poi = new Fourwheeler2017();
			poi.call2();
		} else {
			System.out.println("Inalid Input");
		}
	}
}

class Twowheeler2017 extends y2017 {
	void call1() {
		System.out.println("Year 2017 Bikes");
		ArrayList view = new ArrayList();
		view.add("1.Yamaha_r3_2017");
		view.add("2.Yamaha_r1_2017");
		view.add("3.SUZKUKI_GIXXER150sf_2017");
		view.add("4.tvs_apache160_2017");
		view.add("5.Suzkuki_hayabusa_2017");
		view.add("6.Suzkuki_hayabusa1000_2017");
		view.add("7.Yamaha_r15_2017");
		view.add("8.Suzuki_xsr1000_2017");
		view.add("9.Yamaha_rx100_2017");
		view.add("10.Magane_k200_2017");
		System.out.println("Choose Game you want Buy" + view);
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		switch (a) {
			case 1:
				Yamaha_r3_2017 t0 = new Yamaha_r3_2017("Yamaha_r3_2017");
				break;
			case 2:
				Yamaha_r1_2017 t = new Yamaha_r1_2017("Yamaha_r1_2017");
				break;
			case 3:
				SUZKUKI_GIXXER150sf_2017 t1 = new SUZKUKI_GIXXER150sf_2017("SUZKUKI_GIXXER150sf_2017");
				break;
			case 4:
				tvs_apache160_2017 t2 = new tvs_apache160_2017("tvs_apache160_2017");
				break;
			case 5:
				Suzkuki_hayabusa_2017 t3 = new Suzkuki_hayabusa_2017("Suzkuki_hayabusa_2017");
				break;
			case 6:
				Suzkuki_hayabusa1000_2017 t4 = new Suzkuki_hayabusa1000_2017("Suzkuki_hayabusa1000_2017");
				break;
			case 7:
				Yamaha_r15_2017 t5 = new Yamaha_r15_2017("Yamaha_r15_2017");
				break;
			case 8:
				Suzuki_xsr1000_2017 t6 = new Suzuki_xsr1000_2017("Suzuki_xsr1000_2017");
				break;
			case 9:
				Yamaha_rx100_2017 t7 = new Yamaha_rx100_2017("Yamaha_rx100_2017");
				break;
			case 10:
				Magane_k200_2017 t8 = new Magane_k200_2017("Magane_k200_2017");
				break;

		}
	}
}

class Fourwheeler2017 extends y2017 {
	void call2() {
		System.out.println("Year 2017 Cars");
		ArrayList view1 = new ArrayList();
		view1.add("1.Mahindra_bolero_2017");
		view1.add("2.Mahindra_scorpio_2017");
		view1.add("3.Mahindra_xuv700_2017");
		view1.add("4.Tata_tiagos_2017");
		view1.add("5.Tata_tigar_2017");
		view1.add("6.ford_Mustang_2017");
		view1.add("7.tvs_apache160_2017");
		view1.add("8.Suzuki_vitara_2017");
		view1.add("9.Toyota_innova_2017");
		view1.add("10.Toyota_innovacrista_2017");
		System.out.println("Choose Game you want Buy" + view1);
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();

		switch (b) {
			case 1:
				Mahindra_bolero_2017 t0 = new Mahindra_bolero_2017("Mahindra_bolero_2017");
				break;
			case 2:
				Mahindra_scorpio_2017 t = new Mahindra_scorpio_2017("Mahindra_scorpio_2017");
				break;
			case 3:
				Mahindra_xuv700_2017 t1 = new Mahindra_xuv700_2017("Mahindra_xuv700_2017");
				break;
			case 4:
				Tata_tiagos_2017 t2 = new Tata_tiagos_2017("Tata_tiagos_2017");
				break;
			case 5:
				Tata_tigar_2017 t3 = new Tata_tigar_2017("Tata_tigar_2017");
				break;
			case 6:
				ford_Mustang_2017 t4 = new ford_Mustang_2017("ford_Mustang_2017");
				break;
			case 7:
				tvs_apache160_2017 t5 = new tvs_apache160_2017("tvs_apache160_2017");
				break;
			case 8:
				Suzuki_vitara_2017 t6 = new Suzuki_vitara_2017("Suzuki_vitara_2017");
				break;
			case 9:
				Toyota_innova_2017 t7 = new Toyota_innova_2017("Toyota_innova_2017");
				break;
			case 10:
				Toyota_innovacrista_2017 t8 = new Toyota_innovacrista_2017("Toyota_innovacrista_2017");
				break;
		}
	}
}

// ===========================================================================================================
class Yamaha_r3_2017 extends Twowheeler2017 {
	public Yamaha_r3_2017(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Yamaha_r1_2017 extends Twowheeler2017 {
	public Yamaha_r1_2017(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1800000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Mahindra_bolero_2017 extends Fourwheeler2017 {
	public Mahindra_bolero_2017(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class SUZKUKI_GIXXER150sf_2017 extends Twowheeler2017 {
	public SUZKUKI_GIXXER150sf_2017(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 120000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Mahindra_scorpio_2017 extends Fourwheeler2017 {
	public Mahindra_scorpio_2017(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class tvs_apache160_2017 extends Twowheeler2017 {
	public tvs_apache160_2017(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 2000000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Mahindra_xuv700_2017 extends Fourwheeler2017 {
	public Mahindra_xuv700_2017(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Suzkuki_hayabusa_2017 extends Twowheeler2017 {
	public Suzkuki_hayabusa_2017(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 150000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class Suzkuki_hayabusa1000_2017 extends Twowheeler2017 {
	public Suzkuki_hayabusa1000_2017(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class Yamaha_r15_2017 extends Twowheeler2017 {
	public Yamaha_r15_2017(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Suzuki_xsr1000_2017 extends Twowheeler2017 {
	public Suzuki_xsr1000_2017(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 90000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Yamaha_rx100_2017 extends Twowheeler2017 {
	public Yamaha_rx100_2017(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 200000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Magane_k200_2017 extends Twowheeler2017 {
	public Magane_k200_2017(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 150000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class ford_Mustang_2017 extends Twowheeler2017 {
	public ford_Mustang_2017(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 5200000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class Suzuki_vitara_2017 extends Twowheeler2017 {
	public Suzuki_vitara_2017(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Toyota_innova_2017 extends Twowheeler2017 {
	public Toyota_innova_2017(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1300000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Toyota_innovacrista_2017 extends Twowheeler2017 {
	public Toyota_innovacrista_2017(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 800000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class porche extends Twowheeler2017 {
	public porche(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1800);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Tata_tiagos_2017 extends Fourwheeler2017 {
	public Tata_tiagos_2017(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}



class Tata_tigar_2017 extends Fourwheeler2017 {
	public Tata_tigar_2017(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}


class ferrari extends Twowheeler2017 {
	public ferrari(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class tvs extends Twowheeler2017 {
	public tvs(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100020);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}
