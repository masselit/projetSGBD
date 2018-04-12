package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class LongSGBD extends TypeSGBD<Long> {
	public static final LongSGBD TYPE = new LongSGBD();
	private LongSGBD() {}

	@Override public void serialisation(DataOutputStream os, Long data) throws IOException {
		os.writeLong(data);
	}

	@Override public Long deserialisation(DataInputStream is) throws IOException {
		return is.readLong();
	}

	@Override public Long parse(String data) {
		return Long.parseLong(data);
	}

	@Override public long taille() {
		return 8;
	}
	
	/**
	 * Permet de comparer 2 long
	 * @param a
	 * @param b
	 * @return
	 */
	public int compare(long a,long b) {
		return Long.compare(a,b);
	}
	
	/**
	 * Permet d'aditionner 2 long
	 * @param a
	 * @param b
	 * @return
	 */
	public long add(long a, long b) { return a+b; }
	
	/**
	 * Permet de soustraire 2 long
	 * @param a
	 * @param b
	 * @return
	 */
	public long sub(long a, long b) { return a-b; }
	
	/**
	 * Permet de multiplier 2 long
	 * @param a
	 * @param b
	 * @return
	 */
	public long mult(long a, long b) { return a*b; }
	
	/**
	 * Permet de diviser 2 long
	 * @param a
	 * @param b
	 * @return
	 */
	public long div(long a, long b) { return a/b; }
	
	/**
	 * Permet de connaitre le resultat d'une division entre 2 long
	 * @param a
	 * @param b
	 * @return
	 */
	public long reste(long a, long b) { return a%b; }
}
