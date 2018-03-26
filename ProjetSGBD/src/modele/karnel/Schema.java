package modele.karnel;

import java.util.ArrayList;
import java.util.List;

import modele.karnel.tuple._Tuple;
import modele.type.TypeSGBD;

public class Schema implements _Schema{
	private String nomDeLaRelation;
	private List<Attribut> attribut;
	private ClePrimaire clePrimaire;
	
	public Schema(String nomDeLaRelation){
		this.attribut = new ArrayList<Attribut>();
		this.nomDeLaRelation = nomDeLaRelation;
	}

	@Override
	public int indexOf(String str) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int indexOf(Attribut<?> attr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Attribut<?> ofIndex(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Attribut<?> ofName(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(String str) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int degre() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public _Schema remove(Attribut<?> attr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public _Schema indexedSchema() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public _Tuple deserialisation(byte[] b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] serialisation(_Tuple interfaceTuple) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public _Schema sousSchema(String[] strTab) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Short> indexKeys() {
		// TODO Auto-generated method stub
		return null;
	}
}