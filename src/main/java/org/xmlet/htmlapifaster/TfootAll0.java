package org.xmlet.htmlapifaster;

public interface TfootAll0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Tr<T> tr() {
      return new Tr(this.self());
   }
}
