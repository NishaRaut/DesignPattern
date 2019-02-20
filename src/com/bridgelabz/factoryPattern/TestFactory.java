package com.bridgelabz.factoryPattern;
import com.bridgelabz.factoryPattern.ComputerFactory;
import com.bridgelabz.factoryPattern.Computer;

public class TestFactory {
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}
}
