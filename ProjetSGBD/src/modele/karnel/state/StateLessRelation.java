package modele.karnel.state;

import modele.karnel.Relation;
import modele.karnel._Schema;
import modele.karnel.operateur._Operateur;

public abstract class StateLessRelation extends Relation implements _Operateur{

	protected StateLessRelation(String nom, _Schema schema) {
		super(nom, schema);
	}

}
