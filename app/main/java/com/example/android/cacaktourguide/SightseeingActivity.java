package com.example.android.cacaktourguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import android.view.View.OnClickListener;

public class SightseeingActivity extends AppCompatActivity{

    private LinkedHashMap<String, GroupInfo> subjects = new LinkedHashMap<String, GroupInfo>();
    private ArrayList<GroupInfo> typeList = new ArrayList<GroupInfo>();
    public final static String EXTRA_MESSAGE = "com.example.ListViewTest.MESSAGE";
    private CustomAdapter listAdapter;
    private ExpandableListView simpleExpandableListView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sightseeing);

        // add data for displaying in expandable list view
        loadData();

        //get reference of the ExpandableListView
        simpleExpandableListView = (ExpandableListView) findViewById(R.id.simpleExpandableListView);
        // create the adapter by passing your ArrayList data
        listAdapter = new CustomAdapter(SightseeingActivity.this, typeList);
        // attach the adapter to the expandable list view
        simpleExpandableListView.setAdapter(listAdapter);

        //collapse all the Groups
        collapseAll();

        // setOnChildClickListener listener for child row click
        simpleExpandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                //get the group header
                GroupInfo headerInfo = typeList.get(groupPosition);
                //get the child info
                ChildInfo detailInfo = headerInfo.gettypeList().get(childPosition);
                //display it or do something with it
                Toast.makeText(getBaseContext(), "Showed more" , Toast.LENGTH_LONG).show();


                switch (groupPosition) {
                    case 0:
                        switch (childPosition) {
                            case 0:
                                sights();
                                break;
                            case 1:
                                thermes();
                                break;
                        }
                }
                switch(groupPosition) {
                    case 1:
                        switch (childPosition)

                        {
                            case 0:
                                monuments();
                                break;
                            case 1:
                                monuments1();
                                break;
                            case 2:
                                monuments2();
                                break;
                            case 3:
                                monuments3();
                                break;
                            case 4:
                            monuments4();
                            break;
                        }
                }


