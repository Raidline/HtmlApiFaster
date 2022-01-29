package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Small<Z extends Element> implements GlobalAttributes<Small<Z>, Z>, PhrasingContentChoice<Small<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Small(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSmall(this);
   }

   public Small(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSmall(this);
   }

   protected Small(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSmall(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSmall(this);
      return this.parent;
   }

   public final Small<Z> async(BiConsumer<Runnable, Small<Z>> var1) {
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
      return "small";
   }

   public final Small<Z> self() {
      return this;
   }
}
