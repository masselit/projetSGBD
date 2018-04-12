package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BooleanSGBD extends TypeSGBD<Boolean> {
	public static final BooleanSGBD TYPE = new BooleanSGBD();
	private BooleanSGBD() {}

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
	public long taille() {
		return 1;
	}
	
	/**
	 * Permet de comparer deux boolean
	 * @param a
	 * @param b
	 * @return
	 */
	public int compare(boolean a,boolean b) {
		return Boolean.compare(a,b);
	}
}
