package org.stth.pbo.demo;

import org.stth.pbo.model.RegresiLinierSederhana;

public class DemoRegresiLinierSederhana {
	public static void main(String[] args) {
		RegresiLinierSederhana rls = new RegresiLinierSederhana();
		//rls.cetakPerhitungan();
		rls.tambahTitik(1, 4.5);
		rls.tambahTitik(2, 6.5);
		rls.tambahTitik(3, 8.5);
		rls.tambahTitik(4, 10.5);
		rls.cetakPerhitungan();
		System.out.println(rls.estimasi(5.0));
	}

}
