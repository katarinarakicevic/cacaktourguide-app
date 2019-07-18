package com.example.android.cacaktourguide;

/**
 * Created by Katarina on 25.8.2017.
 */

import java.util.ArrayList;

public class GroupInfo {

    private String name;
    private ArrayList<ChildInfo> list = new ArrayList<ChildInfo>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ChildInfo> gettypeList() {
        return list;
    }

    public void setProductList(ArrayList<ChildInfo> typeList) {
        this.list = typeList;
    }

}