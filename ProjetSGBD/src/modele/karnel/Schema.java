package modele.karnel;


import modele.karnel.tuple.Tuple;

public class Schema implements _Schema{
	private final Attribut[] attributs;
	private ClePrimaire clePrimaire;
	
	public Schema(Attribut...attributs ){
		this.attributs = attributs ;
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
	public int degre() {
		// TODO Auto-generated method stub
		return 0;
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
	public byte[] serialisation(Tuple interfaceTuple) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public _Schema sousSchema(String[] strTab) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}