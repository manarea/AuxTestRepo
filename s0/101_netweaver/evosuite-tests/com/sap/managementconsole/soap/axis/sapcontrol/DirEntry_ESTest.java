/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 07:51:53 GMT 2020
 */

package com.sap.managementconsole.soap.axis.sapcontrol;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sap.managementconsole.soap.axis.sapcontrol.DirEntry;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DirEntry_ESTest extends DirEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry((String) null, 2905L, (String) null);
      dirEntry0.hashCode();
      assertEquals(2905L, dirEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry();
      DirEntry dirEntry1 = new DirEntry((String) null, 2462L, (String) null);
      boolean boolean0 = dirEntry0.equals(dirEntry1);
      assertEquals(2462L, dirEntry1.getSize());
      assertFalse(dirEntry1.equals((Object)dirEntry0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry("KCl,&]`3s+Wl(2LfDD", 0L, ".))'S");
      dirEntry0.getSize();
      assertEquals("KCl,&]`3s+Wl(2LfDD", dirEntry0.getFilename());
      assertEquals(".))'S", dirEntry0.getModtime());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry((String) null, 1024L, (String) null);
      long long0 = dirEntry0.getSize();
      assertEquals(1024L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry("KCl,&]`3s+Wl(2LfDD", 0L, ".))'S");
      String string0 = dirEntry0.getModtime();
      assertEquals("KCl,&]`3s+Wl(2LfDD", dirEntry0.getFilename());
      assertEquals(".))'S", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry();
      dirEntry0.setModtime("");
      String string0 = dirEntry0.getModtime();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry("KCl,&]`3s+Wl(2LfDD", 0L, ".))'S");
      String string0 = dirEntry0.getFilename();
      assertEquals("KCl,&]`3s+Wl(2LfDD", string0);
      assertEquals(".))'S", dirEntry0.getModtime());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry("KCl,&]`3s+Wl(2LfDD", 0L, ".))'S");
      assertEquals("KCl,&]`3s+Wl(2LfDD", dirEntry0.getFilename());
      
      dirEntry0.setFilename("");
      dirEntry0.getFilename();
      assertEquals(".))'S", dirEntry0.getModtime());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry();
      String string0 = dirEntry0.getModtime();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry();
      String string0 = dirEntry0.getFilename();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry("\"g;", (-208L), "");
      long long0 = dirEntry0.getSize();
      assertEquals("", dirEntry0.getModtime());
      assertEquals((-208L), long0);
      assertEquals("\"g;", dirEntry0.getFilename());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry();
      dirEntry0.setFilename(" Z]rbb3Q,8");
      dirEntry0.hashCode();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry();
      DirEntry dirEntry1 = new DirEntry();
      assertTrue(dirEntry1.equals((Object)dirEntry0));
      
      dirEntry1.setModtime("Handling log4j.additivity.");
      boolean boolean0 = dirEntry1.equals(dirEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry();
      dirEntry0.setFilename("");
      DirEntry dirEntry1 = new DirEntry("", 0L, "Enter: DeserializationContext::endDocument()");
      boolean boolean0 = dirEntry0.equals(dirEntry1);
      assertEquals("", dirEntry1.getFilename());
      assertEquals("Enter: DeserializationContext::endDocument()", dirEntry1.getModtime());
      assertFalse(boolean0);
      assertFalse(dirEntry1.equals((Object)dirEntry0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry((String) null, 2905L, (String) null);
      DirEntry dirEntry1 = new DirEntry();
      boolean boolean0 = dirEntry0.equals(dirEntry1);
      assertFalse(boolean0);
      assertEquals(2905L, dirEntry0.getSize());
      assertFalse(dirEntry1.equals((Object)dirEntry0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry("auBhl3V", 2905L, "auBhl3V");
      DirEntry dirEntry1 = new DirEntry();
      boolean boolean0 = dirEntry0.equals(dirEntry1);
      assertFalse(dirEntry1.equals((Object)dirEntry0));
      assertEquals(2905L, dirEntry0.getSize());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry();
      DirEntry dirEntry1 = new DirEntry();
      boolean boolean0 = dirEntry0.equals(dirEntry1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry();
      boolean boolean0 = dirEntry0.equals(dirEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry();
      boolean boolean0 = dirEntry0.equals("20");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Object> class0 = Object.class;
      QName qName0 = new QName("CDATA");
      Serializer serializer0 = DirEntry.getSerializer("rbwQ%qP7)8Ep,p/6C,,", class0, qName0);
      assertEquals("Axis SAX Mechanism", serializer0.getMechanismType());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TypeDesc typeDesc0 = DirEntry.getTypeDesc();
      assertFalse(typeDesc0.hasAttributes());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Object> class0 = Object.class;
      QName qName0 = new QName("CDATA");
      Deserializer deserializer0 = DirEntry.getDeserializer("rbwQ%qP7)8Ep,p/6C,,", class0, qName0);
      assertEquals("Axis SAX Mechanism", deserializer0.getMechanismType());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry();
      dirEntry0.setModtime("20");
      dirEntry0.hashCode();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry();
      dirEntry0.setFilename(" Z]rbb3Q,8");
      DirEntry dirEntry1 = new DirEntry();
      boolean boolean0 = dirEntry1.equals(dirEntry0);
      assertFalse(boolean0);
      assertFalse(dirEntry0.equals((Object)dirEntry1));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry();
      dirEntry0.setSize(0L);
      assertNull(dirEntry0.getFilename());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DirEntry dirEntry0 = new DirEntry("o", (-33L), "o");
      DirEntry dirEntry1 = new DirEntry("o", (-33L), "o");
      boolean boolean0 = dirEntry1.equals(dirEntry0);
      assertTrue(boolean0);
      assertEquals((-33L), dirEntry1.getSize());
  }
}
