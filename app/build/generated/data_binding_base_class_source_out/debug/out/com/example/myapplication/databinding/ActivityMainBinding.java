// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button button2;

  @NonNull
  public final EditText caras;

  @NonNull
  public final EditText dados;

  @NonNull
  public final TextView resultadosTiradas;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView totalTiradas;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull Button button2,
      @NonNull EditText caras, @NonNull EditText dados, @NonNull TextView resultadosTiradas,
      @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView totalTiradas) {
    this.rootView = rootView;
    this.button2 = button2;
    this.caras = caras;
    this.dados = dados;
    this.resultadosTiradas = resultadosTiradas;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.totalTiradas = totalTiradas;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.caras;
      EditText caras = ViewBindings.findChildViewById(rootView, id);
      if (caras == null) {
        break missingId;
      }

      id = R.id.dados;
      EditText dados = ViewBindings.findChildViewById(rootView, id);
      if (dados == null) {
        break missingId;
      }

      id = R.id.resultadosTiradas;
      TextView resultadosTiradas = ViewBindings.findChildViewById(rootView, id);
      if (resultadosTiradas == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.totalTiradas;
      TextView totalTiradas = ViewBindings.findChildViewById(rootView, id);
      if (totalTiradas == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, button2, caras, dados,
          resultadosTiradas, textView3, textView4, totalTiradas);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
