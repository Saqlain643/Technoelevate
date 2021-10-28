
public class ArrayExp2 {
	public static void main(String[] args) {
		int[] a= {20,30,40,10,50,5,45,11};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}		
		}
		//for(int i=0;i<a.length;i++) {
		//	System.out.print(a[i]+" ");
		//}
		for(int x : a) {
			System.out.print(x+" ");
		}
	}
}