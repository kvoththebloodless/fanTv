// Generated code from Butter Knife. Do not modify!
package com.example.kvoththebloodless.fantv;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  @UiThread
  public MainActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.tooly = Utils.findRequiredViewAsType(source, R.id.tooly, "field 'tooly'", Toolbar.class);
    target.recycler = Utils.findRequiredViewAsType(source, R.id.popularlist, "field 'recycler'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.tooly = null;
    target.recycler = null;

    this.target = null;
  }
}
