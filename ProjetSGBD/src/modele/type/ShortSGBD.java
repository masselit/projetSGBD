package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ShortSGBD extends TypeSGBD<Short> {
	public static final ShortSGBD TYPE = new ShortSGBD();
	private ShortSGBD() { }
	
	@Override
	public void serialisation(DataOutputStream os, Short data) throws IOException {
		os.writeShort(data);
	}

	@Override
	public Short deserialisation(DataInputStream is) throws IOException {
		return is.readShort();
	}

	@Override
	public Short parse(String data) {
		return Short.parseShort(data);
	}

	@Override
	public long taille() {
		return 2;
	}
	
	/**
	 * Permet de comparer 2 short
	 * Si a < b -> return -1
	 * @param a
	 * @param b
	 * @return
	 */
	public int compare(short a,short b) {
		return Short.compare(a,b);

	}
	
	/**
	 * Permet d'aditioner 2 short
	 * @param a
	 * @param b
	 * @return
	 */
	public short add (short a, short b) { return (short) (a+b); }
	
	/**
	 * Permet de soustraire 2 short
	 * @param a
	 * @param b
	 * @return
	 */
	public short sub (short a, short b) { return (short) (a-b); }
	
	/**
	 * Permet de multiplier 2 short
	 * @param a
	 * @param b
	 * @return
	 */
	public short mult(short a, short b) { return (short) (a*b); }
	
	/**
	 * Permet de diviser 2 short
	 * @param a
	 * @param b
	 * @return
	 */
	public short div(short a, short b) { return (short) (a/b); }
	
	/**
	 * Permet de connaitre le reste d'une division entre 2 short
	 * @param a
	 * @param b
	 * @return
	 */
	public short reste(short a, short b) { return (short) (a%b); }
}
