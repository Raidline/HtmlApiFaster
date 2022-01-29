package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Progress<Z extends Element> implements GlobalAttributes<Progress<Z>, Z>, PhrasingContentWithoutProgressChoice<Progress<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Progress(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementProgress(this);
   }

   public Progress(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementProgress(this);
   }

   protected Progress(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementProgress(this);
      }

   }

   public Z __() {
      this.visitor.visitParentProgress(this);
      return this.parent;
   }

   public final Progress<Z> async(BiConsumer<Runnable, Progress<Z>> var1) {
      this.visitor.visitOpenAsync();
      ElementVisitor var10001 = this.visitor;
      this.visitor.getClass();
      var1.accept(var10001::visitCloseAsync, this);
      return this;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "progress";
   }

   public final Progress<Z> self() {
      return this;
   }

   public final Progress<Z> attrValue(Double attrValue) {
      this.visitor.visitAttributeValue(attrValue.toString());
      return this;
   }

   public final Progress<Z> attrMax(Double attrMax) {
      this.visitor.visitAttributeMax(attrMax.toString());
      return this;
   }
}
