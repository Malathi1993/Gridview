package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView coursesGV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coursesGV = findViewById(R.id.idGVcourses);

        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.dsa));
        courseModelArrayList.add(new CourseModel("JAVA", R.drawable.java));
        courseModelArrayList.add(new CourseModel("C++", R.drawable.c));
        courseModelArrayList.add(new CourseModel("Python", R.drawable.python));
        courseModelArrayList.add(new CourseModel("Javascript", R.drawable.js));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.dsa));
        courseModelArrayList.add(new CourseModel("JAVA", R.drawable.java));
        courseModelArrayList.add(new CourseModel("C++", R.drawable.c));
        courseModelArrayList.add(new CourseModel("Python", R.drawable.python));
        courseModelArrayList.add(new CourseModel("Javascript", R.drawable.js));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.dsa));
        courseModelArrayList.add(new CourseModel("JAVA", R.drawable.java));
        courseModelArrayList.add(new CourseModel("C++", R.drawable.c));
        courseModelArrayList.add(new CourseModel("Python", R.drawable.python));
        courseModelArrayList.add(new CourseModel("Javascript", R.drawable.js));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.dsa));
        courseModelArrayList.add(new CourseModel("JAVA", R.drawable.java));
        courseModelArrayList.add(new CourseModel("C++", R.drawable.c));
        courseModelArrayList.add(new CourseModel("Python", R.drawable.python));
        courseModelArrayList.add(new CourseModel("Javascript", R.drawable.js));






        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter((ListAdapter) adapter);
    }
}