import java.util.Scanner;
class MultiplicationTable{
	synchronized void printMultiplicationTable(int num1) {
		
			for(int i=1;i<=10;i++) {
				System.out.println(i+"*"+num1+"="+i*num1);
			}
		
		
	}
}
class Thread1 extends Thread{
	
	 MultiplicationTable t;
	 Thread1(MultiplicationTable t){
		 this.t=t;
	 }
	public void run() {
		t.printMultiplicationTable(5);
	}
}
class Thread2 extends Thread{
	MultiplicationTable u;
	Thread2(MultiplicationTable u){
		this.u=u;
	}
	public void run(){
		u.printMultiplicationTable(7); 
	}
}
public class ThreadProblem {
	public static void main(String [] args) {
		MultiplicationTable mul=new MultiplicationTable();
		Thread1 t=new Thread1(mul);
		Thread2 u=new Thread2(mul);
		t.start();
		u.start();
	}
}
