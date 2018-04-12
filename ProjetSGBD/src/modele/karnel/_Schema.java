package modele.karnel;

import modele.karnel.tuple.Tuple;
import modele.type.TypeSGBD;

public interface _Schema {
	// A revoire
	public int indexOf(String str);
	public int indexOf(Attribut attr);
	public Attribut ofIndex(int i);
	public Attribut ofName(String str);
	public boolean contains(String str);
	public int degre();
	public _Schema indexedSchema();
	public Tuple deserialisation(byte[] b);
	public byte[] serialisation(Tuple interfaceTuple);
	public _Schema sousSchema(String[] strTab);
	public long sizeTuple();
	public TypeSGBD<?> getTypeAttribut(String str);
}
