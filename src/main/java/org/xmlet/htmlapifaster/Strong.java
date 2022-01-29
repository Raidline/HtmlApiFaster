package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Strong<Z extends Element> implements GlobalAttributes<Strong<Z>, Z>, PhrasingContentChoice<Strong<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Strong(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementStrong(this);
   }

   public Strong(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementStrong(this);
   }

   protected Strong(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementStrong(this);
      }

   }

   public Z __() {
      this.visitor.visitParentStrong(this);
      return this.parent;
   }

   public final Strong<Z> async(BiConsumer<Runnable, Strong<Z>> var1) {
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
      return "strong";
   }

   public final Strong<Z> self() {
      return this;
   }
}
