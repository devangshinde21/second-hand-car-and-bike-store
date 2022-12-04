package onlinestore;

import java.util.ArrayList;
import java.util.Scanner;

class y2018 extends vehiclesecondhand

{
	void year2018() {
		System.out.println("choose Twowheeler2018(1) or Fourwheeler2018(2)");
		Scanner scan = new Scanner(System.in);
		int choose = scan.nextInt();
		if (choose == 1) {
			Twowheeler2018 poi = new Twowheeler2018();
			poi.call1();
		} else if (choose == 2) {
			Fourwheeler2018 poi = new Fourwheeler2018();
			poi.call2();
		} else {
			System.out.println("Inalid Input");
		}
	}
}

class Twowheeler2018 extends y2018 {
	void call1() {
		System.out.println("Year 2018 Bikes");
		ArrayList view = new ArrayList();
		view.add("1.Yamaha_r3_2018");
		view.add("2.Yamaha_r1_2018");
		view.add("3.SUZKUKI_GIXXER250_2018");
		view.add("4.Toyota_Fortuner_2018");
		view.add("5.Suzkuki_hayabusa_2018");
		view.add("6.Suzkuki_hayabusa1000_2018");
		view.add("7.Yamaha_r15_2018");
		view.add("8.Suzuki_xsr1000_2018");
		view.add("9.Yamaha_rx100_2018");
		view.add("10.Magane_k200_2018");
		System.out.println("Choose Game you want Buy" + view);
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		switch (a) {
			case 1:
				Yamaha_r3_2018 t0 = new Yamaha_r3_2018("Yamaha_r3_2018");
				break;
			case 2:
				Yamaha_r1_2018 t = new Yamaha_r1_2018("Yamaha_r1_2018");
				break;
			case 3:
				SUZKUKI_GIXXER250_2018 t1 = new SUZKUKI_GIXXER250_2018("SUZKUKI_GIXXER250_2018");
				break;
			case 4:
				Toyota_Fortuner_2018 t2 = new Toyota_Fortuner_2018("Toyota_Fortuner_2018");
				break;
			case 5:
				Suzkuki_hayabusa_2018 t3 = new Suzkuki_hayabusa_2018("Suzkuki_hayabusa_2018");
				break;
			case 6:
				Suzkuki_hayabusa1000_2018 t4 = new Suzkuki_hayabusa1000_2018("Suzkuki_hayabusa1000_2018");
				break;
			case 7:
				Yamaha_r15_2018 t5 = new Yamaha_r15_2018("Yamaha_r15_2018");
				break;
			case 8:
				Suzuki_xsr1000_2018 t6 = new Suzuki_xsr1000_2018("Suzuki_xsr1000_2018");
				break;
			case 9:
				Yamaha_rx100_2018 t7 = new Yamaha_rx100_2018("Yamaha_rx100_2018");
				break;
			case 10:
				Magane_k200_2018 t8 = new Magane_k200_2018("Magane_k200_2018");
				break;

		}
	}
}

class Fourwheeler2018 extends y2018 {
	void call2() {
		System.out.println("Year 2018 Cars");
		ArrayList view1 = new ArrayList();
		view1.add("1.Mahindra_bolero_2018");
		view1.add("2.Mahindra_scorpio_2018");
		view1.add("3.Mahindra_xuv700_2018");
		view1.add("4.Tata_tiagos_2018");
		view1.add("5.Tata_tigar_2018");
		view1.add("6.ford_Mustang_2018");
		view1.add("7.Toyota_Fortuner_2018");
		view1.add("8.Suzuki_vitara_2018");
		view1.add("9.Toyota_innova_2018");
		view1.add("10.Toyota_innovacrista_2018");
		System.out.println("Choose Game you want Buy" + view1);
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();

		switch (b) {
			case 1:
				Mahindra_bolero_2018 t0 = new Mahindra_bolero_2018("Mahindra_bolero_2018");
				break;
			case 2:
				Mahindra_scorpio_2018 t = new Mahindra_scorpio_2018("Mahindra_scorpio_2018");
				break;
			case 3:
				Mahindra_xuv700_2018 t1 = new Mahindra_xuv700_2018("Mahindra_xuv700_2018");
				break;
			case 4:
				Tata_tiagos_2018 t2 = new Tata_tiagos_2018("Tata_tiagos_2018");
				break;
			case 5:
				Tata_tigar_2018 t3 = new Tata_tigar_2018("Tata_tigar_2018");
				break;
			case 6:
				ford_Mustang_2018 t4 = new ford_Mustang_2018("ford_Mustang_2018");
				break;
			case 7:
				Toyota_Fortuner_2018 t5 = new Toyota_Fortuner_2018("Toyota_Fortuner_2018");
				break;
			case 8:
				Suzuki_vitara_2018 t6 = new Suzuki_vitara_2018("Suzuki_vitara_2018");
				break;
			case 9:
				Toyota_innova_2018 t7 = new Toyota_innova_2018("Toyota_innova_2018");
				break;
			case 10:
				Toyota_innovacrista_2018 t8 = new Toyota_innovacrista_2018("Toyota_innovacrista_2018");
				break;
		}
	}
}

