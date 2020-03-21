import java.util.Arrays;

public class HeapSort {
	public static void main(String arg[]) {
		int[] arr = {12,11,13,5,6,7};
		HeapSort hs = new HeapSort();
		hs.sort(arr);
		Arrays.stream(arr).forEach(System.out::println);
	}

	private void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		
		for(int i=n/2-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		
		for(int i=n-1;i>=0;i--) {
			int swap=arr[i];
			arr[i]=arr[0];
			arr[0]=swap;
			
			heapify(arr, i, 0);
		}
	}

	private void heapify(int[] arr, int n, int i) {
		// TODO Auto-generated method stub
		int largeIndex = i;
		int l = 2*i+1;
		int r = 2*i+2;
		
		if(l<n && arr[l]>arr[largeIndex])
			largeIndex=l;
		
		if(r<n && arr[r]>arr[largeIndex])
			largeIndex=r;
		
		if(largeIndex!=i) {
			int swap = arr[i];
			arr[i]=arr[largeIndex];
			arr[largeIndex]= swap;
			
			heapify(arr, n, largeIndex);
		}
	}

}
