package problemsolving;

public class PerfectNumber {
	public static void main(String[] args) {
		int n=6;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			System.out.println("this perfect Number");
		}else{
			System.out.println("This not a perfect number");
		}
	}

}
