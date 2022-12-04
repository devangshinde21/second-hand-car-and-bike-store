package onlinestore;

import java.util.ArrayList;
import java.util.Scanner;

class y2020 extends vehiclesecondhand

{
	void year2020() {
		System.out.println("choose Twowheeler2020(1) or Fourwheeler2020(2)");
		Scanner scan = new Scanner(System.in);
		int choose = scan.nextInt();
		if (choose == 1) {
			Twowheeler2020 poi = new Twowheeler2020();
			poi.call1();
		} else if (choose == 2) {
			Fourwheeler2020 poi = new Fourwheeler2020();
			poi.call2();
		} else {
			System.out.println("Inalid Input");
		}
	}
}

class Twowheeler2020 extends y2020 {
	void call1() {
		System.out.println("Year 2020 Bikes");
		ArrayList view = new ArrayList();
		view.add("1.Yamaha_r3_2020");
		view.add("2.Yamaha_r1_2020");
		view.add("3.SUZKUKI_GIXXER250_2020");
		view.add("4.Toyota_Fortuner_2020");
		view.add("5.Suzkuki_hayabusa_2020");
		view.add("6.Suzkuki_hayabusa1000_2020");
		view.add("7.Yamaha_r15_2020");
		view.add("8.Suzuki_xsr1000_2020");
		view.add("9.Yamaha_rx100_2020");
		view.add("10.Magane_k200_2020");
		System.out.println("Choose Game you want Buy" + view);
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		switch (a) {
			case 1:
				Yamaha_r3_2020 t0 = new Yamaha_r3_2020("Yamaha_r3_2020");
				break;
			case 2:
				Yamaha_r1_2020 t = new Yamaha_r1_2020("Yamaha_r1_2020");
				break;
			case 3:
				SUZKUKI_GIXXER250_2020 t1 = new SUZKUKI_GIXXER250_2020("SUZKUKI_GIXXER250_2020");
				break;
			case 4:
				Toyota_Fortuner_2020 t2 = new Toyota_Fortuner_2020("Toyota_Fortuner_2020");
				break;
			case 5:
				Suzkuki_hayabusa_2020 t3 = new Suzkuki_hayabusa_2020("Suzkuki_hayabusa_2020");
				break;
			case 6:
				Suzkuki_hayabusa1000_2020 t4 = new Suzkuki_hayabusa1000_2020("Suzkuki_hayabusa1000_2020");
				break;
			case 7:
				Yamaha_r15_2020 t5 = new Yamaha_r15_2020("Yamaha_r15_2020");
				break;
			case 8:
				Suzuki_xsr1000_2020 t6 = new Suzuki_xsr1000_2020("Suzuki_xsr1000_2020");
				break;
			case 9:
				Yamaha_rx100_2020 t7 = new Yamaha_rx100_2020("Yamaha_rx100_2020");
				break;
			case 10:
				Magane_k200_2020 t8 = new Magane_k200_2020("Magane_k200_2020");
				break;

		}
	}
}

class Fourwheeler2020 extends y2020 {
	void call2() {
		System.out.println("Year 2020 Cars");
		ArrayList view1 = new ArrayList();
		view1.add("1.Mahindra_bolero_2020");
		view1.add("2.Mahindra_scorpio_2020");
		view1.add("3.Mahindra_xuv700_2020");
		view1.add("4.Tata_tiagos_2020");
		view1.add("5.Tata_tigar_2020");
		view1.add("6.ford_Mustang_2020");
		view1.add("7.Toyota_Fortuner_2020");
		view1.add("8.Suzuki_vitara_2020");
		view1.add("9.Toyota_innova_2020");
		view1.add("10.Toyota_innovacrista_2020");
		System.out.println("Choose Game you want Buy" + view1);
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();

		switch (b) {
			case 1:
				Mahindra_bolero_2020 t0 = new Mahindra_bolero_2020("Mahindra_bolero_2020");
				break;
			case 2:
				Mahindra_scorpio_2020 t = new Mahindra_scorpio_2020("Mahindra_scorpio_2020");
				break;
			case 3:
				Mahindra_xuv700_2020 t1 = new Mahindra_xuv700_2020("Mahindra_xuv700_2020");
				break;
			case 4:
				Tata_tiagos_2020 t2 = new Tata_tiagos_2020("Tata_tiagos_2020");
				break;
			case 5:
				Tata_tigar_2020 t3 = new Tata_tigar_2020("Tata_tigar_2020");
				break;
			case 6:
				ford_Mustang_2020 t4 = new ford_Mustang_2020("ford_Mustang_2020");
				break;
			case 7:
				Toyota_Fortuner_2020 t5 = new Toyota_Fortuner_2020("Toyota_Fortuner_2020");
				break;
			case 8:
				Suzuki_vitara_2020 t6 = new Suzuki_vitara_2020("Suzuki_vitara_2020");
				break;
			case 9:
				Toyota_innova_2020 t7 = new Toyota_innova_2020("Toyota_innova_2020");
				break;
			case 10:
				Toyota_innovacrista_2020 t8 = new Toyota_innovacrista_2020("Toyota_innovacrista_2020");
				break;
		}
	}
}

