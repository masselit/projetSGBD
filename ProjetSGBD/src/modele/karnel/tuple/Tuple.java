package modele.karnel.tuple;

import java.util.Iterator;

public class Tuple implements Iterable<Object>{

	private final Object[] valeurs;
	
	public Tuple(Object... valeurs){
		this.valeurs = valeurs;
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Object>() {
			private int index =0;
			@Override public boolean hasNext() {return index<valeurs.length;}
			@Override public Object next() {return valeurs[index++];}
		};
	}

}
