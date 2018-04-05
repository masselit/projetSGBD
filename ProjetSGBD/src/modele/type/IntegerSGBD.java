package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class IntegerSGBD extends TypeSGBD<Integer> {
	private static final IntegerSGBD TYPE = new IntegerSGBD();
	private IntegerSGBD() { }
	
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
	
	public int compare(int a,int b) {
		return Integer.compare(a,b);
	}
	
	public int add(int a, int b) { return a+b; }
	public int sub(int a, int b) { return a-b; }
	public int mult(int a, int b) { return a*b; }
	public int div(int a, int b) { return a/b; }
	public int reste(int a, int b) { return a%b; }
}
