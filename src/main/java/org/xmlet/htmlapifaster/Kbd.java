package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Kbd<Z extends Element> implements GlobalAttributes<Kbd<Z>, Z>, PhrasingContentChoice<Kbd<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Kbd(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementKbd(this);
   }

   public Kbd(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementKbd(this);
   }

   protected Kbd(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementKbd(this);
      }

   }

   public Z __() {
      this.visitor.visitParentKbd(this);
      return this.parent;
   }

   public final Kbd<Z> async(BiConsumer<Runnable, Kbd<Z>> var1) {
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
      return "kbd";
   }

   public final Kbd<Z> self() {
      return this;
   }
}
