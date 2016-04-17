/*
 * Copyright 2013-2016 Grzegorz Ligas <ligasgr@gmail.com> and other contributors
 * (see the CONTRIBUTORS file).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.xquery.psi.XQueryTypes.*;
import org.intellij.xquery.psi.*;

public class XQueryDirectConstructorImpl extends XQueryPsiElementImpl implements XQueryDirectConstructor {

  public XQueryDirectConstructorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XQueryVisitor visitor) {
    visitor.visitDirectConstructor(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XQueryVisitor) accept((XQueryVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XQueryDirCommentConstructor getDirCommentConstructor() {
    return findChildByClass(XQueryDirCommentConstructor.class);
  }

  @Override
  @Nullable
  public XQueryDirPIConstructor getDirPIConstructor() {
    return findChildByClass(XQueryDirPIConstructor.class);
  }

  @Override
  @Nullable
  public XQueryXmlEmptyTag getXmlEmptyTag() {
    return findChildByClass(XQueryXmlEmptyTag.class);
  }

  @Override
  @Nullable
  public XQueryXmlFullTag getXmlFullTag() {
    return findChildByClass(XQueryXmlFullTag.class);
  }

}
