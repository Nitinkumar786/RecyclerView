package com.example.recyclevieew_contect_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<RecycleHolder> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList.add(new RecycleHolder(R.drawable.a,"Pintu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Mannu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Rajesh","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Akash","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Sachin","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Gollu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Nitin","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Nannu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"meera","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Pihu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Pintu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Mannu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Rajesh","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Akash","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Sachin","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Gollu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Nitin","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Nannu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"meera","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Pihu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Pintu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Mannu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Rajesh","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Akash","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Sachin","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Gollu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Nitin","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Nannu","126165544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"meera","126158544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Pihu","126154544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Pintu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Mannu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Rajesh","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Akash","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Sachin","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Gollu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Nitin","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Nannu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"meera","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Pihu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Pintu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Mannu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Rajesh","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Akash","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Sachin","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Gollu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Nitin","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Nannu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"meera","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Pihu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Pintu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Mannu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Rajesh","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Akash","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Sachin","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Gollu","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Nitin","126155544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Nannu","126165544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"meera","126158544"));
        arrayList.add(new RecycleHolder(R.drawable.a,"Pihu","126154544"));

        Adapter adapter = new Adapter(this,arrayList);
        recyclerView.setAdapter(adapter);


    }
}