// ===========================================================================================================
class Yamaha_r3_2018 extends Twowheeler2018 {
	public Yamaha_r3_2018(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Yamaha_r1_2018 extends Twowheeler2018 {
	public Yamaha_r1_2018(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1800000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Mahindra_bolero_2018 extends Fourwheeler2018 {
	public Mahindra_bolero_2018(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class SUZKUKI_GIXXER250_2018 extends Twowheeler2018 {
	public SUZKUKI_GIXXER250_2018(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 120000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Mahindra_scorpio_2018 extends Fourwheeler2018 {
	public Mahindra_scorpio_2018(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Toyota_Fortuner_2018 extends Twowheeler2018 {
	public Toyota_Fortuner_2018(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 2000000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Mahindra_xuv700_2018 extends Fourwheeler2018 {
	public Mahindra_xuv700_2018(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Suzkuki_hayabusa_2018 extends Twowheeler2018 {
	public Suzkuki_hayabusa_2018(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 150000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class Suzkuki_hayabusa1000_2018 extends Twowheeler2018 {
	public Suzkuki_hayabusa1000_2018(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class Yamaha_r15_2018 extends Twowheeler2018 {
	public Yamaha_r15_2018(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Suzuki_xsr1000_2018 extends Twowheeler2018 {
	public Suzuki_xsr1000_2018(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 90000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Yamaha_rx100_2018 extends Twowheeler2018 {
	public Yamaha_rx100_2018(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 200000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Magane_k200_2018 extends Twowheeler2018 {
	public Magane_k200_2018(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 150000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class ford_Mustang_2018 extends Twowheeler2018 {
	public ford_Mustang_2018(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 5200000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class Suzuki_vitara_2018 extends Twowheeler2018 {
	public Suzuki_vitara_2018(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class lolos extends Twowheeler2018 {
	public lolos(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1800);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Toyota_innova_2018 extends Twowheeler2018 {
	public Toyota_innova_2018(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1300000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Banners extends Twowheeler2018 {
	public Banners(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 800);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Toyota_innovacrista_2018 extends Twowheeler2018 {
	public Toyota_innovacrista_2018(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 800000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class TheDivision extends Twowheeler2018 {
	public TheDivision(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 800);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class WorldOfcar extends Twowheeler2018 {
	public WorldOfcar(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Oxen extends Twowheeler2018 {
	public Oxen(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Owlboyrider extends Twowheeler2018 {
	public Owlboyrider(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class porche extends Twowheeler2018 {
	public porche(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1800);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Tata_tiagos_2018 extends Fourwheeler2018 {
	public Tata_tiagos_2018(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class PonyIsland extends Twowheeler2018 {
	public PonyIsland(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class ElderScrollsrider extends Twowheeler2018 {
	public ElderScrollsrider(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class Thumperscar extends Twowheeler2018 {
	public Thumperscar(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Quantumcar extends Twowheeler2018 {
	public Quantumcar(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class JobSimulator extends Twowheeler2018 {
	public JobSimulator(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class DeadRider extends Twowheeler2018 {
	public DeadRider(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Obductionbikes extends Twowheeler2018 {
	public Obductionbikes(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1300);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Uncharted4_Theifend extends Twowheeler2018 {
	public Uncharted4_Theifend(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1300);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class MirrorEdge extends Twowheeler2018 {
	public MirrorEdge(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Tata_tigar_2018 extends Fourwheeler2018 {
	public Tata_tigar_2018(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Batmancar extends Twowheeler2018 {
	public Batmancar(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class ferrari extends Twowheeler2018 {
	public ferrari(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class tvs extends Twowheeler2018 {
	public tvs(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100020);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}
