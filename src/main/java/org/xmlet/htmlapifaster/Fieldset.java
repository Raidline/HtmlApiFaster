package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Fieldset<Z extends Element> implements GlobalAttributes<Fieldset<Z>, Z>, FieldsetChoice0<Fieldset<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Fieldset(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementFieldset(this);
   }

   public Fieldset(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementFieldset(this);
   }

   protected Fieldset(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementFieldset(this);
      }

   }

   public Z __() {
      this.visitor.visitParentFieldset(this);
      return this.parent;
   }

   public final Fieldset<Z> async(BiConsumer<Runnable, Fieldset<Z>> var1) {
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
      return "fieldset";
   }

   public final Fieldset<Z> self() {
      return this;
   }

   public final Fieldset<Z> attrDisabled(Boolean attrDisabled) {
      this.visitor.visitAttributeDisabled(attrDisabled.toString());
      return this;
   }

   public final Fieldset<Z> attrForm(String attrForm) {
      this.visitor.visitAttributeForm(attrForm);
      return this;
   }

   public final Fieldset<Z> attrName(String attrName) {
      this.visitor.visitAttributeName(attrName);
      return this;
   }
}
