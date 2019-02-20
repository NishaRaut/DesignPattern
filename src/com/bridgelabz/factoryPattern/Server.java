package com.bridgelabz.factoryPattern;
public class Server extends Pc {
	private String ram;
	private String hdd;
	private String cpu;

	
	public Server(String ram, String hdd, String cpu, String ram2, String hdd2, String cpu2) {
		super(ram, hdd, cpu);
		ram = ram2;
		hdd = hdd2;
		cpu = cpu2;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}


}
