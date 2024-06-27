package bt1;

public class MainArray {
	public static void main(String[] args) {
		int[] a = new int[]{0,0,1,0,3,0,5,0,6};
		
		for(int i = 0; i < a.length; i++) {
			//Kiem tra tung so trong mang
			if(a[i] != 0) {
				System.out.print(a[i] + " ");
			}
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 0) {
				System.out.printf(a[i] + " ");
			}
		}
	}
}
