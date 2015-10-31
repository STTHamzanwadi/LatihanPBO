package org.stth.pbo.model;

public class Silinder {
	private double r;
	private double t;
	
	public Silinder(double r, double t) {
		super();
		this.r = r;
		this.t = t;
	}
	
	
	public double getR() {
		return r;
	}


	public void setR(double r) throws Exception {
		if (r > 0){
			this.r = r;
		} else {
			throw new Exception("Jari-jari alas harus lebih besar dari nol");
		}
	}


	public double getT() {
		return t;
	}


	public void setT(double t) throws Exception {
		if (t > 0){
			this.t = t;
		} else {
			throw new Exception("Tinggi harus lebih besar dari nol");
		}
	}


	public double getLuasAlas(){
		return Math.PI * r * r;
	}
	
	public double getVolume(){
		return getLuasAlas() * t;
	}
	
	public double getLuasSelimut(){
		return Math.PI * 2 * r * t;
	}
	
	public double getLuasPermukaan(){
		return getLuasAlas() + getLuasSelimut();
	}

}
