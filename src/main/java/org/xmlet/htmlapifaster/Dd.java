package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Dd<Z extends Element> implements GlobalAttributes<Dd<Z>, Z>, FlowContentChoice<Dd<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Dd(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementDd(this);
   }

   public Dd(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementDd(this);
   }

   protected Dd(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementDd(this);
      }

   }

   public Z __() {
      this.visitor.visitParentDd(this);
      return this.parent;
   }

   public final Dd<Z> async(BiConsumer<Runnable, Dd<Z>> var1) {
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
      return "dd";
   }

   public final Dd<Z> self() {
      return this;
   }
}
