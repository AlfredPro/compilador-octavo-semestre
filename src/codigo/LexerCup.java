/* The following code was generated by JFlex 1.4.3 on 3/29/23 7:09 PM */


package codigo;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/29/23 7:09 PM from the specification file
 * <tt>C:/Users/Alfredo/Documents/NetBeansProjects/Analizador2/src/codigo/LexerCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  5,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 36,  6,  0,  0, 39, 34,  0, 40, 41, 33, 31,  3, 32,  0,  4, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  0, 46, 38, 30, 37,  0, 
     0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1, 23,  1,  1,  1,  1,  1,  1,  1, 44,  0, 45,  0,  1, 
     0, 13,  7, 11, 20, 10, 19, 18, 12, 22,  1, 25, 15, 28, 17, 16, 
    27,  1, 14, 24,  9, 21,  1, 29, 26,  8,  1, 42, 35, 43,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\22\2"+
    "\1\7\1\10\1\11\1\12\3\13\2\14\1\1\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\4\1\24"+
    "\17\2\1\25\11\2\1\26\1\27\1\30\1\31\7\2"+
    "\1\14\1\32\1\13\1\0\3\2\1\33\10\2\1\34"+
    "\5\2\1\35\1\36\4\2\1\37\1\2\1\40\1\41"+
    "\1\2\1\42\7\2\1\0\1\43\2\2\1\44\1\45"+
    "\1\46\1\47\10\2\1\50\5\2\1\51\1\2\1\52"+
    "\1\2\1\53\1\3\1\54\1\55\1\2\1\56\3\2"+
    "\1\57\5\2\1\60\1\61\1\62\1\2\1\63\1\64"+
    "\1\65\1\66\1\2\1\67\1\70\1\2\1\71\1\72";

  private static int [] zzUnpackAction() {
    int [] result = new int[176];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\274\0\353\0\57\0\u011a"+
    "\0\u0149\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292"+
    "\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db\0\u040a"+
    "\0\u0439\0\u0468\0\u0497\0\u04c6\0\u04f5\0\u0524\0\u0553\0\u0468"+
    "\0\u0582\0\u05b1\0\u04f5\0\u05e0\0\57\0\57\0\57\0\57"+
    "\0\57\0\57\0\u060f\0\57\0\u063e\0\u066d\0\u069c\0\u06cb"+
    "\0\u06fa\0\u0729\0\u0758\0\u0787\0\u07b6\0\u07e5\0\u0814\0\u0843"+
    "\0\u0872\0\u08a1\0\u08d0\0\136\0\u08ff\0\u092e\0\u095d\0\u098c"+
    "\0\u09bb\0\u09ea\0\u0a19\0\u0a48\0\u0a77\0\u0aa6\0\u0ad5\0\136"+
    "\0\136\0\u0b04\0\u0b33\0\u0b62\0\u0b91\0\u0bc0\0\u0bef\0\u0c1e"+
    "\0\57\0\57\0\57\0\u0c4d\0\u0c7c\0\u0cab\0\u0cda\0\136"+
    "\0\u0d09\0\u0d38\0\u0d67\0\u0d96\0\u0dc5\0\u0df4\0\u0e23\0\u0e52"+
    "\0\136\0\u0e81\0\u0eb0\0\u0edf\0\u0f0e\0\u0f3d\0\136\0\136"+
    "\0\u0f6c\0\u0f9b\0\u0fca\0\u0ff9\0\136\0\u1028\0\136\0\136"+
    "\0\u1057\0\136\0\u1086\0\u10b5\0\u10e4\0\u1113\0\u1142\0\u1171"+
    "\0\u11a0\0\u11cf\0\136\0\u11fe\0\u122d\0\136\0\136\0\136"+
    "\0\136\0\u125c\0\u128b\0\u12ba\0\u12e9\0\u1318\0\u1347\0\u1376"+
    "\0\u13a5\0\136\0\u13d4\0\u1403\0\u1432\0\u1461\0\u1490\0\136"+
    "\0\u14bf\0\136\0\u14ee\0\136\0\57\0\136\0\136\0\u151d"+
    "\0\136\0\u154c\0\u157b\0\u15aa\0\136\0\u15d9\0\u1608\0\u1637"+
    "\0\u1666\0\u1695\0\136\0\136\0\136\0\u16c4\0\136\0\136"+
    "\0\136\0\136\0\u16f3\0\136\0\136\0\u1722\0\136\0\136";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[176];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\5\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\3\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\3\1\25\1\26"+
    "\3\3\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\60\0\2\3\4\0"+
    "\27\3\23\0\1\4\57\0\1\5\1\0\1\5\55\0"+
    "\1\53\31\0\1\54\21\0\2\3\4\0\1\3\1\55"+
    "\5\3\1\56\17\3\22\0\2\3\4\0\17\3\1\57"+
    "\7\3\22\0\2\3\4\0\7\3\1\60\17\3\22\0"+
    "\2\3\4\0\10\3\1\61\12\3\1\62\3\3\22\0"+
    "\2\3\4\0\5\3\1\63\2\3\1\64\1\65\15\3"+
    "\22\0\2\3\4\0\12\3\1\66\6\3\1\67\5\3"+
    "\22\0\2\3\4\0\3\3\1\70\2\3\1\71\20\3"+
    "\22\0\2\3\4\0\6\3\1\72\2\3\1\73\15\3"+
    "\22\0\2\3\4\0\7\3\1\74\17\3\22\0\2\3"+
    "\4\0\1\3\1\75\7\3\1\76\15\3\22\0\2\3"+
    "\4\0\10\3\1\77\16\3\22\0\2\3\4\0\6\3"+
    "\1\100\1\101\1\102\1\103\5\3\1\104\7\3\22\0"+
    "\2\3\4\0\3\3\1\105\5\3\1\106\15\3\22\0"+
    "\2\3\4\0\12\3\1\107\1\3\1\110\4\3\1\111"+
    "\3\3\1\112\1\3\22\0\2\3\4\0\2\3\1\113"+
    "\24\3\22\0\2\3\4\0\6\3\1\114\1\115\17\3"+
    "\22\0\2\3\4\0\6\3\1\116\20\3\22\0\2\3"+
    "\4\0\5\3\1\117\11\3\1\120\7\3\57\0\1\121"+
    "\56\0\1\54\1\122\55\0\1\54\1\0\1\122\54\0"+
    "\1\54\62\0\1\123\57\0\1\123\51\0\1\121\6\0"+
    "\1\121\47\0\1\121\7\0\1\121\50\0\1\124\16\0"+
    "\5\53\1\0\51\53\1\0\2\3\4\0\2\3\1\125"+
    "\24\3\22\0\2\3\4\0\3\3\1\126\23\3\22\0"+
    "\2\3\4\0\3\3\1\127\23\3\22\0\2\3\4\0"+
    "\1\3\1\130\14\3\1\131\10\3\22\0\2\3\4\0"+
    "\17\3\1\132\1\3\1\133\5\3\22\0\2\3\4\0"+
    "\3\3\1\134\1\135\22\3\22\0\2\3\4\0\6\3"+
    "\1\136\20\3\22\0\2\3\4\0\6\3\1\137\20\3"+
    "\22\0\2\3\4\0\12\3\1\140\14\3\22\0\2\3"+
    "\4\0\15\3\1\141\11\3\22\0\2\3\4\0\21\3"+
    "\1\142\5\3\22\0\2\3\4\0\2\3\1\143\24\3"+
    "\22\0\2\3\4\0\17\3\1\144\7\3\22\0\2\3"+
    "\4\0\25\3\1\145\1\3\22\0\2\3\4\0\12\3"+
    "\1\146\14\3\22\0\2\3\4\0\6\3\1\147\20\3"+
    "\22\0\2\3\4\0\2\3\1\150\24\3\22\0\2\3"+
    "\4\0\11\3\1\151\15\3\22\0\2\3\4\0\10\3"+
    "\1\152\16\3\22\0\2\3\4\0\11\3\1\153\15\3"+
    "\22\0\2\3\4\0\11\3\1\154\15\3\22\0\2\3"+
    "\4\0\7\3\1\155\17\3\22\0\2\3\4\0\12\3"+
    "\1\156\14\3\22\0\2\3\4\0\10\3\1\157\3\3"+
    "\1\160\12\3\22\0\2\3\4\0\16\3\1\161\10\3"+
    "\22\0\2\3\4\0\2\3\1\162\24\3\22\0\2\3"+
    "\4\0\24\3\1\163\2\3\22\0\2\3\4\0\7\3"+
    "\1\164\17\3\22\0\2\3\4\0\21\3\1\165\5\3"+
    "\22\0\2\3\4\0\17\3\1\166\7\3\22\0\2\3"+
    "\4\0\17\3\1\167\7\3\22\0\2\3\4\0\17\3"+
    "\1\170\7\3\22\0\2\3\4\0\2\3\1\171\24\3"+
    "\23\0\1\172\55\0\2\3\4\0\3\3\1\173\23\3"+
    "\22\0\2\3\4\0\6\3\1\174\20\3\22\0\2\3"+
    "\4\0\10\3\1\175\16\3\22\0\2\3\4\0\3\3"+
    "\1\176\23\3\22\0\2\3\4\0\14\3\1\177\12\3"+
    "\22\0\2\3\4\0\3\3\1\200\23\3\22\0\2\3"+
    "\4\0\4\3\1\201\22\3\22\0\2\3\4\0\3\3"+
    "\1\202\23\3\22\0\2\3\4\0\7\3\1\173\17\3"+
    "\22\0\2\3\4\0\21\3\1\203\5\3\22\0\2\3"+
    "\4\0\2\3\1\204\24\3\22\0\2\3\4\0\3\3"+
    "\1\205\23\3\22\0\2\3\4\0\16\3\1\206\10\3"+
    "\22\0\2\3\4\0\21\3\1\207\5\3\22\0\2\3"+
    "\4\0\1\210\26\3\22\0\2\3\4\0\13\3\1\173"+
    "\13\3\22\0\2\3\4\0\1\211\26\3\22\0\2\3"+
    "\4\0\21\3\1\131\5\3\22\0\2\3\4\0\25\3"+
    "\1\212\1\3\22\0\2\3\4\0\6\3\1\213\20\3"+
    "\22\0\2\3\4\0\6\3\1\214\20\3\22\0\2\3"+
    "\4\0\1\215\26\3\22\0\2\3\4\0\11\3\1\216"+
    "\15\3\22\0\2\3\4\0\17\3\1\217\7\3\22\0"+
    "\2\3\4\0\21\3\1\220\5\3\22\0\2\3\4\0"+
    "\12\3\1\221\14\3\22\0\2\3\4\0\12\3\1\222"+
    "\14\3\22\0\2\3\4\0\10\3\1\223\16\3\22\0"+
    "\2\3\4\0\5\3\1\224\21\3\23\0\1\172\46\0"+
    "\1\225\6\0\2\3\4\0\22\3\1\226\4\3\22\0"+
    "\2\3\4\0\15\3\1\227\11\3\22\0\2\3\4\0"+
    "\24\3\1\230\2\3\22\0\2\3\4\0\21\3\1\231"+
    "\5\3\22\0\2\3\4\0\17\3\1\232\7\3\22\0"+
    "\2\3\4\0\7\3\1\233\17\3\22\0\2\3\4\0"+
    "\7\3\1\234\17\3\22\0\2\3\4\0\3\3\1\235"+
    "\23\3\22\0\2\3\4\0\15\3\1\236\11\3\22\0"+
    "\2\3\4\0\6\3\1\237\20\3\22\0\2\3\4\0"+
    "\2\3\1\173\24\3\22\0\2\3\4\0\10\3\1\240"+
    "\16\3\22\0\2\3\4\0\10\3\1\125\16\3\22\0"+
    "\2\3\4\0\7\3\1\241\17\3\22\0\2\3\4\0"+
    "\12\3\1\242\14\3\22\0\2\3\4\0\2\3\1\243"+
    "\24\3\22\0\2\3\4\0\3\3\1\244\23\3\22\0"+
    "\2\3\4\0\2\3\1\245\24\3\22\0\2\3\4\0"+
    "\12\3\1\246\14\3\22\0\2\3\4\0\2\3\1\247"+
    "\24\3\22\0\2\3\4\0\12\3\1\250\14\3\22\0"+
    "\2\3\4\0\6\3\1\251\20\3\22\0\2\3\4\0"+
    "\10\3\1\252\16\3\22\0\2\3\4\0\10\3\1\253"+
    "\16\3\22\0\2\3\4\0\2\3\1\254\24\3\22\0"+
    "\2\3\4\0\13\3\1\255\13\3\22\0\2\3\4\0"+
    "\16\3\1\256\10\3\22\0\2\3\4\0\1\3\1\257"+
    "\25\3\22\0\2\3\4\0\3\3\1\260\23\3\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5969];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\1\11\35\1\6\11\1\1\1\11"+
    "\44\1\3\11\1\0\45\1\1\0\32\1\1\11\33\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[176];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 44: 
          { return new Symbol(sym.break_word, yychar, yyline, yytext());
          }
        case 59: break;
        case 37: 
          { return new Symbol(sym.elif_word, yychar, yyline, yytext());
          }
        case 60: break;
        case 15: 
          { return new Symbol(sym.Llave_a, yychar, yyline, yytext());
          }
        case 61: break;
        case 56: 
          { return new Symbol(sym.Cadena, yychar, yyline, yytext());
          }
        case 62: break;
        case 34: 
          { return new Symbol(sym.Int, yychar, yyline, yytext());
          }
        case 63: break;
        case 54: 
          { return new Symbol(sym.global_word, yychar, yyline, yytext());
          }
        case 64: break;
        case 20: 
          { return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());
          }
        case 65: break;
        case 30: 
          { return new Symbol(sym.not_word, yychar, yyline, yytext());
          }
        case 66: break;
        case 48: 
          { return new Symbol(sym.print_word, yychar, yyline, yytext());
          }
        case 67: break;
        case 46: 
          { return new Symbol(sym.class_word, yychar, yyline, yytext());
          }
        case 68: break;
        case 45: 
          { return new Symbol(sym.yield_word, yychar, yyline, yytext());
          }
        case 69: break;
        case 38: 
          { return new Symbol(sym.Else, yychar, yyline, yytext());
          }
        case 70: break;
        case 52: 
          { return new Symbol(sym.return_word, yychar, yyline, yytext());
          }
        case 71: break;
        case 11: 
          { return new Symbol(sym.Op_logico, yychar, yyline, yytext());
          }
        case 72: break;
        case 17: 
          { return new Symbol(sym.Corchete_a, yychar, yyline, yytext());
          }
        case 73: break;
        case 5: 
          { return new Symbol(sym.Division, yychar, yyline, yytext());
          }
        case 74: break;
        case 41: 
          { return new Symbol(sym.pass_word, yychar, yyline, yytext());
          }
        case 75: break;
        case 29: 
          { return new Symbol(sym.nya, yychar, yyline, yytext());
          }
        case 76: break;
        case 32: 
          { return new Symbol(sym.del_word, yychar, yyline, yytext());
          }
        case 77: break;
        case 22: 
          { return new Symbol(sym.Do, yychar, yyline, yytext());
          }
        case 78: break;
        case 6: 
          { return new Symbol(sym.Comillas, yychar, yyline, yytext());
          }
        case 79: break;
        case 31: 
          { return new Symbol(sym.For, yychar, yyline, yytext());
          }
        case 80: break;
        case 58: 
          { return new Symbol(sym.continue_word, yychar, yyline, yytext());
          }
        case 81: break;
        case 35: 
          { return new Symbol(sym.T_dato, yychar, yyline, yytext());
          }
        case 82: break;
        case 13: 
          { return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());
          }
        case 83: break;
        case 9: 
          { return new Symbol(sym.Resta, yychar, yyline, yytext());
          }
        case 84: break;
        case 47: 
          { return new Symbol(sym.raise_word, yychar, yyline, yytext());
          }
        case 85: break;
        case 50: 
          { return new Symbol(sym.except_word, yychar, yyline, yytext());
          }
        case 86: break;
        case 16: 
          { return new Symbol(sym.Llave_c, yychar, yyline, yytext());
          }
        case 87: break;
        case 57: 
          { return new Symbol(sym.finally_word, yychar, yyline, yytext());
          }
        case 88: break;
        case 21: 
          { return new Symbol(sym.or_word, yychar, yyline, yytext());
          }
        case 89: break;
        case 40: 
          { return new Symbol(sym.from_word, yychar, yyline, yytext());
          }
        case 90: break;
        case 18: 
          { return new Symbol(sym.Corchete_c, yychar, yyline, yytext());
          }
        case 91: break;
        case 24: 
          { return new Symbol(sym.If, yychar, yyline, yytext());
          }
        case 92: break;
        case 26: 
          { return new Symbol(sym.Op_incremento, yychar, yyline, yytext());
          }
        case 93: break;
        case 25: 
          { return new Symbol(sym.is_word, yychar, yyline, yytext());
          }
        case 94: break;
        case 23: 
          { return new Symbol(sym.in_word, yychar, yyline, yytext());
          }
        case 95: break;
        case 42: 
          { return new Symbol(sym.Main, yychar, yyline, yytext());
          }
        case 96: break;
        case 43: 
          { return new Symbol(sym.with_word, yychar, yyline, yytext());
          }
        case 97: break;
        case 14: 
          { return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());
          }
        case 98: break;
        case 53: 
          { return new Symbol(sym.lambda_word, yychar, yyline, yytext());
          }
        case 99: break;
        case 27: 
          { return new Symbol(sym.try_word, yychar, yyline, yytext());
          }
        case 100: break;
        case 19: 
          { return new Symbol(sym.P_coma, yychar, yyline, yytext());
          }
        case 101: break;
        case 10: 
          { return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());
          }
        case 102: break;
        case 51: 
          { return new Symbol(sym.assert_word, yychar, yyline, yytext());
          }
        case 103: break;
        case 8: 
          { return new Symbol(sym.Suma, yychar, yyline, yytext());
          }
        case 104: break;
        case 1: 
          { return new Symbol(sym.ERROR, yychar, yyline, yytext());
          }
        case 105: break;
        case 33: 
          { return new Symbol(sym.def_word, yychar, yyline, yytext());
          }
        case 106: break;
        case 49: 
          { return new Symbol(sym.While, yychar, yyline, yytext());
          }
        case 107: break;
        case 4: 
          { /*Ignore*/
          }
        case 108: break;
        case 39: 
          { return new Symbol(sym.exec_word, yychar, yyline, yytext());
          }
        case 109: break;
        case 7: 
          { return new Symbol(sym.Igual, yychar, yyline, yytext());
          }
        case 110: break;
        case 2: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 111: break;
        case 3: 
          { return new Symbol(sym.Numero, yychar, yyline, yytext());
          }
        case 112: break;
        case 12: 
          { return new Symbol(sym.Op_relacional, yychar, yyline, yytext());
          }
        case 113: break;
        case 55: 
          { return new Symbol(sym.import_word, yychar, yyline, yytext());
          }
        case 114: break;
        case 36: 
          { return new Symbol(sym.Op_booleano, yychar, yyline, yytext());
          }
        case 115: break;
        case 28: 
          { return new Symbol(sym.and_word, yychar, yyline, yytext());
          }
        case 116: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
