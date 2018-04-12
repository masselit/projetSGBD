package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class StringSGBD extends TypeSGBD<String> {
	public static final StringSGBD TYPE = new StringSGBD();
	private StringSGBD() { }
	
	@Override
	public void serialisation(DataOutputStream os, String data) throws IOException {
		os.writeUTF(data);
	}

	@Override
	public String deserialisation(DataInputStream is) throws IOException {
		return is.readUTF();
	}

	@Override
	public String parse(String data) {
		return data;
	}

	@Override
	public long taille() {
		return 8;
	}
	
	/**
	 * Permet de mettre a la suite 2 String
	 * @param s1
	 * @param s2
	 * @return
	 */
	public String concat(String s1, String s2) { return s1+s2;}
	
	/**
	 * Pemet de comparer 2 String
	 * @param a
	 * @param b
	 * @return
	 */
	public int compare(String a, String b) {
		return a.compareTo(b);
	}
	
	@Override public String toString() {
		return "SGBD String";
	}
}