/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 09:17:29 GMT 2020
 */

package com.rakegroup;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.rakegroup.JoomlaOutput;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.FileSet;
import org.apache.tools.ant.types.TarFileSet;
import org.apache.tools.ant.types.ZipFileSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jdom.Content;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JoomlaOutput_ESTest extends JoomlaOutput_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JoomlaOutput.VectorElement joomlaOutput_VectorElement0 = new JoomlaOutput.VectorElement("yes");
      assertEquals("", joomlaOutput_VectorElement0.getNamespacePrefix());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JoomlaOutput.SimpleElement joomlaOutput_SimpleElement0 = null;
      try {
        joomlaOutput_SimpleElement0 = new JoomlaOutput.SimpleElement("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The name \"\" is not legal for JDOM/XML elements: XML names cannot be null or empty.
         //
         verifyException("org.jdom.Element", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JoomlaOutput.Files joomlaOutput_Files0 = new JoomlaOutput.Files();
      joomlaOutput_Files0.addText("vk>P");
      assertEquals("", joomlaOutput_Files0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      JoomlaOutput.Params joomlaOutput_Params0 = new JoomlaOutput.Params();
      joomlaOutput_Params0.addConfiguredParam(joomlaOutput_Param0);
      assertEquals("", joomlaOutput_Param0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setScope("pK@#O)PasF ?^");
      assertFalse(joomlaOutput_Param0.isRootElement());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JoomlaOutput.Files joomlaOutput_Files0 = new JoomlaOutput.Files();
      JoomlaOutput.Filename joomlaOutput_Filename0 = new JoomlaOutput.Filename();
      joomlaOutput_Files0.addConfiguredFilename(joomlaOutput_Filename0);
      assertEquals("filename", joomlaOutput_Filename0.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JoomlaOutput.Administration joomlaOutput_Administration0 = new JoomlaOutput.Administration();
      JoomlaOutput.Languages joomlaOutput_Languages0 = new JoomlaOutput.Languages();
      joomlaOutput_Administration0.addConfiguredLanguages(joomlaOutput_Languages0);
      assertEquals("", joomlaOutput_Languages0.getNamespacePrefix());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JoomlaOutput.Administration joomlaOutput_Administration0 = new JoomlaOutput.Administration();
      JoomlaOutput.Administration joomlaOutput_Administration1 = new JoomlaOutput.Administration();
      joomlaOutput_Administration0.addConfiguredAdministraton(joomlaOutput_Administration1);
      assertEquals("", joomlaOutput_Administration0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JoomlaOutput.Files joomlaOutput_Files0 = new JoomlaOutput.Files();
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      joomlaOutput_Install0.addConfiguredFiles(joomlaOutput_Files0);
      JoomlaOutput joomlaOutput0 = new JoomlaOutput();
      joomlaOutput0.addConfiguredInstall(joomlaOutput_Install0);
      ZipFileSet zipFileSet0 = new ZipFileSet();
      joomlaOutput_Files0.addConfiguredFileSet(zipFileSet0);
      // Undeclared exception!
      try { 
        joomlaOutput0.validate();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // No directory specified for ZipFileSet.
         //
         verifyException("org.apache.tools.ant.types.AbstractFileSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JoomlaOutput joomlaOutput0 = new JoomlaOutput();
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      joomlaOutput0.addConfiguredInstall(joomlaOutput_Install0);
      JoomlaOutput.Administration joomlaOutput_Administration0 = new JoomlaOutput.Administration();
      joomlaOutput_Administration0.addContent(")@cLel3`Pl~+rX");
      joomlaOutput_Install0.addConfiguredAdministraton(joomlaOutput_Administration0);
      // Undeclared exception!
      try { 
        joomlaOutput0.validate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.rakegroup.JoomlaOutput$SimpleElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JoomlaOutput joomlaOutput0 = new JoomlaOutput();
      // Undeclared exception!
      try { 
        joomlaOutput0.setOutput((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.rakegroup.JoomlaOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JoomlaOutput joomlaOutput0 = new JoomlaOutput();
      joomlaOutput0.setOutput("");
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      joomlaOutput0.addConfiguredInstall(joomlaOutput_Install0);
      joomlaOutput0.execute();
      // Undeclared exception!
      try { 
        joomlaOutput0.execute();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The element \"install\" could not be added as the root of the document: The Content already has an existing parent document
         //
         verifyException("org.jdom.ContentList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      JoomlaOutput.Files joomlaOutput_Files0 = new JoomlaOutput.Files();
      joomlaOutput_Install0.addConfiguredFiles(joomlaOutput_Files0);
      TarFileSet tarFileSet0 = new TarFileSet();
      joomlaOutput_Files0.addConfiguredFileSet(tarFileSet0);
      // Undeclared exception!
      try { 
        JoomlaOutput.SimpleElement.fixup((Project) null, joomlaOutput_Install0);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // No directory specified for TarFileSet.
         //
         verifyException("org.apache.tools.ant.types.AbstractFileSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JoomlaOutput.Files joomlaOutput_Files0 = new JoomlaOutput.Files();
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      joomlaOutput_Install0.addConfiguredFiles(joomlaOutput_Files0);
      JoomlaOutput.SimpleElement.fixup((Project) null, joomlaOutput_Install0);
      assertEquals("", joomlaOutput_Install0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JoomlaOutput joomlaOutput0 = new JoomlaOutput();
      joomlaOutput0.setOutput("");
      // Undeclared exception!
      try { 
        joomlaOutput0.validate();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // install not defined
         //
         verifyException("com.rakegroup.JoomlaOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JoomlaOutput.Files joomlaOutput_Files0 = new JoomlaOutput.Files();
      Vector<FileSet> vector0 = joomlaOutput_Files0.getFileSets();
      assertEquals(0, vector0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JoomlaOutput.Files joomlaOutput_Files0 = new JoomlaOutput.Files();
      JoomlaOutput.Filename joomlaOutput_Filename0 = new JoomlaOutput.Filename();
      joomlaOutput_Files0.update(joomlaOutput_Filename0, (FileSet) null);
      assertEquals("files", joomlaOutput_Files0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JoomlaOutput.Files joomlaOutput_Files0 = new JoomlaOutput.Files();
      FileSet fileSet0 = new FileSet();
      joomlaOutput_Files0.update((JoomlaOutput.Filename) null, fileSet0);
      JoomlaOutput.Filename joomlaOutput_Filename0 = new JoomlaOutput.Filename();
      // Undeclared exception!
      try { 
        joomlaOutput_Files0.update(joomlaOutput_Filename0, fileSet0);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // filename used in fileSet mode
         //
         verifyException("com.rakegroup.JoomlaOutput$Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JoomlaOutput.Files joomlaOutput_Files0 = new JoomlaOutput.Files();
      FileSet fileSet0 = new FileSet();
      JoomlaOutput.Filename joomlaOutput_Filename0 = new JoomlaOutput.Filename();
      // Undeclared exception!
      try { 
        joomlaOutput_Files0.update(joomlaOutput_Filename0, fileSet0);
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // FileSet used in filename mode
         //
         verifyException("com.rakegroup.JoomlaOutput$Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JoomlaOutput.Files joomlaOutput_Files0 = new JoomlaOutput.Files();
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      joomlaOutput_Install0.addConfiguredFiles(joomlaOutput_Files0);
      JoomlaOutput joomlaOutput0 = new JoomlaOutput();
      joomlaOutput0.addConfiguredInstall(joomlaOutput_Install0);
      ZipFileSet zipFileSet0 = new ZipFileSet();
      joomlaOutput_Files0.addConfiguredFileSet(zipFileSet0);
      // Undeclared exception!
      try { 
        joomlaOutput0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // No directory specified for ZipFileSet.
         //
         verifyException("org.apache.tools.ant.types.AbstractFileSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JoomlaOutput.Files joomlaOutput_Files0 = new JoomlaOutput.Files();
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      joomlaOutput_Install0.addConfiguredFiles(joomlaOutput_Files0);
      JoomlaOutput joomlaOutput0 = new JoomlaOutput();
      joomlaOutput0.addConfiguredInstall(joomlaOutput_Install0);
      joomlaOutput0.validate();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JoomlaOutput.Option joomlaOutput_Option0 = new JoomlaOutput.Option();
      joomlaOutput_Option0.addContent("%.SDx3g21");
      Project project0 = new Project();
      JoomlaOutput.SimpleElement.fixup(project0, joomlaOutput_Option0);
      assertEquals("option", joomlaOutput_Option0.getName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JoomlaOutput.SimpleElement.fixup((Project) null, (Content) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JoomlaOutput joomlaOutput0 = new JoomlaOutput();
      joomlaOutput0.setOverwrite(false);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JoomlaOutput joomlaOutput0 = new JoomlaOutput();
      joomlaOutput0.setOutput("efUk{Rl|{7!<q");
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      JoomlaOutput joomlaOutput0 = new JoomlaOutput();
      joomlaOutput0.addConfiguredInstall(joomlaOutput_Install0);
      joomlaOutput0.execute();
      // Undeclared exception!
      try { 
        joomlaOutput0.execute();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // file exists
         //
         verifyException("com.rakegroup.JoomlaOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JoomlaOutput joomlaOutput0 = new JoomlaOutput();
      joomlaOutput0.setOverwrite(true);
      // Undeclared exception!
      try { 
        joomlaOutput0.validate();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // install not defined
         //
         verifyException("com.rakegroup.JoomlaOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JoomlaOutput.Option joomlaOutput_Option0 = new JoomlaOutput.Option();
      joomlaOutput_Option0.setValue("attribute namespace");
      assertFalse(joomlaOutput_Option0.isRootElement());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JoomlaOutput.Files joomlaOutput_Files0 = new JoomlaOutput.Files();
      JoomlaOutput.Option joomlaOutput_Option0 = new JoomlaOutput.Option();
      joomlaOutput_Files0.addElement(joomlaOutput_Option0);
      assertEquals("", joomlaOutput_Files0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      JoomlaOutput.AuthorUrl joomlaOutput_AuthorUrl0 = new JoomlaOutput.AuthorUrl();
      joomlaOutput_Install0.addConfiguredAuthorUrl(joomlaOutput_AuthorUrl0);
      assertEquals("", joomlaOutput_AuthorUrl0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      joomlaOutput_Install0.setType("xXb1VBz(_bW");
      assertFalse(joomlaOutput_Install0.isRootElement());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      JoomlaOutput.Author joomlaOutput_Author0 = new JoomlaOutput.Author();
      joomlaOutput_Install0.addConfiguredAuthor(joomlaOutput_Author0);
      assertEquals("", joomlaOutput_Author0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      JoomlaOutput.Languages joomlaOutput_Languages0 = new JoomlaOutput.Languages();
      joomlaOutput_Install0.addConfiguredLanguages(joomlaOutput_Languages0);
      assertEquals("", joomlaOutput_Install0.getNamespacePrefix());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      JoomlaOutput.Description joomlaOutput_Description0 = new JoomlaOutput.Description();
      joomlaOutput_Install0.addConfiguredDescription(joomlaOutput_Description0);
      assertEquals("", joomlaOutput_Description0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      JoomlaOutput.Positions joomlaOutput_Positions0 = new JoomlaOutput.Positions();
      joomlaOutput_Install0.addConfiguredPositions(joomlaOutput_Positions0);
      assertFalse(joomlaOutput_Positions0.isRootElement());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      // Undeclared exception!
      try { 
        joomlaOutput_Install0.addConfiguredVersion((JoomlaOutput.Version) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add null object
         //
         verifyException("org.jdom.ContentList", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      JoomlaOutput.Params joomlaOutput_Params0 = new JoomlaOutput.Params();
      joomlaOutput_Install0.addConfiguredParams(joomlaOutput_Params0);
      assertEquals("params", joomlaOutput_Params0.getName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      JoomlaOutput.Name joomlaOutput_Name0 = new JoomlaOutput.Name();
      joomlaOutput_Install0.addConfiguredName(joomlaOutput_Name0);
      assertEquals("name", joomlaOutput_Name0.getName());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      JoomlaOutput.License joomlaOutput_License0 = new JoomlaOutput.License();
      joomlaOutput_Install0.addConfiguredLicense(joomlaOutput_License0);
      assertEquals("", joomlaOutput_Install0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      JoomlaOutput.AuthorEmail joomlaOutput_AuthorEmail0 = new JoomlaOutput.AuthorEmail();
      joomlaOutput_Install0.addConfiguredAuthorEmail(joomlaOutput_AuthorEmail0);
      assertEquals("", joomlaOutput_Install0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      joomlaOutput_Install0.setClient("5");
      assertFalse(joomlaOutput_Install0.isRootElement());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      JoomlaOutput.Copyright joomlaOutput_Copyright0 = new JoomlaOutput.Copyright();
      joomlaOutput_Install0.addConfiguredCopyright(joomlaOutput_Copyright0);
      assertEquals("install", joomlaOutput_Install0.getName());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      joomlaOutput_Install0.setVersion("boolean");
      assertFalse(joomlaOutput_Install0.isRootElement());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      JoomlaOutput.CreationDate joomlaOutput_CreationDate0 = new JoomlaOutput.CreationDate();
      joomlaOutput_Install0.addConfiguredCreationDate(joomlaOutput_CreationDate0);
      assertEquals("", joomlaOutput_CreationDate0.getNamespacePrefix());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JoomlaOutput.Files joomlaOutput_Files0 = new JoomlaOutput.Files();
      JoomlaOutput.Folder joomlaOutput_Folder0 = new JoomlaOutput.Folder();
      joomlaOutput_Files0.addConfiguredFolder(joomlaOutput_Folder0);
      assertEquals("files", joomlaOutput_Files0.getName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JoomlaOutput.Files joomlaOutput_Files0 = new JoomlaOutput.Files();
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      joomlaOutput_Install0.addConfiguredFiles(joomlaOutput_Files0);
      FileSet fileSet0 = new FileSet();
      joomlaOutput_Files0.update((JoomlaOutput.Filename) null, fileSet0);
      JoomlaOutput.SimpleElement.fixup((Project) null, joomlaOutput_Install0);
      assertEquals("", joomlaOutput_Install0.getNamespacePrefix());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JoomlaOutput.Files joomlaOutput_Files0 = new JoomlaOutput.Files();
      joomlaOutput_Files0.setFolder("V3");
      assertEquals("files", joomlaOutput_Files0.getName());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JoomlaOutput.Languages joomlaOutput_Languages0 = new JoomlaOutput.Languages();
      JoomlaOutput.Language joomlaOutput_Language0 = new JoomlaOutput.Language();
      joomlaOutput_Languages0.addConfiguredLanguage(joomlaOutput_Language0);
      assertFalse(joomlaOutput_Languages0.isRootElement());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JoomlaOutput.Languages joomlaOutput_Languages0 = new JoomlaOutput.Languages();
      joomlaOutput_Languages0.setFolder("Sj,r5}R");
      assertFalse(joomlaOutput_Languages0.isRootElement());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setId("&#x");
      assertEquals("", joomlaOutput_Param0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setRows("Sj,r5}R");
      assertFalse(joomlaOutput_Param0.isRootElement());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setNamE("The Content already has an existing parent \"");
      assertEquals("", joomlaOutput_Param0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setSection("");
      assertEquals("", joomlaOutput_Param0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setDirectory("&#x");
      assertEquals("param", joomlaOutput_Param0.getName());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setDescription("\"26Xko;l");
      assertFalse(joomlaOutput_Param0.isRootElement());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setExclude("(z>)%'s~lRw`AM*");
      assertFalse(joomlaOutput_Param0.isRootElement());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setStripext("qEQbR+0i@ovoV!J)(q?");
      assertEquals("param", joomlaOutput_Param0.getName());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setClient("pK@#O)PasF ?^");
      assertEquals("param", joomlaOutput_Param0.getName());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setHide_none("");
      assertEquals("", joomlaOutput_Param0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setType("N#<Amw");
      assertEquals("param", joomlaOutput_Param0.getName());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setCols("\"26Xko;l");
      assertEquals("", joomlaOutput_Param0.getNamespacePrefix());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JoomlaOutput.Option joomlaOutput_Option0 = new JoomlaOutput.Option();
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.addConfiguredOption(joomlaOutput_Option0);
      assertEquals("param", joomlaOutput_Param0.getName());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setDefault("+&l:M");
      assertFalse(joomlaOutput_Param0.isRootElement());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setHide_default("");
      assertEquals("", joomlaOutput_Param0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setMenu_type("file exists");
      assertFalse(joomlaOutput_Param0.isRootElement());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setState("\" could not be added as the root of the document: ");
      assertEquals("", joomlaOutput_Param0.getNamespacePrefix());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setLabel("\" could not be added to the element \"");
      assertEquals("param", joomlaOutput_Param0.getName());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setFilter("");
      assertEquals("", joomlaOutput_Param0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JoomlaOutput.Param joomlaOutput_Param0 = new JoomlaOutput.Param();
      joomlaOutput_Param0.setSize("");
      assertEquals("", joomlaOutput_Param0.getNamespacePrefix());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JoomlaOutput joomlaOutput0 = new JoomlaOutput();
      joomlaOutput0.setDocelement("@(#) $RCSfile: Comment.java,v $ $Revision: 1.33 $ $Date: 2007/11/10 05:28:58 $ $Name: jdom_1_1 $");
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JoomlaOutput joomlaOutput0 = new JoomlaOutput();
      joomlaOutput0.setDocpublic("");
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JoomlaOutput joomlaOutput0 = new JoomlaOutput();
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      joomlaOutput0.addConfiguredInstall(joomlaOutput_Install0);
      joomlaOutput0.execute();
      // Undeclared exception!
      try { 
        joomlaOutput0.validate();
        fail("Expecting exception: BuildException");
      
      } catch(BuildException e) {
         //
         // file exists
         //
         verifyException("com.rakegroup.JoomlaOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JoomlaOutput joomlaOutput0 = new JoomlaOutput();
      joomlaOutput0.setDocsystem("@I~j)^=H)cc9t1");
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JoomlaOutput.Administration joomlaOutput_Administration0 = new JoomlaOutput.Administration();
      JoomlaOutput.Files joomlaOutput_Files0 = new JoomlaOutput.Files();
      joomlaOutput_Administration0.addConfiguredFiles(joomlaOutput_Files0);
      assertEquals("", joomlaOutput_Administration0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JoomlaOutput.Positions joomlaOutput_Positions0 = new JoomlaOutput.Positions();
      JoomlaOutput.Position joomlaOutput_Position0 = new JoomlaOutput.Position();
      joomlaOutput_Positions0.addConfiguredPosition(joomlaOutput_Position0);
      assertFalse(joomlaOutput_Position0.isRootElement());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      JoomlaOutput.Version joomlaOutput_Version0 = new JoomlaOutput.Version();
      JoomlaOutput.Install joomlaOutput_Install0 = new JoomlaOutput.Install();
      joomlaOutput_Install0.addConfiguredVersion(joomlaOutput_Version0);
      assertFalse(joomlaOutput_Version0.isRootElement());
  }
}
