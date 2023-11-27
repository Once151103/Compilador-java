// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/flex/lexerColor.flex

import compilerTools.TextColor;
import java.awt.Color;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class LexerColor {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
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
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\36\u0200\1\u0300\1\u0400\266\u0200\10\u0500\u1020\u0200";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\1\1\4\22\0\1\1"+
    "\11\0\1\5\4\0\1\6\1\7\11\10\7\0\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\22"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\22\1\37"+
    "\1\22\4\0\1\22\1\0\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\22\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\22\1\37\1\22\12\0\1\3"+
    "\73\0\1\22\7\0\1\22\3\0\1\22\3\0\1\22"+
    "\1\0\1\22\6\0\1\22\1\0\1\22\4\0\1\22"+
    "\7\0\1\22\3\0\1\22\3\0\1\22\1\0\1\22"+
    "\6\0\1\22\1\0\1\22\63\0\2\40\115\0\1\41"+
    "\u01a8\0\2\3\u0100\0\1\42\325\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1536];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\1\21\2\2\1\1\0\1\3"+
    "\10\2\1\4\14\2\1\4\4\0\2\3\6\2\1\0"+
    "\1\2\1\5\2\2\1\0\4\2\1\0\4\2\1\0"+
    "\1\2\1\0\1\5\2\0\1\3\4\2\1\0\2\2"+
    "\1\0\4\2\1\0\2\2\1\0\1\2\1\0\2\2"+
    "\1\0\1\2\2\6\2\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[108];
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
    "\0\0\0\43\0\43\0\106\0\151\0\214\0\257\0\322"+
    "\0\365\0\u0118\0\u013b\0\u015e\0\u0181\0\u01a4\0\u01c7\0\u01ea"+
    "\0\u020d\0\u0230\0\u0253\0\u0276\0\u0299\0\u02bc\0\u02df\0\u0302"+
    "\0\u0325\0\u0348\0\u036b\0\u038e\0\u03b1\0\u03d4\0\u03f7\0\u041a"+
    "\0\u043d\0\u0460\0\257\0\u0483\0\u04a6\0\u04c9\0\u04ec\0\u050f"+
    "\0\u0532\0\u0555\0\u0578\0\u059b\0\u05be\0\u05e1\0\u0604\0\43"+
    "\0\u0627\0\u064a\0\u066d\0\u0690\0\43\0\u06b3\0\u06d6\0\u06f9"+
    "\0\u071c\0\u073f\0\u0762\0\u0785\0\u07a8\0\u07cb\0\257\0\u07ee"+
    "\0\u0811\0\u0834\0\u0857\0\u087a\0\u089d\0\u08c0\0\u08e3\0\u0906"+
    "\0\u0929\0\u094c\0\u096f\0\u0992\0\u09b5\0\u09d8\0\43\0\u09fb"+
    "\0\u0a1e\0\u066d\0\u0a41\0\u0a64\0\u0a87\0\u0aaa\0\u0acd\0\u0af0"+
    "\0\u0b13\0\u0b36\0\u0b59\0\u0b7c\0\u0b9f\0\u0bc2\0\u0be5\0\u0c08"+
    "\0\u0c2b\0\u0c4e\0\u0c71\0\u0c94\0\u0cb7\0\u0cda\0\u0cfd\0\u0d20"+
    "\0\257\0\43\0\u0d43\0\u0d66";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[108];
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
    "\1\2\2\3\1\0\1\4\1\2\1\5\1\3\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\2\7\1\15"+
    "\2\7\1\16\1\17\1\20\1\7\1\21\1\22\1\23"+
    "\1\24\1\7\1\25\1\26\1\7\1\27\1\30\1\2"+
    "\45\0\1\3\45\0\1\31\1\32\43\0\2\6\41\0"+
    "\31\7\12\0\20\7\1\33\1\7\1\34\5\7\1\35"+
    "\12\0\11\7\1\36\17\7\12\0\20\7\1\37\10\7"+
    "\12\0\15\7\1\40\13\7\12\0\2\7\1\13\12\7"+
    "\1\41\2\7\1\42\10\7\12\0\7\7\1\43\7\7"+
    "\1\44\11\7\12\0\20\7\1\45\10\7\12\0\2\7"+
    "\1\46\26\7\12\0\25\7\1\47\3\7\12\0\2\7"+
    "\1\50\17\7\1\51\2\7\1\52\3\7\12\0\6\7"+
    "\1\53\22\7\12\0\11\7\1\54\17\7\12\0\22\7"+
    "\1\55\6\7\12\0\20\7\1\56\10\7\12\0\11\7"+
    "\1\57\17\7\21\0\1\60\7\0\1\61\34\0\1\62"+
    "\22\0\5\63\1\64\35\63\2\32\1\65\1\32\1\66"+
    "\36\32\7\0\20\7\1\67\10\7\12\0\6\7\1\70"+
    "\22\7\12\0\24\7\1\71\4\7\12\0\2\7\1\72"+
    "\26\7\12\0\25\7\1\73\3\7\12\0\23\7\1\74"+
    "\5\7\1\0\1\75\10\0\20\7\1\76\10\7\12\0"+
    "\22\7\1\43\6\7\12\0\24\7\1\77\4\7\12\0"+
    "\17\7\1\100\11\7\12\0\12\7\1\101\16\7\1\102"+
    "\11\0\15\7\1\103\13\7\12\0\4\7\1\104\24\7"+
    "\12\0\12\7\1\105\5\7\1\106\10\7\1\107\11\0"+
    "\3\7\1\110\25\7\12\0\24\7\1\111\4\7\12\0"+
    "\20\7\1\112\10\7\12\0\25\7\1\74\3\7\12\0"+
    "\12\7\1\113\16\7\1\114\11\0\12\7\1\115\16\7"+
    "\1\116\35\0\1\117\36\0\1\120\13\0\5\63\1\121"+
    "\42\63\1\121\1\122\34\63\2\0\1\65\47\0\15\7"+
    "\1\123\13\7\12\0\2\7\1\124\26\7\12\0\6\7"+
    "\1\77\22\7\12\0\22\7\1\77\6\7\12\0\3\7"+
    "\1\125\25\7\12\0\6\7\1\43\22\7\20\0\1\60"+
    "\34\0\2\7\1\44\26\7\12\0\10\7\1\77\20\7"+
    "\12\0\17\7\1\43\11\7\31\0\1\60\23\0\15\7"+
    "\1\77\13\7\12\0\14\7\1\126\14\7\2\0\1\127"+
    "\7\0\26\7\1\130\2\7\12\0\24\7\1\131\4\7"+
    "\40\0\1\132\14\0\15\7\1\133\13\7\12\0\25\7"+
    "\1\134\3\7\12\0\22\7\1\44\6\7\12\0\5\7"+
    "\1\77\23\7\17\0\1\117\35\0\15\7\1\74\13\7"+
    "\27\0\1\75\47\0\1\61\11\0\5\63\1\121\1\65"+
    "\34\63\7\0\6\7\1\135\22\7\12\0\14\7\1\43"+
    "\14\7\2\0\1\60\7\0\15\7\1\71\13\7\12\0"+
    "\2\7\1\136\26\7\14\0\1\137\40\0\2\7\1\140"+
    "\26\7\12\0\6\7\1\141\22\7\14\0\1\142\40\0"+
    "\12\7\1\143\16\7\1\144\11\0\22\7\1\101\6\7"+
    "\12\0\2\7\1\145\26\7\12\0\10\7\1\146\20\7"+
    "\22\0\1\147\32\0\24\7\1\146\4\7\12\0\4\7"+
    "\1\150\24\7\36\0\1\147\16\0\4\7\1\151\24\7"+
    "\16\0\1\152\36\0\17\7\1\77\11\7\12\0\6\7"+
    "\1\151\22\7\20\0\1\152\34\0\24\7\1\153\4\7"+
    "\12\0\6\7\1\154\22\7\12\0\5\7\1\151\23\7"+
    "\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3465];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\25\1\1\0\26\1\1\11\4\0\1\11"+
    "\7\1\1\0\4\1\1\0\4\1\1\0\4\1\1\0"+
    "\1\1\1\0\1\11\2\0\5\1\1\0\2\1\1\0"+
    "\4\1\1\0\2\1\1\0\1\1\1\0\2\1\1\0"+
    "\2\1\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[108];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private TextColor textColor(long start, int size, Color color){
        return new TextColor ((int) start, size, color);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerColor(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public TextColor yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
            { /* Ignorar */
            }
            // fall through
          case 7: break;
          case 2:
            { /*Ignorar*/
            }
            // fall through
          case 8: break;
          case 3:
            { return textColor(yychar, yylength(), new Color(146,146,146));
            }
            // fall through
          case 9: break;
          case 4:
            { return textColor(yychar, yylength(), new Color(186, 134, 182));
            }
            // fall through
          case 10: break;
          case 5:
            { return textColor(yychar, yylength(), new Color(68, 201, 164));
            }
            // fall through
          case 11: break;
          case 6:
            { return textColor(yychar, yylength(), new Color(53, 140, 214));
            }
            // fall through
          case 12: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
