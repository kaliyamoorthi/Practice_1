package DataStructure;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int arr[]=new int[3];
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}*/
			//2DArray
		/*int a[][]=new int[3][2];
		System.out.println(a.length);*/
		
		int b[][]=new int[3][];
		b[0]=new int[2];
		b[1]=new int [1];
		b[2]=new int[4];
		System.out.println("Total no of rows="+b.length);
		System.out.println("Total emements in Ist row="+b[0].length);
		System.out.println("Total emements in II row="+b[1].length);
		System.out.println("Total emements in III row="+b[2].length);
		
	}

}
