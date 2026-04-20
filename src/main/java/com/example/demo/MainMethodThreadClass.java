package com.example.demo;

public class MainMethodThreadClass {
	public static void main(String[] args) {
        Thread runnableThread = new Thread(new RunnableInterfaceBasedCustomThread());
        runnableThread.start();
        ThreadBasedCustomThread thread = new ThreadBasedCustomThread();
        thread.setPriority(10);
        thread.start();
    }
}
