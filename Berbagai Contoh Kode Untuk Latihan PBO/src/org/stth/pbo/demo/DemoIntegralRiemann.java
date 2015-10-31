package org.stth.pbo.demo;

import org.stth.pbo.model.IntegralRiemann;

public class DemoIntegralRiemann {
	public static void main(String[] args) {
		double bb=0;
		double ba=3;
		String fungsi = "x^2+2*x";
		int partisi = 1000;
		IntegralRiemann iR = new IntegralRiemann(bb, ba, partisi, fungsi);
		System.out.println(iR.getNilaiIntegral());
	}

}
