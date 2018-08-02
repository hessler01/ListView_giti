package com.danialhz.app.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList <String> names=new ArrayList<>();
        names.add(getString(R.string.sea));
        names.add(getString(R.string.holy));
        names.add(getString(R.string.drive));
        names.add(getString(R.string.desert));
        names.add(getString(R.string.mountain));

        ListView memoryinformation=findViewById(R.id.lv_memory);

        memory_Class adapte=new memory_Class(this,names);
        memoryinformation.setAdapter(adapte);



    }
}
