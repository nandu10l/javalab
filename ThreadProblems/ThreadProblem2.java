package javalab;
import java.util.Random;
class NumberManager{
	private int generatedNumber;
	private boolean numberGenerated=false;
	public synchronized void generateNumber() {
		
			generatedNumber =new Random().nextInt(20)+2;
			System.out.println("Generated random number:"+generatedNumber);
		    numberGenerated=true;
		    notifyAll();
		
	}
	public synchronized void printEvenNumbers() throws InterruptedException{
		while(!numberGenerated || generatedNumber%2!=0) {
			wait();
		}
		for(int i=2;i<=generatedNumber;i+=2) {
			System.out.print(i+" ");
			
		}
		numberGenerated=false;
	}
	public synchronized void printOddNumbers() throws InterruptedException{
		while(!numberGenerated || generatedNumber%2==0) {
			wait();
		}
		for(int i=1;i<=generatedNumber;i+=2) {
			System.out.print(i+" ");
		}
		numberGenerated=false;
	}
}
class numberGenerator extends Thread{
	
	NumberManager numberManager;
	public numberGenerator (NumberManager numberManager) {
		this.numberManager= numberManager;
				
	}
    public void run() {
    	while(true) {
    		numberManager.generateNumber();	
        	try {
    			Thread.sleep(1000);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		
    	}
    }
    }
    
}

class evenPrintThread extends Thread {
	NumberManager numberManager;
	public  evenPrintThread(NumberManager numberManager) {
		this.numberManager=numberManager;
		
	}
	public void run() {
		while(true) {
			try {
				numberManager.printEvenNumbers();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class oddPrintThread extends Thread {
	NumberManager numberManager;
	public  oddPrintThread(NumberManager numberManager) {
		this.numberManager=numberManager;
		
	}
	public void run() {
		while(true) {
			try {
				numberManager.printOddNumbers();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadProblem2 {
	public static void main(String [] args) {
		NumberManager numberManager=new NumberManager();
		numberGenerator numberGenerator = new numberGenerator(numberManager);
		evenPrintThread evenPrintThread=new evenPrintThread(numberManager);
		oddPrintThread oddPrintThread=new oddPrintThread(numberManager);
		numberGenerator.start();
		evenPrintThread.start();
		oddPrintThread.start();
	}
}
