package org.stth.pbo.model;

public class Lingkaran {
	private double r; //r adalah jari-jari lingkaran
	
	
	
	public Lingkaran(double r) throws Exception {
		super();
		setR(r);
	}

	public double getR() {
		return r;
	}

	public void setR(double r) throws Exception{
		if (r>0){
			this.r = r;
		} else {
			throw new Exception("Jari-jari lingkaran harus lebih besar dari nol");
		}
	}
	
	public double getKeliling(){
		return Math.PI * r * 2;
	}
	
	public double getLuas(){
		return Math.PI * r * r;
	}

}
