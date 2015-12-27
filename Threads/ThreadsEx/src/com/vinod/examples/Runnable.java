package com.vinod.examples;

public interface Runnable {
	void run();	
}

class test implements Runnable{
	@Override
	public void run() {
		System.out.println("Print numbers");
		for (int i = 0; i <=10; i++) {
			System.out.println("i="+i);
			try {
				Thread.sleep(1000,100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class MainClass{
	public static void main(String[] args) {
		test t=new test();
		Thread t1=new Thread();
		t1.start();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
	}
}
