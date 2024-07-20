package com.example.routecourses;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.routecourses.utils.Constants;

public class CourseDetailsActivity extends AppCompatActivity {

    ImageView courseImv;
    TextView courseDetailsTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_course_details);
    courseImv=findViewById(R.id. imv_course);
    courseDetailsTv=findViewById(R.id.tv_course_details);
    courseDetailsTv.setMovementMethod(new ScrollingMovementMethod());
        Intent intent=getIntent();
        if (intent==null)
            return;
    switch (intent.getStringExtra(Constants.COURSE)){
        case Constants.ANDROID_COURSE: {
          courseDetailsTv.setText(Constants.ANDROID_DETALS);
           courseImv.setImageResource(R.drawable.andriod);
            break;
        }
        case Constants.Ios_COURSE: {
            courseDetailsTv.setText(Constants.IOS_DETALS);
            courseImv.setImageResource(R.drawable.ios);
            break;

        }
        case Constants.fullStack_Course: {
          courseDetailsTv.setText(Constants.FULLSTACK_DETAILS);
          courseImv.setImageResource(R.drawable.fullstack);
            break;
        }
    }

    }


}