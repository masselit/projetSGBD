package modele.karnel;

import java.util.List;

import modele.karnel.tuple._Tuple;

public interface _Schema {
	// A revoire
	public int indexOf(String str);
	public int indexOf(Attribut<?> attr);
	public Attribut<?> ofIndex(int i);
	public Attribut<?> ofName(String str);
	public boolean contains(String str);
	public int degre();
	public _Schema remove(Attribut<?> attr);
	public _Schema indexedSchema();
	public _Tuple deserialisation(byte[] b);
	public byte[] serialisation(_Tuple interfaceTuple);
	public _Schema sousSchema(String[] strTab);
	public List<Short> indexKeys();
}
