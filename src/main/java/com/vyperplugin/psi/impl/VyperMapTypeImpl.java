// This is a generated file. Not intended for manual editing.
package com.vyperplugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.vyperplugin.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class VyperMapTypeImpl extends ASTWrapperPsiElement implements VyperMapType {

  public VyperMapTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VyperVisitor visitor) {
    visitor.visitMapType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VyperVisitor) accept((VyperVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VyperListType getListType() {
    return findChildByClass(VyperListType.class);
  }

  @Override
  @Nullable
  public VyperMapType getMapType() {
    return findChildByClass(VyperMapType.class);
  }

  @Override
  @Nullable
  public VyperStructType getStructType() {
    return findChildByClass(VyperStructType.class);
  }

  @Override
  @NotNull
  public List<VyperUnitType> getUnitTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VyperUnitType.class);
  }

  @Override
  @NotNull
  public List<VyperValueType> getValueTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VyperValueType.class);
  }

}
