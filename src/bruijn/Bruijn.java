package bruijn;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Bruijn {

	private PrimeBruijn b2;
	private PrimeBruijn b5;

	public Bruijn(PrimeBruijn b2, PrimeBruijn b5) {
		this.b2 = b2;
		this.b5 = b5;

	}

	private void save(String s) {
		PrintWriter writer;

		try {
			writer = new PrintWriter("Sequence.txt");
			writer.print(s);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	private int mapping() {
		int b22 = b2.shift();
		int b55 = b5.shift();
		int output = 0;
		if (b22 == 1) {
			output = b55 + 5;
		} else {
			output = b55;
		}
		return output;
	}

	public void shiftCycle() {
		String s = "";
		int ss = 0;
		for (int i = 0; i < Math.pow(2, 4); i++) {
			for (int j = 0; j < Math.pow(5, 4); j++) {
				ss = mapping();
				s += ss + "";
			}
		}
		ss = mapping();
		s += ss + "";
		ss = mapping();
		s += ss + "";
		ss = mapping();
		s += ss + "";
		System.out.println(s.length());
		save(s);
	}
}
