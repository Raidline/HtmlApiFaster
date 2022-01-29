package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Root<Z extends Element> implements CustomAttributeGroup<Root<Z>, Z>, TransparentContentChoice<Root<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Root(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementRoot(this);
   }

   public Root(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementRoot(this);
   }

   protected Root(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementRoot(this);
      }

   }

   public Z __() {
      this.visitor.visitParentRoot(this);
      return this.parent;
   }

   public final Root<Z> async(BiConsumer<Runnable, Root<Z>> var1) {
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
      return "root";
   }

   public final Root<Z> self() {
      return this;
   }
}
