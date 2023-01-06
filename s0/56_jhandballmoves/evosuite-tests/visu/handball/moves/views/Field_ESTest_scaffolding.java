/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu May 07 08:27:39 GMT 2020
 */

package visu.handball.moves.views;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Field_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "visu.handball.moves.views.Field"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/test-smell/generation-scripts/projects/56_jhandballmoves"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Field_ESTest_scaffolding.class.getClassLoader() ,
      "visu.handball.moves.Main",
      "com.lowagie.text.pdf.FdfWriter",
      "com.lowagie.text.Graphic",
      "com.lowagie.text.pdf.TrueTypeFontUnicode",
      "visu.handball.moves.views.Field",
      "com.lowagie.text.pdf.PdfOCG",
      "com.lowagie.text.Element",
      "com.lowagie.text.pdf.PdfEncodings$SymbolTTConversion",
      "com.lowagie.text.pdf.codec.wmf.InputMeta",
      "com.lowagie.text.pdf.PdfPCellEvent",
      "visu.handball.moves.views.PlayerToolBar",
      "com.lowagie.text.xml.xmp.XmpWriter",
      "com.lowagie.text.Annotation",
      "com.lowagie.text.pdf.PdfPatternPainter",
      "com.lowagie.text.pdf.ExtraEncoding",
      "com.lowagie.bc.asn1.DEROutputStream",
      "com.lowagie.text.pdf.codec.PngImage",
      "com.lowagie.text.pdf.ColumnText",
      "com.lowagie.text.pdf.CJKFont",
      "com.lowagie.text.Anchor",
      "com.lowagie.text.pdf.DefaultFontMapper$BaseFontParameters",
      "com.lowagie.text.pdf.PdfBoolean",
      "com.lowagie.text.pdf.PdfDocument$RenderingContext",
      "com.lowagie.text.TextElementArray",
      "com.lowagie.text.SimpleTable",
      "com.lowagie.text.MarkupAttributes",
      "visu.handball.moves.model.animation.AnimationModel",
      "com.lowagie.text.GreekList",
      "com.lowagie.text.pdf.PdfChunk",
      "visu.handball.moves.views.OffenderDrawer",
      "visu.handball.moves.views.EventPointDrawer",
      "com.lowagie.text.Row",
      "com.lowagie.text.pdf.IntHashtable$IntHashtableEntry",
      "visu.handball.moves.model.HandballModel",
      "com.lowagie.text.pdf.AsianFontMapper",
      "com.lowagie.text.pdf.PageResources",
      "com.lowagie.text.HeaderFooter",
      "com.lowagie.text.pdf.XfaForm$Xml2Som",
      "com.lowagie.text.pdf.PdfStructureElement",
      "com.lowagie.text.pdf.PdfException",
      "com.lowagie.text.pdf.PRTokeniser",
      "com.lowagie.text.pdf.PdfIndirectReference",
      "com.lowagie.text.pdf.PdfPTable",
      "com.lowagie.text.pdf.DocumentFont",
      "com.lowagie.text.pdf.ColorDetails",
      "com.lowagie.text.pdf.PdfPattern",
      "com.lowagie.text.pdf.PdfRectangle",
      "com.lowagie.text.pdf.PdfArray",
      "com.lowagie.text.pdf.XfaForm$AcroFieldsSearch",
      "com.lowagie.text.pdf.PdfPageEvent",
      "com.lowagie.text.StringCompare",
      "com.lowagie.text.pdf.XfaForm$Stack2",
      "com.lowagie.bc.asn1.ASN1TaggedObject",
      "visu.handball.moves.model.animation.Animator",
      "com.lowagie.text.pdf.OutputStreamCounter",
      "com.lowagie.text.pdf.PdfStamperImp",
      "com.lowagie.text.DocWriter",
      "com.lowagie.text.pdf.PdfOutline",
      "visu.handball.moves.model.player.Defender",
      "visu.handball.moves.model.HandballModel$State",
      "com.lowagie.text.pdf.PdfSpotColor",
      "com.lowagie.text.Header",
      "com.lowagie.text.ListItem",
      "com.lowagie.text.pdf.XfdfReader",
      "com.lowagie.text.pdf.PdfAction",
      "com.lowagie.text.pdf.PdfTransition",
      "visu.handball.moves.actions.SetMoveNameAction",
      "com.lowagie.text.pdf.PdfStamperImp$PageStamp",
      "com.lowagie.text.FontFactory",
      "com.lowagie.text.pdf.XfaForm$Xml2SomDatasets",
      "com.lowagie.text.pdf.PdfPages",
      "com.lowagie.text.FontFactoryImp",
      "com.lowagie.text.pdf.Type3Font",
      "com.lowagie.text.pdf.PdfNull",
      "com.lowagie.text.pdf.PdfOCProperties",
      "visu.handball.moves.actions.CloseAction",
      "com.lowagie.text.xml.xmp.PdfSchema",
      "visu.handball.moves.views.StatusBar",
      "com.lowagie.text.pdf.PdfWriter$PdfBody",
      "com.lowagie.text.pdf.XfaForm$Xml2SomTemplate",
      "com.lowagie.text.pdf.PdfDocument",
      "com.lowagie.text.pdf.ByteBuffer",
      "com.lowagie.text.pdf.PdfBorderDictionary",
      "com.lowagie.text.pdf.PdfSigGenericPKCS$VeriSign",
      "com.lowagie.text.pdf.PdfAnnotation",
      "visu.handball.moves.views.ColoredShape",
      "com.lowagie.text.SimpleCell",
      "com.lowagie.text.pdf.PdfSignature",
      "com.lowagie.text.pdf.PdfSigGenericPKCS",
      "com.lowagie.text.pdf.PdfMediaClipData",
      "visu.handball.moves.actions.AbstractSupportSaveAction",
      "com.lowagie.text.pdf.PdfStructureTreeRoot",
      "com.lowagie.text.pdf.PdfWriter",
      "com.lowagie.text.pdf.PdfLiteral",
      "com.lowagie.text.pdf.PdfPrinterGraphics2D",
      "com.lowagie.text.pdf.GrayColor",
      "com.lowagie.text.pdf.PdfXConformanceException",
      "com.lowagie.text.DocListener",
      "visu.handball.moves.model.ColorModel",
      "visu.handball.moves.model.MoveEvent",
      "com.lowagie.text.ImgCCITT",
      "com.lowagie.text.Chunk",
      "com.lowagie.text.Phrase",
      "com.lowagie.text.pdf.PdfPKCS7",
      "com.lowagie.text.pdf.FontMapper",
      "com.lowagie.text.Watermark",
      "com.lowagie.text.pdf.PdfFormField",
      "com.lowagie.text.pdf.PdfDestination",
      "com.lowagie.text.pdf.PdfTable",
      "visu.handball.moves.views.DefenderDrawer",
      "com.lowagie.text.pdf.PdfImportedPage",
      "com.lowagie.text.pdf.PdfNumber",
      "com.lowagie.text.Paragraph",
      "com.lowagie.text.Chapter",
      "visu.handball.moves.model.player.Offender",
      "com.lowagie.text.pdf.PdfPRow",
      "visu.handball.moves.views.AbstractPlayerDrawer",
      "com.lowagie.text.Section",
      "com.lowagie.text.pdf.BadPdfFormatException",
      "com.lowagie.text.Cell",
      "com.lowagie.text.pdf.PdfCell",
      "com.lowagie.text.pdf.PdfPCell",
      "com.lowagie.text.pdf.ExtendedColor",
      "com.lowagie.text.pdf.PdfFunction",
      "com.lowagie.text.pdf.PdfDocument$PdfInfo",
      "com.lowagie.text.pdf.BaseFont",
      "com.lowagie.text.pdf.PdfAcroForm",
      "com.lowagie.text.pdf.PdfLine",
      "com.lowagie.text.ChapterAutoNumber",
      "com.lowagie.bc.asn1.DERObject",
      "com.lowagie.text.pdf.PdfTransparencyGroup",
      "com.lowagie.text.pdf.DefaultFontMapper",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "com.lowagie.text.pdf.PdfBorderArray",
      "com.lowagie.text.pdf.PdfLayerMembership",
      "com.lowagie.text.pdf.PdfEncryption",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "com.lowagie.text.pdf.PdfFormXObject",
      "com.lowagie.text.pdf.FontDetails",
      "com.lowagie.text.pdf.PRStream",
      "com.lowagie.text.pdf.PdfShading",
      "com.lowagie.text.Image",
      "com.lowagie.text.pdf.PdfContentByte",
      "com.lowagie.text.pdf.PdfPKCS7$X509Name",
      "visu.handball.moves.views.FieldDrawer",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "com.lowagie.text.Meta",
      "com.lowagie.text.pdf.codec.CCITTG4Encoder",
      "com.lowagie.text.pdf.PdfIndirectObject",
      "com.lowagie.text.ImgTemplate",
      "com.lowagie.text.pdf.PdfReader",
      "com.lowagie.text.pdf.Type3Glyph",
      "com.lowagie.text.pdf.PdfDocument$PdfCatalog",
      "com.lowagie.text.ImgPostscript",
      "com.lowagie.text.pdf.PdfICCBased",
      "com.lowagie.text.pdf.XfaForm",
      "com.lowagie.text.SpecialSymbol",
      "com.lowagie.text.pdf.PdfDate",
      "com.lowagie.text.ExceptionConverter",
      "com.lowagie.bc.asn1.DERTags",
      "com.lowagie.text.pdf.CMYKColor",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "com.lowagie.text.xml.xmp.XmpBasicSchema",
      "com.lowagie.bc.asn1.DEREncodableVector",
      "com.lowagie.text.pdf.PdfPageLabels",
      "com.lowagie.text.pdf.PdfRendition",
      "com.lowagie.text.pdf.PdfDashPattern",
      "com.lowagie.text.xml.xmp.XmpSchema",
      "com.lowagie.text.Table",
      "visu.handball.moves.model.PlayerRemovedListener",
      "com.lowagie.text.pdf.PdfDictionary",
      "visu.handball.moves.model.TableHandballModel",
      "visu.handball.moves.model.PassEvent",
      "com.lowagie.text.pdf.PdfStream",
      "com.lowagie.text.pdf.PRAcroForm$FieldInformation",
      "visu.handball.moves.model.HandballModelListener",
      "com.lowagie.text.SplitCharacter",
      "com.lowagie.bc.asn1.DERObjectIdentifier",
      "com.lowagie.text.pdf.PdfEncryptionStream",
      "com.lowagie.text.pdf.PdfTemplate",
      "visu.handball.moves.views.CircleDrawer",
      "com.lowagie.text.pdf.AcroFields$RevisionStream",
      "com.lowagie.text.pdf.PdfGraphics2D$fakeComponent",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.ElementListener",
      "com.lowagie.text.pdf.PdfEncodings",
      "visu.handball.moves.controller.HandballFileFilter",
      "com.lowagie.bc.asn1.ASN1EncodableVector",
      "visu.handball.moves.views.BallDrawer",
      "com.lowagie.text.pdf.PdfShadingPattern",
      "visu.handball.moves.model.TableHandballModel$1",
      "com.lowagie.text.pdf.PdfWriter$PdfBody$PdfCrossReference",
      "visu.handball.moves.model.ColorModelListener",
      "com.lowagie.text.pdf.FdfReader",
      "com.lowagie.text.pdf.PdfImage",
      "visu.handball.moves.model.player.HighlightableItem",
      "visu.handball.moves.views.CommentView",
      "com.lowagie.text.pdf.MappedRandomAccessFile",
      "com.lowagie.text.pdf.PdfContentByte$GraphicState",
      "com.lowagie.text.pdf.PdfPage",
      "com.lowagie.text.xml.xmp.XmpArray",
      "com.lowagie.text.pdf.fonts.FontsResourceAnchor",
      "com.lowagie.text.pdf.PdfFileSpecification",
      "visu.handball.moves.model.player.Circle",
      "com.lowagie.text.pdf.StampContent",
      "com.lowagie.text.pdf.PdfName",
      "com.lowagie.text.pdf.PdfGState",
      "com.lowagie.text.List",
      "com.lowagie.text.pdf.RandomAccessFileOrArray",
      "com.lowagie.text.Rectangle",
      "com.lowagie.text.ImgWMF",
      "com.lowagie.text.pdf.HyphenationEvent",
      "com.lowagie.text.pdf.PdfAppearance",
      "visu.handball.moves.actions.SaveAction",
      "com.lowagie.text.pdf.PdfTextArray",
      "visu.handball.moves.model.player.Ball",
      "visu.handball.moves.model.player.MovePoint",
      "com.lowagie.text.pdf.AcroFields$Item",
      "com.lowagie.text.pdf.PdfColor",
      "com.lowagie.text.Jpeg",
      "com.lowagie.text.pdf.PdfLayer",
      "com.lowagie.text.ImgRaw",
      "com.lowagie.text.pdf.IntHashtable",
      "com.lowagie.text.pdf.PdfPTableEvent",
      "com.lowagie.text.pdf.Type1Font",
      "com.lowagie.text.pdf.PdfString",
      "com.lowagie.text.BadElementException",
      "visu.handball.moves.views.EventDrawer",
      "com.lowagie.bc.asn1.DEREncodable",
      "com.lowagie.text.pdf.PdfContents",
      "com.lowagie.text.pdf.TrueTypeFont",
      "com.lowagie.text.pdf.PdfReaderInstance",
      "com.lowagie.text.pdf.SimpleXMLDocHandler",
      "com.lowagie.text.pdf.PRIndirectReference",
      "visu.handball.moves.model.player.Player",
      "com.lowagie.text.pdf.BaseFont$StreamFont",
      "com.lowagie.text.DocumentException",
      "com.lowagie.text.Font",
      "com.lowagie.text.Document",
      "com.lowagie.text.pdf.PdfFont",
      "com.lowagie.text.pdf.PdfPSXObject",
      "com.lowagie.text.pdf.PdfResources",
      "com.lowagie.text.xml.xmp.DublinCoreSchema",
      "com.lowagie.text.pdf.PRAcroForm",
      "com.lowagie.text.PageSize",
      "com.lowagie.text.pdf.AcroFields"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Field_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "visu.handball.moves.views.Field",
      "visu.handball.moves.model.HandballModel$State",
      "visu.handball.moves.model.HandballModel",
      "visu.handball.moves.model.player.Player",
      "visu.handball.moves.model.player.Defender",
      "visu.handball.moves.model.player.Offender",
      "visu.handball.moves.model.player.Circle",
      "visu.handball.moves.model.player.Ball",
      "visu.handball.moves.Main",
      "visu.handball.moves.model.ColorModel",
      "visu.handball.moves.views.FieldDrawer",
      "visu.handball.moves.views.ColoredShape",
      "visu.handball.moves.views.AbstractPlayerDrawer",
      "visu.handball.moves.views.OffenderDrawer",
      "visu.handball.moves.views.CircleDrawer",
      "visu.handball.moves.views.BallDrawer",
      "visu.handball.moves.views.DefenderDrawer",
      "visu.handball.moves.views.EventDrawer",
      "visu.handball.moves.views.EventPointDrawer",
      "com.lowagie.text.DocWriter",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.pdf.ByteBuffer",
      "com.lowagie.text.pdf.PdfName",
      "com.lowagie.text.pdf.PdfWriter",
      "com.lowagie.text.Document",
      "com.lowagie.text.pdf.PdfDocument",
      "com.lowagie.text.Rectangle",
      "com.lowagie.text.PageSize",
      "com.lowagie.text.pdf.PdfDictionary",
      "com.lowagie.text.pdf.PdfDocument$PdfInfo",
      "com.lowagie.text.pdf.PdfString",
      "com.lowagie.text.pdf.PdfDate",
      "com.lowagie.text.StringCompare",
      "com.lowagie.text.Meta",
      "com.lowagie.text.pdf.OutputStreamCounter",
      "com.lowagie.text.pdf.PdfPages",
      "com.lowagie.text.pdf.PdfArray",
      "com.lowagie.text.pdf.PdfContentByte",
      "com.lowagie.text.pdf.PdfContentByte$GraphicState",
      "com.lowagie.text.pdf.PdfAcroForm",
      "com.lowagie.text.pdf.PdfTemplate",
      "com.lowagie.text.pdf.PdfPatternPainter",
      "com.lowagie.text.pdf.PageResources",
      "com.lowagie.text.Graphic",
      "com.lowagie.text.Image",
      "com.lowagie.text.ImgRaw",
      "com.lowagie.text.DocumentException",
      "com.lowagie.text.BadElementException",
      "com.lowagie.text.pdf.BaseFont",
      "com.lowagie.text.pdf.Type3Font",
      "com.lowagie.text.pdf.IntHashtable",
      "com.lowagie.text.pdf.IntHashtable$IntHashtableEntry",
      "com.lowagie.text.pdf.Type3Glyph",
      "com.lowagie.text.pdf.DefaultFontMapper",
      "com.lowagie.text.pdf.AsianFontMapper",
      "com.lowagie.text.List",
      "com.lowagie.text.GreekList",
      "com.lowagie.text.Font",
      "com.lowagie.text.Chunk",
      "com.lowagie.text.FontFactoryImp",
      "com.lowagie.text.FontFactory",
      "com.lowagie.text.pdf.Type1Font",
      "com.lowagie.text.pdf.fonts.FontsResourceAnchor",
      "com.lowagie.text.pdf.RandomAccessFileOrArray",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "com.lowagie.text.pdf.PdfEncodings$SymbolTTConversion",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "com.lowagie.text.pdf.PdfEncodings",
      "visu.handball.moves.model.MoveEvent",
      "visu.handball.moves.model.player.MovePoint",
      "visu.handball.moves.model.player.HighlightableItem",
      "com.lowagie.text.pdf.PdfPSXObject",
      "visu.handball.moves.model.TableHandballModel",
      "com.lowagie.text.ImgPostscript",
      "com.lowagie.text.Jpeg",
      "com.lowagie.text.ImgCCITT",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "com.lowagie.text.pdf.ExtendedColor",
      "com.lowagie.text.Cell",
      "com.lowagie.text.Phrase",
      "com.lowagie.text.Paragraph",
      "com.lowagie.text.ExceptionConverter",
      "com.lowagie.text.pdf.PdfReader",
      "com.lowagie.text.pdf.PRTokeniser",
      "com.lowagie.text.pdf.CJKFont",
      "com.lowagie.text.pdf.PdfTextArray",
      "com.lowagie.text.pdf.PdfPrinterGraphics2D",
      "com.lowagie.text.pdf.codec.PngImage",
      "com.lowagie.text.ImgWMF",
      "com.lowagie.text.Header",
      "com.lowagie.text.pdf.PdfLayer",
      "com.lowagie.text.pdf.PdfPCell",
      "com.lowagie.text.pdf.ColumnText",
      "com.lowagie.text.Table",
      "com.lowagie.text.pdf.PdfAction",
      "com.lowagie.text.pdf.PdfAppearance",
      "com.lowagie.text.pdf.codec.wmf.InputMeta",
      "com.lowagie.text.pdf.PdfGState",
      "com.lowagie.text.pdf.PdfGraphics2D$fakeComponent",
      "com.lowagie.text.pdf.PdfStructureElement",
      "com.lowagie.text.pdf.PdfBorderArray",
      "com.lowagie.text.pdf.PdfNumber",
      "com.lowagie.text.SimpleCell",
      "com.lowagie.text.Row",
      "com.lowagie.text.HeaderFooter",
      "com.lowagie.text.pdf.PdfDestination",
      "com.lowagie.text.pdf.PdfShading",
      "com.lowagie.text.pdf.PdfFunction",
      "com.lowagie.text.SimpleTable",
      "com.lowagie.text.Watermark",
      "com.lowagie.text.pdf.PdfSpotColor",
      "com.lowagie.text.Anchor",
      "com.lowagie.text.ImgTemplate",
      "com.lowagie.text.pdf.PdfPTable",
      "com.lowagie.text.pdf.PdfDashPattern",
      "com.lowagie.text.pdf.PdfOutline",
      "com.lowagie.text.pdf.PdfStream",
      "com.lowagie.text.ListItem",
      "com.lowagie.text.pdf.MappedRandomAccessFile",
      "com.lowagie.text.pdf.PdfWriter$PdfBody",
      "com.lowagie.text.pdf.PdfWriter$PdfBody$PdfCrossReference",
      "com.lowagie.text.pdf.PdfLine",
      "com.lowagie.text.pdf.PdfShadingPattern",
      "visu.handball.moves.model.TableHandballModel$1",
      "com.lowagie.text.Section",
      "com.lowagie.text.Chapter",
      "com.lowagie.text.ChapterAutoNumber",
      "com.lowagie.text.pdf.DefaultFontMapper$BaseFontParameters",
      "com.lowagie.text.pdf.PdfSignature",
      "com.lowagie.text.pdf.codec.CCITTG4Encoder",
      "com.lowagie.text.pdf.PdfSigGenericPKCS",
      "com.lowagie.text.pdf.PdfSigGenericPKCS$VeriSign",
      "com.lowagie.text.pdf.PRAcroForm",
      "com.lowagie.text.pdf.DocumentFont",
      "com.lowagie.text.pdf.PdfAnnotation",
      "com.lowagie.text.pdf.PdfFormField",
      "com.lowagie.text.pdf.PdfLayerMembership",
      "com.lowagie.text.pdf.PdfRectangle",
      "com.lowagie.text.pdf.PdfFileSpecification",
      "com.lowagie.text.SpecialSymbol",
      "com.lowagie.text.pdf.PdfBoolean",
      "com.lowagie.text.xml.xmp.XmpWriter",
      "com.lowagie.text.xml.xmp.XmpSchema",
      "com.lowagie.text.xml.xmp.DublinCoreSchema",
      "com.lowagie.text.xml.xmp.PdfSchema",
      "com.lowagie.text.xml.xmp.XmpBasicSchema"
    );
  }
}
