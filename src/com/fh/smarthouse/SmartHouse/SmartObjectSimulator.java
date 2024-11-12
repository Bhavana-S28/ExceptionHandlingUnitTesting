package com.fh.smarthouse.SmartHouse;

import com.fh.smarthous.Objects.Light;

public class SmartObjectSimulator {

	public static void main(String[] args) {
		Light livingRoomLight = new Light("LivingRoomLight", 60);

        SolarPanel solarPanel = new SolarPanel(500);

		livingRoomLight.turnOn();
		livingRoomLight.turnOff();

		System.out.print(livingRoomLight.getConsumption());

	}

}
