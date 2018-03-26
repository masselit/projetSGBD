package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class FloatSGBD extends TypeSGBD<Float> {

	@Override
	public void serialisation(DataOutputStream os, Float data) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Float deserialisation(DataInputStream is) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float parse(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return 0;
	}

}
