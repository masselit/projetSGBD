package modele.karnel.state.less;

import modele.karnel._Relation;
import modele.karnel._Schema;
import modele.karnel.state.StateLessRelation;

public abstract class StateLessRelationUnaire extends StateLessRelation {
	protected final _Relation r;
	protected StateLessRelationUnaire(String nom, _Schema schema, _Relation r) {
		super(nom, schema);
		this.r=r;
	}

}
