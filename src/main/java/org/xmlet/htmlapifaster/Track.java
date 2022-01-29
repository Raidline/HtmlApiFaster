package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Track<Z extends Element> implements GlobalAttributes<Track<Z>, Z>, TextGroup<Track<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Track(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTrack(this);
   }

   public Track(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTrack(this);
   }

   protected Track(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTrack(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTrack(this);
      return this.parent;
   }

   public final Track<Z> async(BiConsumer<Runnable, Track<Z>> var1) {
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
      return "track";
   }

   public final Track<Z> self() {
      return this;
   }

   public final Track<Z> attrKind(EnumKindType attrKind) {
      this.visitor.visitAttributeKind(attrKind.getValue());
      return this;
   }

   public final Track<Z> attrSrc(String attrSrc) {
      this.visitor.visitAttributeSrc(attrSrc);
      return this;
   }

   public final Track<Z> attrSrclang(String attrSrclang) {
      this.visitor.visitAttributeSrclang(attrSrclang);
      return this;
   }

   public final Track<Z> attrLabel(String attrLabel) {
      this.visitor.visitAttributeLabel(attrLabel);
      return this;
   }

   public final Track<Z> attrDefault(Boolean attrDefault) {
      this.visitor.visitAttributeDefault(attrDefault.toString());
      return this;
   }
}
