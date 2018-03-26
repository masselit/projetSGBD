package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class FloatSGBD extends TypeSGBD<Float> {

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
}
