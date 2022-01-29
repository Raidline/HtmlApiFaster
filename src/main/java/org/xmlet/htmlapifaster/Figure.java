package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Figure<Z extends Element> implements GlobalAttributes<Figure<Z>, Z>, FigureChoice0<Figure<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Figure(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementFigure(this);
   }

   public Figure(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementFigure(this);
   }

   protected Figure(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementFigure(this);
      }

   }

   public Z __() {
      this.visitor.visitParentFigure(this);
      return this.parent;
   }

   public final Figure<Z> async(BiConsumer<Runnable, Figure<Z>> var1) {
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
      return "figure";
   }

   public final Figure<Z> self() {
      return this;
   }
}
