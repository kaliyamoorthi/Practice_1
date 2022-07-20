package multithreading_new;
class MyNewThread implements Runnable{

	@Override
	public void run() {
		System.out.println("I am new Thread");
		
	}
	
}
public class RunnableEXample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method start");
		Thread t=new Thread(new MyNewThread())	;
		//MynewThread thread2=new MyNewThread();
		//Thread t=new Thread(thread2);
		
		t.start();
		//t.run();//it runs thread in separate memory location
		//t.start(); //error
		System.out.println("Main Method Stop");
		
	}

}
