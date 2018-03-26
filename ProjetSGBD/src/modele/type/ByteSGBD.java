package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ByteSGBD extends TypeSGBD<Byte> {

	@Override
	public void serialisation(DataOutputStream os, Byte data) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Byte deserialisation(DataInputStream is) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Byte parse(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return 0;
	}

}
