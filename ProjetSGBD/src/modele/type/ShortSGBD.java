package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ShortSGBD extends TypeSGBD<Short> {
	public static final ShortSGBD TYPE = new ShortSGBD();
	private ShortSGBD() { }
	
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
	public long taille() {
		return 2;
	}
	
	public int compare(short a,short b) {
		return Short.compare(a,b);

	}
	
	public short add (short a, short b) { return (short) (a+b); }
	public short sub (short a, short b) { return (short) (a-b); }
	public short mult(short a, short b) { return (short) (a*b); }
	public short div(short a, short b) { return (short) (a/b); }
	public short reste(short a, short b) { return (short) (a%b); }
}
