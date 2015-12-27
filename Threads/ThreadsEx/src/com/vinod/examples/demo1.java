package com.vinod.examples;

public class demo1 extends Thread {
	@Override
	public void run() {
		for(int i=10;i<=30;i++){
			System.out.println("i="+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args)
	{
		demo1 d1=new demo1();
		d1.start();
		demo1 d2=new demo1();
		d2.start();
		demo1 d3=new demo1();
		d3.start();
	}
}
