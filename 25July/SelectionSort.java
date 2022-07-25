package ssearchingsorting;

public class SelectionSort {
	public static void sort(int arr[]) {
		int temp;
			for(int i=0;i<arr.length;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]>arr[j]){
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
	}

	public static void main(String[] args) {
		int arr[] = { 45, 67, 23, 89, 9 };
		sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
