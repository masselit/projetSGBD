package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ShortSGBD extends TypeSGBD<Short> {

	@Override
	public void serialisation(DataOutputStream os, Short data) throws IOException {
		os.writeShort(data);
	}

	@Override
	public Short deserialisation(DataInputStream is) throws IOException {
		return is.readShort();
	}

	@Override
	public Short parse(String data) {
		return Short.parseShort(data);
	}

	@Override
	public int taille() {
		return 2;
	}
}
