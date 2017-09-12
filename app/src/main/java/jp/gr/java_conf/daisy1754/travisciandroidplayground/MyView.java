package jp.gr.java_conf.daisy1754.travisciandroidplayground;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {

  public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  protected void onDetachedFromWindow() {
    // some nice code comes here
  }
}
