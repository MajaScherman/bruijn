package bruijn;

public class Main {
	public static void main(String[] args) {
		int[] polynomial = { 1, 0, 0, 1, 1 };// x^4+x+1
		PrimeBruijn b2 = new PrimeBruijn(2, polynomial);
		int[] polynomial2 = { 1, 4, 1, 4, 3 };// x^4+4x^3+x^2+4x+3
		PrimeBruijn b5 = new PrimeBruijn(5, polynomial2);	
		Bruijn b = new Bruijn(b2,b5);
		b.shiftCycle();
	}
}
