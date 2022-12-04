package onlinestore;

import java.util.ArrayList;
import java.util.Scanner;

class y2019 extends vehiclesecondhand {
	void year2019() {
		System.out.println("choose TwoWheeler2019(1) or Fourwheeler2019(2)");
		Scanner scan = new Scanner(System.in);
		int choose = scan.nextInt();
		if (choose == 1) {
			TwoWheeler2019 poi = new TwoWheeler2019();
			poi.call1();
		} else if (choose == 2) {
			Fourwheeler2019 poi = new Fourwheeler2019();
			poi.call2();
		} else {
			System.out.println("Inalid Input");
		}
	}
}

class TwoWheeler2019 extends y2019 {
	void call1() {
		System.out.println("Year 2019 bikes");
		ArrayList view = new ArrayList();
		view.add("1.suzukigixxer2019");
		view.add("2.ktmrc2019");
		view.add("3.tvs star city 110cc 2019 ");
		view.add("4.ktm_390_2019");
		view.add("5.harley_750_2019");
		view.add("6.suzuki_125cc_2019 ");
		view.add("7.honda_shine2019");
		view.add("honda_unicorn_2019");
		view.add("9.hero_xtreme_160");
		view.add("10.bajajpulsar2019");
		System.out.println("Choose Game you want Buy" + view);
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		switch (a) {
			case 1:
				suzukigixxer2019 t0 = new suzukigixxer2019("suzukigixxer2019");
				break;
			case 2:
				ktmrc2019 t = new ktmrc2019("ktm rc 200cc 2019");
				break;
			case 3:
				tvsstar2019 t1 = new tvsstar2019("tvsstar2019");
				break;
			case 4:
				ktm_390_2019 t2 = new ktm_390_2019("ktm_390_2019");
				break;
			case 5:
				harley_750_2019 t3 = new harley_750_2019("harley_750_2019");
				break;
			case 6:
				suzuki_125cc_2019 t4 = new suzuki_125cc_2019("suzuki_125cc_2019");
				break;
			case 7:
				Honda_shine2019 t5 = new Honda_shine2019("Honda_shine2019");
				break;
			case 8:
				honda_unicorn_2019 t6 = new honda_unicorn_2019("honda_unicorn_2019");
				break;
			case 9:
				Hero_xtreme_160 t7 = new Hero_xtreme_160("Hero_xtreme_160");
				break;
			case 10:
				Bajajpulsar2019 t8 = new Bajajpulsar2019("Bajajpulsar2019");
				break;

		}
	}
}

class Fourwheeler2019 extends y2019 {
	void call2() {
		System.out.println("Year 2019 Fourwheeler");
		ArrayList view1 = new ArrayList();
		view1.add("1.Hyundai_i20_2019");
		view1.add("2.Hyundai_i10_2019");
		view1.add("3.Toyota_inova_2019");
		view1.add("4.Toyota_qualis_2019");
		view1.add("5.Mahindra_bolero_2019");
		view1.add("6.Suzuki_wagonr_2019");
		view1.add("7.Suzuki_Swift_2019");
		view1.add("8.Suzuki_brezza_2019");
		view1.add("9.Toyota_fortuner_2019");
		view1.add("10.Suzuki_alto_800");
		System.out.println("Choose Game you want Buy" + view1);
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();

		switch (b) {
			case 1:
				hyundai_i20_2019 t0 = new hyundai_i20_2019("hyundai_i20_2019");
				break;
			case 2:
				hyundai_i10_2019 t = new hyundai_i10_2019("hyundai_i10_2019");
				break;
			case 3:
				Toyota_inova_2019 t1 = new Toyota_inova_2019("Toyota_inova_2019");
				break;
			case 4:
				Toyota_qualis_2019 t2 = new Toyota_qualis_2019("Toyota_qualis_2019");
				break;
			case 5:
				Mahindra_bolero_2019 t3 = new Mahindra_bolero_2019("Mahindra_bolero_2019");
				break;
			case 6:
				Suzuki_wagonr_2019 t4 = new Suzuki_wagonr_2019("Suzuki_wagonr_2019");
				break;
			case 7:
				Suzuki_Swift_2019 t5 = new Suzuki_Swift_2019("Suzuki_Swift_2019");
				break;
			case 8:
				Suzuki_brezza_2019 t6 = new Suzuki_brezza_2019("Suzuki_brezza_2019");
				break;
			case 9:
				Toyota_fortuner_2019 t7 = new Toyota_fortuner_2019("Toyota_fortuner_2019");
				break;
			case 10:
				Suzuki_alto_800 t8 = new Suzuki_alto_800("Suzuki_alto_800");
				break;
		}
	}
}

