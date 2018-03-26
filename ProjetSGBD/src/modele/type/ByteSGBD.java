package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ByteSGBD extends TypeSGBD<Byte> {

	@Override
	public void serialisation(DataOutputStream os, Byte data) throws IOException {
		os.writeByte(data);
		
	}

	@Override
	public Byte deserialisation(DataInputStream is) throws IOException {
		return is.readByte();
	}

	@Override
	public Byte parse(String data) {
		return Byte.parseByte(data);
	}

	@Override
	public int taille() {
		return 1;
	}
}
