package DataStructure;

import java.util.Scanner;

class Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();*/
		
		Person objects[]=new Person[3];
		Scanner sc=new Scanner(System.in);
			
		for(int i=0;i<objects.length;i++){
			objects[i]=new Person();
			System.out.println("Enter name");
			objects[i].setName(sc.nextLine());
			System.out.println(objects[i]);
		}
		
		for(int i=0;i<objects.length;i++){
			System.out.println(objects[i].getName());
		}
		

	}

}
