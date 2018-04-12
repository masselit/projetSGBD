package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class IntegerSGBD extends TypeSGBD<Integer> {
	public static final IntegerSGBD TYPE = new IntegerSGBD();
	private IntegerSGBD() { }
	
	@Override
	public void serialisation(DataOutputStream os, Integer data) throws IOException {
		os.writeInt(data);
	}

	@Override
	public Integer deserialisation(DataInputStream is) throws IOException {
		return is.readInt();
	}

	@Override
	public Integer parse(String data) {
		return Integer.parseInt(data);
	}

	@Override
	public long taille() {
		return 4;
	}
	
	/**
	 * Permet de comparer 2 entiers
	 * @param a
	 * @param b
	 * @return
	 */
	public int compare(int a,int b) {
		return Integer.compare(a,b);
	}
	
	/**
	 * Permet d'aditionner 2 entiers
	 * @param a
	 * @param b
	 * @return
	 */
	public int add(int a, int b) { return a+b; }
	
	/**
	 * Permet de soustraire 2 entiers
	 * @param a
	 * @param b
	 * @return
	 */
	public int sub(int a, int b) { return a-b; }
	
	/**
	 * Permet de multiplier 2 entiers
	 * @param a
	 * @param b
	 * @return
	 */
	public int mult(int a, int b) { return a*b; }
	
	/**
	 * Permet de diviser 2 entiers
	 * @param a
	 * @param b
	 * @return
	 */
	public int div(int a, int b) { return a/b; }
	
	/**
	 * Permet de connaitre le reste d'une division entre 2 entiers
	 * @param a
	 * @param b
	 * @return
	 */
	public int reste(int a, int b) { return a%b; }
}
