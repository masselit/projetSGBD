package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class IntegerSGBD extends TypeSGBD<Integer> {

	@Override
	public void serialisation(DataOutputStream os, Integer data) throws IOException {
		os.writeInt(data);
		
	}

	@Override
	public Integer deserialisation(DataInputStream is) throws IOException {
		return is.readInt();
	}

	@Override
	public Integer parse(String data) {
		return Integer.parseInt(data);
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return 4;
	}



}
