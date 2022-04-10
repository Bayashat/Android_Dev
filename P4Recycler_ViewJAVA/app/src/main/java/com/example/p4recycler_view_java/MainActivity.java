package com.example.p4recycler_view_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.os.RecoverySystem;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private List<User> data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0; i < 100; i++){
            User user = new User();
            user.setName("Student" + i);
            data.add(user);
        }

        RecyclerView recyclerView = findViewById(R.id.rv);
        // 1. 线性布局
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(linearLayoutManager);
        // 2. 网格布局
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3); // 一行显示3个
        recyclerView.setLayoutManager(gridLayoutManager);
        // 3.瀑布流:
//        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3,LinearLayout.VERTICAL);
//        recyclerView.setLayoutManager(staggeredGridLayoutManager );

        MyAdapter myAdapter = new MyAdapter(data, this);
        recyclerView.setAdapter(myAdapter);

        myAdapter.setRecyclerItemClickListener(new MyAdapter.OnRecyclerItemClickListener()
        {
            @Override
            public void onRecyclerItemClick(int position)
            {
                Log.e("Leo", "onRecyclerItemClick: " + position);
            }
        });
    }
}