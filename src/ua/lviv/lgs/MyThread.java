package ua.lviv.lgs;

public class MyThread extends Thread{	
	int [] fibonachiArray;
		
	public MyThread(int[] myFibArr) {
		super();
		this.fibonachiArray = myFibArr;
	}

	public void run() {		
		System.out.print("Потік Thread: ");
		for (int i = 0; i < fibonachiArray.length; i ++) {
			System.out.print(fibonachiArray[i] + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}									
		} 
		System.out.println();
	}
}
