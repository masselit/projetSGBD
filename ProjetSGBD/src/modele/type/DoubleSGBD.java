package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DoubleSGBD extends TypeSGBD<Double> {
	public static final DoubleSGBD TYPE = new DoubleSGBD();
	private DoubleSGBD() { }

	@Override
	public void serialisation(DataOutputStream os, Double data) throws IOException {
		os.writeDouble(data);		
	}

	@Override
	public Double deserialisation(DataInputStream is) throws IOException {
		return is.readDouble();
	}

	@Override
	public Double parse(String data) {
		return Double.parseDouble(data);
	}

	@Override
	public long taille() {
		return 8;
	}
	
	/**
	 * Permet de comparer 2 double
	 * @param a
	 * @param b
	 * @return
	 */
	public int compare(double a,double b) {
		return Double.compare(a,b);
	}
	/**
	 * Permet d'ajouter 2 double
	 * @param a
	 * @param b
	 * @return
	 */
	public double add(double a, double b) { return a+b; }
	
	/**
	 * Permet de soustraire 2 double
	 * @param a
	 * @param b
	 * @return
	 */
	public double sub(double a, double b) { return a-b; }
	
	/**
	 * Permet de multiplier 2 double
	 * @param a
	 * @param b
	 * @return
	 */
	public double mult(double a, double b) { return a*b; }
	
	/**
	 * Permet de diviser 2 double
	 * @param a
	 * @param b
	 * @return
	 */
	public double div(double a, double b) { return a/b; }
	
	/**
	 * permet de connaitre le reste d'une division entre 2 double
	 * @param a
	 * @param b
	 * @return
	 */
	public double reste(double a, double b) { return a%b; }
	
}
