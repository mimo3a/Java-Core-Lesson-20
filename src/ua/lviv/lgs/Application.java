package ua.lviv.lgs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {
	public static void main(String[] args) throws InterruptedException {
		int [] myFibArr;
		myFibArr = new MyScanner().runnScanner();
		
		MyThread mth = new MyThread(myFibArr);
		mth.start();
		mth.join();
		RunnableThread rth = new RunnableThread(myFibArr);
		Thread t = new Thread(rth);
		t.start();
		
		
//		CachedThreadPool
		
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new MyThread(myFibArr));
		exec.execute(new RunnableThread(myFibArr));
		exec.shutdown();
		
//		FixedThreadPool
		
		ExecutorService exec2 = Executors.newFixedThreadPool(2);
		exec2.execute(new MyThread(myFibArr));
		exec2.execute(new RunnableThread(myFibArr));
		exec2.shutdown();
		
//		SingleThreadExecutor
		
		ExecutorService exec3 = Executors.newSingleThreadExecutor();
		exec3.execute(new MyThread(myFibArr));
		exec3.execute(new RunnableThread(myFibArr));
		exec3.shutdown();		
	}

}
