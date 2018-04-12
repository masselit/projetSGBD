package modele.karnel;

import modele.karnel.tuple.Tuple;
import modele.type.TypeSGBD;

public class Schema implements _Schema{
	private final Attribut[] attributs;
	private ClePrimaire clePrimaire;
	
	public Schema(Attribut...attributs ){
		this.attributs = attributs ;
	}

	@Override
	public TypeSGBD<?> getTypeAttribut(String str){
		return this.ofIndex(this.indexOf(str)).getType();
	}
	
	@Override
	public int indexOf(String str) {
		int index = 0;
		for(Attribut atr :attributs){
			if(atr.getName().equals(str)){
				return index;
			}
			index++;
		}
		return -1;
	}

	@Override
	public int indexOf(Attribut attr) {
		int index = 0;
		for(Attribut atr :attributs){
			if(atr.getName().equals(attr.getName())){
				return index;
			}
			index++;
		}
		return -1;
	}

	@Override
	public Attribut ofIndex(int i) {
		return attributs[i];
	}

	@Override
	public Attribut ofName(String str) {
		for(Attribut atr :attributs){
			if(atr.getName().equals(str)){
				return atr;
			}
		}
		return null;
	}

	@Override
	public boolean contains(String str) {
		for(Attribut atr :attributs){
			if(atr.getName().equals(str)){
				return true;
			}
		}
		return false;
	}

	@Override
	public long sizeTuple(){
		long size = 0;
		for(Attribut att : attributs){
			size += att.size();
		}
		return size;
	}
	
	/**
	 * Return le nombre d'attibuts
	 */
	@Override
	public int degre() {
		return attributs.length;
	}


	@Override
	public _Schema indexedSchema() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tuple deserialisation(byte[] b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] serialisation(Tuple tuple) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public _Schema sousSchema(String[] strTab) {
		// TODO Auto-generated method stub
		return null;
	}
	
}