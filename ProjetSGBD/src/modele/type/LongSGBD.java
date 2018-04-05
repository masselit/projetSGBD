package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class LongSGBD extends TypeSGBD<Long> {
	public static final LongSGBD TYPE = new LongSGBD();
	private LongSGBD() {}

	@Override public void serialisation(DataOutputStream os, Long data) throws IOException {
		os.writeLong(data);
	}

	@Override public Long deserialisation(DataInputStream is) throws IOException {
		return is.readLong();
	}

	@Override public Long parse(String data) {
		return Long.parseLong(data);
	}

	@Override public int taille() {
		return 8;
	}
	
	public int compare(long a,long b) {
		return Long.compare(a,b);
	}
}
