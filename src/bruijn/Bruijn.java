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

	private int mapping() {
		int b22 = b2.shift();
		int b55 = b5.shift();
		int mappedValue = 0;
		if (b22 == 1) {
			mappedValue = b55 + 5;
		} else {
			mappedValue = b55;
		}
		return mappedValue;
	}

	public void shiftCycle() {
		String s = "";
		int ss = 0;
		for (int i = 0; i < (Math.pow(2, 4) * Math.pow(5, 4)); i++) {
			ss = mapping();
			s += ss + "";
		}
		s += "000";
		System.out.println(s.length());
		save(s);
	}

	private void save(String s) {
		PrintWriter writer;
		try {
			writer = new PrintWriter("Sequence.txt");
			writer.println(s);
			System.out.println(s);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
