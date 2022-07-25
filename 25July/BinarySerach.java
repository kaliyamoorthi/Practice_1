package ssearchingsorting;

import java.util.Scanner;

public class BinarySerach {

	public static void main(String[] args) {
		int arr[] = { 45, 67, 23, 89, 9 };
		SelectionSort.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		Scanner scan=new Scanner(System.in);
		System.out.println("\nEnter a value to be searched");
		int key=scan.nextInt();
		boolean ans=binarySearching(arr,key);
		if(ans)
			System.out.println("Value present");
		else
			System.out.println("Value not present");

	}
	
	public static boolean binarySearching(int arr[],int key){
		boolean ans=false;
		int st=0;
		int end=arr.length-1;
		int mid;
		while(st<=end){
			mid=(st+end)/2;
			if(arr[mid]==key){
				ans=true; break;
			}
			else
				if(arr[mid]<key)
					st=mid+1;
				else
					end=mid-1;
				
		}
		
	return ans;
	}

}
