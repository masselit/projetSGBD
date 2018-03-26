package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class IntegerSGBD extends TypeSGBD<Integer> {

	@Override
	public void serialisation(DataOutputStream os, Integer data) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer deserialisation(DataInputStream is) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer parse(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return 0;
	}



}
