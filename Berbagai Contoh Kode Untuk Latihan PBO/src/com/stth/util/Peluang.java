package com.stth.util;

public class Peluang {
	public static int faktorial(int n) throws Exception{
		if (n>=0){
			int hasil = 1;
			if (n>1){
				hasil = n * faktorial(n-1);
			} else if (n==1||n==0){
				hasil = 1;
			} 
			return hasil;
		} else {
			throw new Exception("Bilangan harus lebih besar dari 0");
		}
	}
	public static double permutasi(int elemen, int posisi) throws Exception{
		double hasil = 0.0;
		if (elemen>=posisi && elemen>0 && posisi>0){
			hasil = faktorial(elemen)/faktorial(elemen-posisi);
		} else {
			throw new Exception("jumlah elemen harus lebih besar dari posisi penempatan, keduanya harus lebih besar dari 0");
		}
		return hasil;
	}
	public static double permutasiSiklik(int elemen) throws Exception{
		double hasil = 0.0;
		if (elemen>=0){
			hasil = faktorial(elemen-1);
		} else {
			throw new Exception("jumlah elemen harus lebih besar dari 0");
		}
		return hasil;
	}
	public static double kombinasi(int elemen, int posisi) throws Exception{
		double hasil = 0.0;
		if (elemen>=posisi && elemen>0 && posisi>0){
			hasil = faktorial(elemen)/(faktorial(elemen-posisi)*faktorial(posisi));
		} else {
			throw new Exception("jumlah elemen harus lebih besar dari posisi penempatan, keduanya harus lebih besar dari 0");
		}
		return hasil;
	}
}
