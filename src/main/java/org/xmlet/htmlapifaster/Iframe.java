package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Iframe<Z extends Element> implements GlobalAttributes<Iframe<Z>, Z>, TextGroup<Iframe<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Iframe(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementIframe(this);
   }

   public Iframe(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementIframe(this);
   }

   protected Iframe(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementIframe(this);
      }

   }

   public Z __() {
      this.visitor.visitParentIframe(this);
      return this.parent;
   }

   public final Iframe<Z> async(BiConsumer<Runnable, Iframe<Z>> var1) {
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
      return "iframe";
   }

   public final Iframe<Z> self() {
      return this;
   }

   public final Iframe<Z> attrSrc(String attrSrc) {
      this.visitor.visitAttributeSrc(attrSrc);
      return this;
   }

   public final Iframe<Z> attrSrcDoc(String attrSrcDoc) {
      this.visitor.visitAttributeSrcDoc(attrSrcDoc);
      return this;
   }

   public final Iframe<Z> attrName(String attrName) {
      this.visitor.visitAttributeName(attrName);
      return this;
   }

   public final Iframe<Z> attrSandbox(EnumSandboxType attrSandbox) {
      this.visitor.visitAttributeSandbox(attrSandbox.getValue());
      return this;
   }

   public final Iframe<Z> attrAllowfullscreen(Boolean attrAllowfullscreen) {
      this.visitor.visitAttributeAllowfullscreen(attrAllowfullscreen.toString());
      return this;
   }

   public final Iframe<Z> attrAllowpaymentrequest(Boolean attrAllowpaymentrequest) {
      this.visitor.visitAttributeAllowpaymentrequest(attrAllowpaymentrequest.toString());
      return this;
   }

   public final Iframe<Z> attrWidth(String attrWidth) {
      this.visitor.visitAttributeWidth(attrWidth);
      return this;
   }

   public final Iframe<Z> attrHeight(String attrHeight) {
      this.visitor.visitAttributeHeight(attrHeight);
      return this;
   }

   public final Iframe<Z> attrReferrerpolicy(String attrReferrerpolicy) {
      this.visitor.visitAttributeReferrerpolicy(attrReferrerpolicy);
      return this;
   }
}
