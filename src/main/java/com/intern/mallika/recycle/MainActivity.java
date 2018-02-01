package com.intern.mallika.recycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;
public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {

    boolean is_in_action_mode=false;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    int image[]={R.drawable.album6,R.drawable.album7,R.drawable.album8,R.drawable.image_one,R.drawable.image_two,R.drawable.image_three,R.drawable.album3,R.drawable.album4,R.drawable.album5,R.drawable.cover,R.drawable.darshan,R.drawable.logo,R.drawable.timings,R.drawable.monday,R.drawable.sat,R.drawable.thu,R.drawable.tue,R.drawable.wed,R.drawable.fri,R.drawable.sat,R.drawable.timings};
    ArrayList<Contact> contacts=new ArrayList<>();
    ArrayList<Contact> selection_list=new ArrayList<>();
    ArrayList<Integer> list=new ArrayList<>();
    int counter=0,id;
    Button submitButton;
    String[] title,god,title2,god2;
    int image2[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        title=getResources().getStringArray(R.array.title);
        god=getResources().getStringArray(R.array.god);
        submitButton=(Button)findViewById(R.id.submit);
        submitButton.setVisibility(View.GONE);
        int i=0;
        for(String TITLE:title)
        {
            Contact contact=new Contact(image[i],TITLE,god[i]);
            contacts.add(contact);
            i++;
        }
        adapter=new ContactAdapter(contacts,MainActivity.this);
        recyclerView.setAdapter(adapter);
        String id1=getIntent().getStringExtra("id");
        id=Integer.parseInt(id1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //Toast.makeText(getApplicationContext(),"Hi "+id,Toast.LENGTH_SHORT).show();
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id=item.getItemId();
        if(id==android.R.id.home)
            this.finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onLongClick(View v) {
        is_in_action_mode=true;
        submitButton.setVisibility(View.VISIBLE);
        adapter.notifyDataSetChanged();
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        return true;
    }

    public void prepareSelection(View view,int position)
    {
        if(((CheckBox)view).isChecked())
        {
            list.add(position);
            selection_list.add(contacts.get(position));
            counter=counter+1;
        }
        else
        {
            list.remove(position);
            selection_list.remove(contacts.get(position));
            counter=counter-1;
        }
    }
    public void submitData(View view)
    {
        int[] initial=new int[counter+1];//this is the array in which we place the arraylist
        initial[0]=id;
        int j=1,m=0;
        for(int i=0;i<counter;i++) {
            if (id == list.get(i)) {
                m = 1;
            } else {
                initial[j] = list.get(i);
                j++;
            }
        }
            if(m==0)
            {
                counter=counter+1;
            }
            else if(m==1)
                counter=counter;
       // for(int i=0;i<counter;i++)
         //Toast.makeText(getApplicationContext(), initial[0]+"You selected position number " + initial[i], Toast.LENGTH_SHORT).show();

        ShortestPath shortestPath=new ShortestPath();
       int[] result=  shortestPath.path(initial,counter);
      // int temp=result[counter-1];
      // int temp0=result[0];
     //  for(int l=1;l<counter;l++)
      // {
     //   result[l]=result[l-1];
     //  }
       //result[0]=temp;
        image2=new int[counter-1];
        title2=new String[counter-1];
        god2=new String[counter-1];
       for(int i=0;i<counter-1;i++)
       {
           image2[i]=image[initial[result[i]]];
           title2[i]=title[initial[result[i]]];
           god2[i]=god[initial[result[i]]];
           //Toast.makeText(getApplicationContext(),"your path"+title2[i],Toast.LENGTH_SHORT).show();
       }

        Intent i=new Intent(MainActivity.this,SecondActivity.class);
         i.putExtra("title",title2);
         i.putExtra("god",god2);
         i.putExtra("image",image2);
        startActivity(i);
    }
}