// ==========================================================================================================
class suzukigixxer2019 extends TwoWheeler2019 {
	public suzukigixxer2019(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 9000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");

	}
}

class ktmrc2019 extends TwoWheeler2019 {
	public ktmrc2019(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 20000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class tvsstar2019 extends TwoWheeler2019 {
	public tvsstar2019(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 50000);
		System.out.println("Star Rating:" + 2);
		System.out.println("BUY NOW");
	}

}

class ktm_390_2019 extends TwoWheeler2019 {
	public ktm_390_2019(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 250000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class hyundai_i20_2019 extends TwoWheeler2019 {
	public hyundai_i20_2019(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class hyundai_i10_2019 extends TwoWheeler2019 {
	public hyundai_i10_2019(String name) {
		System.out.println("Name:" + 900000);
		System.out.println("Price:" + 1300);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class harley_750_2019 extends TwoWheeler2019 {
	public harley_750_2019(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 400000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class suzuki_125cc_2019 extends TwoWheeler2019 {
	public suzuki_125cc_2019(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 40000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class Honda_shine2019 extends TwoWheeler2019 {
	public Honda_shine2019(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Toyota_inova_2019 extends Fourwheeler2019 {
	public Toyota_inova_2019(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Toyota_qualis_2019 extends Fourwheeler2019 {
	public Toyota_qualis_2019(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1100000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class honda_unicorn_2019 extends TwoWheeler2019 {
	public honda_unicorn_2019(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 80000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Hero_xtreme_160 extends TwoWheeler2019 {
	public Hero_xtreme_160(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 7000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class Bajajpulsar2019 extends TwoWheeler2019 {
	public Bajajpulsar2019(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 6000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Mahindra_bolero_2019 extends Fourwheeler2019 {
	public Mahindra_bolero_2019(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 920000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Undertable extends TwoWheeler2019 {
	public Undertable(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 800);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class execar extends TwoWheeler2019 {
	public execar(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Suzuki_wagonr_2019 extends Fourwheeler2019 {
	public Suzuki_wagonr_2019(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 120000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class Dying extends TwoWheeler2019 {
	public Dying(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class tvs extends TwoWheeler2019 {
	public tvs(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class omega extends TwoWheeler2019 {
	public omega(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Suzuki_Swift_2019 extends Fourwheeler2019 {
	public Suzuki_Swift_2019(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}



class Suzuki_brezza_2019 extends Fourwheeler2019 {
	public Suzuki_brezza_2019(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Divinity extends TwoWheeler2019 {
	public Divinity(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Toyota_fortuner_2019 extends Fourwheeler2019 {
	public Toyota_fortuner_2019(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Suzuki_alto_800 extends Fourwheeler2019 {
	public Suzuki_alto_800(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class luna extends Fourwheeler2019 {
	public luna(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 80000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class SOMA extends TwoWheeler2019 {
	public SOMA(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 80012);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}


class mahindra2 extends TwoWheeler2019 {
	public mahindra2(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1800);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}



class Ferrari extends Fourwheeler2019 {
	public Ferrari(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class tvf extends TwoWheeler2019 {
	public tvf(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100200);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class bmw extends Fourwheeler2019 {
	public bmw(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}


class suzuki extends TwoWheeler2019 {
	public suzuki(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Mahindra extends TwoWheeler2019 {
	public Mahindra(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

