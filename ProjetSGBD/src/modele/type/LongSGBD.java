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

	@Override public long taille() {
		return 8;
	}
	

	public int compare(long a,long b) {
		return Long.compare(a,b);
	}
	
	public long add(long a, long b) { return a+b; }
	public long sub(long a, long b) { return a-b; }
	public long mult(long a, long b) { return a*b; }
	public long div(long a, long b) { return a/b; }
	public long reste(long a, long b) { return a%b; }
}
