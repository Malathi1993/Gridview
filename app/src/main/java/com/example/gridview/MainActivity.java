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
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("JAVA", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("C++", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("Python", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("Javascript", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("JAVA", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("C++", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("Python", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("Javascript", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("JAVA", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("C++", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("Python", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("Javascript", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("JAVA", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("C++", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("Python", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("Javascript", R.drawable.kayk_img));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.kayk_img));

        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter((ListAdapter) adapter);
    }
}