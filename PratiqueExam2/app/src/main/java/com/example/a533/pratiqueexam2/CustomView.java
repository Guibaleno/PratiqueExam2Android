package com.example.a533.pratiqueexam2;

import android.content.Context;
import android.view.View;

public class CustomView extends View {
    String password = "0101";
    String currentInput;
    OnSuccessPasswordListener onSuccessPasswordListener;
    public CustomView(Context context) {
        super(context);
    }


    public void setInput(String input)
    {
        currentInput += input;
        if (currentInput.length() == 4)
        {
            if (currentInput.equals(password))
            {
                this.onSuccessPasswordListener.onSucessPassword();
            }
        }
    }

    void setOnSucessPasswordListener(OnSuccessPasswordListener onSucessPasswordListener)
    {
        this.onSuccessPasswordListener = onSucessPasswordListener;
    }

    interface OnSuccessPasswordListener{
        void onSucessPassword();
    }
}
