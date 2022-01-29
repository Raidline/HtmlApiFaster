package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public class DetailsComplete<Z extends Element> implements CustomAttributeGroup<DetailsComplete<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public DetailsComplete(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
   }

   public DetailsComplete(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
   }

   protected DetailsComplete(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
   }

   public Z __() {
      this.visitor.visitParentDetailsComplete(this);
      return this.parent;
   }

   public final DetailsComplete<Z> async(BiConsumer<Runnable, DetailsComplete<Z>> var1) {
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
      return "details";
   }

   public final DetailsComplete<Z> self() {
      return this;
   }
}
