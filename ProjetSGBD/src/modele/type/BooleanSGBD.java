package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BooleanSGBD extends TypeSGBD<Boolean> {

	@Override
	public void serialisation(DataOutputStream os, Boolean data) throws IOException {
		os.writeBoolean(data);
		
	}

	@Override
	public Boolean deserialisation(DataInputStream is) throws IOException {
		return is.readBoolean();
	}

	@Override
	public Boolean parse(String data) {
		return Boolean.parseBoolean(data);
	}

	@Override
	public int taille() {
		return 1;
	}
}
