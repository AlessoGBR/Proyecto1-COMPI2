// Generated from pigLatin.g4 by ANTLR 4.13.1
package Backend.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class pigLatinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_IMPORT=1, KW_NOVUS=2, KW_VARIABILES=3, KW_MUNERA=4, KW_MAIOR=5, FINIS_PROGRAMA=6, 
		FINIS_BLOQUE=7, KW_ESTO=8, KW_SERIES=9, KW_NUMERUS=10, KW_TEXTUM=11, KW_DECIMALIS=12, 
		KW_LITTERA=13, KW_BOOL=14, KW_VERUM=15, KW_FALSUS=16, KW_SI=17, KW_ALITER=18, 
		KW_DUM=19, KW_FACERE=20, KW_PER=21, KW_PERGE=22, KW_INTERRUMPE=23, KW_ACTIO=24, 
		KW_RATIO=25, KW_REDDERE=26, KW_NON=27, NOT=28, LE=29, GE=30, EQ=31, NEQ=32, 
		LT=33, GT=34, AND=35, OR=36, PLUS=37, MINUS=38, STAR=39, SLASH=40, MOD=41, 
		INC=42, DEC=43, SHIFT_OUT=44, SHIFT_IN=45, ASSIGN=46, DOT=47, COMMA=48, 
		SEMI=49, COLON=50, LPAREN=51, RPAREN=52, LBRACE=53, RBRACE=54, LBRACKET=55, 
		RBRACKET=56, DECIMALIS_LIT=57, NUMERUS_LIT=58, TEXTUM_LIT=59, LITTERA_LIT=60, 
		ID=61, LINE_COMMENT=62, BLOCK_COMMENT=63, WS=64;
	public static final int
		RULE_programa = 0, RULE_seccionImportaciones = 1, RULE_importacion = 2, 
		RULE_rutaImport = 3, RULE_seccionVariablesGlobales = 4, RULE_declaracionGlobal = 5, 
		RULE_seccionFunciones = 6, RULE_seccionPrincipal = 7, RULE_declaracionVariable = 8, 
		RULE_inicializadorVariable = 9, RULE_instanciacionObjeto = 10, RULE_valorBooleano = 11, 
		RULE_declaracionArreglo = 12, RULE_listaValoresArreglo = 13, RULE_elementoArreglo = 14, 
		RULE_literalStruct = 15, RULE_elementoStruct = 16, RULE_tipoPrimitivo = 17, 
		RULE_tipo = 18, RULE_definicionFuncion = 19, RULE_funcionSinRetorno = 20, 
		RULE_funcionConRetorno = 21, RULE_listaParametros = 22, RULE_parametro = 23, 
		RULE_seccionVariablesLocales = 24, RULE_declaracionLocal = 25, RULE_instruccion = 26, 
		RULE_asignacion = 27, RULE_destino = 28, RULE_accesoMiembro = 29, RULE_instruccionLlamadaMetodo = 30, 
		RULE_llamadaMetodo = 31, RULE_accesoPostfijo = 32, RULE_listaArgumentos = 33, 
		RULE_instruccionSi = 34, RULE_ramaAliterCondicional = 35, RULE_ramaAliterFinal = 36, 
		RULE_bloqueInstrucciones = 37, RULE_instruccionDum = 38, RULE_instruccionFacere = 39, 
		RULE_instruccionPer = 40, RULE_declaracionCicloFor = 41, RULE_actualizacionCiclo = 42, 
		RULE_instruccionInterrumpe = 43, RULE_instruccionPerge = 44, RULE_instruccionReddere = 45, 
		RULE_instruccionImprimir = 46, RULE_instruccionLeer = 47, RULE_instruccionIncrementoDecremento = 48, 
		RULE_expresion = 49, RULE_literal = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "seccionImportaciones", "importacion", "rutaImport", "seccionVariablesGlobales", 
			"declaracionGlobal", "seccionFunciones", "seccionPrincipal", "declaracionVariable", 
			"inicializadorVariable", "instanciacionObjeto", "valorBooleano", "declaracionArreglo", 
			"listaValoresArreglo", "elementoArreglo", "literalStruct", "elementoStruct", 
			"tipoPrimitivo", "tipo", "definicionFuncion", "funcionSinRetorno", "funcionConRetorno", 
			"listaParametros", "parametro", "seccionVariablesLocales", "declaracionLocal", 
			"instruccion", "asignacion", "destino", "accesoMiembro", "instruccionLlamadaMetodo", 
			"llamadaMetodo", "accesoPostfijo", "listaArgumentos", "instruccionSi", 
			"ramaAliterCondicional", "ramaAliterFinal", "bloqueInstrucciones", "instruccionDum", 
			"instruccionFacere", "instruccionPer", "declaracionCicloFor", "actualizacionCiclo", 
			"instruccionInterrumpe", "instruccionPerge", "instruccionReddere", "instruccionImprimir", 
			"instruccionLeer", "instruccionIncrementoDecremento", "expresion", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'novus'", "'VARIABILES'", "'MUNERA'", "'MAIOR'", "'FINIS'", 
			"'finis'", "'esto'", "'series'", "'numerus'", "'textum'", "'decimalis'", 
			"'littera'", "'bool'", "'verum'", "'falsus'", "'si'", "'aliter'", "'dum'", 
			"'facere'", "'per'", "'perge'", "'interrumpe'", "'actio'", "'ratio'", 
			"'reddere'", "'non'", "'!'", "'<='", "'>='", "'=='", "'!='", "'<'", "'>'", 
			"'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'>>'", 
			"'<<'", "'='", "'.'", "','", "';'", "':'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KW_IMPORT", "KW_NOVUS", "KW_VARIABILES", "KW_MUNERA", "KW_MAIOR", 
			"FINIS_PROGRAMA", "FINIS_BLOQUE", "KW_ESTO", "KW_SERIES", "KW_NUMERUS", 
			"KW_TEXTUM", "KW_DECIMALIS", "KW_LITTERA", "KW_BOOL", "KW_VERUM", "KW_FALSUS", 
			"KW_SI", "KW_ALITER", "KW_DUM", "KW_FACERE", "KW_PER", "KW_PERGE", "KW_INTERRUMPE", 
			"KW_ACTIO", "KW_RATIO", "KW_REDDERE", "KW_NON", "NOT", "LE", "GE", "EQ", 
			"NEQ", "LT", "GT", "AND", "OR", "PLUS", "MINUS", "STAR", "SLASH", "MOD", 
			"INC", "DEC", "SHIFT_OUT", "SHIFT_IN", "ASSIGN", "DOT", "COMMA", "SEMI", 
			"COLON", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", 
			"DECIMALIS_LIT", "NUMERUS_LIT", "TEXTUM_LIT", "LITTERA_LIT", "ID", "LINE_COMMENT", 
			"BLOCK_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "pigLatin.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pigLatinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public SeccionPrincipalContext seccionPrincipal() {
			return getRuleContext(SeccionPrincipalContext.class,0);
		}
		public TerminalNode EOF() { return getToken(pigLatinParser.EOF, 0); }
		public SeccionImportacionesContext seccionImportaciones() {
			return getRuleContext(SeccionImportacionesContext.class,0);
		}
		public SeccionVariablesGlobalesContext seccionVariablesGlobales() {
			return getRuleContext(SeccionVariablesGlobalesContext.class,0);
		}
		public SeccionFuncionesContext seccionFunciones() {
			return getRuleContext(SeccionFuncionesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IMPORT) {
				{
				setState(102);
				seccionImportaciones();
				}
			}

			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_VARIABILES) {
				{
				setState(105);
				seccionVariablesGlobales();
				}
			}

			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUNERA) {
				{
				setState(108);
				seccionFunciones();
				}
			}

			setState(111);
			seccionPrincipal();
			setState(112);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeccionImportacionesContext extends ParserRuleContext {
		public List<ImportacionContext> importacion() {
			return getRuleContexts(ImportacionContext.class);
		}
		public ImportacionContext importacion(int i) {
			return getRuleContext(ImportacionContext.class,i);
		}
		public SeccionImportacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seccionImportaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterSeccionImportaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitSeccionImportaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitSeccionImportaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeccionImportacionesContext seccionImportaciones() throws RecognitionException {
		SeccionImportacionesContext _localctx = new SeccionImportacionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_seccionImportaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114);
				importacion();
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_IMPORT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportacionContext extends ParserRuleContext {
		public TerminalNode KW_IMPORT() { return getToken(pigLatinParser.KW_IMPORT, 0); }
		public RutaImportContext rutaImport() {
			return getRuleContext(RutaImportContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pigLatinParser.SEMI, 0); }
		public ImportacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterImportacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitImportacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitImportacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportacionContext importacion() throws RecognitionException {
		ImportacionContext _localctx = new ImportacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(KW_IMPORT);
			setState(120);
			rutaImport();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(121);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RutaImportContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pigLatinParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pigLatinParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(pigLatinParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(pigLatinParser.DOT, i);
		}
		public RutaImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rutaImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterRutaImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitRutaImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitRutaImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RutaImportContext rutaImport() throws RecognitionException {
		RutaImportContext _localctx = new RutaImportContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rutaImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ID);
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				match(DOT);
				setState(126);
				match(ID);
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeccionVariablesGlobalesContext extends ParserRuleContext {
		public TerminalNode KW_VARIABILES() { return getToken(pigLatinParser.KW_VARIABILES, 0); }
		public TerminalNode GT() { return getToken(pigLatinParser.GT, 0); }
		public List<DeclaracionGlobalContext> declaracionGlobal() {
			return getRuleContexts(DeclaracionGlobalContext.class);
		}
		public DeclaracionGlobalContext declaracionGlobal(int i) {
			return getRuleContext(DeclaracionGlobalContext.class,i);
		}
		public SeccionVariablesGlobalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seccionVariablesGlobales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterSeccionVariablesGlobales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitSeccionVariablesGlobales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitSeccionVariablesGlobales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeccionVariablesGlobalesContext seccionVariablesGlobales() throws RecognitionException {
		SeccionVariablesGlobalesContext _localctx = new SeccionVariablesGlobalesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_seccionVariablesGlobales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(KW_VARIABILES);
			setState(132);
			match(GT);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_ESTO || _la==KW_SERIES) {
				{
				{
				setState(133);
				declaracionGlobal();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionGlobalContext extends ParserRuleContext {
		public DeclaracionVariableContext declaracionVariable() {
			return getRuleContext(DeclaracionVariableContext.class,0);
		}
		public DeclaracionArregloContext declaracionArreglo() {
			return getRuleContext(DeclaracionArregloContext.class,0);
		}
		public DeclaracionGlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionGlobal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterDeclaracionGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitDeclaracionGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitDeclaracionGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionGlobalContext declaracionGlobal() throws RecognitionException {
		DeclaracionGlobalContext _localctx = new DeclaracionGlobalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracionGlobal);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ESTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				declaracionVariable();
				}
				break;
			case KW_SERIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				declaracionArreglo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeccionFuncionesContext extends ParserRuleContext {
		public TerminalNode KW_MUNERA() { return getToken(pigLatinParser.KW_MUNERA, 0); }
		public TerminalNode GT() { return getToken(pigLatinParser.GT, 0); }
		public List<DefinicionFuncionContext> definicionFuncion() {
			return getRuleContexts(DefinicionFuncionContext.class);
		}
		public DefinicionFuncionContext definicionFuncion(int i) {
			return getRuleContext(DefinicionFuncionContext.class,i);
		}
		public SeccionFuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seccionFunciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterSeccionFunciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitSeccionFunciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitSeccionFunciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeccionFuncionesContext seccionFunciones() throws RecognitionException {
		SeccionFuncionesContext _localctx = new SeccionFuncionesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_seccionFunciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(KW_MUNERA);
			setState(144);
			match(GT);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_ACTIO || _la==KW_RATIO) {
				{
				{
				setState(145);
				definicionFuncion();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeccionPrincipalContext extends ParserRuleContext {
		public TerminalNode KW_MAIOR() { return getToken(pigLatinParser.KW_MAIOR, 0); }
		public TerminalNode GT() { return getToken(pigLatinParser.GT, 0); }
		public TerminalNode FINIS_PROGRAMA() { return getToken(pigLatinParser.FINIS_PROGRAMA, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(pigLatinParser.SEMI, 0); }
		public SeccionPrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seccionPrincipal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterSeccionPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitSeccionPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitSeccionPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeccionPrincipalContext seccionPrincipal() throws RecognitionException {
		SeccionPrincipalContext _localctx = new SeccionPrincipalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_seccionPrincipal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(KW_MAIOR);
			setState(152);
			match(GT);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305895785855320832L) != 0)) {
				{
				{
				setState(153);
				instruccion();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(FINIS_PROGRAMA);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(160);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionVariableContext extends ParserRuleContext {
		public TerminalNode KW_ESTO() { return getToken(pigLatinParser.KW_ESTO, 0); }
		public TerminalNode ID() { return getToken(pigLatinParser.ID, 0); }
		public InicializadorVariableContext inicializadorVariable() {
			return getRuleContext(InicializadorVariableContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pigLatinParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(pigLatinParser.SEMI, 0); }
		public DeclaracionVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterDeclaracionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitDeclaracionVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitDeclaracionVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionVariableContext declaracionVariable() throws RecognitionException {
		DeclaracionVariableContext _localctx = new DeclaracionVariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracionVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(KW_ESTO);
			setState(164);
			match(ID);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(165);
				match(COLON);
				}
			}

			setState(168);
			inicializadorVariable();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(169);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicializadorVariableContext extends ParserRuleContext {
		public TipoPrimitivoContext tipoPrimitivo() {
			return getRuleContext(TipoPrimitivoContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode KW_BOOL() { return getToken(pigLatinParser.KW_BOOL, 0); }
		public TerminalNode ID() { return getToken(pigLatinParser.ID, 0); }
		public LiteralStructContext literalStruct() {
			return getRuleContext(LiteralStructContext.class,0);
		}
		public InstanciacionObjetoContext instanciacionObjeto() {
			return getRuleContext(InstanciacionObjetoContext.class,0);
		}
		public ValorBooleanoContext valorBooleano() {
			return getRuleContext(ValorBooleanoContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public InicializadorVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializadorVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterInicializadorVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitInicializadorVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitInicializadorVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializadorVariableContext inicializadorVariable() throws RecognitionException {
		InicializadorVariableContext _localctx = new InicializadorVariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inicializadorVariable);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				tipoPrimitivo();
				setState(174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(173);
					expresion(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(KW_BOOL);
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(177);
					expresion(0);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(ID);
				setState(181);
				literalStruct();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				instanciacionObjeto();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				valorBooleano();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				tipo();
				setState(187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(185);
					expresion(0);
					}
					break;
				case 2:
					{
					setState(186);
					literalStruct();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				expresion(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstanciacionObjetoContext extends ParserRuleContext {
		public TerminalNode KW_NOVUS() { return getToken(pigLatinParser.KW_NOVUS, 0); }
		public TerminalNode ID() { return getToken(pigLatinParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(pigLatinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pigLatinParser.RPAREN, 0); }
		public ListaArgumentosContext listaArgumentos() {
			return getRuleContext(ListaArgumentosContext.class,0);
		}
		public InstanciacionObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanciacionObjeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterInstanciacionObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitInstanciacionObjeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitInstanciacionObjeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanciacionObjetoContext instanciacionObjeto() throws RecognitionException {
		InstanciacionObjetoContext _localctx = new InstanciacionObjetoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instanciacionObjeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(KW_NOVUS);
			setState(193);
			match(ID);
			setState(194);
			match(LPAREN);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4469822905445875716L) != 0)) {
				{
				setState(195);
				listaArgumentos();
				}
			}

			setState(198);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValorBooleanoContext extends ParserRuleContext {
		public TerminalNode KW_VERUM() { return getToken(pigLatinParser.KW_VERUM, 0); }
		public TerminalNode KW_FALSUS() { return getToken(pigLatinParser.KW_FALSUS, 0); }
		public ValorBooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorBooleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterValorBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitValorBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitValorBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorBooleanoContext valorBooleano() throws RecognitionException {
		ValorBooleanoContext _localctx = new ValorBooleanoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valorBooleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !(_la==KW_VERUM || _la==KW_FALSUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionArregloContext extends ParserRuleContext {
		public TerminalNode KW_SERIES() { return getToken(pigLatinParser.KW_SERIES, 0); }
		public TerminalNode ID() { return getToken(pigLatinParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(pigLatinParser.LBRACKET, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(pigLatinParser.RBRACKET, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pigLatinParser.COLON, 0); }
		public TerminalNode LBRACE() { return getToken(pigLatinParser.LBRACE, 0); }
		public ListaValoresArregloContext listaValoresArreglo() {
			return getRuleContext(ListaValoresArregloContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(pigLatinParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(pigLatinParser.SEMI, 0); }
		public DeclaracionArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionArreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterDeclaracionArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitDeclaracionArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitDeclaracionArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionArregloContext declaracionArreglo() throws RecognitionException {
		DeclaracionArregloContext _localctx = new DeclaracionArregloContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaracionArreglo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(KW_SERIES);
			setState(203);
			match(ID);
			setState(204);
			match(LBRACKET);
			setState(205);
			expresion(0);
			setState(206);
			match(RBRACKET);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(207);
				match(COLON);
				}
			}

			setState(210);
			tipo();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(211);
				match(LBRACE);
				setState(212);
				listaValoresArreglo();
				setState(213);
				match(RBRACE);
				}
			}

			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(217);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaValoresArregloContext extends ParserRuleContext {
		public List<ElementoArregloContext> elementoArreglo() {
			return getRuleContexts(ElementoArregloContext.class);
		}
		public ElementoArregloContext elementoArreglo(int i) {
			return getRuleContext(ElementoArregloContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pigLatinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pigLatinParser.COMMA, i);
		}
		public ListaValoresArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaValoresArreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterListaValoresArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitListaValoresArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitListaValoresArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaValoresArregloContext listaValoresArreglo() throws RecognitionException {
		ListaValoresArregloContext _localctx = new ListaValoresArregloContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listaValoresArreglo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			elementoArreglo();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(221);
				match(COMMA);
				setState(222);
				elementoArreglo();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementoArregloContext extends ParserRuleContext {
		public LiteralStructContext literalStruct() {
			return getRuleContext(LiteralStructContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ElementoArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementoArreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterElementoArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitElementoArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitElementoArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoArregloContext elementoArreglo() throws RecognitionException {
		ElementoArregloContext _localctx = new ElementoArregloContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elementoArreglo);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				literalStruct();
				}
				break;
			case KW_NOVUS:
			case KW_VERUM:
			case KW_FALSUS:
			case KW_NON:
			case NOT:
			case MINUS:
			case LPAREN:
			case DECIMALIS_LIT:
			case NUMERUS_LIT:
			case TEXTUM_LIT:
			case LITTERA_LIT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				expresion(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralStructContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(pigLatinParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(pigLatinParser.RBRACE, 0); }
		public List<ElementoStructContext> elementoStruct() {
			return getRuleContexts(ElementoStructContext.class);
		}
		public ElementoStructContext elementoStruct(int i) {
			return getRuleContext(ElementoStructContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pigLatinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pigLatinParser.COMMA, i);
		}
		public LiteralStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterLiteralStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitLiteralStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitLiteralStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralStructContext literalStruct() throws RecognitionException {
		LiteralStructContext _localctx = new LiteralStructContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literalStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(LBRACE);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4478830104700616708L) != 0)) {
				{
				setState(233);
				elementoStruct();
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(234);
					match(COMMA);
					setState(235);
					elementoStruct();
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(243);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementoStructContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pigLatinParser.ID, 0); }
		public TerminalNode COLON() { return getToken(pigLatinParser.COLON, 0); }
		public LiteralStructContext literalStruct() {
			return getRuleContext(LiteralStructContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ElementoStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementoStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterElementoStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitElementoStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitElementoStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoStructContext elementoStruct() throws RecognitionException {
		ElementoStructContext _localctx = new ElementoStructContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elementoStruct);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(ID);
				setState(246);
				match(COLON);
				setState(249);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					setState(247);
					literalStruct();
					}
					break;
				case KW_NOVUS:
				case KW_VERUM:
				case KW_FALSUS:
				case KW_NON:
				case NOT:
				case MINUS:
				case LPAREN:
				case DECIMALIS_LIT:
				case NUMERUS_LIT:
				case TEXTUM_LIT:
				case LITTERA_LIT:
				case ID:
					{
					setState(248);
					expresion(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				literalStruct();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				expresion(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoPrimitivoContext extends ParserRuleContext {
		public TerminalNode KW_NUMERUS() { return getToken(pigLatinParser.KW_NUMERUS, 0); }
		public TerminalNode KW_TEXTUM() { return getToken(pigLatinParser.KW_TEXTUM, 0); }
		public TerminalNode KW_DECIMALIS() { return getToken(pigLatinParser.KW_DECIMALIS, 0); }
		public TerminalNode KW_LITTERA() { return getToken(pigLatinParser.KW_LITTERA, 0); }
		public TipoPrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoPrimitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterTipoPrimitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitTipoPrimitivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitTipoPrimitivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoPrimitivoContext tipoPrimitivo() throws RecognitionException {
		TipoPrimitivoContext _localctx = new TipoPrimitivoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tipoPrimitivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoPrimitivoContext tipoPrimitivo() {
			return getRuleContext(TipoPrimitivoContext.class,0);
		}
		public TerminalNode KW_BOOL() { return getToken(pigLatinParser.KW_BOOL, 0); }
		public TerminalNode ID() { return getToken(pigLatinParser.ID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tipo);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_NUMERUS:
			case KW_TEXTUM:
			case KW_DECIMALIS:
			case KW_LITTERA:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				tipoPrimitivo();
				}
				break;
			case KW_BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(KW_BOOL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinicionFuncionContext extends ParserRuleContext {
		public FuncionSinRetornoContext funcionSinRetorno() {
			return getRuleContext(FuncionSinRetornoContext.class,0);
		}
		public FuncionConRetornoContext funcionConRetorno() {
			return getRuleContext(FuncionConRetornoContext.class,0);
		}
		public DefinicionFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicionFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterDefinicionFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitDefinicionFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitDefinicionFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicionFuncionContext definicionFuncion() throws RecognitionException {
		DefinicionFuncionContext _localctx = new DefinicionFuncionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_definicionFuncion);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ACTIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				funcionSinRetorno();
				}
				break;
			case KW_RATIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				funcionConRetorno();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionSinRetornoContext extends ParserRuleContext {
		public TerminalNode KW_ACTIO() { return getToken(pigLatinParser.KW_ACTIO, 0); }
		public TerminalNode ID() { return getToken(pigLatinParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(pigLatinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pigLatinParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(pigLatinParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(pigLatinParser.RBRACE, 0); }
		public TerminalNode FINIS_BLOQUE() { return getToken(pigLatinParser.FINIS_BLOQUE, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public SeccionVariablesLocalesContext seccionVariablesLocales() {
			return getRuleContext(SeccionVariablesLocalesContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(pigLatinParser.SEMI, 0); }
		public FuncionSinRetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionSinRetorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterFuncionSinRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitFuncionSinRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitFuncionSinRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionSinRetornoContext funcionSinRetorno() throws RecognitionException {
		FuncionSinRetornoContext _localctx = new FuncionSinRetornoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funcionSinRetorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(KW_ACTIO);
			setState(267);
			match(ID);
			setState(268);
			match(LPAREN);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ESTO) {
				{
				setState(269);
				listaParametros();
				}
			}

			setState(272);
			match(RPAREN);
			setState(273);
			match(LBRACE);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_VARIABILES) {
				{
				setState(274);
				seccionVariablesLocales();
				}
			}

			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305895785855320832L) != 0)) {
				{
				{
				setState(277);
				instruccion();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			match(RBRACE);
			setState(284);
			match(FINIS_BLOQUE);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(285);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionConRetornoContext extends ParserRuleContext {
		public TerminalNode KW_RATIO() { return getToken(pigLatinParser.KW_RATIO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(pigLatinParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(pigLatinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pigLatinParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(pigLatinParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(pigLatinParser.RBRACE, 0); }
		public TerminalNode FINIS_BLOQUE() { return getToken(pigLatinParser.FINIS_BLOQUE, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public SeccionVariablesLocalesContext seccionVariablesLocales() {
			return getRuleContext(SeccionVariablesLocalesContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(pigLatinParser.SEMI, 0); }
		public FuncionConRetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionConRetorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterFuncionConRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitFuncionConRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitFuncionConRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionConRetornoContext funcionConRetorno() throws RecognitionException {
		FuncionConRetornoContext _localctx = new FuncionConRetornoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_funcionConRetorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(KW_RATIO);
			setState(289);
			tipo();
			setState(290);
			match(ID);
			setState(291);
			match(LPAREN);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ESTO) {
				{
				setState(292);
				listaParametros();
				}
			}

			setState(295);
			match(RPAREN);
			setState(296);
			match(LBRACE);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_VARIABILES) {
				{
				setState(297);
				seccionVariablesLocales();
				}
			}

			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305895785855320832L) != 0)) {
				{
				{
				setState(300);
				instruccion();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			match(RBRACE);
			setState(307);
			match(FINIS_BLOQUE);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(308);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pigLatinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pigLatinParser.COMMA, i);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterListaParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitListaParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitListaParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			parametro();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(312);
				match(COMMA);
				setState(313);
				parametro();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode KW_ESTO() { return getToken(pigLatinParser.KW_ESTO, 0); }
		public TerminalNode ID() { return getToken(pigLatinParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pigLatinParser.COLON, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(KW_ESTO);
			setState(320);
			match(ID);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(321);
				match(COLON);
				}
			}

			setState(324);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeccionVariablesLocalesContext extends ParserRuleContext {
		public TerminalNode KW_VARIABILES() { return getToken(pigLatinParser.KW_VARIABILES, 0); }
		public TerminalNode LBRACKET() { return getToken(pigLatinParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(pigLatinParser.RBRACKET, 0); }
		public List<DeclaracionLocalContext> declaracionLocal() {
			return getRuleContexts(DeclaracionLocalContext.class);
		}
		public DeclaracionLocalContext declaracionLocal(int i) {
			return getRuleContext(DeclaracionLocalContext.class,i);
		}
		public SeccionVariablesLocalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seccionVariablesLocales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterSeccionVariablesLocales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitSeccionVariablesLocales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitSeccionVariablesLocales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeccionVariablesLocalesContext seccionVariablesLocales() throws RecognitionException {
		SeccionVariablesLocalesContext _localctx = new SeccionVariablesLocalesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_seccionVariablesLocales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(KW_VARIABILES);
			setState(327);
			match(LBRACKET);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_ESTO || _la==KW_SERIES) {
				{
				{
				setState(328);
				declaracionLocal();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionLocalContext extends ParserRuleContext {
		public DeclaracionVariableContext declaracionVariable() {
			return getRuleContext(DeclaracionVariableContext.class,0);
		}
		public DeclaracionArregloContext declaracionArreglo() {
			return getRuleContext(DeclaracionArregloContext.class,0);
		}
		public DeclaracionLocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionLocal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterDeclaracionLocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitDeclaracionLocal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitDeclaracionLocal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionLocalContext declaracionLocal() throws RecognitionException {
		DeclaracionLocalContext _localctx = new DeclaracionLocalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declaracionLocal);
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ESTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				declaracionVariable();
				}
				break;
			case KW_SERIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				declaracionArreglo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionVariableContext declaracionVariable() {
			return getRuleContext(DeclaracionVariableContext.class,0);
		}
		public DeclaracionArregloContext declaracionArreglo() {
			return getRuleContext(DeclaracionArregloContext.class,0);
		}
		public InstruccionImprimirContext instruccionImprimir() {
			return getRuleContext(InstruccionImprimirContext.class,0);
		}
		public InstruccionLeerContext instruccionLeer() {
			return getRuleContext(InstruccionLeerContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public InstruccionIncrementoDecrementoContext instruccionIncrementoDecremento() {
			return getRuleContext(InstruccionIncrementoDecrementoContext.class,0);
		}
		public InstruccionSiContext instruccionSi() {
			return getRuleContext(InstruccionSiContext.class,0);
		}
		public InstruccionDumContext instruccionDum() {
			return getRuleContext(InstruccionDumContext.class,0);
		}
		public InstruccionFacereContext instruccionFacere() {
			return getRuleContext(InstruccionFacereContext.class,0);
		}
		public InstruccionPerContext instruccionPer() {
			return getRuleContext(InstruccionPerContext.class,0);
		}
		public InstruccionInterrumpeContext instruccionInterrumpe() {
			return getRuleContext(InstruccionInterrumpeContext.class,0);
		}
		public InstruccionPergeContext instruccionPerge() {
			return getRuleContext(InstruccionPergeContext.class,0);
		}
		public InstruccionReddereContext instruccionReddere() {
			return getRuleContext(InstruccionReddereContext.class,0);
		}
		public InstruccionLlamadaMetodoContext instruccionLlamadaMetodo() {
			return getRuleContext(InstruccionLlamadaMetodoContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_instruccion);
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				declaracionVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				declaracionArreglo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				instruccionImprimir();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(343);
				instruccionLeer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(344);
				asignacion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(345);
				instruccionIncrementoDecremento();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(346);
				instruccionSi();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(347);
				instruccionDum();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(348);
				instruccionFacere();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(349);
				instruccionPer();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(350);
				instruccionInterrumpe();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(351);
				instruccionPerge();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(352);
				instruccionReddere();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(353);
				instruccionLlamadaMetodo();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public DestinoContext destino() {
			return getRuleContext(DestinoContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(pigLatinParser.ASSIGN, 0); }
		public LiteralStructContext literalStruct() {
			return getRuleContext(LiteralStructContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pigLatinParser.SEMI, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			destino();
			setState(357);
			match(ASSIGN);
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(358);
				literalStruct();
				}
				break;
			case KW_NOVUS:
			case KW_VERUM:
			case KW_FALSUS:
			case KW_NON:
			case NOT:
			case MINUS:
			case LPAREN:
			case DECIMALIS_LIT:
			case NUMERUS_LIT:
			case TEXTUM_LIT:
			case LITTERA_LIT:
			case ID:
				{
				setState(359);
				expresion(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(362);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DestinoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pigLatinParser.ID, 0); }
		public List<AccesoMiembroContext> accesoMiembro() {
			return getRuleContexts(AccesoMiembroContext.class);
		}
		public AccesoMiembroContext accesoMiembro(int i) {
			return getRuleContext(AccesoMiembroContext.class,i);
		}
		public DestinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterDestino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitDestino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitDestino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestinoContext destino() throws RecognitionException {
		DestinoContext _localctx = new DestinoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_destino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(ID);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT || _la==LBRACKET) {
				{
				{
				setState(366);
				accesoMiembro();
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccesoMiembroContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(pigLatinParser.DOT, 0); }
		public TerminalNode ID() { return getToken(pigLatinParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(pigLatinParser.LBRACKET, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(pigLatinParser.RBRACKET, 0); }
		public AccesoMiembroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesoMiembro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterAccesoMiembro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitAccesoMiembro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitAccesoMiembro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccesoMiembroContext accesoMiembro() throws RecognitionException {
		AccesoMiembroContext _localctx = new AccesoMiembroContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_accesoMiembro);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(DOT);
				setState(373);
				match(ID);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(LBRACKET);
				setState(375);
				expresion(0);
				setState(376);
				match(RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionLlamadaMetodoContext extends ParserRuleContext {
		public LlamadaMetodoContext llamadaMetodo() {
			return getRuleContext(LlamadaMetodoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pigLatinParser.SEMI, 0); }
		public InstruccionLlamadaMetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionLlamadaMetodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterInstruccionLlamadaMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitInstruccionLlamadaMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitInstruccionLlamadaMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionLlamadaMetodoContext instruccionLlamadaMetodo() throws RecognitionException {
		InstruccionLlamadaMetodoContext _localctx = new InstruccionLlamadaMetodoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_instruccionLlamadaMetodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			llamadaMetodo();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(381);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LlamadaMetodoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pigLatinParser.ID, 0); }
		public List<AccesoPostfijoContext> accesoPostfijo() {
			return getRuleContexts(AccesoPostfijoContext.class);
		}
		public AccesoPostfijoContext accesoPostfijo(int i) {
			return getRuleContext(AccesoPostfijoContext.class,i);
		}
		public LlamadaMetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaMetodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterLlamadaMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitLlamadaMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitLlamadaMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadaMetodoContext llamadaMetodo() throws RecognitionException {
		LlamadaMetodoContext _localctx = new LlamadaMetodoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_llamadaMetodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(ID);
			setState(386); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(385);
				accesoPostfijo();
				}
				}
				setState(388); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 38421334321004544L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccesoPostfijoContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(pigLatinParser.DOT, 0); }
		public TerminalNode ID() { return getToken(pigLatinParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(pigLatinParser.LBRACKET, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(pigLatinParser.RBRACKET, 0); }
		public TerminalNode LPAREN() { return getToken(pigLatinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pigLatinParser.RPAREN, 0); }
		public ListaArgumentosContext listaArgumentos() {
			return getRuleContext(ListaArgumentosContext.class,0);
		}
		public AccesoPostfijoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesoPostfijo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterAccesoPostfijo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitAccesoPostfijo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitAccesoPostfijo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccesoPostfijoContext accesoPostfijo() throws RecognitionException {
		AccesoPostfijoContext _localctx = new AccesoPostfijoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_accesoPostfijo);
		int _la;
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(DOT);
				setState(391);
				match(ID);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(LBRACKET);
				setState(393);
				expresion(0);
				setState(394);
				match(RBRACKET);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				match(LPAREN);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4469822905445875716L) != 0)) {
					{
					setState(397);
					listaArgumentos();
					}
				}

				setState(400);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaArgumentosContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pigLatinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pigLatinParser.COMMA, i);
		}
		public ListaArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArgumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterListaArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitListaArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitListaArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaArgumentosContext listaArgumentos() throws RecognitionException {
		ListaArgumentosContext _localctx = new ListaArgumentosContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_listaArgumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			expresion(0);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(404);
				match(COMMA);
				setState(405);
				expresion(0);
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionSiContext extends ParserRuleContext {
		public TerminalNode KW_SI() { return getToken(pigLatinParser.KW_SI, 0); }
		public TerminalNode LPAREN() { return getToken(pigLatinParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pigLatinParser.RPAREN, 0); }
		public BloqueInstruccionesContext bloqueInstrucciones() {
			return getRuleContext(BloqueInstruccionesContext.class,0);
		}
		public TerminalNode FINIS_BLOQUE() { return getToken(pigLatinParser.FINIS_BLOQUE, 0); }
		public List<RamaAliterCondicionalContext> ramaAliterCondicional() {
			return getRuleContexts(RamaAliterCondicionalContext.class);
		}
		public RamaAliterCondicionalContext ramaAliterCondicional(int i) {
			return getRuleContext(RamaAliterCondicionalContext.class,i);
		}
		public RamaAliterFinalContext ramaAliterFinal() {
			return getRuleContext(RamaAliterFinalContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pigLatinParser.SEMI, 0); }
		public InstruccionSiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionSi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterInstruccionSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitInstruccionSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitInstruccionSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionSiContext instruccionSi() throws RecognitionException {
		InstruccionSiContext _localctx = new InstruccionSiContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_instruccionSi);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(KW_SI);
			setState(412);
			match(LPAREN);
			setState(413);
			expresion(0);
			setState(414);
			match(RPAREN);
			setState(415);
			bloqueInstrucciones();
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(416);
					ramaAliterCondicional();
					}
					} 
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ALITER) {
				{
				setState(422);
				ramaAliterFinal();
				}
			}

			setState(425);
			match(FINIS_BLOQUE);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(426);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RamaAliterCondicionalContext extends ParserRuleContext {
		public TerminalNode KW_ALITER() { return getToken(pigLatinParser.KW_ALITER, 0); }
		public TerminalNode LPAREN() { return getToken(pigLatinParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pigLatinParser.RPAREN, 0); }
		public BloqueInstruccionesContext bloqueInstrucciones() {
			return getRuleContext(BloqueInstruccionesContext.class,0);
		}
		public RamaAliterCondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ramaAliterCondicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterRamaAliterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitRamaAliterCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitRamaAliterCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RamaAliterCondicionalContext ramaAliterCondicional() throws RecognitionException {
		RamaAliterCondicionalContext _localctx = new RamaAliterCondicionalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ramaAliterCondicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(KW_ALITER);
			setState(430);
			match(LPAREN);
			setState(431);
			expresion(0);
			setState(432);
			match(RPAREN);
			setState(433);
			bloqueInstrucciones();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RamaAliterFinalContext extends ParserRuleContext {
		public TerminalNode KW_ALITER() { return getToken(pigLatinParser.KW_ALITER, 0); }
		public BloqueInstruccionesContext bloqueInstrucciones() {
			return getRuleContext(BloqueInstruccionesContext.class,0);
		}
		public RamaAliterFinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ramaAliterFinal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterRamaAliterFinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitRamaAliterFinal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitRamaAliterFinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RamaAliterFinalContext ramaAliterFinal() throws RecognitionException {
		RamaAliterFinalContext _localctx = new RamaAliterFinalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ramaAliterFinal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(KW_ALITER);
			setState(436);
			bloqueInstrucciones();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueInstruccionesContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(pigLatinParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(pigLatinParser.RBRACE, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public BloqueInstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueInstrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterBloqueInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitBloqueInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitBloqueInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueInstruccionesContext bloqueInstrucciones() throws RecognitionException {
		BloqueInstruccionesContext _localctx = new BloqueInstruccionesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_bloqueInstrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(LBRACE);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305895785855320832L) != 0)) {
				{
				{
				setState(439);
				instruccion();
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(445);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionDumContext extends ParserRuleContext {
		public TerminalNode KW_DUM() { return getToken(pigLatinParser.KW_DUM, 0); }
		public TerminalNode LPAREN() { return getToken(pigLatinParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pigLatinParser.RPAREN, 0); }
		public BloqueInstruccionesContext bloqueInstrucciones() {
			return getRuleContext(BloqueInstruccionesContext.class,0);
		}
		public TerminalNode FINIS_BLOQUE() { return getToken(pigLatinParser.FINIS_BLOQUE, 0); }
		public TerminalNode SEMI() { return getToken(pigLatinParser.SEMI, 0); }
		public InstruccionDumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionDum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterInstruccionDum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitInstruccionDum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitInstruccionDum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionDumContext instruccionDum() throws RecognitionException {
		InstruccionDumContext _localctx = new InstruccionDumContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_instruccionDum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(KW_DUM);
			setState(448);
			match(LPAREN);
			setState(449);
			expresion(0);
			setState(450);
			match(RPAREN);
			setState(451);
			bloqueInstrucciones();
			setState(452);
			match(FINIS_BLOQUE);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(453);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionFacereContext extends ParserRuleContext {
		public TerminalNode KW_FACERE() { return getToken(pigLatinParser.KW_FACERE, 0); }
		public BloqueInstruccionesContext bloqueInstrucciones() {
			return getRuleContext(BloqueInstruccionesContext.class,0);
		}
		public TerminalNode KW_DUM() { return getToken(pigLatinParser.KW_DUM, 0); }
		public TerminalNode LPAREN() { return getToken(pigLatinParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pigLatinParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(pigLatinParser.SEMI, 0); }
		public InstruccionFacereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionFacere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterInstruccionFacere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitInstruccionFacere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitInstruccionFacere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionFacereContext instruccionFacere() throws RecognitionException {
		InstruccionFacereContext _localctx = new InstruccionFacereContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_instruccionFacere);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(KW_FACERE);
			setState(457);
			bloqueInstrucciones();
			setState(458);
			match(KW_DUM);
			setState(459);
			match(LPAREN);
			setState(460);
			expresion(0);
			setState(461);
			match(RPAREN);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(462);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionPerContext extends ParserRuleContext {
		public TerminalNode KW_PER() { return getToken(pigLatinParser.KW_PER, 0); }
		public TerminalNode LPAREN() { return getToken(pigLatinParser.LPAREN, 0); }
		public DeclaracionCicloForContext declaracionCicloFor() {
			return getRuleContext(DeclaracionCicloForContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(pigLatinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pigLatinParser.SEMI, i);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ActualizacionCicloContext actualizacionCiclo() {
			return getRuleContext(ActualizacionCicloContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pigLatinParser.RPAREN, 0); }
		public BloqueInstruccionesContext bloqueInstrucciones() {
			return getRuleContext(BloqueInstruccionesContext.class,0);
		}
		public TerminalNode FINIS_BLOQUE() { return getToken(pigLatinParser.FINIS_BLOQUE, 0); }
		public InstruccionPerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionPer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterInstruccionPer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitInstruccionPer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitInstruccionPer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionPerContext instruccionPer() throws RecognitionException {
		InstruccionPerContext _localctx = new InstruccionPerContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_instruccionPer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(KW_PER);
			setState(466);
			match(LPAREN);
			setState(467);
			declaracionCicloFor();
			setState(468);
			match(SEMI);
			setState(469);
			expresion(0);
			setState(470);
			match(SEMI);
			setState(471);
			actualizacionCiclo();
			setState(472);
			match(RPAREN);
			setState(473);
			bloqueInstrucciones();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINIS_BLOQUE) {
				{
				setState(474);
				match(FINIS_BLOQUE);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(475);
					match(SEMI);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionCicloForContext extends ParserRuleContext {
		public TerminalNode KW_ESTO() { return getToken(pigLatinParser.KW_ESTO, 0); }
		public TerminalNode ID() { return getToken(pigLatinParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pigLatinParser.COLON, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclaracionCicloForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionCicloFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterDeclaracionCicloFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitDeclaracionCicloFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitDeclaracionCicloFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionCicloForContext declaracionCicloFor() throws RecognitionException {
		DeclaracionCicloForContext _localctx = new DeclaracionCicloForContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_declaracionCicloFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(KW_ESTO);
			setState(481);
			match(ID);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(482);
				match(COLON);
				}
			}

			setState(485);
			tipo();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4469822905445875716L) != 0)) {
				{
				setState(486);
				expresion(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActualizacionCicloContext extends ParserRuleContext {
		public DestinoContext destino() {
			return getRuleContext(DestinoContext.class,0);
		}
		public TerminalNode INC() { return getToken(pigLatinParser.INC, 0); }
		public TerminalNode DEC() { return getToken(pigLatinParser.DEC, 0); }
		public TerminalNode ASSIGN() { return getToken(pigLatinParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ActualizacionCicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualizacionCiclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterActualizacionCiclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitActualizacionCiclo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitActualizacionCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualizacionCicloContext actualizacionCiclo() throws RecognitionException {
		ActualizacionCicloContext _localctx = new ActualizacionCicloContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_actualizacionCiclo);
		int _la;
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				destino();
				setState(490);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				destino();
				setState(493);
				match(ASSIGN);
				setState(494);
				expresion(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionInterrumpeContext extends ParserRuleContext {
		public TerminalNode KW_INTERRUMPE() { return getToken(pigLatinParser.KW_INTERRUMPE, 0); }
		public TerminalNode SEMI() { return getToken(pigLatinParser.SEMI, 0); }
		public InstruccionInterrumpeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionInterrumpe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterInstruccionInterrumpe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitInstruccionInterrumpe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitInstruccionInterrumpe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionInterrumpeContext instruccionInterrumpe() throws RecognitionException {
		InstruccionInterrumpeContext _localctx = new InstruccionInterrumpeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_instruccionInterrumpe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(KW_INTERRUMPE);
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(499);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionPergeContext extends ParserRuleContext {
		public TerminalNode KW_PERGE() { return getToken(pigLatinParser.KW_PERGE, 0); }
		public TerminalNode SEMI() { return getToken(pigLatinParser.SEMI, 0); }
		public InstruccionPergeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionPerge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterInstruccionPerge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitInstruccionPerge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitInstruccionPerge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionPergeContext instruccionPerge() throws RecognitionException {
		InstruccionPergeContext _localctx = new InstruccionPergeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_instruccionPerge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(KW_PERGE);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(503);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionReddereContext extends ParserRuleContext {
		public TerminalNode KW_REDDERE() { return getToken(pigLatinParser.KW_REDDERE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pigLatinParser.SEMI, 0); }
		public InstruccionReddereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionReddere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterInstruccionReddere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitInstruccionReddere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitInstruccionReddere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionReddereContext instruccionReddere() throws RecognitionException {
		InstruccionReddereContext _localctx = new InstruccionReddereContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_instruccionReddere);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(KW_REDDERE);
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(507);
				expresion(0);
				}
				break;
			}
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(510);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionImprimirContext extends ParserRuleContext {
		public List<TerminalNode> SHIFT_OUT() { return getTokens(pigLatinParser.SHIFT_OUT); }
		public TerminalNode SHIFT_OUT(int i) {
			return getToken(pigLatinParser.SHIFT_OUT, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(pigLatinParser.SEMI, 0); }
		public InstruccionImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionImprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterInstruccionImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitInstruccionImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitInstruccionImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionImprimirContext instruccionImprimir() throws RecognitionException {
		InstruccionImprimirContext _localctx = new InstruccionImprimirContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_instruccionImprimir);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(SHIFT_OUT);
			setState(514);
			expresion(0);
			setState(519);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(515);
					match(SHIFT_OUT);
					setState(516);
					expresion(0);
					}
					} 
				}
				setState(521);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(522);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionLeerContext extends ParserRuleContext {
		public TerminalNode SHIFT_IN() { return getToken(pigLatinParser.SHIFT_IN, 0); }
		public DestinoContext destino() {
			return getRuleContext(DestinoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pigLatinParser.SEMI, 0); }
		public InstruccionLeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionLeer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterInstruccionLeer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitInstruccionLeer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitInstruccionLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionLeerContext instruccionLeer() throws RecognitionException {
		InstruccionLeerContext _localctx = new InstruccionLeerContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_instruccionLeer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(525);
				destino();
				}
			}

			setState(528);
			match(SHIFT_IN);
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(529);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionIncrementoDecrementoContext extends ParserRuleContext {
		public DestinoContext destino() {
			return getRuleContext(DestinoContext.class,0);
		}
		public TerminalNode INC() { return getToken(pigLatinParser.INC, 0); }
		public TerminalNode DEC() { return getToken(pigLatinParser.DEC, 0); }
		public TerminalNode SEMI() { return getToken(pigLatinParser.SEMI, 0); }
		public InstruccionIncrementoDecrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionIncrementoDecremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterInstruccionIncrementoDecremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitInstruccionIncrementoDecremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitInstruccionIncrementoDecremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionIncrementoDecrementoContext instruccionIncrementoDecremento() throws RecognitionException {
		InstruccionIncrementoDecrementoContext _localctx = new InstruccionIncrementoDecrementoContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_instruccionIncrementoDecremento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			destino();
			setState(533);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(534);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprInstanciacionNovusContext extends ExpresionContext {
		public InstanciacionObjetoContext instanciacionObjeto() {
			return getRuleContext(InstanciacionObjetoContext.class,0);
		}
		public ExprInstanciacionNovusContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterExprInstanciacionNovus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitExprInstanciacionNovus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitExprInstanciacionNovus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLlamadaMetodoContext extends ExpresionContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(pigLatinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pigLatinParser.RPAREN, 0); }
		public ListaArgumentosContext listaArgumentos() {
			return getRuleContext(ListaArgumentosContext.class,0);
		}
		public ExprLlamadaMetodoContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterExprLlamadaMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitExprLlamadaMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitExprLlamadaMetodo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRelacionalContext extends ExpresionContext {
		public Token op;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode LE() { return getToken(pigLatinParser.LE, 0); }
		public TerminalNode GE() { return getToken(pigLatinParser.GE, 0); }
		public TerminalNode LT() { return getToken(pigLatinParser.LT, 0); }
		public TerminalNode GT() { return getToken(pigLatinParser.GT, 0); }
		public ExprRelacionalContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterExprRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitExprRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitExprRelacional(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIgualdadContext extends ExpresionContext {
		public Token op;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(pigLatinParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(pigLatinParser.NEQ, 0); }
		public TerminalNode ASSIGN() { return getToken(pigLatinParser.ASSIGN, 0); }
		public ExprIgualdadContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterExprIgualdad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitExprIgualdad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitExprIgualdad(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIdentificadorContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(pigLatinParser.ID, 0); }
		public ExprIdentificadorContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterExprIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitExprIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitExprIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNegacionLogicaContext extends ExpresionContext {
		public TerminalNode KW_NON() { return getToken(pigLatinParser.KW_NON, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExprNegacionLogicaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterExprNegacionLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitExprNegacionLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitExprNegacionLogica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAditivaContext extends ExpresionContext {
		public Token op;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(pigLatinParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(pigLatinParser.MINUS, 0); }
		public ExprAditivaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterExprAditiva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitExprAditiva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitExprAditiva(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParentesisContext extends ExpresionContext {
		public TerminalNode LPAREN() { return getToken(pigLatinParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pigLatinParser.RPAREN, 0); }
		public ExprParentesisContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterExprParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitExprParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitExprParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAndLogicoContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode AND() { return getToken(pigLatinParser.AND, 0); }
		public ExprAndLogicoContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterExprAndLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitExprAndLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitExprAndLogico(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIndexacionContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(pigLatinParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(pigLatinParser.RBRACKET, 0); }
		public ExprIndexacionContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterExprIndexacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitExprIndexacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitExprIndexacion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprOrLogicoContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode OR() { return getToken(pigLatinParser.OR, 0); }
		public ExprOrLogicoContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterExprOrLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitExprOrLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitExprOrLogico(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLiteralContext extends ExpresionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExprLiteralContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterExprLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitExprLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitExprLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAccesoMiembroContext extends ExpresionContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(pigLatinParser.DOT, 0); }
		public TerminalNode ID() { return getToken(pigLatinParser.ID, 0); }
		public ExprAccesoMiembroContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterExprAccesoMiembro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitExprAccesoMiembro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitExprAccesoMiembro(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMultiplicativaContext extends ExpresionContext {
		public Token op;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(pigLatinParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(pigLatinParser.SLASH, 0); }
		public TerminalNode MOD() { return getToken(pigLatinParser.MOD, 0); }
		public ExprMultiplicativaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterExprMultiplicativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitExprMultiplicativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitExprMultiplicativa(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNotSimboloContext extends ExpresionContext {
		public TerminalNode NOT() { return getToken(pigLatinParser.NOT, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExprNotSimboloContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterExprNotSimbolo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitExprNotSimbolo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitExprNotSimbolo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPostfijaContext extends ExpresionContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode INC() { return getToken(pigLatinParser.INC, 0); }
		public TerminalNode DEC() { return getToken(pigLatinParser.DEC, 0); }
		public ExprPostfijaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterExprPostfija(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitExprPostfija(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitExprPostfija(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMenosUnarioContext extends ExpresionContext {
		public TerminalNode MINUS() { return getToken(pigLatinParser.MINUS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExprMenosUnarioContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterExprMenosUnario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitExprMenosUnario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitExprMenosUnario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_NOVUS:
				{
				_localctx = new ExprInstanciacionNovusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(538);
				instanciacionObjeto();
				}
				break;
			case KW_NON:
				{
				_localctx = new ExprNegacionLogicaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(539);
				match(KW_NON);
				setState(540);
				expresion(12);
				}
				break;
			case NOT:
				{
				_localctx = new ExprNotSimboloContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(541);
				match(NOT);
				setState(542);
				expresion(11);
				}
				break;
			case MINUS:
				{
				_localctx = new ExprMenosUnarioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(543);
				match(MINUS);
				setState(544);
				expresion(10);
				}
				break;
			case LPAREN:
				{
				_localctx = new ExprParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(545);
				match(LPAREN);
				setState(546);
				expresion(0);
				setState(547);
				match(RPAREN);
				}
				break;
			case ID:
				{
				_localctx = new ExprIdentificadorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(549);
				match(ID);
				}
				break;
			case KW_VERUM:
			case KW_FALSUS:
			case DECIMALIS_LIT:
			case NUMERUS_LIT:
			case TEXTUM_LIT:
			case LITTERA_LIT:
				{
				_localctx = new ExprLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(550);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(589);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(587);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultiplicativaContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(553);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(554);
						((ExprMultiplicativaContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) ) {
							((ExprMultiplicativaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(555);
						expresion(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprAditivaContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(556);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(557);
						((ExprAditivaContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExprAditivaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(558);
						expresion(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprRelacionalContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(559);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(560);
						((ExprRelacionalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 27380416512L) != 0)) ) {
							((ExprRelacionalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(561);
						expresion(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprIgualdadContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(562);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(563);
						((ExprIgualdadContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 70375186628608L) != 0)) ) {
							((ExprIgualdadContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(564);
						expresion(7);
						}
						break;
					case 5:
						{
						_localctx = new ExprAndLogicoContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(565);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(566);
						match(AND);
						setState(567);
						expresion(6);
						}
						break;
					case 6:
						{
						_localctx = new ExprOrLogicoContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(568);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(569);
						match(OR);
						setState(570);
						expresion(5);
						}
						break;
					case 7:
						{
						_localctx = new ExprPostfijaContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(571);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(572);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 8:
						{
						_localctx = new ExprAccesoMiembroContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(573);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(574);
						match(DOT);
						setState(575);
						match(ID);
						}
						break;
					case 9:
						{
						_localctx = new ExprIndexacionContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(576);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(577);
						match(LBRACKET);
						setState(578);
						expresion(0);
						setState(579);
						match(RBRACKET);
						}
						break;
					case 10:
						{
						_localctx = new ExprLlamadaMetodoContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(581);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(582);
						match(LPAREN);
						setState(584);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4469822905445875716L) != 0)) {
							{
							setState(583);
							listaArgumentos();
							}
						}

						setState(586);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMERUS_LIT() { return getToken(pigLatinParser.NUMERUS_LIT, 0); }
		public TerminalNode DECIMALIS_LIT() { return getToken(pigLatinParser.DECIMALIS_LIT, 0); }
		public TerminalNode TEXTUM_LIT() { return getToken(pigLatinParser.TEXTUM_LIT, 0); }
		public TerminalNode LITTERA_LIT() { return getToken(pigLatinParser.LITTERA_LIT, 0); }
		public TerminalNode KW_VERUM() { return getToken(pigLatinParser.KW_VERUM, 0); }
		public TerminalNode KW_FALSUS() { return getToken(pigLatinParser.KW_FALSUS, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pigLatinListener ) ((pigLatinListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pigLatinVisitor ) return ((pigLatinVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161727821137936384L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 49:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 17);
		case 7:
			return precpred(_ctx, 16);
		case 8:
			return precpred(_ctx, 15);
		case 9:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001@\u0253\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u0001\u0000\u0003\u0000h\b\u0000\u0001\u0000\u0003\u0000k\b\u0000"+
		"\u0001\u0000\u0003\u0000n\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0004\u0001t\b\u0001\u000b\u0001\f\u0001u\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002{\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003\u0080\b\u0003\u000b\u0003\f\u0003\u0081\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u0087\b\u0004\n\u0004\f\u0004\u008a"+
		"\t\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u008e\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u0093\b\u0006\n\u0006\f\u0006\u0096"+
		"\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u009b\b\u0007"+
		"\n\u0007\f\u0007\u009e\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a2"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00a7\b\b\u0001\b\u0001\b\u0003"+
		"\b\u00ab\b\b\u0001\t\u0001\t\u0003\t\u00af\b\t\u0001\t\u0001\t\u0003\t"+
		"\u00b3\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00bc\b\t\u0001\t\u0003\t\u00bf\b\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0003\n\u00c5\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d1\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00d8\b\f\u0001\f\u0003\f\u00db\b\f\u0001\r"+
		"\u0001\r\u0001\r\u0005\r\u00e0\b\r\n\r\f\r\u00e3\t\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00e7\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00ed\b\u000f\n\u000f\f\u000f\u00f0\t\u000f\u0003\u000f"+
		"\u00f2\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00fa\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00fe\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0105\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0109\b"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u010f"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0114\b\u0014"+
		"\u0001\u0014\u0005\u0014\u0117\b\u0014\n\u0014\f\u0014\u011a\t\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u011f\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0126\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u012b\b\u0015\u0001\u0015\u0005"+
		"\u0015\u012e\b\u0015\n\u0015\f\u0015\u0131\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0136\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u013b\b\u0016\n\u0016\f\u0016\u013e\t\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0143\b\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u014a\b\u0018\n\u0018\f\u0018"+
		"\u014d\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0153\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0163\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0169\b\u001b\u0001\u001b"+
		"\u0003\u001b\u016c\b\u001b\u0001\u001c\u0001\u001c\u0005\u001c\u0170\b"+
		"\u001c\n\u001c\f\u001c\u0173\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u017b\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u017f\b\u001e\u0001\u001f\u0001\u001f\u0004\u001f"+
		"\u0183\b\u001f\u000b\u001f\f\u001f\u0184\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u018f\b \u0001 \u0003 \u0192\b \u0001!\u0001"+
		"!\u0001!\u0005!\u0197\b!\n!\f!\u019a\t!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0005\"\u01a2\b\"\n\"\f\"\u01a5\t\"\u0001\"\u0003\""+
		"\u01a8\b\"\u0001\"\u0001\"\u0003\"\u01ac\b\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0005%\u01b9\b%\n%"+
		"\f%\u01bc\t%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u01c7\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u01d0\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0003(\u01dd\b(\u0003(\u01df\b(\u0001)\u0001"+
		")\u0001)\u0003)\u01e4\b)\u0001)\u0001)\u0003)\u01e8\b)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0003*\u01f1\b*\u0001+\u0001+\u0003+\u01f5"+
		"\b+\u0001,\u0001,\u0003,\u01f9\b,\u0001-\u0001-\u0003-\u01fd\b-\u0001"+
		"-\u0003-\u0200\b-\u0001.\u0001.\u0001.\u0001.\u0005.\u0206\b.\n.\f.\u0209"+
		"\t.\u0001.\u0003.\u020c\b.\u0001/\u0003/\u020f\b/\u0001/\u0001/\u0003"+
		"/\u0213\b/\u00010\u00010\u00010\u00030\u0218\b0\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00031\u0228\b1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00031\u0249\b1\u00011\u00051\u024c\b1\n1\f1\u024f"+
		"\t1\u00012\u00012\u00012\u0000\u0001b3\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bd\u0000\b\u0001\u0000\u000f\u0010\u0001\u0000\n\r\u0001"+
		"\u0000*+\u0001\u0000\')\u0001\u0000%&\u0002\u0000\u001d\u001e!\"\u0002"+
		"\u0000\u001f ..\u0002\u0000\u000f\u00109<\u028c\u0000g\u0001\u0000\u0000"+
		"\u0000\u0002s\u0001\u0000\u0000\u0000\u0004w\u0001\u0000\u0000\u0000\u0006"+
		"|\u0001\u0000\u0000\u0000\b\u0083\u0001\u0000\u0000\u0000\n\u008d\u0001"+
		"\u0000\u0000\u0000\f\u008f\u0001\u0000\u0000\u0000\u000e\u0097\u0001\u0000"+
		"\u0000\u0000\u0010\u00a3\u0001\u0000\u0000\u0000\u0012\u00be\u0001\u0000"+
		"\u0000\u0000\u0014\u00c0\u0001\u0000\u0000\u0000\u0016\u00c8\u0001\u0000"+
		"\u0000\u0000\u0018\u00ca\u0001\u0000\u0000\u0000\u001a\u00dc\u0001\u0000"+
		"\u0000\u0000\u001c\u00e6\u0001\u0000\u0000\u0000\u001e\u00e8\u0001\u0000"+
		"\u0000\u0000 \u00fd\u0001\u0000\u0000\u0000\"\u00ff\u0001\u0000\u0000"+
		"\u0000$\u0104\u0001\u0000\u0000\u0000&\u0108\u0001\u0000\u0000\u0000("+
		"\u010a\u0001\u0000\u0000\u0000*\u0120\u0001\u0000\u0000\u0000,\u0137\u0001"+
		"\u0000\u0000\u0000.\u013f\u0001\u0000\u0000\u00000\u0146\u0001\u0000\u0000"+
		"\u00002\u0152\u0001\u0000\u0000\u00004\u0162\u0001\u0000\u0000\u00006"+
		"\u0164\u0001\u0000\u0000\u00008\u016d\u0001\u0000\u0000\u0000:\u017a\u0001"+
		"\u0000\u0000\u0000<\u017c\u0001\u0000\u0000\u0000>\u0180\u0001\u0000\u0000"+
		"\u0000@\u0191\u0001\u0000\u0000\u0000B\u0193\u0001\u0000\u0000\u0000D"+
		"\u019b\u0001\u0000\u0000\u0000F\u01ad\u0001\u0000\u0000\u0000H\u01b3\u0001"+
		"\u0000\u0000\u0000J\u01b6\u0001\u0000\u0000\u0000L\u01bf\u0001\u0000\u0000"+
		"\u0000N\u01c8\u0001\u0000\u0000\u0000P\u01d1\u0001\u0000\u0000\u0000R"+
		"\u01e0\u0001\u0000\u0000\u0000T\u01f0\u0001\u0000\u0000\u0000V\u01f2\u0001"+
		"\u0000\u0000\u0000X\u01f6\u0001\u0000\u0000\u0000Z\u01fa\u0001\u0000\u0000"+
		"\u0000\\\u0201\u0001\u0000\u0000\u0000^\u020e\u0001\u0000\u0000\u0000"+
		"`\u0214\u0001\u0000\u0000\u0000b\u0227\u0001\u0000\u0000\u0000d\u0250"+
		"\u0001\u0000\u0000\u0000fh\u0003\u0002\u0001\u0000gf\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ik\u0003\b\u0004"+
		"\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000"+
		"\u0000\u0000ln\u0003\f\u0006\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000op\u0003\u000e\u0007\u0000pq\u0005"+
		"\u0000\u0000\u0001q\u0001\u0001\u0000\u0000\u0000rt\u0003\u0004\u0002"+
		"\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0003\u0001\u0000\u0000\u0000"+
		"wx\u0005\u0001\u0000\u0000xz\u0003\u0006\u0003\u0000y{\u00051\u0000\u0000"+
		"zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0005\u0001\u0000"+
		"\u0000\u0000|\u007f\u0005=\u0000\u0000}~\u0005/\u0000\u0000~\u0080\u0005"+
		"=\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0007\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0003\u0000"+
		"\u0000\u0084\u0088\u0005\"\u0000\u0000\u0085\u0087\u0003\n\u0005\u0000"+
		"\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000"+
		"\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\t\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b"+
		"\u008e\u0003\u0010\b\u0000\u008c\u008e\u0003\u0018\f\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u000b"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0004\u0000\u0000\u0090\u0094"+
		"\u0005\"\u0000\u0000\u0091\u0093\u0003&\u0013\u0000\u0092\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\r\u0001\u0000"+
		"\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0005"+
		"\u0000\u0000\u0098\u009c\u0005\"\u0000\u0000\u0099\u009b\u00034\u001a"+
		"\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009f\u00a1\u0005\u0006\u0000\u0000\u00a0\u00a2\u00051\u0000\u0000"+
		"\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u000f\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\b\u0000\u0000\u00a4"+
		"\u00a6\u0005=\u0000\u0000\u00a5\u00a7\u00052\u0000\u0000\u00a6\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a8\u00aa\u0003\u0012\t\u0000\u00a9\u00ab\u00051"+
		"\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ab\u0011\u0001\u0000\u0000\u0000\u00ac\u00ae\u0003\"\u0011"+
		"\u0000\u00ad\u00af\u0003b1\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0001\u0000\u0000\u0000\u00af\u00bf\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b2\u0005\u000e\u0000\u0000\u00b1\u00b3\u0003b1\u0000\u00b2\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00bf\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0005=\u0000\u0000\u00b5\u00bf\u0003\u001e"+
		"\u000f\u0000\u00b6\u00bf\u0003\u0014\n\u0000\u00b7\u00bf\u0003\u0016\u000b"+
		"\u0000\u00b8\u00bb\u0003$\u0012\u0000\u00b9\u00bc\u0003b1\u0000\u00ba"+
		"\u00bc\u0003\u001e\u000f\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bf\u0003b1\u0000\u00be\u00ac\u0001"+
		"\u0000\u0000\u0000\u00be\u00b0\u0001\u0000\u0000\u0000\u00be\u00b4\u0001"+
		"\u0000\u0000\u0000\u00be\u00b6\u0001\u0000\u0000\u0000\u00be\u00b7\u0001"+
		"\u0000\u0000\u0000\u00be\u00b8\u0001\u0000\u0000\u0000\u00be\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bf\u0013\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005"+
		"\u0002\u0000\u0000\u00c1\u00c2\u0005=\u0000\u0000\u00c2\u00c4\u00053\u0000"+
		"\u0000\u00c3\u00c5\u0003B!\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u00054\u0000\u0000\u00c7\u0015\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0007\u0000\u0000\u0000\u00c9\u0017\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0005\t\u0000\u0000\u00cb\u00cc\u0005=\u0000\u0000\u00cc\u00cd\u0005"+
		"7\u0000\u0000\u00cd\u00ce\u0003b1\u0000\u00ce\u00d0\u00058\u0000\u0000"+
		"\u00cf\u00d1\u00052\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d7\u0003$\u0012\u0000\u00d3\u00d4\u00055\u0000\u0000\u00d4\u00d5\u0003"+
		"\u001a\r\u0000\u00d5\u00d6\u00056\u0000\u0000\u00d6\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d3\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00db\u00051\u0000"+
		"\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000"+
		"\u0000\u00db\u0019\u0001\u0000\u0000\u0000\u00dc\u00e1\u0003\u001c\u000e"+
		"\u0000\u00dd\u00de\u00050\u0000\u0000\u00de\u00e0\u0003\u001c\u000e\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e2\u001b\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e7\u0003\u001e\u000f\u0000\u00e5\u00e7\u0003b1\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u001d"+
		"\u0001\u0000\u0000\u0000\u00e8\u00f1\u00055\u0000\u0000\u00e9\u00ee\u0003"+
		" \u0010\u0000\u00ea\u00eb\u00050\u0000\u0000\u00eb\u00ed\u0003 \u0010"+
		"\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f1\u00e9\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u00056\u0000\u0000"+
		"\u00f4\u001f\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005=\u0000\u0000\u00f6"+
		"\u00f9\u00052\u0000\u0000\u00f7\u00fa\u0003\u001e\u000f\u0000\u00f8\u00fa"+
		"\u0003b1\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fe\u0001\u0000\u0000\u0000\u00fb\u00fe\u0003\u001e"+
		"\u000f\u0000\u00fc\u00fe\u0003b1\u0000\u00fd\u00f5\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe!\u0001\u0000\u0000\u0000\u00ff\u0100\u0007\u0001\u0000\u0000\u0100"+
		"#\u0001\u0000\u0000\u0000\u0101\u0105\u0003\"\u0011\u0000\u0102\u0105"+
		"\u0005\u000e\u0000\u0000\u0103\u0105\u0005=\u0000\u0000\u0104\u0101\u0001"+
		"\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0103\u0001"+
		"\u0000\u0000\u0000\u0105%\u0001\u0000\u0000\u0000\u0106\u0109\u0003(\u0014"+
		"\u0000\u0107\u0109\u0003*\u0015\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0108\u0107\u0001\u0000\u0000\u0000\u0109\'\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0005\u0018\u0000\u0000\u010b\u010c\u0005=\u0000\u0000\u010c\u010e"+
		"\u00053\u0000\u0000\u010d\u010f\u0003,\u0016\u0000\u010e\u010d\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u00054\u0000\u0000\u0111\u0113\u00055\u0000\u0000"+
		"\u0112\u0114\u00030\u0018\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0001\u0000\u0000\u0000\u0114\u0118\u0001\u0000\u0000\u0000\u0115"+
		"\u0117\u00034\u001a\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117\u011a"+
		"\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0118"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u00056\u0000\u0000\u011c\u011e\u0005"+
		"\u0007\u0000\u0000\u011d\u011f\u00051\u0000\u0000\u011e\u011d\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f)\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0005\u0019\u0000\u0000\u0121\u0122\u0003$\u0012\u0000"+
		"\u0122\u0123\u0005=\u0000\u0000\u0123\u0125\u00053\u0000\u0000\u0124\u0126"+
		"\u0003,\u0016\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0125\u0126\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0005"+
		"4\u0000\u0000\u0128\u012a\u00055\u0000\u0000\u0129\u012b\u00030\u0018"+
		"\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000"+
		"\u0000\u012b\u012f\u0001\u0000\u0000\u0000\u012c\u012e\u00034\u001a\u0000"+
		"\u012d\u012c\u0001\u0000\u0000\u0000\u012e\u0131\u0001\u0000\u0000\u0000"+
		"\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000"+
		"\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u00056\u0000\u0000\u0133\u0135\u0005\u0007\u0000\u0000\u0134"+
		"\u0136\u00051\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0001\u0000\u0000\u0000\u0136+\u0001\u0000\u0000\u0000\u0137\u013c\u0003"+
		".\u0017\u0000\u0138\u0139\u00050\u0000\u0000\u0139\u013b\u0003.\u0017"+
		"\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000"+
		"\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000"+
		"\u0000\u013d-\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\u0005\b\u0000\u0000\u0140\u0142\u0005=\u0000\u0000\u0141"+
		"\u0143\u00052\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145"+
		"\u0003$\u0012\u0000\u0145/\u0001\u0000\u0000\u0000\u0146\u0147\u0005\u0003"+
		"\u0000\u0000\u0147\u014b\u00057\u0000\u0000\u0148\u014a\u00032\u0019\u0000"+
		"\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000"+
		"\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000"+
		"\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u00058\u0000\u0000\u014f1\u0001\u0000\u0000\u0000\u0150\u0153"+
		"\u0003\u0010\b\u0000\u0151\u0153\u0003\u0018\f\u0000\u0152\u0150\u0001"+
		"\u0000\u0000\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u01533\u0001\u0000"+
		"\u0000\u0000\u0154\u0163\u0003\u0010\b\u0000\u0155\u0163\u0003\u0018\f"+
		"\u0000\u0156\u0163\u0003\\.\u0000\u0157\u0163\u0003^/\u0000\u0158\u0163"+
		"\u00036\u001b\u0000\u0159\u0163\u0003`0\u0000\u015a\u0163\u0003D\"\u0000"+
		"\u015b\u0163\u0003L&\u0000\u015c\u0163\u0003N\'\u0000\u015d\u0163\u0003"+
		"P(\u0000\u015e\u0163\u0003V+\u0000\u015f\u0163\u0003X,\u0000\u0160\u0163"+
		"\u0003Z-\u0000\u0161\u0163\u0003<\u001e\u0000\u0162\u0154\u0001\u0000"+
		"\u0000\u0000\u0162\u0155\u0001\u0000\u0000\u0000\u0162\u0156\u0001\u0000"+
		"\u0000\u0000\u0162\u0157\u0001\u0000\u0000\u0000\u0162\u0158\u0001\u0000"+
		"\u0000\u0000\u0162\u0159\u0001\u0000\u0000\u0000\u0162\u015a\u0001\u0000"+
		"\u0000\u0000\u0162\u015b\u0001\u0000\u0000\u0000\u0162\u015c\u0001\u0000"+
		"\u0000\u0000\u0162\u015d\u0001\u0000\u0000\u0000\u0162\u015e\u0001\u0000"+
		"\u0000\u0000\u0162\u015f\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000"+
		"\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u01635\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u00038\u001c\u0000\u0165\u0168\u0005.\u0000\u0000\u0166"+
		"\u0169\u0003\u001e\u000f\u0000\u0167\u0169\u0003b1\u0000\u0168\u0166\u0001"+
		"\u0000\u0000\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169\u016b\u0001"+
		"\u0000\u0000\u0000\u016a\u016c\u00051\u0000\u0000\u016b\u016a\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c7\u0001\u0000\u0000"+
		"\u0000\u016d\u0171\u0005=\u0000\u0000\u016e\u0170\u0003:\u001d\u0000\u016f"+
		"\u016e\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000\u0171"+
		"\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172"+
		"9\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0005/\u0000\u0000\u0175\u017b\u0005=\u0000\u0000\u0176\u0177\u00057"+
		"\u0000\u0000\u0177\u0178\u0003b1\u0000\u0178\u0179\u00058\u0000\u0000"+
		"\u0179\u017b\u0001\u0000\u0000\u0000\u017a\u0174\u0001\u0000\u0000\u0000"+
		"\u017a\u0176\u0001\u0000\u0000\u0000\u017b;\u0001\u0000\u0000\u0000\u017c"+
		"\u017e\u0003>\u001f\u0000\u017d\u017f\u00051\u0000\u0000\u017e\u017d\u0001"+
		"\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f=\u0001\u0000"+
		"\u0000\u0000\u0180\u0182\u0005=\u0000\u0000\u0181\u0183\u0003@ \u0000"+
		"\u0182\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000"+
		"\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000"+
		"\u0185?\u0001\u0000\u0000\u0000\u0186\u0187\u0005/\u0000\u0000\u0187\u0192"+
		"\u0005=\u0000\u0000\u0188\u0189\u00057\u0000\u0000\u0189\u018a\u0003b"+
		"1\u0000\u018a\u018b\u00058\u0000\u0000\u018b\u0192\u0001\u0000\u0000\u0000"+
		"\u018c\u018e\u00053\u0000\u0000\u018d\u018f\u0003B!\u0000\u018e\u018d"+
		"\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0190"+
		"\u0001\u0000\u0000\u0000\u0190\u0192\u00054\u0000\u0000\u0191\u0186\u0001"+
		"\u0000\u0000\u0000\u0191\u0188\u0001\u0000\u0000\u0000\u0191\u018c\u0001"+
		"\u0000\u0000\u0000\u0192A\u0001\u0000\u0000\u0000\u0193\u0198\u0003b1"+
		"\u0000\u0194\u0195\u00050\u0000\u0000\u0195\u0197\u0003b1\u0000\u0196"+
		"\u0194\u0001\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198"+
		"\u0196\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199"+
		"C\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u0005\u0011\u0000\u0000\u019c\u019d\u00053\u0000\u0000\u019d\u019e\u0003"+
		"b1\u0000\u019e\u019f\u00054\u0000\u0000\u019f\u01a3\u0003J%\u0000\u01a0"+
		"\u01a2\u0003F#\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a8\u0003H$\u0000\u01a7\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a9\u01ab\u0005\u0007\u0000\u0000\u01aa\u01ac\u00051\u0000\u0000"+
		"\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000"+
		"\u01acE\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005\u0012\u0000\u0000\u01ae"+
		"\u01af\u00053\u0000\u0000\u01af\u01b0\u0003b1\u0000\u01b0\u01b1\u0005"+
		"4\u0000\u0000\u01b1\u01b2\u0003J%\u0000\u01b2G\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b4\u0005\u0012\u0000\u0000\u01b4\u01b5\u0003J%\u0000\u01b5I"+
		"\u0001\u0000\u0000\u0000\u01b6\u01ba\u00055\u0000\u0000\u01b7\u01b9\u0003"+
		"4\u001a\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000"+
		"\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000"+
		"\u0000\u0000\u01bd\u01be\u00056\u0000\u0000\u01beK\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c0\u0005\u0013\u0000\u0000\u01c0\u01c1\u00053\u0000\u0000\u01c1"+
		"\u01c2\u0003b1\u0000\u01c2\u01c3\u00054\u0000\u0000\u01c3\u01c4\u0003"+
		"J%\u0000\u01c4\u01c6\u0005\u0007\u0000\u0000\u01c5\u01c7\u00051\u0000"+
		"\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c7M\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005\u0014\u0000\u0000"+
		"\u01c9\u01ca\u0003J%\u0000\u01ca\u01cb\u0005\u0013\u0000\u0000\u01cb\u01cc"+
		"\u00053\u0000\u0000\u01cc\u01cd\u0003b1\u0000\u01cd\u01cf\u00054\u0000"+
		"\u0000\u01ce\u01d0\u00051\u0000\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000"+
		"\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0O\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d2\u0005\u0015\u0000\u0000\u01d2\u01d3\u00053\u0000\u0000\u01d3\u01d4"+
		"\u0003R)\u0000\u01d4\u01d5\u00051\u0000\u0000\u01d5\u01d6\u0003b1\u0000"+
		"\u01d6\u01d7\u00051\u0000\u0000\u01d7\u01d8\u0003T*\u0000\u01d8\u01d9"+
		"\u00054\u0000\u0000\u01d9\u01de\u0003J%\u0000\u01da\u01dc\u0005\u0007"+
		"\u0000\u0000\u01db\u01dd\u00051\u0000\u0000\u01dc\u01db\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01df\u0001\u0000\u0000"+
		"\u0000\u01de\u01da\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000"+
		"\u0000\u01dfQ\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005\b\u0000\u0000"+
		"\u01e1\u01e3\u0005=\u0000\u0000\u01e2\u01e4\u00052\u0000\u0000\u01e3\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e7\u0003$\u0012\u0000\u01e6\u01e8\u0003"+
		"b1\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000"+
		"\u0000\u01e8S\u0001\u0000\u0000\u0000\u01e9\u01ea\u00038\u001c\u0000\u01ea"+
		"\u01eb\u0007\u0002\u0000\u0000\u01eb\u01f1\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ed\u00038\u001c\u0000\u01ed\u01ee\u0005.\u0000\u0000\u01ee\u01ef\u0003"+
		"b1\u0000\u01ef\u01f1\u0001\u0000\u0000\u0000\u01f0\u01e9\u0001\u0000\u0000"+
		"\u0000\u01f0\u01ec\u0001\u0000\u0000\u0000\u01f1U\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f4\u0005\u0017\u0000\u0000\u01f3\u01f5\u00051\u0000\u0000\u01f4"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5"+
		"W\u0001\u0000\u0000\u0000\u01f6\u01f8\u0005\u0016\u0000\u0000\u01f7\u01f9"+
		"\u00051\u0000\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001"+
		"\u0000\u0000\u0000\u01f9Y\u0001\u0000\u0000\u0000\u01fa\u01fc\u0005\u001a"+
		"\u0000\u0000\u01fb\u01fd\u0003b1\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01ff\u0001\u0000\u0000\u0000"+
		"\u01fe\u0200\u00051\u0000\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0001\u0000\u0000\u0000\u0200[\u0001\u0000\u0000\u0000\u0201\u0202"+
		"\u0005,\u0000\u0000\u0202\u0207\u0003b1\u0000\u0203\u0204\u0005,\u0000"+
		"\u0000\u0204\u0206\u0003b1\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0206"+
		"\u0209\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0207"+
		"\u0208\u0001\u0000\u0000\u0000\u0208\u020b\u0001\u0000\u0000\u0000\u0209"+
		"\u0207\u0001\u0000\u0000\u0000\u020a\u020c\u00051\u0000\u0000\u020b\u020a"+
		"\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c]\u0001"+
		"\u0000\u0000\u0000\u020d\u020f\u00038\u001c\u0000\u020e\u020d\u0001\u0000"+
		"\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000"+
		"\u0000\u0000\u0210\u0212\u0005-\u0000\u0000\u0211\u0213\u00051\u0000\u0000"+
		"\u0212\u0211\u0001\u0000\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000"+
		"\u0213_\u0001\u0000\u0000\u0000\u0214\u0215\u00038\u001c\u0000\u0215\u0217"+
		"\u0007\u0002\u0000\u0000\u0216\u0218\u00051\u0000\u0000\u0217\u0216\u0001"+
		"\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218a\u0001\u0000"+
		"\u0000\u0000\u0219\u021a\u00061\uffff\uffff\u0000\u021a\u0228\u0003\u0014"+
		"\n\u0000\u021b\u021c\u0005\u001b\u0000\u0000\u021c\u0228\u0003b1\f\u021d"+
		"\u021e\u0005\u001c\u0000\u0000\u021e\u0228\u0003b1\u000b\u021f\u0220\u0005"+
		"&\u0000\u0000\u0220\u0228\u0003b1\n\u0221\u0222\u00053\u0000\u0000\u0222"+
		"\u0223\u0003b1\u0000\u0223\u0224\u00054\u0000\u0000\u0224\u0228\u0001"+
		"\u0000\u0000\u0000\u0225\u0228\u0005=\u0000\u0000\u0226\u0228\u0003d2"+
		"\u0000\u0227\u0219\u0001\u0000\u0000\u0000\u0227\u021b\u0001\u0000\u0000"+
		"\u0000\u0227\u021d\u0001\u0000\u0000\u0000\u0227\u021f\u0001\u0000\u0000"+
		"\u0000\u0227\u0221\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000"+
		"\u0000\u0227\u0226\u0001\u0000\u0000\u0000\u0228\u024d\u0001\u0000\u0000"+
		"\u0000\u0229\u022a\n\t\u0000\u0000\u022a\u022b\u0007\u0003\u0000\u0000"+
		"\u022b\u024c\u0003b1\n\u022c\u022d\n\b\u0000\u0000\u022d\u022e\u0007\u0004"+
		"\u0000\u0000\u022e\u024c\u0003b1\t\u022f\u0230\n\u0007\u0000\u0000\u0230"+
		"\u0231\u0007\u0005\u0000\u0000\u0231\u024c\u0003b1\b\u0232\u0233\n\u0006"+
		"\u0000\u0000\u0233\u0234\u0007\u0006\u0000\u0000\u0234\u024c\u0003b1\u0007"+
		"\u0235\u0236\n\u0005\u0000\u0000\u0236\u0237\u0005#\u0000\u0000\u0237"+
		"\u024c\u0003b1\u0006\u0238\u0239\n\u0004\u0000\u0000\u0239\u023a\u0005"+
		"$\u0000\u0000\u023a\u024c\u0003b1\u0005\u023b\u023c\n\u0011\u0000\u0000"+
		"\u023c\u024c\u0007\u0002\u0000\u0000\u023d\u023e\n\u0010\u0000\u0000\u023e"+
		"\u023f\u0005/\u0000\u0000\u023f\u024c\u0005=\u0000\u0000\u0240\u0241\n"+
		"\u000f\u0000\u0000\u0241\u0242\u00057\u0000\u0000\u0242\u0243\u0003b1"+
		"\u0000\u0243\u0244\u00058\u0000\u0000\u0244\u024c\u0001\u0000\u0000\u0000"+
		"\u0245\u0246\n\u000e\u0000\u0000\u0246\u0248\u00053\u0000\u0000\u0247"+
		"\u0249\u0003B!\u0000\u0248\u0247\u0001\u0000\u0000\u0000\u0248\u0249\u0001"+
		"\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024c\u0005"+
		"4\u0000\u0000\u024b\u0229\u0001\u0000\u0000\u0000\u024b\u022c\u0001\u0000"+
		"\u0000\u0000\u024b\u022f\u0001\u0000\u0000\u0000\u024b\u0232\u0001\u0000"+
		"\u0000\u0000\u024b\u0235\u0001\u0000\u0000\u0000\u024b\u0238\u0001\u0000"+
		"\u0000\u0000\u024b\u023b\u0001\u0000\u0000\u0000\u024b\u023d\u0001\u0000"+
		"\u0000\u0000\u024b\u0240\u0001\u0000\u0000\u0000\u024b\u0245\u0001\u0000"+
		"\u0000\u0000\u024c\u024f\u0001\u0000\u0000\u0000\u024d\u024b\u0001\u0000"+
		"\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024ec\u0001\u0000\u0000"+
		"\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u0250\u0251\u0007\u0007\u0000"+
		"\u0000\u0251e\u0001\u0000\u0000\u0000Kgjmuz\u0081\u0088\u008d\u0094\u009c"+
		"\u00a1\u00a6\u00aa\u00ae\u00b2\u00bb\u00be\u00c4\u00d0\u00d7\u00da\u00e1"+
		"\u00e6\u00ee\u00f1\u00f9\u00fd\u0104\u0108\u010e\u0113\u0118\u011e\u0125"+
		"\u012a\u012f\u0135\u013c\u0142\u014b\u0152\u0162\u0168\u016b\u0171\u017a"+
		"\u017e\u0184\u018e\u0191\u0198\u01a3\u01a7\u01ab\u01ba\u01c6\u01cf\u01dc"+
		"\u01de\u01e3\u01e7\u01f0\u01f4\u01f8\u01fc\u01ff\u0207\u020b\u020e\u0212"+
		"\u0217\u0227\u0248\u024b\u024d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}