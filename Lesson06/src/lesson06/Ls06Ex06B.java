package lesson06;

public class Ls06Ex06B {
	
	public static int fibonaci(int n){
		
		if(n==1||n==2){
			return 1;
		}
		int prethodni = 1;
		int trenutni = 1;
		for (int i = 2; i < n; i++) {
			int temp = prethodni;
			prethodni = trenutni;
			trenutni += temp;
		}
		return trenutni;
	}
	
	public static void main(String[] args) {
		int f = fibonaci(6);
		System.out.println(f);
	}

}
