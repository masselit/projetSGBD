package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DoubleSGBD extends TypeSGBD<Double> {

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
	public int taille() {
		return 8;
	}
	
}
