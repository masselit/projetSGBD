package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class FloatSGBD extends TypeSGBD<Float> {
	public static final FloatSGBD TYPE = new FloatSGBD();
	private FloatSGBD() { }
	
	@Override
	public void serialisation(DataOutputStream os, Float data) throws IOException {
		os.writeFloat(data);
	}

	@Override
	public Float deserialisation(DataInputStream is) throws IOException {
		return is.readFloat();
	}

	@Override
	public Float parse(String data) {
		return Float.parseFloat(data);
	}

	@Override
	public long taille() {
		// TODO Auto-generated method stub
		return 4;
	}
	
	/**
	 * Permet de comparer 2 float
	 * @param a
	 * @param b
	 * @return
	 */
	public int compare(float a,float b) {
		return Float.compare(a,b);
	}
	
	/**
	 * Permet d'aditionner 2 float
	 * @param a
	 * @param b
	 * @return
	 */
	public float add(float a, float b) { return a+b; }
	
	/**
	 * Permet de soustraire 2 float
	 * @param a
	 * @param b
	 * @return
	 */
	public float sub(float a, float b) { return a-b; }
	
	/**
	 * Permet de multiplier 2 float
	 * @param a
	 * @param b
	 * @return
	 */
	public float mult(float a, float b) { return a*b; }
	
	/**
	 * Permet de diviser 2 float
	 * @param a
	 * @param b
	 * @return
	 */
	public float div(float a, float b) { return a/b; }
	
	/**
	 * Permet de connaitre le reste d'une division entre 2 foat
	 * @param a
	 * @param b
	 * @return
	 */
	public float reste(float a, float b) { return a%b; }
}
