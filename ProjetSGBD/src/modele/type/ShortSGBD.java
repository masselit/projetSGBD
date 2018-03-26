package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ShortSGBD extends TypeSGBD<Short> {

	@Override
	public void serialisation(DataOutputStream os, Short data) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Short deserialisation(DataInputStream is) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Short parse(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return 0;
	}

}