// ===========================================================================================================
class Yamaha_r3_2020 extends Twowheeler2020 {
	public Yamaha_r3_2020(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Yamaha_r1_2020 extends Twowheeler2020 {
	public Yamaha_r1_2020(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1800);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Mahindra_bolero_2020 extends Fourwheeler2020 {
	public Mahindra_bolero_2020(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class SUZKUKI_GIXXER250_2020 extends Twowheeler2020 {
	public SUZKUKI_GIXXER250_2020(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Mahindra_scorpio_2020 extends Fourwheeler2020 {
	public Mahindra_scorpio_2020(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Toyota_Fortuner_2020 extends Twowheeler2020 {
	public Toyota_Fortuner_2020(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Mahindra_xuv700_2020 extends Fourwheeler2020 {
	public Mahindra_xuv700_2020(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Suzkuki_hayabusa_2020 extends Twowheeler2020 {
	public Suzkuki_hayabusa_2020(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class Suzkuki_hayabusa1000_2020 extends Twowheeler2020 {
	public Suzkuki_hayabusa1000_2020(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class Yamaha_r15_2020 extends Twowheeler2020 {
	public Yamaha_r15_2020(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Suzuki_xsr1000_2020 extends Twowheeler2020 {
	public Suzuki_xsr1000_2020(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Yamaha_rx100_2020 extends Twowheeler2020 {
	public Yamaha_rx100_2020(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1300);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Magane_k200_2020 extends Twowheeler2020 {
	public Magane_k200_2020(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class ford_Mustang_2020 extends Twowheeler2020 {
	public ford_Mustang_2020(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1300);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class Suzuki_vitara_2020 extends Twowheeler2020 {
	public Suzuki_vitara_2020(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 800);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class lolos extends Twowheeler2020 {
	public lolos(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1800);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Toyota_innova_2020 extends Twowheeler2020 {
	public Toyota_innova_2020(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1300);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Banners extends Twowheeler2020 {
	public Banners(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 800);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Toyota_innovacrista_2020 extends Twowheeler2020 {
	public Toyota_innovacrista_2020(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 800);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class TheDivision extends Twowheeler2020 {
	public TheDivision(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 800);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class WorldOfcar extends Twowheeler2020 {
	public WorldOfcar(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Oxen extends Twowheeler2020 {
	public Oxen(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Owlboyrider extends Twowheeler2020 {
	public Owlboyrider(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class porche extends Twowheeler2020 {
	public porche(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1800);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Tata_tiagos_2020 extends Fourwheeler2020 {
	public Tata_tiagos_2020(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class PonyIsland extends Twowheeler2020 {
	public PonyIsland(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class ElderScrollsrider extends Twowheeler2020 {
	public ElderScrollsrider(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1500);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class Thumperscar extends Twowheeler2020 {
	public Thumperscar(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Quantumcar extends Twowheeler2020 {
	public Quantumcar(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class JobSimulator extends Twowheeler2020 {
	public JobSimulator(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class DeadRider extends Twowheeler2020 {
	public DeadRider(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1200);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Obductionbikes extends Twowheeler2020 {
	public Obductionbikes(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1300);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Uncharted4_Theifend extends Twowheeler2020 {
	public Uncharted4_Theifend(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1300);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class MirrorEdge extends Twowheeler2020 {
	public MirrorEdge(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class Tata_tigar_2020 extends Fourwheeler2020 {
	public Tata_tigar_2020(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}

class Batmancar extends Twowheeler2020 {
	public Batmancar(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 1000);
		System.out.println("Star Rating:" + 4);
		System.out.println("BUY NOW");
	}
}

class ferrari extends Twowheeler2020 {
	public ferrari(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100000);
		System.out.println("Star Rating:" + 5);
		System.out.println("BUY NOW");
	}
}

class tvs extends Twowheeler2020 {
	public tvs(String name) {
		System.out.println("Name:" + name);
		System.out.println("Price:" + 100020);
		System.out.println("Star Rating:" + 3);
		System.out.println("BUY NOW");
	}
}
