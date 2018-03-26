package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class StringSGBD extends TypeSGBD<String> {

	@Override
	public void serialisation(DataOutputStream os, String data) throws IOException {
		os.writeUTF(data);
	}

	@Override
	public String deserialisation(DataInputStream is) throws IOException {
		return is.readUTF();
	}

	@Override
	public String parse(String data) {
		return data;
	}

	@Override
	public int taille() {
		return 8;
	}
	
	public String concat(String s1, String s2) { return s1+s2;}
}