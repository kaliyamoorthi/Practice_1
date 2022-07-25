package DataStructure;

import java.util.Scanner;

public class ArrayExample {
	int marks[]=new int[3];
	
	void getInfo(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks for 3 subjects");
		for(int i=0;i<=marks.length-1;i++){//3--> 0,1,2,3
			marks[i]=sc.nextInt();
		}
	}
		int calcTotal(){
			int sum=0;
			for(int i=0;i<marks.length;i++){
				sum=sum+marks[i];
			}
		return sum;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayExample obj=new ArrayExample();
			obj.getInfo();
			System.out.println("Total="+obj.calcTotal());
	}

}
