package modele.karnel;

public abstract class Relation implements _Relation{
	@Override public String nom() {return nom;}
	@Override public _Schema schema() {return schema;}
	private _Schema schema;
	private final String nom;
	protected Relation(String nom, _Schema schema) {
		this.nom=nom;
		this.schema=schema;
		// TODO Auto-generated constructor stub
	}
}
