package ua.lviv.lgs;

public class RunnableThread implements Runnable{
	int [] fibonachiArray;
		
	public RunnableThread(int[] myFibArr) {
		super();
		this.fibonachiArray = myFibArr;
	}


	@Override
	public void run() {
		System.out.print("Потік Runnable:  ");
		for(int i = fibonachiArray.length - 1; i>=0; i --) {
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
