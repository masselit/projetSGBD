package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public abstract class TypeSGBD<T> {
	
	public abstract void serialisation(DataOutputStream os, T data) throws IOException;
	public abstract T deserialisation(DataInputStream is) throws IOException;
	public abstract T parse(String data);
	public abstract int taille();
}
