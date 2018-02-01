package com.intern.mallika.recycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    int image[];
    String[] title,god;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    ArrayList<Contact> contacts=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView1);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        image=getIntent().getExtras().getIntArray("image");
        title=getIntent().getExtras().getStringArray("title");
        god=getIntent().getExtras().getStringArray("god");
        int i=0;
        for(String TITLE:title)
        {
            Contact contact=new Contact(image[i],TITLE,god[i]);
            contacts.add(contact);
            i++;
        }
        adapter=new ContactAdapter1(contacts,SecondActivity.this);
        recyclerView.setAdapter(adapter);
    }

}
