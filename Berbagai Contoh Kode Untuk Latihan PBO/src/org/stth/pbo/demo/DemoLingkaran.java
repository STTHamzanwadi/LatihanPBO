package org.stth.pbo.demo;

import org.stth.pbo.model.Lingkaran;

public class DemoLingkaran {
	public static void main(String[] args) {
		try {
			Lingkaran l = new Lingkaran(2);
			System.out.println(l.getKeliling());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
