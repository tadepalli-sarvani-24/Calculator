public class Operations {
	
	public int add(int a,int b) {
		return a + b;
	}
	
	public int mul(int a,int b) {
		return a * b;
	}
	
	public int div(int a,int b) {
		if(a == 0 && b == 0)
			return -1;
		else if(b == 0)
			return -1;
		else 
			return a / b;
	}
}