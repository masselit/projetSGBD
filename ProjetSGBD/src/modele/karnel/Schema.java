package modele.karnel;

import modele.karnel.tuple.Tuple;
import modele.type.TypeSGBD;

public class Schema implements _Schema{
	private final Attribut[] attributs;
	private ClePrimaire clePrimaire;
	
	public Schema(Attribut...attributs ){
		this.attributs = attributs ;
	}

	/**
	 * Retourne le type SGBD de l'attribut
	 * @return TypeSGBD<?>
	 * @param String
	 */
	@Override public TypeSGBD<?> getTypeAttribut(String str){
		return this.ofIndex(this.indexOf(str)).getType();
	}
	
	/**
	 * Parcours les attributs et renvoie l'index de l'attribut
	 * @return int
	 * @param String
	 */
	@Override public int indexOf(String str) {
		int index = 0;
		for(Attribut atr :attributs){
			if(atr.getName().equals(str)){
				return index;
			}
			index++;
		}
		return -1;
	}

	/**
	 * Parcours les attributs et renvoie l'index de l'attribut
	 * @return int
	 * @param Attribut
	 */
	@Override public int indexOf(Attribut attr) {
		int index = 0;
		for(Attribut atr :attributs){
			if(atr.getName().equals(attr.getName())){
				return index;
			}
			index++;
		}
		return -1;
	}

	/**
	 * Retourne l'attribut d'index i
	 * @return Attribut
	 * @param int
	 */
	@Override public Attribut ofIndex(int i) {
		return attributs[i];
	}

	/**
	 * Retourne l'attribut qui à comme nom le paramètre String
	 * @return Attribut
	 * @params String
	 */
	@Override public Attribut ofName(String str) {
		for(Attribut atr :attributs){
			if(atr.getName().equals(str)){
				return atr;
			}
		}
		return null;
	}

	/**
	 * Retourne true si le tableau attributs contient le paramètre String 
	 * @return Boolean
	 * @param String
	 */
	@Override public boolean contains(String str) {
		for(Attribut atr :attributs){
			if(atr.getName().equals(str)){
				return true;
			}
		}
		return false;
	}

	/**
	 * Renvoie la taille d'un tuple
	 * @return Long
	 */
	@Override public long sizeTuple(){
		long size = 0;
		for(Attribut att : attributs){
			size += att.size();
		}
		return size;
	}
	
	/**
	 * Return le nombre d'attibuts
	 * @return int
	 */
	@Override public int degre() {
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