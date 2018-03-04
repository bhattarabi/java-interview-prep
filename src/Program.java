
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fib = new Fibonacci();
		
		
		for (int i=1; i<=50; i++)
			System.out.println(fib.getNthFiboRec(i));
	}

}