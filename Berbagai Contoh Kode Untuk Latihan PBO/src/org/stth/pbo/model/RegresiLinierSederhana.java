package org.stth.pbo.model;

import java.util.ArrayList;
import java.util.List;

public class RegresiLinierSederhana {
	/**
	 * Contoh model class sederhana untuk melakukan perhitungan regresi linear dua dimensi
	 * Persamaan y = mx+c, dimana m = gradien dan c= konstanta
	 * Class ini langsung melakukan perhitungan setiap terjadi penambahan data
	 * 
	 */
	private List<TitikDuaDimensi> daftarTitik = new ArrayList<>();
	private double jumlahX,jumlahX2,jumlahY,jumlahY2,jumlahXY;
	private double gradien;
	private double konstanta;
	
	public void tambahTitik(double x, double y){
		TitikDuaDimensi t = new TitikDuaDimensi(x,y);
		tambahTitik(t);
	}
	
	public void tambahTitik(TitikDuaDimensi titik){
		daftarTitik.add(titik);
		hitungRegresi();
	}
	
	public void hitungRegresi(){
		if (daftarTitik.size() <= 0){
			return;
		} else {
			jumlahX = 0.0;
			jumlahX2 = 0.0;
			jumlahY = 0.0;
			jumlahY2 = 0.0;
			jumlahXY = 0.0;
			int n = daftarTitik.size();
			for (TitikDuaDimensi t : daftarTitik) {
				jumlahX += t.x;
				jumlahX2 += t.x * t.x;
				jumlahY += t.y;
				jumlahY2 += t.y * t.y;
				jumlahXY += t.x * t.y;
			}
			gradien = ((n * jumlahXY)-(jumlahX * jumlahY))/((n * jumlahX2) - (jumlahX*jumlahX));
			konstanta = ((jumlahY * jumlahX2)-(jumlahX * jumlahXY))/(n * jumlahX2 - (jumlahX*jumlahX));
		}	
	}
	public void cetakPerhitungan(){
		if (daftarTitik.size() <= 0){
			System.err.println("Belum ada titik sampel");
			return;
		} else {
			System.out.println("Jumlah titik = " + daftarTitik.size());
			System.out.println("Berikut adalah daftar titik tersebut :");
			for (TitikDuaDimensi t : daftarTitik) {
				System.out.println("("+t.x+","+ t.y+")");
			}
			System.out.println("Jumlah x dan x kuadrat = " +jumlahX +" dan "+ jumlahX2);
			System.out.println("Jumlah y dan y kuadrat = " +jumlahY +" dan "+ jumlahY2);
			System.out.println("Jumlah x kali y = "+jumlahXY);
			System.out.println("Gradien (m) = " + gradien );
			System.out.println("Konstanta (c) = " + konstanta );
			System.out.println("Persamaan garis  y = " + gradien+"x + "+konstanta );
		}
	}
	public Double estimasi(double nilaiX){
		double hasil;
		if (daftarTitik.size() <= 0){
			System.err.println("Belum ada titik sampel");
			return null;
		} else {
			hasil =  (gradien * nilaiX) + konstanta;
			return hasil;
		}
	}
}
