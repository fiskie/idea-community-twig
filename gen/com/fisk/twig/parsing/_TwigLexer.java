/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.fisk.twig.parsing;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.containers.Stack;

// suppress various warnings/inspections for the generated class
@SuppressWarnings ({"FieldCanBeLocal", "UnusedDeclaration", "UnusedAssignment", "AccessStaticViaInstance", "MismatchedReadAndWriteOfArray", "WeakerAccess", "SameParameterValue", "CanBeFinal", "SameReturnValue", "RedundantThrows", "ConstantConditions"})

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>twig.flex</tt>
 */
final class _TwigLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int expression = 2;
  public static final int statement = 4;
  public static final int statement_block_tag = 6;
  public static final int comment = 8;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4, 4
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\5\1\22\0\1\50\1\42\1\12\1\6\1\0\1\5\1\0\1\56\1\23\1\24\1\53\1\52\1\14"+
    "\1\3\1\11\1\37\12\10\1\55\1\0\1\43\1\22\1\43\1\54\1\0\32\7\1\25\1\13\1\26"+
    "\3\7\1\33\1\40\1\46\1\16\1\17\1\32\1\7\1\47\1\44\2\7\1\34\1\45\1\21\1\15\2"+
    "\7\1\30\1\35\1\27\1\31\1\20\1\51\1\41\2\7\1\2\1\36\1\4\1\52\6\0\1\57\242\0"+
    "\2\57\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\3\0\1\2\1\1\2\3\1\4\1\5\1\6"+
    "\1\7\1\6\1\10\1\3\1\11\1\3\3\10\1\3"+
    "\1\12\1\13\1\14\1\15\4\10\1\16\1\11\1\10"+
    "\1\6\2\10\1\6\2\3\1\6\1\7\1\6\2\10"+
    "\1\17\2\3\1\20\1\21\3\2\1\22\1\23\1\24"+
    "\2\0\1\25\1\26\2\0\1\27\1\0\1\6\6\10"+
    "\2\0\1\10\2\0\1\30\2\10\1\2\1\31\1\22"+
    "\1\23\1\24\1\0\4\10\3\0\1\10\1\32\1\10"+
    "\1\33\4\10\1\0\1\10\1\0\1\34\2\10\1\0"+
    "\1\35\1\10\2\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[109];
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
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\u0150"+
    "\0\u0180\0\u0150\0\u01b0\0\u01e0\0\u0150\0\u0210\0\u0240\0\u0270"+
    "\0\u02a0\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0150\0\u0150\0\u0210"+
    "\0\u0210\0\u0390\0\u03c0\0\u03f0\0\u0420\0\u0150\0\u0450\0\u0480"+
    "\0\u0360\0\u04b0\0\u04e0\0\u0510\0\u0540\0\u0570\0\u05a0\0\u0150"+
    "\0\u05d0\0\u0600\0\u0630\0\u0360\0\u0660\0\u05d0\0\u0690\0\u0150"+
    "\0\u06c0\0\u06f0\0\u0720\0\u0750\0\u0780\0\u07b0\0\u01e0\0\u0240"+
    "\0\u0150\0\u0150\0\u07e0\0\u02a0\0\u0150\0\u0810\0\u0210\0\u0840"+
    "\0\u0870\0\u08a0\0\u08d0\0\u0900\0\u0930\0\u0960\0\u0570\0\u0990"+
    "\0\u09c0\0\u05d0\0\u0150\0\u09f0\0\u0a20\0\u0a50\0\u0150\0\u0150"+
    "\0\u0150\0\u0150\0\u0a80\0\u0ab0\0\u0ae0\0\u0b10\0\u0b40\0\u0b70"+
    "\0\u0ba0\0\u0bd0\0\u0c00\0\u0210\0\u0c30\0\u0150\0\u0c60\0\u0c90"+
    "\0\u0cc0\0\u0cf0\0\u0d20\0\u0d50\0\u0d80\0\u0150\0\u0db0\0\u0de0"+
    "\0\u0e10\0\u0150\0\u0e40\0\u0e70\0\u0ea0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[109];
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
    "\2\6\1\7\55\6\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\10\1\16\1\17\1\20\1\21\1\16\1\10"+
    "\1\22\1\16\1\23\1\16\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\2\16\1\33\1\34\1\16\1\35"+
    "\1\36\1\37\1\40\1\16\1\25\1\41\1\42\1\43"+
    "\2\16\1\11\1\16\1\15\1\44\1\45\1\10\1\46"+
    "\1\0\1\10\1\11\1\12\1\47\1\50\1\51\1\10"+
    "\1\16\1\17\1\20\1\21\1\16\1\10\1\52\1\16"+
    "\1\53\1\16\1\24\1\54\1\26\1\27\1\30\1\31"+
    "\1\32\2\16\1\33\1\34\1\16\1\35\1\36\1\37"+
    "\1\40\1\16\1\25\1\41\1\42\1\43\2\16\1\11"+
    "\1\16\1\15\1\44\1\45\1\10\1\46\1\0\1\10"+
    "\1\11\1\10\1\55\1\10\1\56\1\10\1\57\3\10"+
    "\1\57\1\60\5\57\3\10\11\57\2\10\2\57\2\10"+
    "\4\57\1\11\1\57\5\10\1\0\3\61\1\62\2\61"+
    "\1\63\51\61\2\6\1\0\55\6\2\0\1\64\2\0"+
    "\1\65\1\66\132\0\1\11\46\0\1\11\13\0\1\67"+
    "\3\0\1\70\53\0\1\71\62\0\2\16\2\0\1\16"+
    "\1\0\5\16\3\0\11\16\2\0\2\16\2\0\4\16"+
    "\1\0\1\16\7\0\1\72\2\0\1\72\3\0\1\70"+
    "\1\73\12\0\1\72\23\0\1\72\20\0\1\15\46\0"+
    "\12\74\1\75\1\76\44\74\7\0\2\16\2\0\1\16"+
    "\1\0\5\16\3\0\3\16\1\77\5\16\2\0\2\16"+
    "\2\0\4\16\1\0\1\16\15\0\2\16\2\0\1\16"+
    "\1\0\4\16\1\100\3\0\11\16\2\0\2\16\2\0"+
    "\4\16\1\0\1\16\15\0\2\16\2\0\1\16\1\0"+
    "\1\101\4\16\3\0\11\16\2\0\2\16\2\0\4\16"+
    "\1\0\1\16\30\0\1\15\44\0\2\16\2\0\1\16"+
    "\1\0\5\16\3\0\3\16\1\102\5\16\2\0\2\16"+
    "\2\0\4\16\1\0\1\16\15\0\2\16\2\0\1\16"+
    "\1\0\5\16\3\0\6\16\1\103\2\16\2\0\2\16"+
    "\2\0\4\16\1\0\1\16\15\0\2\16\2\0\1\16"+
    "\1\0\4\16\1\104\3\0\11\16\2\0\2\16\2\0"+
    "\4\16\1\0\1\16\15\0\2\16\2\0\1\16\1\0"+
    "\5\16\3\0\2\16\1\105\6\16\2\0\2\16\2\0"+
    "\4\16\1\0\1\16\45\0\1\15\23\0\1\106\3\0"+
    "\2\16\1\0\1\74\1\16\1\0\5\16\3\0\11\16"+
    "\2\0\2\16\2\0\4\16\1\0\1\16\4\0\1\107"+
    "\10\0\2\16\2\0\1\16\1\0\4\16\1\77\3\0"+
    "\10\16\1\77\2\0\2\16\2\0\4\16\1\0\1\16"+
    "\15\0\2\16\2\0\1\16\1\0\5\16\3\0\6\16"+
    "\1\110\2\16\2\0\2\16\2\0\4\16\1\0\1\16"+
    "\61\0\1\15\60\0\2\15\2\0\13\107\1\111\42\107"+
    "\1\75\1\107\5\0\1\112\2\0\1\70\53\0\1\113"+
    "\62\0\2\16\2\0\1\16\1\0\1\16\1\114\3\16"+
    "\3\0\3\16\1\77\5\16\2\0\2\16\2\0\4\16"+
    "\1\0\1\16\15\0\2\16\2\0\1\16\1\0\3\16"+
    "\1\115\1\100\3\0\11\16\2\0\2\16\2\0\4\16"+
    "\1\0\1\16\13\0\1\112\61\0\2\57\2\0\1\57"+
    "\1\0\5\57\3\0\11\57\2\0\2\57\2\0\4\57"+
    "\1\0\1\57\6\0\6\61\1\116\57\61\1\63\55\61"+
    "\1\117\1\61\1\116\51\61\3\0\1\120\57\0\1\121"+
    "\57\0\1\122\64\0\1\123\60\0\1\74\55\0\2\16"+
    "\2\0\1\16\1\0\1\16\1\124\3\16\3\0\11\16"+
    "\2\0\2\16\2\0\4\16\1\0\1\16\15\0\2\16"+
    "\2\0\1\16\1\0\5\16\3\0\2\16\1\77\6\16"+
    "\2\0\2\16\2\0\4\16\1\0\1\16\15\0\2\16"+
    "\2\0\1\16\1\0\5\16\3\0\4\16\1\125\4\16"+
    "\2\0\2\16\2\0\4\16\1\0\1\16\15\0\2\16"+
    "\2\0\1\16\1\0\5\16\3\0\7\16\1\126\1\16"+
    "\2\0\2\16\2\0\4\16\1\0\1\16\15\0\2\16"+
    "\2\0\1\16\1\0\1\16\1\77\3\16\3\0\11\16"+
    "\2\0\2\16\2\0\4\16\1\0\1\16\15\0\2\16"+
    "\2\0\1\16\1\0\5\16\3\0\6\16\1\127\2\16"+
    "\2\0\2\16\2\0\4\16\1\0\1\16\23\0\1\130"+
    "\15\0\1\131\5\0\1\132\25\0\2\16\2\0\1\16"+
    "\1\0\5\16\3\0\2\16\1\133\6\16\2\0\2\16"+
    "\2\0\4\16\1\0\1\16\17\0\1\107\55\0\2\16"+
    "\2\0\1\16\1\0\1\16\1\134\3\16\3\0\11\16"+
    "\2\0\2\16\2\0\4\16\1\0\1\16\15\0\2\16"+
    "\2\0\1\16\1\0\2\16\1\135\2\16\3\0\11\16"+
    "\2\0\2\16\2\0\4\16\1\0\1\16\6\0\4\61"+
    "\1\136\1\61\1\116\51\61\1\0\1\72\2\0\1\72"+
    "\3\0\1\123\13\0\1\72\23\0\1\72\16\0\2\16"+
    "\2\0\1\16\1\0\5\16\3\0\10\16\1\137\2\0"+
    "\2\16\2\0\4\16\1\0\1\16\15\0\2\16\2\0"+
    "\1\16\1\0\2\16\1\140\2\16\3\0\11\16\2\0"+
    "\2\16\2\0\4\16\1\0\1\16\15\0\2\16\2\0"+
    "\1\16\1\0\5\16\3\0\10\16\1\141\2\0\2\16"+
    "\2\0\4\16\1\0\1\16\15\0\2\16\2\0\1\16"+
    "\1\0\5\16\3\0\3\16\1\142\5\16\2\0\2\16"+
    "\2\0\4\16\1\0\1\16\36\0\1\15\50\0\1\143"+
    "\53\0\1\130\51\0\2\16\2\0\1\16\1\0\5\16"+
    "\3\0\11\16\2\0\2\16\2\0\2\16\1\144\1\16"+
    "\1\0\1\16\15\0\2\16\2\0\1\16\1\0\4\16"+
    "\1\134\3\0\11\16\2\0\2\16\2\0\4\16\1\0"+
    "\1\16\15\0\2\16\2\0\1\16\1\0\5\16\3\0"+
    "\11\16\2\0\2\16\2\0\4\16\1\145\1\16\7\0"+
    "\1\146\2\0\1\146\2\0\2\16\2\0\1\16\1\0"+
    "\5\16\2\0\1\146\11\16\2\0\2\16\2\0\4\16"+
    "\1\146\1\16\15\0\2\16\2\0\1\16\1\0\2\16"+
    "\1\147\2\16\3\0\11\16\2\0\2\16\2\0\4\16"+
    "\1\0\1\16\15\0\2\16\2\0\1\16\1\0\5\16"+
    "\3\0\2\16\1\124\6\16\2\0\2\16\2\0\4\16"+
    "\1\0\1\16\24\0\1\15\50\0\2\16\2\0\1\16"+
    "\1\0\5\16\3\0\11\16\2\0\2\16\2\0\3\16"+
    "\1\150\1\0\1\16\57\0\1\151\7\0\1\152\2\0"+
    "\1\152\2\0\2\16\2\0\1\16\1\0\5\16\2\0"+
    "\1\152\11\16\2\0\2\16\2\0\4\16\1\152\1\16"+
    "\15\0\2\16\2\0\1\16\1\0\2\16\1\153\2\16"+
    "\3\0\11\16\2\0\2\16\2\0\4\16\1\0\1\16"+
    "\52\0\1\154\22\0\2\16\2\0\1\16\1\0\5\16"+
    "\3\0\10\16\1\77\2\0\2\16\2\0\4\16\1\0"+
    "\1\16\35\0\1\155\77\0\1\15\10\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3792];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\3\0\3\1\1\11\1\1\1\11\2\1\1\11"+
    "\10\1\2\11\6\1\1\11\11\1\1\11\7\1\1\11"+
    "\6\1\2\0\2\11\2\0\1\11\1\0\7\1\2\0"+
    "\1\1\2\0\1\11\3\1\4\11\1\0\4\1\3\0"+
    "\3\1\1\11\4\1\1\0\1\1\1\0\1\11\2\1"+
    "\1\0\1\11\1\1\2\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[109];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Stack<Integer> stack = new Stack<Integer>();

    public void yypushState(int newState) {
      stack.push(yystate());
      yybegin(newState);
    }

    public void yypopState() {
      yybegin(stack.pop());
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  _TwigLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBuffer.charAt(zzStartRead+pos);
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TwigTokenTypes.CONTENT;
            } 
            // fall through
          case 30: break;
          case 2: 
            { return TwigTokenTypes.UNCLOSED_COMMENT;
            } 
            // fall through
          case 31: break;
          case 3: 
            { return TwigTokenTypes.INVALID;
            } 
            // fall through
          case 32: break;
          case 4: 
            { return TwigTokenTypes.WHITE_SPACE;
            } 
            // fall through
          case 33: break;
          case 5: 
            { return TwigTokenTypes.OPEN_HASH;
            } 
            // fall through
          case 34: break;
          case 6: 
            { return TwigTokenTypes.OPERATOR;
            } 
            // fall through
          case 35: break;
          case 7: 
            { return TwigTokenTypes.CLOSE_HASH;
            } 
            // fall through
          case 36: break;
          case 8: 
            { return TwigTokenTypes.VARIABLE;
            } 
            // fall through
          case 37: break;
          case 9: 
            { return TwigTokenTypes.SEP;
            } 
            // fall through
          case 38: break;
          case 10: 
            { return TwigTokenTypes.OPEN_SEXPR;
            } 
            // fall through
          case 39: break;
          case 11: 
            { return TwigTokenTypes.CLOSE_SEXPR;
            } 
            // fall through
          case 40: break;
          case 12: 
            { return TwigTokenTypes.OPEN_LIST;
            } 
            // fall through
          case 41: break;
          case 13: 
            { return TwigTokenTypes.CLOSE_LIST;
            } 
            // fall through
          case 42: break;
          case 14: 
            { return TwigTokenTypes.FILTER_SEP;
            } 
            // fall through
          case 43: break;
          case 15: 
            { return TwigTokenTypes.EQUALS;
            } 
            // fall through
          case 44: break;
          case 16: 
            { yybegin(statement);
        return TwigTokenTypes.TAG;
            } 
            // fall through
          case 45: break;
          case 17: 
            { 
            } 
            // fall through
          case 46: break;
          case 18: 
            { yybegin(expression);
        return TwigTokenTypes.EXPRESSION_OPEN;
            } 
            // fall through
          case 47: break;
          case 19: 
            { yybegin(statement_block_tag);
        return TwigTokenTypes.STATEMENT_OPEN;
            } 
            // fall through
          case 48: break;
          case 20: 
            { yybegin(comment);
        return TwigTokenTypes.COMMENT_OPEN;
            } 
            // fall through
          case 49: break;
          case 21: 
            { yybegin(YYINITIAL);
        return TwigTokenTypes.EXPRESSION_CLOSE;
            } 
            // fall through
          case 50: break;
          case 22: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return TwigTokenTypes.NUMBER;
            } 
            // fall through
          case 51: break;
          case 23: 
            { return TwigTokenTypes.STRING;
            } 
            // fall through
          case 52: break;
          case 24: 
            { yybegin(YYINITIAL);
        return TwigTokenTypes.STATEMENT_CLOSE;
            } 
            // fall through
          case 53: break;
          case 25: 
            { yybegin(YYINITIAL);
        return TwigTokenTypes.COMMENT_CLOSE;
            } 
            // fall through
          case 54: break;
          case 26: 
            { return TwigTokenTypes.TEST;
            } 
            // fall through
          case 55: break;
          case 27: 
            { // handle the extra - if it's a whitespace controlling tag
        if (yytext().subSequence(yylength() - 3, yylength() - 2).toString().equals("-")) {
            yypushback(1);
        }

        yypushback(2);
        return TwigTokenTypes.COMMENT_CONTENT;
            } 
            // fall through
          case 56: break;
          case 28: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzStartRead, 4);
            { return TwigTokenTypes.BOOLEAN;
            } 
            // fall through
          case 57: break;
          case 29: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzStartRead, 5);
            { return TwigTokenTypes.BOOLEAN;
            } 
            // fall through
          case 58: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
