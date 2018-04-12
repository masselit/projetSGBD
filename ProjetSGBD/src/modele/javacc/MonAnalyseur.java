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

      int selectTest;
      String schemaReq;
      int choix;
      String table;
      l.clear();
      table = "";
      selectTest = 0;
      try
      {
        l = parser.REQUETE();
        for (String valeurIt : l)
        {
          //=====================================================================
          // Si Le premier Therme est select
          //=====================================================================
          if (valeurIt.equals("select"))
          {
            selectTest = 1;
          }
          else if (selectTest == 1)
          {
            schemaReq = valeurIt;
            if (schemaReq.equals("*"))
            {
              choix = 1;
              selectTest = 2;
            }
          }

          else if (selectTest == 2)
          {
            selectTest =3;
          }

          else if (selectTest == 3)
          {

            new Print(new Identite(bd.get(valeurIt))).execute();
          }
          //=====================================================================
          // Si le premier therme est insert
          //=====================================================================
          if (valeurIt.equals("insert"))
          {
            selectTest = 10;
          }
          else if (selectTest == 10)
          {
            table = valeurIt;
            selectTest = 20;
          }
          else if (selectTest == 20)
          {
            bd.get(table).add(new Tuple(valeurIt));
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

  static final public String INSERTVALUE() throws ParseException {
  Token t;
    jj_consume_token(18);
    t = jj_consume_token(IDF);
    jj_consume_token(19);
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

  static final public List < String > SCHEMA() throws ParseException {
  Token t;
    t = jj_consume_token(IDF);
    List < String > s = new ArrayList < String > ();
    s.add(t.image);
    {if (true) return s;}
    throw new Error("Missing return statement in function");
  }

  static final public void TABLE() throws ParseException {
    jj_consume_token(IDF);
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