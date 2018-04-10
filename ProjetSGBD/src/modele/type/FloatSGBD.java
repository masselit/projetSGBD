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
	public int taille() {
		// TODO Auto-generated method stub
		return 4;
	}
	
	public int compare(float a,float b) {
		return Float.compare(a,b);
	}
	
	public float add(float a, float b) { return a+b; }
	public float sub(float a, float b) { return a-b; }
	public float mult(float a, float b) { return a*b; }
	public float div(float a, float b) { return a/b; }
	public float reste(float a, float b) { return a%b; }
}
