package org.stth.pbo.demo;

import com.stth.util.Peluang;

public class DemoPeluang {
	public static void main(String[] args) {
		//contoh cara menggunakan peluang util
		try {
			System.out.println(Peluang.permutasi(5, 2));
			System.out.println(Peluang.permutasiSiklik(3));
			System.out.println(Peluang.kombinasi(3, 1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
