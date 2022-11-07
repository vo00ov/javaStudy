package org.study.oop;

public class Hcar {

	public static void main(String[] args) {
		
		Car h1 = new Car();
		h1.carName = "HCar";
		h1.carYear= 2023;
		h1.carCoin = 3000;
		h1.carCC = 3000;
		h1.carColor = "RED";
		
		h1.carInfo();
		
		CarBumfer bumfer1 = new CarBumfer();
		bumfer1.carBumferName = "HCar Bumfer";
		bumfer1.carBumferPrice = 200;
		
		CarHandle hHandle1 = new CarHandle();
		hHandle1.carHandleName = "HCar Handle";
		hHandle1.carHandlePrice = 2000;
		
		CarChain hChain = new CarChain();
		hChain.carChainName = "HCar Chain";
		hChain.carChainPrice = 100;
	}
}
