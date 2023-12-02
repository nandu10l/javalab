package threadProblems;
import java.util.Random;

	
	class NumberManager{
		private int generatedNumber;
		private boolean numberGenerated=false;
		public synchronized void generateNumber() {
			
				generatedNumber =new Random().nextInt(99)+1;
				System.out.println("Generated random number:"+generatedNumber);
			    numberGenerated=true;
			    notifyAll();
			
		}
		public synchronized void printEvenNumber() throws InterruptedException{
			while(!numberGenerated || generatedNumber%2!=0) {
				wait();
			}
			System.out.println("The square of The number is: "+ generatedNumber*generatedNumber);
			System.out.println("");
			numberGenerated=false;
		}
		public synchronized void printOddNumber() throws InterruptedException{
			while(!numberGenerated || generatedNumber%2==0) {
				wait();
			}
			
				System.out.print("The cube of The number is: "+generatedNumber*generatedNumber*generatedNumber);
				System.out.println("");
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
					numberManager.printEvenNumber();
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
					numberManager.printOddNumber();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

public class MutliThread2 {
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

