/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 08:47:56 GMT 2020
 */

package weka.core.tokenizers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.core.tokenizers.AlphabeticTokenizer;
import weka.core.tokenizers.Tokenizer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AlphabeticTokenizer_ESTest extends AlphabeticTokenizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AlphabeticTokenizer alphabeticTokenizer0 = new AlphabeticTokenizer();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "'";
      stringArray0[1] = "Can't normalize array. Sum is zero.";
      stringArray0[2] = "weka.core.Utils";
      stringArray0[3] = "weka.core.tokenizers.AlphabeticTokenizer";
      stringArray0[4] = "BIf(R5-6DxR>(xE";
      Tokenizer.runTokenizer(alphabeticTokenizer0, stringArray0);
      char[] charArray0 = new char[0];
      alphabeticTokenizer0.m_Str = charArray0;
      // Undeclared exception!
      try { 
        alphabeticTokenizer0.nextElement();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No more tokens present
         //
         verifyException("weka.core.tokenizers.AlphabeticTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AlphabeticTokenizer alphabeticTokenizer0 = new AlphabeticTokenizer();
      alphabeticTokenizer0.tokenize("}7ZRuAz");
      boolean boolean0 = alphabeticTokenizer0.hasMoreElements();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AlphabeticTokenizer alphabeticTokenizer0 = new AlphabeticTokenizer();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "'";
      stringArray0[1] = "Can't normalize array. Sum is zero.";
      stringArray0[2] = "weka.core.Utils";
      stringArray0[3] = "weka.core.tokenizers.AlphabeticTokenizer";
      stringArray0[4] = "BIf(R5-6DxR>(xE";
      Tokenizer.runTokenizer(alphabeticTokenizer0, stringArray0);
      char[] charArray0 = new char[0];
      alphabeticTokenizer0.m_Str = charArray0;
      boolean boolean0 = alphabeticTokenizer0.hasMoreElements();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AlphabeticTokenizer alphabeticTokenizer0 = new AlphabeticTokenizer();
      // Undeclared exception!
      try { 
        alphabeticTokenizer0.tokenize((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.tokenizers.AlphabeticTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AlphabeticTokenizer alphabeticTokenizer0 = new AlphabeticTokenizer();
      // Undeclared exception!
      try { 
        alphabeticTokenizer0.nextElement();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.tokenizers.AlphabeticTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AlphabeticTokenizer alphabeticTokenizer0 = new AlphabeticTokenizer();
      alphabeticTokenizer0.tokenize("ODR`b@9mEMSt*Lp");
      alphabeticTokenizer0.m_CurrentPos = (-1);
      // Undeclared exception!
      try { 
        alphabeticTokenizer0.nextElement();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("weka.core.tokenizers.AlphabeticTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AlphabeticTokenizer alphabeticTokenizer0 = new AlphabeticTokenizer();
      // Undeclared exception!
      try { 
        alphabeticTokenizer0.hasMoreElements();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AlphabeticTokenizer alphabeticTokenizer0 = new AlphabeticTokenizer();
      alphabeticTokenizer0.tokenize("[");
      alphabeticTokenizer0.m_CurrentPos = (-3664);
      // Undeclared exception!
      try { 
        alphabeticTokenizer0.hasMoreElements();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AlphabeticTokenizer alphabeticTokenizer0 = new AlphabeticTokenizer();
      alphabeticTokenizer0.tokenize("7ZRuhz-");
      Object object0 = alphabeticTokenizer0.nextElement();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[2];
      AlphabeticTokenizer.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AlphabeticTokenizer alphabeticTokenizer0 = new AlphabeticTokenizer();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-delimiters";
      stringArray0[1] = "zmxs5wB.";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "weka.core.tokenizers.AlphabeticTokenizer";
      stringArray0[5] = "P^VT95qt=+~TZK";
      stringArray0[6] = "";
      stringArray0[7] = "";
      Tokenizer.tokenize((Tokenizer) alphabeticTokenizer0, stringArray0);
      // Undeclared exception!
      try { 
        alphabeticTokenizer0.nextElement();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No more tokens present
         //
         verifyException("weka.core.tokenizers.AlphabeticTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AlphabeticTokenizer alphabeticTokenizer0 = new AlphabeticTokenizer();
      String string0 = alphabeticTokenizer0.getRevision();
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AlphabeticTokenizer alphabeticTokenizer0 = new AlphabeticTokenizer();
      String string0 = alphabeticTokenizer0.globalInfo();
      assertEquals("Alphabetic string tokenizer, tokens are to be formed only from contiguous alphabetic sequences.", string0);
  }
}
