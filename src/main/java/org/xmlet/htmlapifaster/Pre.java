package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Pre<Z extends Element> implements GlobalAttributes<Pre<Z>, Z>, PhrasingContentChoice<Pre<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Pre(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementPre(this);
   }

   public Pre(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementPre(this);
   }

   protected Pre(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementPre(this);
      }

   }

   public Z __() {
      this.visitor.visitParentPre(this);
      return this.parent;
   }

   public final Pre<Z> async(BiConsumer<Runnable, Pre<Z>> var1) {
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
      return "pre";
   }

   public final Pre<Z> self() {
      return this;
   }
}
