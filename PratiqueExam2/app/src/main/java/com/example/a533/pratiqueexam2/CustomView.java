package com.example.a533.pratiqueexam2;

import android.content.Context;
import android.view.View;

public class CustomView extends View {
    public CustomView(Context context) {
        super(context);
    }
    static String password = "0101";
    static String currentInput;
    static OnSuccessPasswordListener onSuccessPasswordListener;

    public static void setInput(String input)
    {
        currentInput += input;
        if (currentInput.length() == 4)
        {
            if (currentInput.equals(password))
            {
                onSuccessPasswordListener.onSucessPassword();
            }
        }
    }

    static void setOnSucessPasswordListener(OnSuccessPasswordListener onSucessPasswordListener)
    {
        onSuccessPasswordListener = onSucessPasswordListener;
    }

    interface OnSuccessPasswordListener{
        void onSucessPassword();
    }
}
