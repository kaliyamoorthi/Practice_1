package multithreading_new;

class Table1{

  void printTable(int n, Thread t){
  
	  synchronized(this) {  
	System.out.println("Thread id="+t.getId());
     for(int i=1;i<=5;i++){
      System.out.println(n*i);
      try{
       Thread.sleep(400);
      }catch(Exception e){System.out.println(e);}
     }
	 }//end block
	 
	 
   System.out.println("Square of a number="+ n*n+ " id="+ t.getId());
 }//end of the method
}
 
class MyThread3 extends Thread{
	Table1 t;
	MyThread3(Table1 t){
	this.t=t;
	}

	public void run(){
	t.printTable(5,this);
	}

}

class MyThread4 extends Thread{
	Table1 t;
	MyThread4(Table1 t){
	this.t=t;
	}
	public void run(){
	t.printTable(100,this);
	}
}

public class BlockSynchronizedDemo{
public static void main(String args[]){
Table1 obj = new Table1();//only one object
MyThread3 t1=new MyThread3(obj);
MyThread4 t2=new MyThread4(obj);
t1.start();
t2.start();
}
}
