package modele.karnel;

import modele.karnel.tuple.Tuple;

public interface _Relation extends Iterable<Tuple>{

	public String nom();

	public _Schema schema();
	
}
