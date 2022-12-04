package onlinestore;

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.stream.events.StartDocument;

class y2015 extends vehiclesecondhand {
	void year2015() {
		System.out.println("choose TwoWheeler2015(1) or Fourwheeler2015(2)");
		Scanner scan = new Scanner(System.in);
		int choose = scan.nextInt();
		if (choose == 1) {
			TwoWheeler2015 poi = new TwoWheeler2015();
			poi.call1();
		} else if (choose == 2) {
			Fourwheeler2015 poi = new Fourwheeler2015();
			poi.call2();
		} else {
			System.out.println("Inalid Input");
		}
	}
}

class TwoWheeler2015 extends y2015 {
	void call1() {
		System.out.println("Year 2015 bikes");
		ArrayList view = new ArrayList();
		view.add("1.suzukigixxer2015");
		view.add("2.ktmrc2015");
		view.add("3.tvs_star_city_110cc_2015 ");
		view.add("4.ktm_390_2015");
		view.add("5.harley_750_2015");
		view.add("6.suzuki_125cc_2015 ");
		view.add("7.honda_shine2015");
		view.add("honda_unicorn_2015");
		view.add("9.hero_xtreme_160");
		view.add("10.bajajpulsar2015");
		System.out.println("Choose Game you want Buy" + view);
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		switch (a) {
			case 1:
				suzukigixxer2015 t0 = new suzukigixxer2015("suzukigixxer2015");
				break;
			case 2:
				ktmrc2015 t = new ktmrc2015("ktm rc 200cc 2015");
				break;
			case 3:
				tvsstar2015 t1 = new tvsstar2015("tvsstar2015");
				break;
			case 4:
				ktm_390_2015 t2 = new ktm_390_2015("ktm_390_2015");
				break;
			case 5:
				harley_750_2015 t3 = new harley_750_2015("harley_750_2015");
				break;
			case 6:
				suzuki_125cc_2015 t4 = new suzuki_125cc_2015("suzuki_125cc_2015");
				break;
			case 7:
				Honda_shine2015 t5 = new Honda_shine2015("Honda_shine2015");
				break;
			case 8:
				honda_unicorn_2015 t6 = new honda_unicorn_2015("honda_unicorn_2015");
				break;
			case 9:
				Hero_xtreme_160 t7 = new Hero_xtreme_160("Hero_xtreme_160");
				break;
			case 10:
				Bajajpulsar2015 t8 = new Bajajpulsar2015("Bajajpulsar2015");
				break;
			default:

				System.err.println("invalid input");
				call1();

		}
	}

}

class Fourwheeler2015 extends y2015 {
	void call2() {
		System.out.println("Year 2015 Fourwheeler");
		ArrayList view1 = new ArrayList();
		view1.add("1.Hyundai_i20_2015");
		view1.add("2.Hyundai_i10_2015");
		view1.add("3.Toyota_inova_2015");
		view1.add("4.Toyota_qualis_2015");
		view1.add("5.Mahindra_bolero_2015");
		view1.add("6.Suzuki_wagonr_2015");
		view1.add("7.Suzuki_Swift_2015");
		view1.add("8.Suzuki_vitara_2015");
		view1.add("9.Toyota_fortuner_2015");
		view1.add("10.Suzuki_alto_800");
		System.out.println("Choose Game you want Buy" + view1);
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();

		switch (b) {
			case 1:
				hyundai_i20_2015 t0 = new hyundai_i20_2015("hyundai_i20_2015");
				break;
			case 2:
				hyundai_i10_2015 t = new hyundai_i10_2015("hyundai_i10_2015");
				break;
			case 3:
				Toyota_inova_2015 t1 = new Toyota_inova_2015("Toyota_inova_2015");
				break;
			case 4:
				Toyota_qualis_2015 t2 = new Toyota_qualis_2015("Toyota_qualis_2015");
				break;
			case 5:
				Mahindra_bolero_2015 t3 = new Mahindra_bolero_2015("Mahindra_bolero_2015");
				break;
			case 6:
				Suzuki_wagonr_2015 t4 = new Suzuki_wagonr_2015("Suzuki_wagonr_2015");
				break;
			case 7:
				Suzuki_Swift_2015 t5 = new Suzuki_Swift_2015("Suzuki_Swift_2015");
				break;
			case 8:
				Suzuki_vitara_2015 t6 = new Suzuki_vitara_2015("Suzuki_vitara_2015");
				break;
			case 9:
				Toyota_fortuner_2015 t7 = new Toyota_fortuner_2015("Toyota_fortuner_2015");
				break;
			case 10:
				Suzuki_alto_800 t8 = new Suzuki_alto_800("Suzuki_alto_800");
				break;
		}
	}
}

// ==========================================================================================================
class suzukigixxer2015 extends TwoWheeler2015 {
	public suzukigixxer2015(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 9000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");

	}
}

class ktmrc2015 extends TwoWheeler2015 {
	public ktmrc2015(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 20000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class tvsstar2015 extends TwoWheeler2015 {
	public tvsstar2015(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 50000);
		System.out.println("Star Rating:" + 2);
		System.out.println("BUY NOW");
	}

}

class ktm_390_2015 extends TwoWheeler2015 {
	public ktm_390_2015(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 250000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class hyundai_i20_2015 extends TwoWheeler2015 {
	public hyundai_i20_2015(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class hyundai_i10_2015 extends TwoWheeler2015 {
	public hyundai_i10_2015(String name) {
		System.out.println("Name:" + 900000);
		System.out.println("Price:" + 1300);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class harley_750_2015 extends TwoWheeler2015 {
	public harley_750_2015(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 400000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class suzuki_125cc_2015 extends TwoWheeler2015 {
	public suzuki_125cc_2015(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 40000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class Honda_shine2015 extends TwoWheeler2015 {
	public Honda_shine2015(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Toyota_inova_2015 extends Fourwheeler2015 {
	public Toyota_inova_2015(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Toyota_qualis_2015 extends Fourwheeler2015 {
	public Toyota_qualis_2015(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1100000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class honda_unicorn_2015 extends TwoWheeler2015 {
	public honda_unicorn_2015(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 80000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Hero_xtreme_160 extends TwoWheeler2015 {
	public Hero_xtreme_160(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 7000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class Bajajpulsar2015 extends TwoWheeler2015 {
	public Bajajpulsar2015(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 6000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Mahindra_bolero_2015 extends Fourwheeler2015 {
	public Mahindra_bolero_2015(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 920000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}



class Suzuki_wagonr_2015 extends Fourwheeler2015 {
	public Suzuki_wagonr_2015(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 120000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}


class tvs extends TwoWheeler2015 {
	public tvs(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Suzuki_Swift_2015 extends Fourwheeler2015 {
	public Suzuki_Swift_2015(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}


class Suzuki_vitara_2015 extends Fourwheeler2015 {
	public Suzuki_vitara_2015(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}


class Toyota_fortuner_2015 extends Fourwheeler2015 {
	public Toyota_fortuner_2015(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Suzuki_alto_800 extends Fourwheeler2015 {
	public Suzuki_alto_800(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}



class Ferrari extends Fourwheeler2015 {
	public Ferrari(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class bmw extends Fourwheeler2015 {
	public bmw(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}


class suzuki extends TwoWheeler2015 {
	public suzuki(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Mahindra extends TwoWheeler2015 {
	public Mahindra(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

