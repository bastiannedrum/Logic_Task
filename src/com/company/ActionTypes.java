package com.company;

interface ActionType
{
    String run(String str);
}

public class ActionTypes
{
    String actionValue;
    String actionType;
    //ActionType actionType;


    public ActionTypes(String actionValue, String actionType) {
        this.actionValue = actionValue;
        this.actionType = actionType;
    }
}
