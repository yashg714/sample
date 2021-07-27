package com.lti.main;

import java.util.Random;

public class CricketMatch {

	int runtype[] = new int[7];
	int Totalrun = 0;

	public CricketMatch() {
	}

	public int GenerateData() {
		for (int i = 0; i < 30; i++) {
			// int run=(int)(Math.random()*7);
			Random random = new Random();
			int run = random.nextInt(7);
			if (run == 5)
				run = random.nextInt(7);
			runtype[run] += 1;
			Totalrun += run;
			System.out.println("batsman hit " + run + " at " + (i + 1) + " Ball");
		}
		System.out.println("Total run scored is " + Totalrun);
		for (int i = 0; i < 7; i++) {
			if (i == 5)
				continue;
			System.out.println("Number of " + i + " :" + runtype[i]);
		}
		System.out.println("Batsman Strike rate is " + Totalrun / 30 * 100);
		return Totalrun;
	}

	public static void main(String[] args) {
		CricketMatch cm=new CricketMatch();
		int totalRun=0;
		totalRun+=cm.GenerateData();
		totalRun+=cm.GenerateData();
		totalRun+=cm.GenerateData();
		totalRun+=cm.GenerateData();
		totalRun+=cm.GenerateData();
		System.out.println("Average Run Scored: "+totalRun/5);
		System.out.println("Total run is "+totalRun);
	}

}
