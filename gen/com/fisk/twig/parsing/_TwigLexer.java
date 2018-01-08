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
  public static final int statement = 2;
  public static final int statement_block_tag = 4;
  public static final int twig = 6;
  public static final int comment = 8;
  public static final int expression = 10;
  public static final int subexpression = 12;
  public static final int hash = 14;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7, 7
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 15296 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\6\15\1\16\23\15"+
    "\1\17\1\15\1\20\1\21\12\15\1\22\10\12\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
    "\32\1\33\1\34\1\35\1\36\2\12\1\15\1\37\3\12\1\40\10\12\1\41\1\42\5\15\1\43"+
    "\1\44\11\12\1\45\2\12\1\46\4\12\1\47\1\50\1\51\1\12\1\52\1\12\1\53\1\54\1"+
    "\55\3\12\51\15\1\56\3\15\1\57\1\60\4\15\1\61\12\12\1\62\u02c1\12\1\63\277"+
    "\12");

  /* The ZZ_CMAP_Y table has 3328 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1\1\11\1\12\1\13\1\14\1\13\1\14\34"+
    "\13\1\15\1\16\1\17\1\1\7\13\1\20\1\21\1\13\1\22\4\13\1\23\10\13\1\22\12\13"+
    "\1\24\1\13\1\25\1\24\1\13\1\26\1\24\1\13\1\27\1\30\1\13\1\31\1\32\1\1\1\31"+
    "\4\13\1\33\6\13\1\34\1\35\1\36\1\1\3\13\1\37\6\13\1\16\3\13\1\40\2\13\1\41"+
    "\1\1\1\13\1\42\4\1\1\13\1\43\1\1\1\44\1\22\7\13\1\45\1\24\1\34\1\46\1\35\1"+
    "\47\1\50\1\51\1\45\1\16\1\52\1\46\1\35\1\53\1\54\1\55\1\56\1\57\1\60\1\22"+
    "\1\35\1\61\1\62\1\63\1\45\1\64\1\65\1\46\1\35\1\61\1\66\1\67\1\45\1\70\1\71"+
    "\1\72\1\73\1\33\1\74\1\75\1\56\1\1\1\76\1\77\1\35\1\100\1\101\1\102\1\45\1"+
    "\1\1\76\1\77\1\35\1\103\1\101\1\104\1\45\1\105\1\106\1\77\1\13\1\37\1\107"+
    "\1\110\1\45\1\111\1\112\1\113\1\13\1\114\1\115\1\116\1\56\1\117\1\24\2\13"+
    "\1\31\1\120\1\121\2\1\1\122\1\123\1\124\1\125\1\126\1\127\2\1\1\63\1\130\1"+
    "\121\1\131\1\132\1\13\1\133\1\24\1\134\1\132\1\13\1\133\1\135\3\1\4\13\1\121"+
    "\4\13\1\41\2\13\1\136\2\13\1\137\24\13\1\140\1\141\2\13\1\140\2\13\1\142\1"+
    "\143\1\14\3\13\1\143\3\13\1\37\2\1\1\13\1\1\5\13\1\144\1\24\45\13\1\36\1\13"+
    "\1\24\1\31\4\13\1\145\1\146\1\147\1\150\1\13\1\150\1\13\1\151\1\147\1\152"+
    "\5\13\1\153\1\121\1\1\1\154\1\121\5\13\1\26\2\13\1\31\4\13\1\57\1\13\1\120"+
    "\2\42\1\56\1\13\1\41\1\150\2\13\1\42\1\13\2\121\2\1\1\13\1\42\3\13\1\120\1"+
    "\13\1\36\2\121\1\155\1\120\4\1\4\13\1\42\1\121\1\156\1\151\7\13\1\151\3\13"+
    "\1\26\1\100\2\13\1\41\1\146\4\1\1\157\1\13\1\160\17\13\1\161\21\13\1\144\2"+
    "\13\1\144\1\162\1\13\1\41\3\13\1\163\1\164\1\165\1\133\1\164\2\1\1\166\1\167"+
    "\1\63\1\170\1\1\1\171\1\1\1\133\3\1\2\13\1\63\1\172\1\173\1\174\1\127\1\175"+
    "\1\1\2\13\1\146\62\1\1\56\2\13\1\121\161\1\2\13\1\120\2\13\1\120\10\13\1\176"+
    "\1\151\2\13\1\136\3\13\1\177\1\167\1\13\1\200\4\201\2\13\2\1\1\167\35\1\1"+
    "\202\1\1\1\24\1\203\1\24\4\13\1\204\1\24\4\13\1\137\1\205\1\13\1\41\1\24\4"+
    "\13\1\120\1\1\1\13\1\31\3\1\1\13\40\1\133\13\1\57\4\1\135\13\1\57\2\1\10\13"+
    "\1\133\4\1\2\13\1\41\20\13\1\133\1\13\1\42\1\1\3\13\1\206\7\13\1\16\1\1\1"+
    "\207\1\210\5\13\1\211\1\13\1\120\1\26\3\1\1\207\2\13\1\26\1\1\3\13\1\151\4"+
    "\13\1\57\1\121\1\13\1\212\2\13\1\41\2\13\1\151\1\13\1\133\4\13\1\213\1\121"+
    "\1\13\1\120\3\13\1\200\1\41\1\121\1\13\1\113\4\13\1\32\1\154\1\13\1\214\1"+
    "\215\1\216\1\201\2\13\1\137\1\57\7\13\1\217\1\121\72\13\1\151\1\13\1\220\2"+
    "\13\1\42\20\1\26\13\1\41\6\13\1\121\2\1\1\200\1\221\1\35\1\222\1\223\6\13"+
    "\1\16\1\1\1\224\25\13\1\41\1\1\4\13\1\210\2\13\1\26\2\1\1\42\1\13\1\1\1\13"+
    "\1\225\1\226\2\1\1\134\7\13\1\133\1\1\1\121\1\24\1\227\1\24\1\31\1\56\4\13"+
    "\1\120\1\230\1\231\2\1\1\232\1\13\1\14\1\233\2\41\2\1\7\13\1\31\4\1\3\13\1"+
    "\150\7\1\1\234\10\1\1\13\1\133\3\13\2\63\1\1\2\13\1\1\1\13\1\31\2\13\1\31"+
    "\1\13\1\41\2\13\1\235\1\236\2\1\11\13\1\41\1\121\2\13\1\235\1\13\1\42\2\13"+
    "\1\26\3\13\1\151\11\1\23\13\1\200\1\13\1\57\1\26\11\1\1\237\2\13\1\240\1\13"+
    "\1\57\1\13\1\200\1\13\1\120\4\1\1\13\1\241\1\13\1\57\1\13\1\121\4\1\3\13\1"+
    "\242\4\1\1\243\1\244\1\13\1\245\2\1\1\13\1\133\1\13\1\133\2\1\1\132\1\13\1"+
    "\200\1\1\3\13\1\57\1\13\1\57\1\13\1\32\1\13\1\16\6\1\4\13\1\146\3\1\3\13\1"+
    "\32\3\13\1\32\60\1\4\13\1\200\1\1\1\56\1\167\3\13\1\31\1\1\1\13\1\146\1\121"+
    "\3\13\1\134\1\1\2\13\1\246\4\13\1\247\1\250\2\1\1\13\1\22\1\13\1\251\4\1\1"+
    "\252\1\27\1\146\3\13\1\31\1\121\1\34\1\46\1\35\1\61\1\66\1\253\1\254\1\150"+
    "\10\1\4\13\1\31\1\121\2\1\4\13\1\255\1\121\12\1\3\13\1\256\1\63\1\257\2\1"+
    "\4\13\1\260\1\121\2\1\3\13\1\26\1\121\3\1\1\13\1\100\1\42\1\121\26\1\4\13"+
    "\1\121\1\167\34\1\3\13\1\146\20\1\1\35\2\13\1\14\1\63\1\121\1\1\1\210\1\13"+
    "\1\210\1\132\1\200\64\1\71\13\1\121\6\1\6\13\1\120\1\1\14\13\1\151\53\1\2"+
    "\13\1\120\75\1\44\13\1\200\33\1\43\13\1\146\1\13\1\120\1\121\6\1\1\13\1\41"+
    "\1\150\3\13\1\200\1\151\1\121\1\224\1\261\1\13\67\1\4\13\1\150\2\13\1\120"+
    "\1\167\1\13\4\1\1\63\1\1\76\13\1\133\1\1\57\13\1\32\20\1\1\16\77\1\6\13\1"+
    "\31\1\133\1\146\1\262\114\1\1\263\1\264\1\265\1\1\1\266\11\1\1\267\33\1\5"+
    "\13\1\134\3\13\1\147\1\270\1\271\1\272\3\13\1\273\1\274\1\13\1\275\1\276\1"+
    "\77\24\13\1\256\1\13\1\77\1\137\1\13\1\137\1\13\1\134\1\13\1\134\1\120\1\13"+
    "\1\120\1\13\1\35\1\13\1\35\1\13\1\277\3\13\40\1\3\13\1\220\2\13\1\133\1\300"+
    "\1\170\1\156\1\24\25\1\1\14\1\211\1\301\75\1\14\13\1\150\1\200\2\1\4\13\1"+
    "\31\1\121\112\1\1\272\1\13\1\302\1\303\1\304\1\305\1\306\1\307\1\310\1\42"+
    "\1\311\1\42\47\1\1\13\1\121\1\13\1\121\1\13\1\121\47\1\55\13\1\200\2\1\103"+
    "\13\1\150\15\13\1\41\150\13\1\16\25\1\41\13\1\41\56\1\17\13\41\1");

  /* The ZZ_CMAP_A table has 3232 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\4\1\22\0\1\55\1\51\1\34\1\7\1\0\1\6\1\0\1\37\1\12\1\13\1\60\1\56"+
    "\1\62\1\4\1\30\1\32\12\27\1\16\1\0\1\52\1\33\1\52\1\61\1\0\32\10\1\14\1\35"+
    "\1\15\1\0\1\10\1\0\1\24\1\47\1\54\1\41\1\22\1\23\1\10\1\46\1\45\2\10\1\25"+
    "\1\53\1\43\1\40\2\10\1\20\1\26\1\17\1\21\1\42\1\44\1\50\2\10\1\3\1\31\1\5"+
    "\1\57\6\0\1\36\24\0\1\11\12\0\1\11\4\0\1\11\5\0\27\11\1\0\12\11\4\0\14\11"+
    "\16\0\5\11\7\0\1\11\1\0\1\11\1\0\5\11\1\0\2\11\2\0\4\11\1\0\1\11\6\0\1\11"+
    "\1\0\3\11\1\0\1\11\1\0\4\11\1\0\23\11\1\0\11\11\1\0\26\11\2\0\1\11\6\0\10"+
    "\11\10\0\16\11\1\0\1\11\1\0\2\11\1\0\2\11\1\0\1\11\10\0\13\11\5\0\3\11\15"+
    "\0\12\11\4\0\6\11\1\0\10\11\2\0\12\11\1\0\23\11\2\0\14\11\2\0\11\11\4\0\1"+
    "\11\5\0\16\11\2\0\14\11\4\0\5\11\1\0\10\11\6\0\20\11\2\0\13\11\2\0\16\11\1"+
    "\0\1\11\3\0\4\11\2\0\11\11\2\0\2\11\2\0\4\11\10\0\1\11\4\0\2\11\1\0\1\11\1"+
    "\0\3\11\1\0\6\11\4\0\2\11\1\0\2\11\1\0\2\11\1\0\2\11\2\0\1\11\1\0\5\11\4\0"+
    "\2\11\2\0\3\11\3\0\1\11\7\0\4\11\1\0\1\11\7\0\20\11\13\0\3\11\1\0\11\11\1"+
    "\0\2\11\1\0\2\11\1\0\5\11\2\0\12\11\1\0\3\11\1\0\3\11\2\0\1\11\30\0\1\11\7"+
    "\0\3\11\1\0\10\11\2\0\6\11\2\0\2\11\2\0\3\11\10\0\2\11\4\0\2\11\1\0\1\11\1"+
    "\0\1\11\20\0\2\11\1\0\6\11\3\0\3\11\1\0\4\11\3\0\2\11\1\0\1\11\1\0\2\11\3"+
    "\0\2\11\3\0\3\11\3\0\5\11\3\0\3\11\1\0\4\11\2\0\1\11\6\0\1\11\10\0\4\11\1"+
    "\0\10\11\1\0\3\11\1\0\30\11\3\0\10\11\1\0\3\11\1\0\4\11\7\0\2\11\1\0\3\11"+
    "\5\0\4\11\1\0\5\11\2\0\4\11\5\0\2\11\7\0\1\11\2\0\2\11\16\0\3\11\1\0\10\11"+
    "\1\0\7\11\1\0\3\11\1\0\5\11\5\0\4\11\7\0\1\11\12\0\6\11\2\0\2\11\1\0\22\11"+
    "\3\0\10\11\1\0\11\11\1\0\1\11\2\0\7\11\3\0\1\11\4\0\6\11\1\0\1\11\1\0\10\11"+
    "\2\0\2\11\14\0\17\11\1\0\12\11\7\0\2\11\1\0\1\11\2\0\2\11\1\0\1\11\2\0\1\11"+
    "\6\0\4\11\1\0\7\11\1\0\3\11\1\0\1\11\1\0\1\11\2\0\2\11\1\0\15\11\1\0\3\11"+
    "\2\0\5\11\1\0\1\11\1\0\6\11\2\0\12\11\2\0\4\11\10\0\2\11\13\0\1\11\1\0\1\11"+
    "\1\0\1\11\4\0\12\11\1\0\24\11\3\0\5\11\1\0\12\11\6\0\1\11\11\0\6\11\1\0\1"+
    "\11\5\0\1\11\2\0\13\11\1\0\15\11\1\0\4\11\2\0\7\11\1\0\1\11\1\0\4\11\2\0\1"+
    "\11\1\0\4\11\2\0\7\11\1\0\1\11\1\0\4\11\2\0\16\11\2\0\6\11\2\0\13\11\3\0\13"+
    "\11\7\0\15\11\1\0\7\11\13\0\4\11\14\0\1\11\1\0\2\11\14\0\4\11\3\0\1\11\4\0"+
    "\2\11\15\0\3\11\11\0\1\11\23\0\10\11\1\0\23\11\1\0\2\11\6\0\6\11\5\0\15\11"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\1\0\6\11\1\0\7\11\1\0\1\11\3\0\3\11\1\0\7\11\3"+
    "\0\4\11\2\0\6\11\14\0\2\36\25\0\1\11\4\0\1\11\14\0\1\11\15\0\1\11\2\0\1\11"+
    "\4\0\1\11\2\0\12\11\1\0\1\11\3\0\5\11\6\0\1\11\1\0\1\11\1\0\1\11\1\0\4\11"+
    "\1\0\1\11\5\0\5\11\4\0\1\11\1\0\5\11\6\0\15\11\7\0\10\11\11\0\7\11\1\0\7\11"+
    "\6\0\3\11\11\0\5\11\2\0\5\11\3\0\7\11\2\0\2\11\2\0\3\11\5\0\16\11\1\0\12\11"+
    "\1\0\1\11\7\0\11\11\2\0\27\11\2\0\15\11\3\0\1\11\1\0\1\11\2\0\1\11\16\0\1"+
    "\11\2\0\5\11\12\0\6\11\2\0\6\11\2\0\6\11\11\0\13\11\1\0\2\11\2\0\7\11\4\0"+
    "\5\11\3\0\5\11\5\0\12\11\1\0\5\11\1\0\1\11\1\0\2\11\1\0\2\11\1\0\12\11\3\0"+
    "\15\11\3\0\2\11\30\0\16\11\4\0\1\11\2\0\6\11\2\0\6\11\2\0\6\11\2\0\3\11\3"+
    "\0\14\11\1\0\16\11\1\0\2\11\1\0\1\11\15\0\1\11\2\0\4\11\4\0\10\11\1\0\5\11"+
    "\12\0\6\11\2\0\1\11\1\0\14\11\1\0\2\11\3\0\1\11\2\0\4\11\1\0\2\11\12\0\10"+
    "\11\6\0\6\11\1\0\2\11\5\0\10\11\1\0\3\11\1\0\13\11\4\0\3\11\4\0\5\11\2\0\1"+
    "\11\11\0\5\11\5\0\3\11\3\0\13\11\1\0\1\11\3\0\10\11\6\0\1\11\1\0\7\11\1\0"+
    "\1\11\1\0\4\11\1\0\2\11\6\0\1\11\5\0\7\11\2\0\7\11\3\0\6\11\1\0\1\11\10\0"+
    "\6\11\2\0\10\11\10\0\6\11\2\0\1\11\3\0\1\11\13\0\10\11\5\0\15\11\3\0\2\11"+
    "\6\0\5\11\3\0\6\11\10\0\10\11\2\0\7\11\16\0\4\11\4\0\3\11\15\0\1\11\2\0\2"+
    "\11\2\0\4\11\1\0\14\11\1\0\1\11\1\0\7\11\1\0\21\11\1\0\4\11\2\0\10\11\1\0"+
    "\7\11\1\0\14\11\1\0\4\11\1\0\5\11\1\0\1\11\3\0\11\11\1\0\10\11\2\0\2\11\5"+
    "\0\1\11\12\0\2\11\1\0\2\11\1\0\5\11\6\0\2\11\1\0\1\11\2\0\1\11\1\0\12\11\1"+
    "\0\4\11\1\0\1\11\1\0\1\11\6\0\1\11\4\0\1\11\1\0\1\11\1\0\1\11\1\0\3\11\1\0"+
    "\2\11\1\0\1\11\2\0\1\11\1\0\1\11\1\0\1\11\1\0\1\11\1\0\1\11\1\0\2\11\1\0\1"+
    "\11\2\0\4\11\1\0\7\11\1\0\4\11\1\0\4\11\1\0\1\11\1\0\12\11\1\0\5\11\1\0\3"+
    "\11\1\0\5\11\1\0\5\11");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\3\0\1\2\3\0\1\3\1\4\1\5\2\4"+
    "\1\6\2\4\3\2\1\7\1\10\1\11\1\10\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\5\12\1\4\1\20"+
    "\1\21\1\20\1\22\2\4\5\12\1\4\1\10\1\12"+
    "\2\10\1\4\1\23\1\10\1\11\1\24\1\0\1\25"+
    "\1\0\1\26\1\27\1\30\1\31\1\2\1\32\3\0"+
    "\1\33\1\34\6\12\1\35\2\0\1\36\3\0\1\10"+
    "\3\12\1\0\1\12\1\27\1\30\1\31\1\37\5\12"+
    "\1\0\1\40\1\12\3\0\5\12\1\0\1\12\1\41"+
    "\1\0\2\12\1\0\1\42\1\12\2\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[120];
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
    "\0\0\0\63\0\146\0\231\0\314\0\377\0\u0132\0\u0165"+
    "\0\u0198\0\u0198\0\u01cb\0\u01fe\0\u0231\0\u0264\0\u0297\0\u02ca"+
    "\0\u02fd\0\u0330\0\u0363\0\u0198\0\u0396\0\u03c9\0\u03fc\0\u042f"+
    "\0\u0198\0\u0198\0\u0198\0\u0198\0\u0198\0\u0462\0\u0495\0\u04c8"+
    "\0\u04fb\0\u052e\0\u0561\0\u0594\0\u0198\0\u05c7\0\u05fa\0\u062d"+
    "\0\u0660\0\u0693\0\u06c6\0\u06f9\0\u072c\0\u075f\0\u05fa\0\u05fa"+
    "\0\u0792\0\u0198\0\u07c5\0\u07f8\0\u0198\0\u082b\0\u0198\0\u0198"+
    "\0\u0231\0\u0198\0\u01fe\0\u085e\0\u0891\0\u08c4\0\u08f7\0\u092a"+
    "\0\u0198\0\u03c9\0\u03fc\0\u0561\0\u0198\0\u0198\0\u095d\0\u0990"+
    "\0\u09c3\0\u09f6\0\u0a29\0\u0a5c\0\u0198\0\u0a8f\0\u062d\0\u0198"+
    "\0\u0ac2\0\u0660\0\u0af5\0\u042f\0\u0b28\0\u0b5b\0\u0b8e\0\u0bc1"+
    "\0\u0bf4\0\u0198\0\u0198\0\u0198\0\u0198\0\u0c27\0\u0c5a\0\u0c8d"+
    "\0\u0cc0\0\u0cf3\0\u0d26\0\u042f\0\u0d59\0\u0d8c\0\u0dbf\0\u0df2"+
    "\0\u0e25\0\u0e58\0\u0e8b\0\u0ebe\0\u0ef1\0\u0f24\0\u0f57\0\u0198"+
    "\0\u0f8a\0\u0fbd\0\u0ff0\0\u1023\0\u0198\0\u1056\0\u1089\0\u10bc";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[120];
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
    "\3\1\1\11\57\1\1\12\2\13\33\12\1\0\16\12"+
    "\1\13\6\12\2\13\1\12\1\14\1\12\1\15\1\12"+
    "\1\16\6\12\10\16\7\12\1\0\1\12\11\16\2\12"+
    "\2\16\1\13\1\12\1\17\4\12\2\13\1\20\32\12"+
    "\1\0\16\12\1\13\5\12\4\21\1\22\2\21\1\23"+
    "\53\21\1\12\2\13\1\24\1\25\1\26\1\27\1\12"+
    "\1\30\1\12\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\2\30\1\37\1\40\1\41\1\30\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\12\1\0\1\51\1\52"+
    "\2\30\1\53\1\54\1\55\1\30\1\56\1\30\1\57"+
    "\1\60\1\61\1\30\1\13\2\62\1\63\1\64\1\65"+
    "\1\12\2\13\1\24\1\66\1\67\1\62\1\12\1\30"+
    "\1\12\1\31\1\32\1\33\1\34\1\35\1\36\2\30"+
    "\1\37\1\40\1\41\1\30\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\12\1\0\1\51\1\52\2\30"+
    "\1\53\1\54\1\55\1\30\1\56\1\30\1\57\1\60"+
    "\1\61\1\30\1\13\2\62\1\63\1\64\1\65\1\12"+
    "\2\13\1\24\1\66\1\70\1\62\1\12\1\30\1\12"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\2\30\1\37"+
    "\1\40\1\41\1\30\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\1\12\1\0\1\51\1\52\2\30\1\53"+
    "\1\54\1\55\1\30\1\56\1\30\1\57\1\60\1\61"+
    "\1\30\1\13\2\62\1\63\1\64\1\65\64\0\2\13"+
    "\52\0\1\13\13\0\1\71\61\0\1\72\65\0\2\16"+
    "\5\0\11\16\10\0\11\16\2\0\2\16\12\0\1\73"+
    "\1\0\1\71\54\0\3\74\1\75\2\74\1\76\1\77"+
    "\53\74\7\21\1\100\62\21\1\23\60\21\1\101\1\21"+
    "\1\100\53\21\5\0\1\102\1\103\20\0\1\104\40\0"+
    "\1\105\62\0\1\106\65\0\2\30\5\0\11\30\10\0"+
    "\11\30\2\0\2\30\16\0\2\30\5\0\1\30\1\107"+
    "\7\30\10\0\11\30\2\0\2\30\16\0\2\30\5\0"+
    "\11\30\10\0\2\30\1\110\1\111\5\30\2\0\2\30"+
    "\16\0\2\30\5\0\5\30\1\112\3\30\10\0\11\30"+
    "\2\0\2\30\16\0\2\30\5\0\11\30\10\0\3\30"+
    "\1\113\5\30\2\0\2\30\16\0\2\30\5\0\1\114"+
    "\10\30\10\0\11\30\2\0\2\30\7\0\2\115\2\0"+
    "\1\115\5\0\1\115\13\0\1\104\1\116\24\0\1\115"+
    "\35\0\1\62\64\0\1\62\63\0\1\62\27\0\34\117"+
    "\1\120\1\121\25\117\35\122\1\123\1\122\1\120\23\122"+
    "\10\0\2\30\5\0\1\30\1\124\7\30\10\0\1\30"+
    "\1\125\7\30\2\0\2\30\16\0\2\30\5\0\11\30"+
    "\10\0\1\126\10\30\2\0\2\30\16\0\2\30\5\0"+
    "\11\30\10\0\5\30\1\127\3\30\2\0\2\30\16\0"+
    "\2\30\5\0\7\30\1\124\1\30\10\0\3\30\1\124"+
    "\5\30\2\0\2\30\12\0\1\130\3\0\2\30\5\0"+
    "\11\30\10\0\11\30\2\0\2\30\16\0\2\30\5\0"+
    "\5\30\1\131\3\30\10\0\11\30\2\0\2\30\66\0"+
    "\1\62\20\0\1\62\42\0\1\62\30\0\1\104\33\0"+
    "\3\74\1\0\2\74\2\0\53\74\4\0\1\132\62\0"+
    "\1\133\62\0\1\134\56\0\5\21\1\135\1\21\1\100"+
    "\53\21\10\0\2\30\5\0\2\30\1\136\6\30\10\0"+
    "\11\30\2\0\2\30\16\0\2\30\5\0\3\30\1\137"+
    "\5\30\10\0\11\30\2\0\2\30\16\0\2\30\5\0"+
    "\11\30\10\0\1\30\1\140\7\30\2\0\2\30\16\0"+
    "\2\30\5\0\6\30\1\141\2\30\10\0\11\30\2\0"+
    "\2\30\16\0\2\30\5\0\11\30\10\0\1\30\1\124"+
    "\7\30\2\0\2\30\16\0\2\30\5\0\5\30\1\142"+
    "\3\30\10\0\11\30\2\0\2\30\35\0\1\143\33\0"+
    "\1\117\1\0\34\117\1\0\24\117\1\122\1\0\34\122"+
    "\1\0\24\122\10\0\2\30\5\0\11\30\10\0\1\30"+
    "\1\144\7\30\2\0\2\30\16\0\2\30\5\0\1\124"+
    "\10\30\10\0\11\30\2\0\2\30\16\0\2\30\5\0"+
    "\1\145\10\30\10\0\11\30\2\0\2\30\32\0\1\146"+
    "\13\0\1\147\7\0\1\150\22\0\2\30\5\0\1\151"+
    "\10\30\10\0\11\30\2\0\2\30\16\0\2\30\5\0"+
    "\3\30\1\152\5\30\10\0\11\30\2\0\2\30\16\0"+
    "\2\30\5\0\11\30\10\0\3\30\1\144\5\30\2\0"+
    "\2\30\16\0\2\30\5\0\7\30\1\153\1\30\10\0"+
    "\11\30\2\0\2\30\16\0\2\30\5\0\7\30\1\154"+
    "\1\30\10\0\11\30\2\0\2\30\16\0\2\30\5\0"+
    "\1\30\1\155\7\30\10\0\11\30\2\0\2\30\7\0"+
    "\2\115\2\0\1\115\5\0\1\115\13\0\1\143\25\0"+
    "\1\115\15\0\2\30\5\0\11\30\10\0\6\30\1\124"+
    "\2\30\2\0\2\30\51\0\1\156\37\0\1\62\102\0"+
    "\1\147\32\0\2\30\5\0\11\30\10\0\11\30\2\0"+
    "\1\30\1\157\7\0\2\160\2\0\1\160\2\0\2\30"+
    "\1\0\1\160\3\0\11\30\10\0\11\30\2\0\2\30"+
    "\1\160\15\0\2\30\5\0\11\30\10\0\11\30\2\0"+
    "\2\30\1\161\15\0\2\30\5\0\3\30\1\162\5\30"+
    "\10\0\11\30\2\0\2\30\16\0\2\30\5\0\1\140"+
    "\10\30\10\0\11\30\2\0\2\30\47\0\1\62\31\0"+
    "\2\30\5\0\11\30\10\0\6\30\1\163\2\30\2\0"+
    "\2\30\52\0\1\164\17\0\2\165\2\0\1\165\2\0"+
    "\2\30\1\0\1\165\3\0\11\30\10\0\11\30\2\0"+
    "\2\30\1\165\15\0\2\30\5\0\3\30\1\166\5\30"+
    "\10\0\11\30\2\0\2\30\53\0\1\167\25\0\2\30"+
    "\5\0\7\30\1\124\1\30\10\0\11\30\2\0\2\30"+
    "\25\0\1\170\111\0\1\62\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4335];
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
    "\1\1\3\0\1\1\3\0\2\11\11\1\1\11\4\1"+
    "\5\11\7\1\1\11\14\1\1\11\2\1\1\11\1\1"+
    "\2\11\1\0\1\11\1\0\5\1\1\11\3\0\2\11"+
    "\6\1\1\11\2\0\1\11\3\0\4\1\1\0\1\1"+
    "\4\11\5\1\1\0\2\1\3\0\5\1\1\0\1\1"+
    "\1\11\1\0\2\1\1\0\1\11\1\1\2\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[120];
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

    public IElementType handleContent() {
        if (yytext().toString().trim().length() == 0) {
            return TwigTokenTypes.WHITE_SPACE;
        } else {
            return TwigTokenTypes.CONTENT;
        }
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
          case 35: break;
          case 2: 
            { return TwigTokenTypes.UNCLOSED_COMMENT;
            } 
            // fall through
          case 36: break;
          case 3: 
            { // backtrack over any stache characters at the end of this string
        while (yylength() > 0 && yytext().subSequence(yylength() - 1, yylength()).toString().equals("{")) {
            yypushback(1);
        }

        yypushState(twig);

        if (!yytext().toString().equals("")) {
          return handleContent();
        }
            } 
            // fall through
          case 37: break;
          case 4: 
            { return TwigTokenTypes.INVALID;
            } 
            // fall through
          case 38: break;
          case 5: 
            { return TwigTokenTypes.WHITE_SPACE;
            } 
            // fall through
          case 39: break;
          case 6: 
            { yypopState();
        yypushState(expression);
        return TwigTokenTypes.TAG;
            } 
            // fall through
          case 40: break;
          case 7: 
            { yypushState(hash); return TwigTokenTypes.LBRACE;
            } 
            // fall through
          case 41: break;
          case 8: 
            { return TwigTokenTypes.OPERATOR;
            } 
            // fall through
          case 42: break;
          case 9: 
            { return TwigTokenTypes.RBRACE;
            } 
            // fall through
          case 43: break;
          case 10: 
            { return TwigTokenTypes.LABEL;
            } 
            // fall through
          case 44: break;
          case 11: 
            { return TwigTokenTypes.LPARENTH;
            } 
            // fall through
          case 45: break;
          case 12: 
            { return TwigTokenTypes.RPARENTH;
            } 
            // fall through
          case 46: break;
          case 13: 
            { return TwigTokenTypes.LBRACKET;
            } 
            // fall through
          case 47: break;
          case 14: 
            { return TwigTokenTypes.RBRACKET;
            } 
            // fall through
          case 48: break;
          case 15: 
            { return TwigTokenTypes.COLON;
            } 
            // fall through
          case 49: break;
          case 16: 
            { return TwigTokenTypes.SEP;
            } 
            // fall through
          case 50: break;
          case 17: 
            { return TwigTokenTypes.FILTER_SEP;
            } 
            // fall through
          case 51: break;
          case 18: 
            { return TwigTokenTypes.EQUALS;
            } 
            // fall through
          case 52: break;
          case 19: 
            { return TwigTokenTypes.COMMA;
            } 
            // fall through
          case 53: break;
          case 20: 
            { yypopState(); return TwigTokenTypes.RBRACE;
            } 
            // fall through
          case 54: break;
          case 21: 
            { yypopState();
        return TwigTokenTypes.STATEMENT_CLOSE;
            } 
            // fall through
          case 55: break;
          case 22: 
            { yypopState(); return TwigTokenTypes.CONTENT;
            } 
            // fall through
          case 56: break;
          case 23: 
            { yypopState(); yypushState(expression); return TwigTokenTypes.EXPRESSION_OPEN;
            } 
            // fall through
          case 57: break;
          case 24: 
            { yypopState(); yypushState(statement_block_tag); return TwigTokenTypes.STATEMENT_OPEN;
            } 
            // fall through
          case 58: break;
          case 25: 
            { yypopState(); yypushState(comment); return TwigTokenTypes.COMMENT_OPEN;
            } 
            // fall through
          case 59: break;
          case 26: 
            { yypopState(); return TwigTokenTypes.COMMENT_CLOSE;
            } 
            // fall through
          case 60: break;
          case 27: 
            { yypopState(); return TwigTokenTypes.EXPRESSION_CLOSE;
            } 
            // fall through
          case 61: break;
          case 28: 
            { yypopState(); return TwigTokenTypes.STATEMENT_CLOSE;
            } 
            // fall through
          case 62: break;
          case 29: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return TwigTokenTypes.NUMBER;
            } 
            // fall through
          case 63: break;
          case 30: 
            { return TwigTokenTypes.STRING;
            } 
            // fall through
          case 64: break;
          case 31: 
            { // handle the extra - if it's a whitespace controlling tag
        if (yytext().subSequence(yylength() - 3, yylength() - 2).toString().equals("-")) {
            yypushback(1);
        }

        yypushback(2);
        return TwigTokenTypes.COMMENT_CONTENT;
            } 
            // fall through
          case 65: break;
          case 32: 
            { return TwigTokenTypes.TEST;
            } 
            // fall through
          case 66: break;
          case 33: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzStartRead, 4);
            { return TwigTokenTypes.BOOLEAN;
            } 
            // fall through
          case 67: break;
          case 34: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzStartRead, 5);
            { return TwigTokenTypes.BOOLEAN;
            } 
            // fall through
          case 68: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