switch (groupPosition) {
    case 2:
        switch (childPosition)

        {
            case 0:
                church();
                break;
            case 1:
                church1();
                break;
            case 2:
                church2();
                break;
            case 3:
                church3();
                break;
            case 4:
                church4();
                break;
        }
}
            switch (groupPosition){

                 case 3:
                     switch (childPosition)
                     {
                         case 0:
                             culture();
                             break;
                         case 1:
                             culture1();
                             break;
                         case 2:
                             culture2();
                             break;
                         case 3:
                             culture3();
                             break;
                         case 4:
                             culture4();
                             break;
                         case 5:
                             culture5();
                             break;
                     }

              }
                switch (groupPosition){

                    case 4:
                        switch (childPosition)
                        {
                            case 0:
                               gorge();
                                break;
                            case 1:
                                gorge1();
                                break;
                            case 2:
                                gorge2();
                                break;
                            case 3:
                                gorge3();
                                break;

                        }

                }
                switch (groupPosition){

                    case 5:
                        switch (childPosition)
                        {
                            case 0:
                                spa();
                                break;
                            case 1:
                                spa1();
                                break;
                            case 2:
                                spa2();
                                break;


                        }

                }

                switch (groupPosition){

                    case 6:
                        switch (childPosition)
                        {
                            case 0:
                                vacation();
                                break;
                            case 1:
                                vacation1();
                                break;
                            case 2:
                                vacation2();
                                break;


                        }

                }
                return false;
            }

            private void sights(){
                Intent myIntent1 = new Intent(SightseeingActivity.this,SightseeingActivity1.class);
                startActivity(myIntent1);


            }

            private void thermes(){
                Intent myIntent2 = new Intent(SightseeingActivity.this,ThermsActivity.class);
                startActivity(myIntent2);

            }

            private void monuments(){
                Intent myIntent3= new Intent(SightseeingActivity.this,MonumentsActivity.class);
                startActivity (myIntent3);
            }

            private void monuments1(){
                Intent myIntent4= new Intent(SightseeingActivity.this,Monuments1Activity.class);
                startActivity (myIntent4);
            }

            private void monuments2(){
                Intent myIntent5= new Intent(SightseeingActivity.this,Monuments2Activity.class);
                startActivity (myIntent5);
            }
            private void monuments3(){
                Intent myIntent6= new Intent(SightseeingActivity.this,Monuments3Activity.class);
                startActivity (myIntent6);
            }
            private void church(){
                Intent myIntent7= new Intent(SightseeingActivity.this, ChruchActivity.class);
                startActivity (myIntent7);
            }

            private void church1(){
                Intent myIntent8= new Intent(SightseeingActivity.this, Church1Activity.class);
                startActivity (myIntent8);
            }

            private void church2(){
                Intent myIntent9= new Intent(SightseeingActivity.this, Church2Activity.class);
                startActivity (myIntent9);
            }

            private void church3(){
                Intent myIntent10= new Intent(SightseeingActivity.this, Church3Activity.class);
                startActivity (myIntent10);
            }

            private void church4(){
                Intent myIntent11= new Intent(SightseeingActivity.this, Church4Activity.class);
                startActivity (myIntent11);
            }
            private void culture(){
                Intent myIntent12= new Intent(SightseeingActivity.this, CultureActivity.class);
                startActivity (myIntent12);

            }

            private void culture1(){
                Intent myIntent13= new Intent(SightseeingActivity.this, Culture1Activity.class);
                startActivity (myIntent13);

            }
            private void culture2(){
                Intent myIntent14= new Intent(SightseeingActivity.this, Culture2Activity.class);
                startActivity (myIntent14);

            }
            private void culture3(){
                Intent myIntent15= new Intent(SightseeingActivity.this, Culture3Activity.class);
                startActivity (myIntent15);

            }
            private void culture4(){
                Intent myIntent16= new Intent(SightseeingActivity.this, Culture4Activity.class);
                startActivity (myIntent16);

            }
            private void culture5(){
                Intent myIntent17= new Intent(SightseeingActivity.this, Culture5Activity.class);
                startActivity (myIntent17);

            }

            private void gorge(){
                Intent myIntent18= new Intent(SightseeingActivity.this, GorgeActivity.class);
                startActivity (myIntent18);

            }
            private void gorge1(){
                Intent myIntent19= new Intent(SightseeingActivity.this, Gorge1Activity.class);
                startActivity (myIntent19);

            }
            private void gorge2(){
                Intent myIntent20= new Intent(SightseeingActivity.this,Gorge2Activity.class);
                startActivity (myIntent20);

            }
            private void gorge3(){
                Intent myIntent21= new Intent(SightseeingActivity.this, Gorge3Activity.class);
                startActivity (myIntent21);

            }

            private void spa(){
                Intent myIntent22= new Intent(SightseeingActivity.this, SpaActivity.class);
                startActivity (myIntent22);

            }

            private void spa1(){
                Intent myIntent23= new Intent(SightseeingActivity.this, Spa1Activity.class);
                startActivity (myIntent23);

            }
            private void spa2(){
                Intent myIntent24= new Intent(SightseeingActivity.this, Spa2Activity.class);
                startActivity (myIntent24);

            }

            private void vacation(){
                Intent myIntent25= new Intent(SightseeingActivity.this, VacationActivity.class);
                startActivity (myIntent25);

            }
            private void vacation1(){
                Intent myIntent26= new Intent(SightseeingActivity.this, Vacation1Activity.class);
                startActivity (myIntent26);

            }
            private void vacation2(){
                Intent myIntent27= new Intent(SightseeingActivity.this, Vacation2Activity.class);
                startActivity (myIntent27);

            }

            private void monuments4(){
                Intent myIntent28= new Intent(SightseeingActivity.this,Monuments5Activity.class);
                startActivity (myIntent28);
            }
        });






        // setOnGroupClickListener listener for group heading click
        simpleExpandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                //get the group header
                GroupInfo headerInfo = typeList.get(groupPosition);
                //display it or do something with it
                Toast.makeText(getBaseContext(), " Show/hide more: " + headerInfo.getName(),
                        Toast.LENGTH_LONG).show();

                return false;
            }
        });


    }

    //method to expand all groups
    private void expandAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++){
            simpleExpandableListView.expandGroup(i);
        }
    }

    //method to collapse all groups
    private void collapseAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++){
            simpleExpandableListView.collapseGroup(i);
        }
    }

    //load some initial data into out list
    private void loadData(){

        addLocation("Archeological location","Gradina");
        addLocation("Archeological location","Roman thermes");


        addLocation("Historic monuments","Mark of Hadzi Prodan's riot");
        addLocation("Historic monuments","Monument Four Faiths");
        addLocation("Historic monuments","Monument Tanasko Rajic");
        addLocation("Historic monuments","Monument Duke Stepa Stepanovic");
        addLocation("Historic monuments","Monument Nadezda Petrovic");

        addLocation("Churchs and monasteries","The Temple of the Passion of Christ - Town Church");
        addLocation("Churchs and monasteries","Monastery Jezevica");
        addLocation("Churchs and monasteries","Monastery Stjenik");
        addLocation("Churchs and monasteries","Monastery Trnava");
        addLocation("Churchs and monasteries","Monastery Vujan");

        addLocation("Cultural institution","Cultural center Cacak");
        addLocation("Cultural institution","City library Vladislav Petkovic Dis");
        addLocation("Cultural institution","Inter municipal historical archive");
        addLocation("Cultural institution","The national museum Cacak");
        addLocation("Cultural institution","Art gallery Nadezda Petrovic");
        addLocation("Cultural institution","Art gallery Risim");


        addLocation("Ovcharsko-Kablarska gorge","About gorge");
        addLocation("Ovcharsko-Kablarska gorge","Monasteries");
        addLocation("Ovcharsko-Kablarska gorge", "Flora");
        addLocation("Ovcharsko-Kablarska gorge","Fauna");

        addLocation("Resort & Spa","Ovchar spa");
        addLocation("Resort & Spa","Atomic spa Gornja Trepcha");
        addLocation("Resort & Spa", "Slatinska spa");


        addLocation("Excursions,country-side tourism, active vacation","Excursions");
        addLocation("Excursions,country-side tourism, active vacation","Country-side tourism");
        addLocation("Excursions,country-side tourism, active vacation","Active vacation");


    }



    //here we maintain our products in various departments
    private int addLocation(String type, String location){

        int groupPosition = 0;

        //check the hash map if the group already exists
        GroupInfo headerInfo = subjects.get(type);
        //add the group if doesn't exists
        if(headerInfo == null){
            headerInfo = new GroupInfo();
            headerInfo.setName(type);
            subjects.put(type, headerInfo);
            typeList.add(headerInfo);
        }

        //get the children for the group
        ArrayList<ChildInfo> typeList = headerInfo.gettypeList();
        //size of the children list
        int listSize = typeList.size();
        //add to the counter
        listSize++;

        //create a new child and add that to the group
        ChildInfo detailInfo = new ChildInfo();
        detailInfo.setSequence(String.valueOf(listSize));
        detailInfo.setName(location);
        typeList.add(detailInfo);
        headerInfo.setProductList(typeList);

        //find the group position inside the list
        groupPosition = typeList.indexOf(headerInfo);
        return groupPosition;
    }

}