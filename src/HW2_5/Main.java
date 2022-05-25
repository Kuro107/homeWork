package HW2_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//	Task A
		SUV hummer = new SUV();
		hummer.name = "HUMMER";
		hummer.carBodyType = "SUV";
		hummer.driveUnit = "4WD";
		hummer.engineType = "Electrical engine";
		System.out.println(hummer + "\n");

		SpecialEquipment excavator = new SpecialEquipment();
		excavator.name = "Excavator Daewoo";
		excavator.carBodyType = "Cabin";
		excavator.occupation = "Dig";
		excavator.haveWheels = false;
		excavator.engineType = "Internal combustion engine";
		System.out.println(excavator + "\n");

		Supercar mclaren = new Supercar();
		mclaren.name = "Mclaren f1231";
		mclaren.carBodyType = "sport car";
		mclaren.engineType = "Internal combustion engine";
		mclaren.engineHP = 1200;
		mclaren.maxSpeed = 480;
		System.out.println(mclaren + "\n");

//Task B
		System.out.println("Введите любое число для получения квадрата или введите 1 для получения круга");
		int a = sc.nextInt();
		 
		if (a == 1) {
			Сircle crObj = new Сircle();
			System.out.println("Введите из каких символов будет фигура");
			char c = sc.next().charAt(0);
			crObj.setSybol(c);
			crObj.draw(crObj.getSybol());
			

		}else {
			Square sqObj = new Square();			
			System.out.println("Введите из каких символов будет фигура");
			char c = sc.next().charAt(0);
			sqObj.setSybol(c);
			sqObj.draw(sqObj.getSybol());
		}
		
		


	}

}
