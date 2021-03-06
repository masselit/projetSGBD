/* Generated By:JavaCC: Do not edit this line. MonAnalyseur.java */
package modele.javacc;
//import
import java.util.*;
import modele.bdd.Bdd;
import modele.commande.Print;
import modele.karnel.Attribut;
import modele.karnel.Schema;
import modele.karnel._Relation;
import modele.karnel._Schema;
import modele.karnel.state.StateFullRelation;
import modele.karnel.state.full.StateFullInMemoryRelation;
import modele.karnel.state.less.Identite;
import modele.karnel.tuple.Tuple;
import modele.type.IntegerSGBD;
import modele.type.StringSGBD;
import modele.karnel.state.less.Projection;

public class MonAnalyseur implements MonAnalyseurConstants {
  public static void main(String args []) throws ParseException
  {
    Bdd bd = new Bdd();
    _Schema schema = new Schema(
    new Attribut("C1", IntegerSGBD.TYPE),
    new Attribut("C2", StringSGBD.TYPE)
    );
    StateFullRelation r = new StateFullInMemoryRelation(bd, "RELATION", schema);
    bd.add(r);
    bd.get("RELATION").add(new Tuple(123, "MORAT"));
    bd.get("RELATION").add(new Tuple(1234, "MASSELIN"));
    bd.get("RELATION").add(new Tuple(12434, "DERVIEUX"));
    new Print(bd.get("RELATION")).execute();
    new Print(new Identite(bd.get("RELATION"))).execute();
    //Debut Parser
    MonAnalyseur parser = new MonAnalyseur(System.in);
    List < String > l = new ArrayList < String > ();
    //Declaration des variables
    int selectTest;
    String schemaReq;
    int choix;
    String table;
    String colonnes;
    //initialisation des variables
    l.clear();
    table = "";
    selectTest = 0;
    colonnes = "";
    try
    {
      l = parser.REQUETE();
      for (String valeurIt : l)
      {
        switch (selectTest)
        {
          //Si c'est la premi�re iteration
          case 0 :
          // Si le premier mot est select
          if (valeurIt.equals("select"))
          {
            selectTest = 1;
          }
          // Si le premier mot insert
          if (valeurIt.equals("insert into"))
          {
            selectTest = 10;
          }
          break;
          // Le premier therme �tait select on recupere donc les colonnes demander soit �toile pour une projection totale
          // ou seulement le nom de certaine colonnes pour une projection partielle
          case 1 :
          schemaReq = valeurIt;
          // Si l'utilisateur � rentrer * il veut une projection totale
          if (schemaReq.equals("*"))
          {
            colonnes = "*";
          }
          // Sinon il souhaite une projection partielle et on le stock dans une variable
          else
          {
            colonnes = valeurIt;
          }
          selectTest = 2;
          break;
          // Le premier thermes �tait select et donc le troisi�me est from et on passe au suivant
          case 2 :
          selectTest = 3;
          break;
          // Le premier thermes �tait select et on prend le therme apr�s from qui correspond � la table dans laquel on veut chercher ces informations
          case 3 :
          // Si la table demander �tait complete alors on utilise la class identite et on lui passe le nom de la table rentrer par l'utilisateur 
          if (colonnes.equals("*"))
          {
            new Print(new Identite(bd.get(valeurIt))).execute();
          }
          // sinon on lui passe la table et les champs qu'il souhaite voire
          else
          {
            _Schema sche = new Schema(new Attribut(colonnes, bd.get(valeurIt).schema().getTypeAttribut(colonnes)));
            new Print(new Projection(bd.get(valeurIt), sche)).execute();
          }
          break;
          // Le premier therme �tait un insert alors le deuxi�me est la table o� il souhaite inserer
          case 10 :
          table = valeurIt;
          selectTest = 20;
          // Le premier therme �tait insert donc le troisi�me doit �tre values
          case 20 :
          selectTest = 30;
          break;
          // Le premier therme �tait insert et donc on peut r�cup�rer ce que l'utilisateur souhaite entrer dans la table
          case 30 :
          bd.get(table).add(new Tuple(valeurIt));
          break;
        }
      }
      System.out.println();
      System.out.println("syntaxe correcte !");
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }

//Permet de regrouper tout les types de requete diff�rent
  static final public List < String > REQUETE() throws ParseException {
  List < String > ls;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SELECT:
      ls = REQUETESELSIMPLE();
    {if (true) return ls;}
      break;
    case INSERT:
      ls = REQUETEINS();
    {if (true) return ls;}
      break;
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

//Permet d'ajouter UN tuple dans une table
  static final public List < String > REQUETEINS() throws ParseException {
  Token t1;
  Token t2;
  Token t3;
  String str;
    t1 = jj_consume_token(INSERT);
    t2 = jj_consume_token(IDF);
    t3 = jj_consume_token(VALUES);
    str = INSERTVALUE();
    List < String > s = new ArrayList < String > ();
    s.add(t1.image);
    s.add(t2.image);
    s.add(t3.image);
    s.add(str);
    {if (true) return s;}
    throw new Error("Missing return statement in function");
  }

//Requete de selection simple a base d'un select et d'un from
  static final public List < String > REQUETESELSIMPLE() throws ParseException {
  Token t1;
  Token t2;
  Token t3;
  Token t4;
    t1 = jj_consume_token(SELECT);
    t2 = jj_consume_token(IDF);
    t3 = jj_consume_token(FROM);
    t4 = jj_consume_token(IDF);
    List < String > s = new ArrayList < String > ();
    s.add(t1.image);
    s.add(t2.image);
    s.add(t3.image);
    s.add(t4.image);
    {if (true) return s;}
    throw new Error("Missing return statement in function");
  }

//Requete de selection a base d'un select d'un from et d'un where
  static final public List < String > REQUETESELWHERE() throws ParseException {
  Token t1;
  Token t2;
  Token t3;
  Token t4;
  Token t5;
    t1 = jj_consume_token(SELECT);
    t2 = jj_consume_token(IDF);
    t3 = jj_consume_token(FROM);
    t4 = jj_consume_token(IDF);
    t5 = jj_consume_token(WHERE);
    List < String > s = new ArrayList < String > ();
    s.add(t1.image);
    s.add(t2.image);
    s.add(t3.image);
    s.add(t4.image);
    s.add(t5.image);
    {if (true) return s;}
    throw new Error("Missing return statement in function");
  }

  static final public String INSERTVALUE() throws ParseException {
  Token t;
    jj_consume_token(OUVPAR);
    t = jj_consume_token(IDF);
    jj_consume_token(FERPAR);
    {if (true) return t.image;}
    throw new Error("Missing return statement in function");
  }

  static final public void SUITEINSERT() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 20:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_1;
      }
      jj_consume_token(20);
      INSERTVALUE();
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public MonAnalyseurTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[2];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x90,0x100000,};
   }

  /** Constructor with InputStream. */
  public MonAnalyseur(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public MonAnalyseur(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new MonAnalyseurTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public MonAnalyseur(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new MonAnalyseurTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public MonAnalyseur(MonAnalyseurTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(MonAnalyseurTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[21];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 2; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 21; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
