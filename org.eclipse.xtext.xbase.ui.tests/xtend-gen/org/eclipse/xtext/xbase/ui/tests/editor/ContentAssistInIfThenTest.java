/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xbase.ui.tests.editor;

import org.eclipse.xtext.xbase.junit.ui.AbstractXbaseContentAssistTest;
import org.eclipse.xtext.xbase.ui.tests.editor.ContentAssistTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class ContentAssistInIfThenTest extends ContentAssistTest {
  @Override
  protected String getPrefix() {
    return "if (true)";
  }
  
  @AfterClass
  public static void resetCastInstanceOf() {
    AbstractXbaseContentAssistTest.CAST_INSTANCEOF = new String[] { "as", "instanceof" };
  }
  
  @BeforeClass
  public static void addElseToCastInstanceOf() {
    AbstractXbaseContentAssistTest.CAST_INSTANCEOF = new String[] { "as", "else", "instanceof" };
  }
  
  @Override
  public void testOnStringLiteral_33() throws Exception {
    this.newBuilder().append("(\'\'.toString )").assertTextAtCursorPosition(")", this.expect(AbstractXbaseContentAssistTest.STRING_OPERATORS, new String[] { "as", "instanceof" }));
  }
  
  @Override
  public void testAfterBinaryOperation_06() throws Exception {
    this.newBuilder().append("((\'\'+\'\'))").assertTextAtCursorPosition("))", 1, this.expect(AbstractXbaseContentAssistTest.STRING_OPERATORS, new String[] { "as", "instanceof" }));
  }
  
  @Override
  public void testAfterBinaryOperation_07() throws Exception {
    this.newBuilder().append("((\'\'+\'\'))").assertTextAtCursorPosition("))", this.expect(AbstractXbaseContentAssistTest.STRING_OPERATORS, new String[] { "as", "instanceof" }));
  }
  
  @Override
  public void testOnVoidMethod_01() throws Exception {
    this.newBuilder().append("(null as java.util.List).clear ").assertText("else");
  }
}
