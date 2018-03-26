package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BooleanSGBD extends TypeSGBD<Boolean> {

	@Override
	public void serialisation(DataOutputStream os, Boolean data) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean deserialisation(DataInputStream is) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean parse(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return 0;
	}

}
