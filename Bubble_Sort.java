public class Bubble_Sort {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		int length=arr.length;
		System.out.print("Unsorted array: ");
		for(int i=0; i<length;i++)
			System.out.print(arr[i]+ " ");
		for (int i=0;i<length;i++) {
			for (int j=1; j<length-i;j++) {
				int temp =arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
		}
	
	System.out.print("\nSorted array: ");
	for (int i=0;i<length;i++)
		System.out.print(+ arr[i]+" ");
	}
}
