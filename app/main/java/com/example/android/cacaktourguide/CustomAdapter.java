package com.example.android.cacaktourguide;

/**
 * Created by Katarina on 25.8.2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ArrayList;



public class CustomAdapter extends BaseExpandableListAdapter {

    private Context context;
    private ArrayList<GroupInfo> typeList;

    public CustomAdapter(Context context, ArrayList<GroupInfo> typeList) {
        this.context = context;
        this.typeList = typeList;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        ArrayList<ChildInfo> productList = typeList.get(groupPosition).gettypeList();
        return productList.get(childPosition);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild,
                             View view, ViewGroup parent) {

        ChildInfo detailInfo = (ChildInfo) getChild(groupPosition, childPosition);
        if (view == null) {
            LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = infalInflater.inflate(R.layout.child_items, null);
        }

        TextView sequence = (TextView) view.findViewById(R.id.sequence);
        sequence.setText(detailInfo.getSequence().trim() + ". ");
        TextView childItem = (TextView) view.findViewById(R.id.childItem);
        childItem.setText(detailInfo.getName().trim());

        return view;
    }

    @Override
    public int getChildrenCount(int groupPosition) {

        ArrayList<ChildInfo> productList = typeList.get(groupPosition).gettypeList();
        return productList.size();

    }

    @Override
    public Object getGroup(int groupPosition) {
        return typeList.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return typeList.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isLastChild, View view,
                             ViewGroup parent) {

        GroupInfo headerInfo = (GroupInfo) getGroup(groupPosition);
        if (view == null) {
            LayoutInflater inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inf.inflate(R.layout.group_items, null);
        }

        TextView heading = (TextView) view.findViewById(R.id.heading);
        heading.setText(headerInfo.getName().trim());

        return view;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

}
