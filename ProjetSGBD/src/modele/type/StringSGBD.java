package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class StringSGBD extends TypeSGBD<String> {

	@Override
	public void serialisation(DataOutputStream os, String data) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String deserialisation(DataInputStream is) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String parse(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}