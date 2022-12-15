package com.example.kalkulatoruas13917;

public class ItemList {
    private final String mNumber1;
    private final String mOperation;
    private final String mNumber2;
    private final String mResult;

    public ItemList(String number1, String operation, String number2, String result) {
        mNumber1 = number1;
        mOperation = operation;
        mNumber2 = number2;
        mResult = result;
    }

    public String getNumber1() {
        return mNumber1;
    }

    public String getOperation() {
        return mOperation;
    }

    public String getNumber2() {
        return mNumber2;
    }

    public String getResult() {
        return mResult;
    }
}

