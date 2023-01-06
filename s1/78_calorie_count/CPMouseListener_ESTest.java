/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 10:10:48 GMT 2020
 */

package com.lts.swing.contentpanel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.swing.TextContentPanel;
import com.lts.swing.contentpanel.CPMouseListener;
import com.lts.swing.contentpanel.ContentPanel;
import com.lts.swing.contentpanel.SimpleMouseListener;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.math.RoundingMode;
import javax.swing.JPopupMenu;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CPMouseListener_ESTest extends CPMouseListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", 0, "");
      CPMouseListener cPMouseListener0 = new CPMouseListener(textContentPanel0);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(textContentPanel0, 0, (-1L), (-1400), 2, 10, 1, 1, 3, true, 0, 1844, (-1560), (-1756.0887048186166));
      cPMouseListener0.mouseClicked(mouseWheelEvent0);
      assertEquals(0, mouseWheelEvent0.getButton());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("com.lts.swing.contentpanel.CPMouseListener", 0, "}$");
      CPMouseListener cPMouseListener0 = new CPMouseListener(textContentPanel0);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(textContentPanel0, (-265), 3, 223, 2, 1024, 0, false, 3, 20, 0);
      cPMouseListener0.singleMouseClick(mouseWheelEvent0);
      assertTrue(mouseWheelEvent0.isMetaDown());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", 240, "com.lts.swing.TextContentPanel");
      CPMouseListener cPMouseListener0 = textContentPanel0.getMouseListener();
      MouseEvent mouseEvent0 = new MouseEvent(textContentPanel0, 0, (-1L), (-1), 0, 2, 240, false);
      cPMouseListener0.doubleMouseClick(mouseEvent0);
      assertEquals((-2147483585), mouseEvent0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("?&CI[e_", 1100, "?&CI[e_");
      CPMouseListener cPMouseListener0 = textContentPanel0.getMouseListener();
      MouseEvent mouseEvent0 = new MouseEvent(textContentPanel0, 9, 2, 4, 5, 0, 3, true, 1);
      mouseEvent0.setSource("?&CI[e_");
      // Undeclared exception!
      try { 
        cPMouseListener0.mouseReleased(mouseEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.awt.Component
         //
         verifyException("com.lts.swing.contentpanel.CPMouseListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("LW/p/_A>C;l[u", 2744, "LW/p/_A>C;l[u");
      CPMouseListener cPMouseListener0 = textContentPanel0.getMouseListener();
      // Undeclared exception!
      try { 
        cPMouseListener0.mousePressed((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.swing.contentpanel.CPMouseListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("0hqtv.M(bAKwOB9.", (-6), "0hqtv.M(bAKwOB9.");
      CPMouseListener cPMouseListener0 = textContentPanel0.getMouseListener();
      MouseEvent mouseEvent0 = new MouseEvent(textContentPanel0, 0, (-6), 2, 3, 1146, (-6), true);
      mouseEvent0.setSource(cPMouseListener0);
      // Undeclared exception!
      try { 
        cPMouseListener0.mousePressed(mouseEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.lts.swing.contentpanel.CPMouseListener cannot be cast to java.awt.Component
         //
         verifyException("com.lts.swing.contentpanel.CPMouseListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("0hqtv.M(bAKwOB98", (-6), "0hqtv.M(bAKwOB98");
      CPMouseListener cPMouseListener0 = textContentPanel0.getMouseListener();
      // Undeclared exception!
      try { 
        cPMouseListener0.mouseClicked((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.swing.contentpanel.CPMouseListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("9b", 0, (String) null);
      CPMouseListener cPMouseListener0 = new CPMouseListener(textContentPanel0);
      // Undeclared exception!
      try { 
        cPMouseListener0.maybeShowPopup((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.swing.contentpanel.CPMouseListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("rr.", 5, "rr.");
      CPMouseListener cPMouseListener0 = textContentPanel0.getMouseListener();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(textContentPanel0, 2, 1, 1, 1, 4, 2, 2, 2, true, 3, 3, 2, 2);
      RoundingMode roundingMode0 = RoundingMode.HALF_EVEN;
      mouseWheelEvent0.setSource(roundingMode0);
      // Undeclared exception!
      try { 
        cPMouseListener0.maybeShowPopup(mouseWheelEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.math.RoundingMode cannot be cast to java.awt.Component
         //
         verifyException("com.lts.swing.contentpanel.CPMouseListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("<?L;)HNvi(z~ba", (-2498), "Li1QkL4K3");
      CPMouseListener cPMouseListener0 = new CPMouseListener(textContentPanel0);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(textContentPanel0, 3040, (-4380L), 0, 3, 3, (-2498), 4, 2, true, 0, 2308, 0);
      cPMouseListener0.maybeShowPopup(mouseWheelEvent0);
      assertEquals(2308, mouseWheelEvent0.getScrollAmount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", 240, "com.lts.swing.TextContentPanel");
      CPMouseListener cPMouseListener0 = textContentPanel0.getMouseListener();
      MouseEvent mouseEvent0 = new MouseEvent(textContentPanel0, 0, (-1L), (-1), 0, 2, 240, false);
      cPMouseListener0.maybeShowPopup(mouseEvent0);
      assertEquals(0, mouseEvent0.getID());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("RjrjaV:v`F3XQCS)z:]", 2745, "RjrjaV:v`F3XQCS)z:]");
      CPMouseListener cPMouseListener0 = textContentPanel0.getMouseListener();
      cPMouseListener0.showPopup(textContentPanel0, 2, 0);
      assertEquals(3, ContentPanel.BOTTOM_PANEL_YES_NO_CANCEL);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPMouseListener cPMouseListener0 = new CPMouseListener((SimpleMouseListener) null);
      JPopupMenu jPopupMenu0 = new JPopupMenu("");
      // Undeclared exception!
      try { 
        cPMouseListener0.showPopup(jPopupMenu0, (-268), (-268));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.swing.contentpanel.CPMouseListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("X", 2734, "X");
      CPMouseListener cPMouseListener0 = textContentPanel0.getMouseListener();
      // Undeclared exception!
      try { 
        cPMouseListener0.doubleMouseClick((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.swing.contentpanel.CPMouseListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", 2741, "");
      CPMouseListener cPMouseListener0 = textContentPanel0.getMouseListener();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(textContentPanel0, 4, 10, 0, 3, 4, 0, false, 10, 2, 3);
      cPMouseListener0.mouseClicked(mouseWheelEvent0);
      assertEquals(0, mouseWheelEvent0.getXOnScreen());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("[3+bB^+a){RhjfU|9", 0, "N;%,+/-&_%uEllw<Bu-");
      CPMouseListener cPMouseListener0 = textContentPanel0.getMouseListener();
      MouseEvent mouseEvent0 = new MouseEvent(textContentPanel0, 3, 3, 92, 2, 10, 0, false);
      cPMouseListener0.mouseReleased(mouseEvent0);
      assertEquals(3, mouseEvent0.getID());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", 0, "The system has encountered an severe error that has prevented it starting up.  This is probably the result of a bug or other problem that is beyond your control.  The details button may provide information that will help in resolving the problem so you may wish to copy the contents of that window and include it in any bug reports, etc.");
      CPMouseListener cPMouseListener0 = textContentPanel0.getMouseListener();
      cPMouseListener0.showPopup((Component) null, 2087, 1433);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("com.lts.swing.contentpanel.CPMouseListener", 2744, "com.lts.swing.contentpanel.CPMouseListener");
      CPMouseListener cPMouseListener0 = textContentPanel0.getMouseListener();
      // Undeclared exception!
      try { 
        cPMouseListener0.mouseReleased((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.swing.contentpanel.CPMouseListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("%&UJo2Scvb<X>IP&", 2729, "TL)9pA");
      CPMouseListener cPMouseListener0 = textContentPanel0.getMouseListener();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(textContentPanel0, 0, 1052L, 2, 20, (-126), 2, true, 4, (-70), 1);
      cPMouseListener0.mouseClicked(mouseWheelEvent0);
      assertEquals(0, mouseWheelEvent0.getButton());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", (-679), "");
      CPMouseListener cPMouseListener0 = textContentPanel0.getMouseListener();
      // Undeclared exception!
      try { 
        cPMouseListener0.singleMouseClick((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.swing.contentpanel.CPMouseListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("0hqtv.M(bAKwOB9.", (-6), "0hqtv.M(bAKwOB9.");
      CPMouseListener cPMouseListener0 = textContentPanel0.getMouseListener();
      MouseEvent mouseEvent0 = new MouseEvent(textContentPanel0, 0, (-6), 2, 3, 1146, (-6), true);
      cPMouseListener0.mousePressed(mouseEvent0);
      assertEquals(3, mouseEvent0.getX());
  }
}
