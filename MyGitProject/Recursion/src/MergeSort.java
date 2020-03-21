
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {10,2,6,12,20};
		sort(A,0,A.length-1);
	}

	private static void sort(int[] a, int l, int r) {
		// TODO Auto-generated method stub
		if(l<r) {
			int m = (r+l)/2;
			sort(a,l,m);
			sort(a,m+1,r);
			System.out.println("merge");
			mergeSort(a,l,m,r);
		}
	}

	private static void mergeSort(int[] a, int l, int m, int r) {
		// TODO Auto-generated method stub
		int n1 = m-l+1;
		int n2= r-m;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int i=0;i<n1;i++) {
			L[i] = a[l+i];
		}
		for(int j=0; j<n2; j++) {
			R[j] = a[m+1+j];
		}
		
		int i=0,j=0,k=l;
		
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				a[k]=L[i];
				i++;
			}else {
				a[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<n2) {
			a[k]=R[j];
			j++;
			k++;
		}
	}

}
