package modele.karnel.state.less;

import modele.karnel._Relation;
import modele.karnel._Schema;
import modele.karnel.state.StateLessRelation;

public abstract class StateLessRelationBinaire extends StateLessRelation {

	protected final _Relation r1;
	protected final _Relation r2;
	
	protected StateLessRelationBinaire(String nom, _Schema schema, _Relation r1 , _Relation r2) {
		super(nom, schema);
		this.r1 = r1;
		this.r2 = r2;
	}

}
