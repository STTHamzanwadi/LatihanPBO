package org.stth.pbo.model;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class IntegralRiemann {
	private double batasBawah,batasAtas;
	private int partisi;
	private String fungsi;
	
	public IntegralRiemann(double batasBawah, double batasAtas, int partisi,
			String fungsi) {
		super();
		if (batasBawah>batasAtas){
			double temp;
			temp = batasAtas;
			batasAtas = batasBawah;
			batasBawah = temp;
		}
		this.batasBawah = batasBawah;
		this.batasAtas = batasAtas;
		this.partisi = partisi;
		this.fungsi = fungsi;
	}
	
	public double getNilaiIntegral(){
		double dx = (batasAtas - batasBawah)/partisi; // dx lebar partisi
		double nilaiIntegral = 0.0;
		double pos = batasBawah;
		for (int i=1;i<=partisi;i++){
			pos = pos + dx; //posisi x pada iterasi ke-i
			double luasPartisi =  getNilaiFungsi(pos) * dx; //luas partisi ke-i (dx kali nilai fungsi pada posisi pos)
			nilaiIntegral = nilaiIntegral + luasPartisi;
		}
		return nilaiIntegral;
	}
	
	public double getNilaiFungsi(double x){
		Expression e = new ExpressionBuilder(fungsi)
			.variable("x")
			.build()
			.setVariable("x", x);
		
		return e.evaluate();
	}
}
