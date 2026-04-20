package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ThreadBasedCustomThread extends Thread {
	public void run() {
		System.out.println("ThreadBasedCustomThread is running...");
		try {
			Thread.sleep(10);
			System.out.println("Display even numbers and limit 1000");
			List<Integer> evenNumbersList = new ArrayList<>();
			for (int i = 1; i < 1000; i++ ) {
				if (i % 2 == 0) {
					evenNumbersList.add(i);
				}
			}
			Thread.sleep(10);
			evenNumbersList.stream().forEach(System.out::println);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
