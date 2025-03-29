package com.example.happyticket;

import android.content.Intent;
import android.widget.TextView;

public class EditCategoryCalculateLogic {

    private StringBuilder inputStr = new StringBuilder();

    private State state;

    private enum State {
        inputArgs,
        resultShow
    }

    public EditCategoryCalculateLogic() {
        state = State.inputArgs;
    }

    public void onNumPressed(int buttonId) {
        if (state == State.resultShow){
            state = State.inputArgs;
        }

        if (inputStr.length() < 7) {
            if (buttonId == R.id.zero){
                if (inputStr.length() !=0){
                    inputStr.append("0");}}
            if (buttonId == R.id.one){inputStr.append("1");}
            if (buttonId == R.id.two){inputStr.append("2");}
            if (buttonId == R.id.three){inputStr.append("3");}
            if (buttonId == R.id.four){inputStr.append("4");}
            if (buttonId == R.id.five){inputStr.append("5");}
            if (buttonId == R.id.six){inputStr.append("6");}
            if (buttonId == R.id.seven){inputStr.append("7");}
            if (buttonId == R.id.eight){inputStr.append("8");}
            if (buttonId == R.id.nine){inputStr.append("9");}
        } else {
            inputStr.setLength(0);
        }
    }
    public void onActionPressed(int actionId) {
        if (actionId == R.id.clear) {
            if (inputStr.length() != 0) {
                String text = getText();
                text = text.substring(0, text.length() - 1);
                inputStr.setLength(0);
                inputStr.append(text);
            }
        }

        if (actionId == R.id.dot) {inputStr.append(".");}
    }

    public String getText() {
        return inputStr.toString();
    }
    public String removeLast(String str){
        str.substring(0,str.length()-1);
    return str;
    }
}
