package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class RunnableInterfaceBasedCustomThread implements Runnable {

	@Override
	public void run() {
		System.out.println("RunnableInterfaceBasedCustomThread is running...");
		try {
			Thread.sleep(10);
			System.out.println("Display odd number and limit 1000");
			List<Integer> oddNumbersList = new ArrayList<>();
			for (int i = 1; i < 1000; i++ ) {
				if (i % 2 == 1) {
					oddNumbersList.add(i);
				}
			}
			Thread.sleep(10);
			oddNumbersList.stream().forEach(System.out::println);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
