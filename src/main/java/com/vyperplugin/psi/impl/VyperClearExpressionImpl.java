// This is a generated file. Not intended for manual editing.
package com.vyperplugin.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.vyperplugin.psi.VyperClearExpression;
import com.vyperplugin.psi.VyperExpression;
import com.vyperplugin.psi.VyperVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class VyperClearExpressionImpl extends VyperExpressionImpl implements VyperClearExpression {

  public VyperClearExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VyperVisitor visitor) {
    visitor.visitClearExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VyperVisitor) accept((VyperVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VyperExpression getExpression() {
    return findChildByClass(VyperExpression.class);
  }

}
