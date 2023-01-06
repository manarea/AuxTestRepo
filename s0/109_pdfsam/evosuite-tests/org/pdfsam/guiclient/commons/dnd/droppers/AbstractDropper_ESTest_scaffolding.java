/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu May 07 08:21:34 GMT 2020
 */

package org.pdfsam.guiclient.commons.dnd.droppers;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractDropper_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.pdfsam.guiclient.commons.dnd.droppers.AbstractDropper"; 
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
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/test-smell/generation-scripts/projects/109_pdfsam"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("java.rmi.server.hostname", "127.0.0.1"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractDropper_ESTest_scaffolding.class.getClassLoader() ,
      "org.jaxen.pattern.TextNodeTest",
      "org.jaxen.SimpleVariableContext",
      "org.jaxen.expr.DefaultTruthExpr",
      "org.pdfsam.guiclient.plugins.interfaces.AbstractPlugablePanel",
      "org.pdfsam.guiclient.commons.components.JPdfSelectionToolTipHeader",
      "com.lowagie.text.pdf.PdfOCG",
      "org.dom4j.tree.NamespaceStack",
      "com.lowagie.text.Element",
      "org.dom4j.tree.AbstractBranch",
      "com.lowagie.text.pdf.ExtraEncoding",
      "org.jaxen.Function",
      "org.dom4j.Namespace",
      "org.jaxen.expr.PredicateSet",
      "org.dom4j.tree.DefaultDocumentType",
      "org.pdfsam.guiclient.plugins.interfaces.Plugable",
      "com.lowagie.text.pdf.PdfDeveloperExtension",
      "org.apache.log4j.spi.Filter",
      "org.jaxen.expr.iter.IterableFollowingSiblingAxis",
      "org.jaxen.expr.iter.IterableSelfAxis",
      "org.dom4j.tree.FlyweightComment",
      "org.pdfsam.emp4j.exceptions.ParentEmp4jException",
      "org.jaxen.XPath",
      "org.dom4j.tree.ConcurrentReaderHashMap$ValueIterator",
      "org.apache.log4j.Hierarchy",
      "org.pdfsam.guiclient.dto.DocumentMetaData",
      "org.pdfsam.guiclient.commons.panels.CloseableTabbedPane$CloseableMetalTabbedPaneUI",
      "com.lowagie.text.pdf.ColorDetails",
      "com.lowagie.text.pdf.PdfEncodings$1",
      "com.lowagie.text.pdf.PdfPattern",
      "org.jaxen.ContextSupport",
      "com.lowagie.text.pdf.PdfPageEvent",
      "org.dom4j.dom.DOMDocumentFactory",
      "org.dom4j.bean.BeanElement",
      "org.apache.log4j.spi.OptionHandler",
      "org.dom4j.dom.DOMNodeHelper$EmptyNodeList",
      "org.dom4j.tree.AbstractProcessingInstruction",
      "com.lowagie.text.pdf.PdfOutline",
      "org.jaxen.function.ConcatFunction",
      "org.apache.log4j.helpers.OptionConverter",
      "org.dom4j.tree.ConcurrentReaderHashMap$HashIterator",
      "org.jaxen.function.LocalNameFunction",
      "org.dom4j.util.SingletonStrategy",
      "org.jaxen.function.BooleanFunction",
      "com.lowagie.text.pdf.PdfAction",
      "org.dom4j.tree.BackedList",
      "org.jaxen.SimpleNamespaceContext",
      "org.jaxen.expr.DefaultExpr",
      "org.apache.log4j.Category",
      "org.jaxen.NamespaceContext",
      "org.jaxen.pattern.AnyNodeTest",
      "com.lowagie.text.pdf.PdfNull",
      "com.lowagie.text.pdf.PdfOCProperties",
      "org.jaxen.expr.Predicated",
      "org.jaxen.saxpath.base.Token",
      "org.jaxen.saxpath.XPathSyntaxException",
      "org.pdfsam.guiclient.dto.StringItem",
      "com.lowagie.text.pdf.PdfDocument",
      "com.lowagie.text.pdf.ByteBuffer",
      "org.dom4j.util.IndexedElement",
      "org.dom4j.util.NonLazyElement",
      "org.jaxen.expr.DefaultRelativeLocationPath",
      "org.jaxen.pattern.NameTest",
      "org.jaxen.JaxenHandler",
      "com.lowagie.text.pdf.PdfWriter",
      "com.lowagie.text.pdf.PdfLiteral",
      "org.jaxen.VariableContext",
      "org.jaxen.dom4j.Dom4jXPath",
      "org.jaxen.saxpath.SAXPathEventSource",
      "org.dom4j.tree.DefaultAttribute",
      "org.dom4j.ElementHandler",
      "com.lowagie.text.pdf.PdfXConformanceException",
      "org.pdfsam.guiclient.dto.DocumentInfo",
      "org.jaxen.JaxenRuntimeException",
      "org.pdfsam.guiclient.exceptions.ThumbnailCreationException",
      "org.dom4j.rule.Pattern",
      "org.jaxen.function.StartsWithFunction",
      "org.pdfsam.guiclient.commons.models.AbstractPdfSelectionTableModel$SortingState",
      "com.lowagie.text.pdf.PdfGraphics2D$HyperLinkKey",
      "com.lowagie.text.pdf.PdfImportedPage",
      "org.jaxen.expr.iter.IterableParentAxis",
      "org.dom4j.tree.AbstractComment",
      "org.dom4j.Branch",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.pdfsam.emp4j.exceptions.ClassNameKeyException",
      "org.jaxen.function.LangFunction",
      "com.lowagie.text.pdf.PdfGraphics2D$FakeComponent",
      "org.dom4j.XPath",
      "org.dom4j.xpath.DefaultXPath",
      "org.dom4j.tree.FlyweightCDATA",
      "org.jaxen.expr.DefaultBinaryExpr",
      "com.lowagie.text.pdf.PdfDocument$PdfInfo",
      "org.jaxen.JaxenException",
      "org.jaxen.XPathFunctionContext",
      "org.jaxen.expr.iter.IterableDescendantOrSelfAxis",
      "org.dom4j.InvalidXPathException",
      "org.dom4j.tree.DefaultText",
      "org.pdfsam.guiclient.business.PagesWorker",
      "org.jaxen.expr.Step",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "org.jaxen.expr.EqualityExpr",
      "org.dom4j.tree.ConcurrentReaderHashMap$KeyIterator",
      "org.jaxen.function.StringFunction",
      "com.lowagie.text.pdf.FontDetails",
      "org.jaxen.function.IdFunction",
      "com.lowagie.text.pdf.PdfShading",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "com.lowagie.text.pdf.PdfReader",
      "org.dom4j.tree.AbstractDocument",
      "com.lowagie.text.pdf.IntHashtable$Entry",
      "org.dom4j.Attribute",
      "org.dom4j.Document",
      "org.dom4j.tree.ConcurrentReaderHashMap",
      "org.jaxen.pattern.NodeTypeTest",
      "org.jaxen.function.NumberFunction",
      "org.apache.log4j.helpers.Loader",
      "org.jaxen.expr.LiteralExpr",
      "org.dom4j.tree.AbstractDocumentType",
      "org.jaxen.expr.DefaultLocationPath",
      "org.jaxen.function.NotFunction",
      "org.apache.log4j.helpers.FileWatchdog",
      "com.lowagie.text.pdf.PdfPageLabels",
      "org.dom4j.CDATA",
      "org.pdfsam.console.exceptions.BasicPdfsamException",
      "org.jaxen.UnresolvableException",
      "org.dom4j.tree.FlyweightText",
      "org.pdfsam.guiclient.commons.panels.CloseableTabbedPane$CloseableTabbedPaneUI",
      "org.dom4j.tree.ConcurrentReaderHashMap$BarrierLock",
      "com.lowagie.text.pdf.PdfDictionary",
      "org.pdfsam.guiclient.configuration.services.xml.XmlConfigurationService",
      "org.dom4j.xpath.XPathPattern",
      "org.jaxen.expr.DefaultXPathFactory",
      "org.jaxen.saxpath.base.XPathReader",
      "org.jaxen.expr.DefaultEqualityExpr",
      "org.jaxen.expr.iter.IterableAncestorOrSelfAxis",
      "org.pdfsam.guiclient.commons.components.JPdfSelectionTable",
      "org.jaxen.function.ext.EvaluateFunction",
      "com.lowagie.text.ElementListener",
      "org.jaxen.expr.UnionExpr",
      "org.dom4j.XPathException",
      "org.pdfsam.guiclient.commons.business.loaders.PdfLoaderExecutor",
      "com.lowagie.text.exceptions.BadPasswordException",
      "org.jaxen.expr.FunctionCallExpr",
      "org.dom4j.io.SAXReader",
      "com.lowagie.text.pdf.internal.PdfVersionImp",
      "org.jaxen.pattern.Pattern",
      "org.jaxen.FunctionCallException",
      "org.jaxen.function.RoundFunction",
      "org.jaxen.function.ext.LowerFunction",
      "org.dom4j.dom.DOMDocumentType",
      "org.dom4j.DocumentType",
      "com.lowagie.text.pdf.PdfImage",
      "org.jaxen.UnsupportedAxisException",
      "com.lowagie.text.pdf.interfaces.PdfVersion",
      "org.jaxen.expr.XPathExpr",
      "org.dom4j.tree.DefaultDocument",
      "com.lowagie.text.pdf.internal.PdfViewerPreferencesImp",
      "com.lowagie.text.pdf.PdfPage",
      "org.jaxen.pattern.UnionPattern",
      "org.dom4j.tree.ConcurrentReaderHashMap$KeySet",
      "org.jaxen.expr.iter.IterableFollowingAxis",
      "com.lowagie.text.pdf.PdfName",
      "com.lowagie.text.pdf.PdfGState",
      "com.lowagie.text.pdf.RandomAccessFileOrArray",
      "org.jaxen.expr.DefaultStep",
      "org.dom4j.util.SimpleSingleton",
      "org.jaxen.expr.Expr",
      "org.pdfsam.guiclient.configuration.services.xml.strategy.DefaultXmlStrategy",
      "org.apache.log4j.PropertyConfigurator",
      "org.dom4j.dom.DOMNamespace",
      "org.pdfsam.guiclient.commons.business.loaders.PdfLoader",
      "org.jaxen.saxpath.base.Verifier",
      "org.jaxen.expr.iter.IterableAncestorAxis",
      "com.lowagie.text.pdf.PdfLayer",
      "org.pdfsam.guiclient.commons.dnd.handlers.VisualListTransferHandler",
      "org.dom4j.tree.BaseElement",
      "org.dom4j.Comment",
      "org.pdfsam.guiclient.commons.panels.JVisualPdfPageSelectionPanel",
      "com.lowagie.text.pdf.PdfReaderInstance",
      "com.lowagie.text.pdf.PRIndirectReference",
      "org.dom4j.dom.DOMNodeHelper",
      "org.jaxen.function.SumFunction",
      "org.jaxen.function.NormalizeSpaceFunction",
      "com.lowagie.text.pdf.IntHashtable$IntHashtableIterator",
      "org.dom4j.Text",
      "org.dom4j.tree.AbstractCharacterData",
      "com.lowagie.text.DocumentException",
      "org.jaxen.expr.iter.IterablePrecedingAxis",
      "org.dom4j.bean.BeanDocumentFactory",
      "org.jaxen.FunctionContext",
      "com.lowagie.text.pdf.PRAcroForm",
      "org.apache.log4j.spi.LoggerRepository",
      "org.jaxen.function.ext.LocaleFunctionSupport",
      "com.lowagie.text.pdf.AcroFields",
      "org.jaxen.expr.iter.IterableAxis",
      "org.jaxen.function.ext.UpperFunction",
      "org.dom4j.io.DispatchHandler",
      "org.dom4j.Entity",
      "org.dom4j.xpath.DefaultNamespaceContext",
      "com.lowagie.text.pdf.interfaces.PdfViewerPreferences",
      "org.apache.log4j.Level",
      "com.lowagie.text.pdf.PdfEncodings$SymbolTTConversion",
      "org.jaxen.function.NameFunction",
      "com.lowagie.text.xml.xmp.XmpWriter",
      "com.lowagie.text.pdf.PdfPatternPainter",
      "org.dom4j.ProcessingInstruction",
      "org.pdfsam.guiclient.configuration.services.ConfigurationService",
      "org.dom4j.tree.FlyweightProcessingInstruction",
      "org.jaxen.BaseXPath",
      "org.pdfsam.guiclient.commons.panels.JPdfSelectionPanel",
      "com.lowagie.text.pdf.PdfBoolean",
      "org.jaxen.function.ext.EndsWithFunction",
      "org.dom4j.tree.AbstractText",
      "org.jaxen.saxpath.SAXPathException",
      "org.dom4j.tree.NamespaceCache",
      "com.lowagie.text.pdf.interfaces.PdfPageActions",
      "org.apache.log4j.Layout",
      "org.pdfsam.guiclient.exceptions.ConfigurationException",
      "com.lowagie.text.HeaderFooter",
      "org.pdfsam.console.exceptions.console.ConsoleException",
      "com.lowagie.text.LargeElement",
      "com.lowagie.text.pdf.PdfException",
      "com.lowagie.text.pdf.PdfIndirectReference",
      "org.jaxen.pattern.NamespaceTest",
      "org.dom4j.tree.QNameCache",
      "org.jaxen.expr.iter.IterableNamespaceAxis",
      "org.jaxen.dom4j.DocumentNavigator",
      "org.jaxen.expr.iter.IterablePrecedingSiblingAxis",
      "org.jaxen.expr.LocationPath",
      "org.dom4j.tree.ContentListFacade",
      "com.lowagie.text.pdf.PdfArray",
      "org.pdfsam.guiclient.commons.dnd.droppers.JVisualMultiSelectionDropper",
      "org.jaxen.Navigator",
      "org.jaxen.pattern.LocationPathPattern",
      "com.lowagie.text.pdf.collection.PdfCollection",
      "org.pdfsam.guiclient.commons.components.JPdfVersionCombo",
      "org.pdfsam.guiclient.commons.business.loaders.PdfThumbnailsLoader",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.dom4j.NodeFilter",
      "org.dom4j.tree.DefaultNamespace",
      "org.jaxen.saxpath.helpers.XPathReaderFactory",
      "org.dom4j.tree.DefaultComment",
      "org.jaxen.function.xslt.DocumentFunction",
      "org.jaxen.expr.Predicate",
      "com.lowagie.text.pdf.OutputStreamCounter",
      "org.pdfsam.guiclient.commons.dnd.droppers.JPdfSelectionTableDropper",
      "com.lowagie.text.DocWriter",
      "org.jaxen.function.CountFunction",
      "org.dom4j.io.SAXContentHandler",
      "org.jaxen.expr.PathExpr",
      "org.dom4j.QName",
      "org.jaxen.pattern.PatternParser",
      "com.lowagie.text.pdf.PdfSpotColor",
      "org.dom4j.tree.DefaultElement",
      "org.jaxen.expr.iter.IterableDescendantAxis",
      "org.dom4j.Node",
      "org.jaxen.function.SubstringBeforeFunction",
      "org.apache.log4j.or.ObjectRenderer",
      "org.dom4j.tree.DefaultCDATA",
      "com.lowagie.text.pdf.PdfTransition",
      "org.pdfsam.guiclient.utils.filters.PdfFilter",
      "org.pdfsam.guiclient.configuration.services.xml.strategy.BackwardCompatibilityXmlStrategy",
      "org.dom4j.tree.AbstractAttribute",
      "org.jaxen.saxpath.helpers.DefaultXPathHandler",
      "org.dom4j.dom.DOMElement",
      "org.dom4j.util.UserDataElement",
      "org.jaxen.dom4j.DocumentNavigator$Singleton",
      "org.pdfsam.guiclient.commons.dnd.droppers.AbstractDropper",
      "org.jaxen.function.FalseFunction",
      "org.pdfsam.guiclient.commons.models.AbstractPdfSelectionTableModel",
      "org.pdfsam.guiclient.commons.panels.CloseableTabbedPane$CloseTabIcon",
      "com.lowagie.text.pdf.PdfAnnotation",
      "org.pdfsam.guiclient.commons.business.loaders.callable.ReloadPdfDocument",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.jaxen.function.TrueFunction",
      "org.jaxen.expr.iter.IterableChildAxis",
      "com.lowagie.text.pdf.PdfStructureTreeRoot",
      "org.apache.log4j.spi.LocationInfo",
      "org.dom4j.bean.BeanAttribute",
      "org.apache.log4j.PropertyWatchdog",
      "org.pdfsam.guiclient.commons.business.loaders.PdfDocumentLoadedHook",
      "com.lowagie.text.DocListener",
      "com.lowagie.text.pdf.FontMapper",
      "com.lowagie.text.pdf.PdfFormField",
      "com.lowagie.text.pdf.PdfDestination",
      "org.pdfsam.guiclient.commons.dnd.handlers.ClosableTabTransferHandler",
      "com.lowagie.text.pdf.PdfNumber",
      "org.jaxen.saxpath.base.TokenTypes",
      "org.jaxen.expr.NameStep",
      "org.jaxen.expr.DefaultXPathExpr",
      "org.jaxen.Context",
      "org.pdfsam.guiclient.utils.filters.AbstractFileFilter",
      "org.apache.log4j.Priority",
      "org.jaxen.expr.iter.IterableAttributeAxis",
      "org.pdfsam.guiclient.configuration.services.GuiConfigurationService",
      "org.dom4j.Element",
      "org.pdfsam.guiclient.exceptions.LoadJobException",
      "org.pdfsam.guiclient.commons.components.JVisualSelectionList",
      "org.apache.log4j.LogManager",
      "org.jaxen.saxpath.XPathReader",
      "com.lowagie.text.pdf.BaseFont",
      "com.lowagie.text.pdf.PdfAcroForm",
      "org.jaxen.SimpleFunctionContext",
      "org.jaxen.expr.DefaultNameStep",
      "org.apache.log4j.DefaultCategoryFactory",
      "com.lowagie.text.exceptions.UnsupportedPdfException",
      "org.apache.log4j.or.RendererMap",
      "org.pdfsam.guiclient.commons.dnd.handlers.VisualListExportTransferHandler",
      "org.pdfsam.guiclient.configuration.Configuration",
      "org.jaxen.DefaultNavigator",
      "org.jaxen.expr.XPathFactory",
      "com.lowagie.text.pdf.PdfEncryption",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "com.lowagie.text.pdf.PRStream",
      "org.jaxen.expr.BinaryExpr",
      "com.lowagie.text.Image",
      "org.pdfsam.plugin.docinfo.GUI.DocInfoMainGUI$DocInfoFocusPolicy",
      "com.lowagie.text.pdf.PdfContentByte",
      "org.dom4j.tree.AbstractCDATA",
      "com.lowagie.text.pdf.PdfIndirectObject",
      "org.dom4j.bean.BeanMetaData",
      "org.apache.log4j.CategoryKey",
      "org.pdfsam.guiclient.dto.VisualPageListItem",
      "com.lowagie.text.pdf.PdfDocument$PdfCatalog",
      "com.lowagie.text.pdf.PdfICCBased",
      "org.dom4j.tree.ConcurrentReaderHashMap$Entry",
      "org.jaxen.expr.DefaultEqualsExpr",
      "org.apache.log4j.ProvisionNode",
      "com.lowagie.text.pdf.interfaces.PdfEncryptionSettings",
      "com.lowagie.text.ExceptionConverter",
      "org.pdfsam.console.business.ConsoleServicesFacade",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "org.dom4j.tree.FlyweightAttribute",
      "org.dom4j.IllegalAddException",
      "org.jaxen.function.SubstringAfterFunction",
      "org.dom4j.tree.AbstractNode",
      "org.dom4j.Visitor",
      "com.lowagie.text.Table",
      "org.dom4j.CharacterData",
      "org.apache.log4j.spi.RootLogger",
      "org.pdfsam.guiclient.commons.business.listeners.CloseableTabbedPaneListener",
      "com.lowagie.text.pdf.PdfStream",
      "com.lowagie.text.pdf.PdfGraphics2D$1",
      "org.apache.log4j.spi.ErrorHandler",
      "org.pdfsam.guiclient.business.ClosableTabbedPanelAdder",
      "org.pdfsam.guiclient.dto.PdfSelectionTableItem",
      "org.jaxen.function.NamespaceUriFunction",
      "com.lowagie.text.pdf.PdfTemplate",
      "org.apache.log4j.spi.RendererSupport",
      "org.jaxen.expr.DefaultPathExpr",
      "com.lowagie.text.pdf.PdfObject",
      "org.jaxen.expr.FilterExpr",
      "com.lowagie.text.pdf.PdfEncodings",
      "org.jaxen.expr.VariableReferenceExpr",
      "org.jaxen.function.LastFunction",
      "org.pdfsam.guiclient.commons.models.SortablePdfSelectionTableModel",
      "org.pdfsam.guiclient.commons.models.SimplePdfSelectionTableModel",
      "org.pdfsam.guiclient.commons.business.loaders.callable.AddPdfDocument",
      "com.lowagie.text.pdf.PdfShadingPattern",
      "org.pdfsam.guiclient.commons.dnd.DnDSupportUtility",
      "org.dom4j.tree.ConcurrentReaderHashMap$Values",
      "org.apache.log4j.Logger",
      "org.jaxen.saxpath.base.XPathLexer",
      "org.jaxen.function.SubstringFunction",
      "org.jaxen.function.ContainsFunction",
      "org.jaxen.function.FloorFunction",
      "com.lowagie.text.pdf.interfaces.PdfAnnotations",
      "org.apache.log4j.helpers.LogLog",
      "com.lowagie.text.pdf.interfaces.PdfRunDirection",
      "com.lowagie.text.pdf.PdfFileSpecification",
      "org.apache.log4j.spi.RepositorySelector",
      "org.pdfsam.guiclient.exceptions.SaveJobException",
      "org.jaxen.function.CeilingFunction",
      "com.lowagie.text.Rectangle",
      "org.apache.log4j.or.DefaultRenderer",
      "org.dom4j.tree.ConcurrentReaderHashMap$1",
      "org.dom4j.dom.DOMDocument",
      "org.jaxen.NamedAccessNavigator",
      "com.lowagie.text.pdf.interfaces.PdfDocumentActions",
      "org.jaxen.util.SingletonList",
      "org.pdfsam.guiclient.configuration.services.xml.strategy.XmlConfigStrategy",
      "org.jaxen.function.TranslateFunction",
      "org.dom4j.bean.BeanAttributeList",
      "com.lowagie.text.exceptions.InvalidPdfException",
      "org.pdfsam.guiclient.configuration.services.xml.strategy.AbstractXmlConfigStrategy",
      "org.dom4j.tree.AbstractElement",
      "org.pdfsam.plugin.docinfo.GUI.DocInfoMainGUI",
      "org.dom4j.DocumentFactory",
      "com.lowagie.text.pdf.IntHashtable",
      "org.dom4j.DocumentException",
      "org.apache.log4j.Appender",
      "org.jaxen.saxpath.XPathHandler",
      "com.lowagie.text.pdf.PdfString",
      "org.dom4j.tree.ConcurrentReaderHashMap$EntrySet",
      "com.lowagie.text.pdf.PdfContents",
      "org.jaxen.XPathSyntaxException",
      "org.pdfsam.console.business.dto.commands.AbstractParsedCommand",
      "org.apache.log4j.spi.HierarchyEventListener",
      "org.jaxen.function.StringLengthFunction",
      "org.pdfsam.guiclient.commons.panels.CloseableTabbedPane",
      "com.lowagie.text.pdf.interfaces.PdfXConformance",
      "org.dom4j.tree.DefaultProcessingInstruction",
      "org.apache.log4j.spi.LoggingEvent",
      "org.dom4j.util.UserDataAttribute",
      "org.jaxen.pattern.NodeTest",
      "org.jaxen.function.PositionFunction",
      "com.lowagie.text.Document",
      "org.apache.log4j.spi.ThrowableInformation",
      "org.pdfsam.guiclient.gui.components.JHelpLabel",
      "org.jaxen.expr.NumberExpr",
      "org.jaxen.QualifiedName",
      "org.dom4j.dom.DOMComment",
      "org.pdfsam.guiclient.configuration.services.ConfigurationServiceLocator"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractDropper_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.pdfsam.guiclient.commons.dnd.droppers.AbstractDropper",
      "org.pdfsam.guiclient.commons.dnd.DnDSupportUtility",
      "org.pdfsam.guiclient.configuration.Configuration",
      "org.pdfsam.guiclient.commons.panels.JPdfSelectionPanel",
      "org.pdfsam.guiclient.commons.components.JPdfSelectionTable",
      "org.pdfsam.guiclient.configuration.services.ConfigurationServiceLocator",
      "org.pdfsam.guiclient.configuration.services.xml.XmlConfigurationService",
      "org.pdfsam.guiclient.commons.business.loaders.PdfLoader",
      "org.pdfsam.guiclient.commons.business.loaders.PdfLoaderExecutor",
      "org.pdfsam.guiclient.commons.models.AbstractPdfSelectionTableModel",
      "org.pdfsam.guiclient.commons.models.SimplePdfSelectionTableModel",
      "org.pdfsam.guiclient.commons.models.SortablePdfSelectionTableModel",
      "org.pdfsam.guiclient.commons.panels.CloseableTabbedPane",
      "org.pdfsam.guiclient.commons.panels.CloseableTabbedPane$CloseableMetalTabbedPaneUI",
      "org.pdfsam.guiclient.business.ClosableTabbedPanelAdder",
      "org.pdfsam.guiclient.commons.dnd.droppers.JVisualMultiSelectionDropper",
      "org.dom4j.DocumentFactory",
      "org.dom4j.tree.QNameCache",
      "org.dom4j.bean.BeanDocumentFactory",
      "org.dom4j.bean.BeanMetaData",
      "org.dom4j.util.SimpleSingleton",
      "org.dom4j.QName",
      "org.dom4j.tree.AbstractNode",
      "org.dom4j.tree.NamespaceCache",
      "org.dom4j.tree.ConcurrentReaderHashMap",
      "org.dom4j.tree.ConcurrentReaderHashMap$BarrierLock",
      "org.dom4j.tree.ConcurrentReaderHashMap$Entry",
      "org.dom4j.Namespace",
      "org.dom4j.tree.AbstractBranch",
      "org.dom4j.tree.AbstractElement",
      "org.dom4j.tree.DefaultElement",
      "org.dom4j.bean.BeanElement",
      "org.dom4j.bean.BeanAttributeList",
      "org.dom4j.tree.AbstractAttribute",
      "org.dom4j.bean.BeanAttribute",
      "org.pdfsam.guiclient.plugins.interfaces.AbstractPlugablePanel",
      "org.pdfsam.plugin.docinfo.GUI.DocInfoMainGUI",
      "org.pdfsam.guiclient.commons.dnd.droppers.JPdfSelectionTableDropper",
      "org.dom4j.xpath.DefaultXPath",
      "org.jaxen.BaseXPath",
      "org.jaxen.dom4j.Dom4jXPath",
      "org.jaxen.DefaultNavigator",
      "org.jaxen.dom4j.DocumentNavigator",
      "org.jaxen.dom4j.DocumentNavigator$Singleton",
      "org.jaxen.saxpath.helpers.XPathReaderFactory",
      "org.jaxen.saxpath.helpers.DefaultXPathHandler",
      "org.jaxen.saxpath.base.XPathReader",
      "org.jaxen.JaxenHandler",
      "org.jaxen.expr.DefaultXPathFactory",
      "org.jaxen.saxpath.base.XPathLexer",
      "org.jaxen.saxpath.base.Verifier",
      "org.jaxen.saxpath.base.Token",
      "org.jaxen.saxpath.SAXPathException",
      "org.jaxen.saxpath.XPathSyntaxException",
      "org.jaxen.JaxenException",
      "org.jaxen.XPathSyntaxException",
      "org.dom4j.InvalidXPathException",
      "org.dom4j.tree.DefaultNamespace",
      "org.dom4j.dom.DOMNamespace",
      "org.dom4j.util.IndexedElement",
      "org.dom4j.tree.BackedList",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.pdf.ByteBuffer",
      "com.lowagie.text.pdf.PdfName",
      "com.lowagie.text.pdf.IntHashtable",
      "com.lowagie.text.pdf.IntHashtable$Entry",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "com.lowagie.text.pdf.PdfEncodings$SymbolTTConversion",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "com.lowagie.text.pdf.PdfEncodings",
      "org.pdfsam.guiclient.commons.business.loaders.callable.AddPdfDocument",
      "org.pdfsam.guiclient.utils.filters.AbstractFileFilter",
      "org.pdfsam.guiclient.utils.filters.PdfFilter",
      "org.pdfsam.guiclient.commons.panels.CloseableTabbedPane$CloseTabIcon",
      "org.pdfsam.guiclient.commons.business.loaders.callable.ReloadPdfDocument",
      "org.dom4j.tree.BaseElement",
      "com.lowagie.text.pdf.PdfGraphics2D$HyperLinkKey",
      "org.dom4j.util.UserDataElement",
      "org.dom4j.util.NonLazyElement",
      "org.dom4j.xpath.XPathPattern",
      "org.jaxen.Context",
      "org.jaxen.ContextSupport",
      "org.jaxen.SimpleNamespaceContext",
      "org.jaxen.SimpleFunctionContext",
      "org.jaxen.function.BooleanFunction",
      "org.jaxen.QualifiedName",
      "org.jaxen.function.CeilingFunction",
      "org.jaxen.function.ConcatFunction",
      "org.jaxen.function.ContainsFunction",
      "org.jaxen.function.CountFunction",
      "org.jaxen.function.FalseFunction",
      "org.jaxen.function.FloorFunction",
      "org.jaxen.function.IdFunction",
      "org.jaxen.function.LangFunction",
      "org.jaxen.function.LastFunction",
      "org.jaxen.function.LocalNameFunction",
      "org.jaxen.function.NameFunction",
      "org.jaxen.function.NamespaceUriFunction",
      "org.jaxen.function.NormalizeSpaceFunction",
      "org.jaxen.function.NotFunction",
      "org.jaxen.function.NumberFunction",
      "org.jaxen.function.PositionFunction",
      "org.jaxen.function.RoundFunction",
      "org.jaxen.function.StartsWithFunction",
      "org.jaxen.function.StringFunction",
      "org.jaxen.function.StringLengthFunction",
      "org.jaxen.function.SubstringAfterFunction",
      "org.jaxen.function.SubstringBeforeFunction",
      "org.jaxen.function.SubstringFunction",
      "org.jaxen.function.SumFunction",
      "org.jaxen.function.TrueFunction",
      "org.jaxen.function.TranslateFunction",
      "org.jaxen.function.xslt.DocumentFunction",
      "org.jaxen.function.ext.EvaluateFunction",
      "org.jaxen.function.ext.LocaleFunctionSupport",
      "org.jaxen.function.ext.LowerFunction",
      "org.jaxen.function.ext.UpperFunction",
      "org.jaxen.function.ext.EndsWithFunction",
      "org.jaxen.XPathFunctionContext",
      "org.jaxen.SimpleVariableContext",
      "org.jaxen.pattern.PatternParser",
      "org.dom4j.dom.DOMDocumentFactory",
      "org.dom4j.dom.DOMElement",
      "org.jaxen.expr.DefaultExpr",
      "org.jaxen.expr.DefaultLocationPath",
      "org.jaxen.expr.DefaultRelativeLocationPath",
      "org.jaxen.expr.iter.IterableAxis",
      "org.jaxen.expr.iter.IterableChildAxis",
      "org.jaxen.expr.DefaultStep",
      "org.jaxen.expr.DefaultNameStep",
      "org.jaxen.expr.PredicateSet",
      "org.jaxen.expr.DefaultPathExpr",
      "org.jaxen.expr.DefaultXPathExpr",
      "org.dom4j.tree.AbstractDocumentType",
      "org.dom4j.tree.DefaultDocumentType",
      "org.dom4j.dom.DOMDocumentType",
      "org.dom4j.tree.AbstractDocument",
      "org.dom4j.tree.DefaultDocument",
      "org.dom4j.dom.DOMDocument",
      "org.dom4j.tree.AbstractProcessingInstruction",
      "org.dom4j.tree.FlyweightProcessingInstruction",
      "org.dom4j.tree.DefaultProcessingInstruction",
      "org.dom4j.tree.FlyweightAttribute",
      "org.dom4j.tree.DefaultAttribute",
      "org.dom4j.util.UserDataAttribute",
      "org.dom4j.tree.AbstractCharacterData",
      "org.dom4j.tree.AbstractText",
      "org.dom4j.tree.FlyweightText",
      "org.dom4j.tree.DefaultText",
      "org.dom4j.xpath.DefaultNamespaceContext",
      "org.jaxen.util.SingletonList",
      "org.dom4j.dom.DOMNodeHelper$EmptyNodeList",
      "org.dom4j.dom.DOMNodeHelper",
      "org.dom4j.tree.NamespaceStack",
      "org.dom4j.tree.AbstractCDATA",
      "org.dom4j.tree.FlyweightCDATA",
      "org.dom4j.tree.DefaultCDATA",
      "org.dom4j.tree.AbstractComment",
      "org.dom4j.tree.FlyweightComment",
      "org.dom4j.tree.DefaultComment",
      "org.dom4j.dom.DOMComment",
      "org.dom4j.tree.ContentListFacade",
      "org.jaxen.expr.DefaultBinaryExpr",
      "org.jaxen.expr.DefaultTruthExpr",
      "org.jaxen.expr.DefaultEqualityExpr",
      "org.jaxen.expr.DefaultEqualsExpr",
      "org.jaxen.saxpath.base.TokenTypes"
    );
  }
}
