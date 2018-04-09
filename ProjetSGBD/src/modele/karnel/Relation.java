package modele.karnel;

public abstract class Relation implements _Relation{
	
	private _Schema schema;
	private final String nom;
	
	@Override public String nom() {return nom;}
	@Override public _Schema schema() {return schema;}
	
	protected Relation(String nom, _Schema schema) {
		this.nom=nom;
		this.schema=schema;
	}
}
