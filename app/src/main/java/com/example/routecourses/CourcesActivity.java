package com.example.routecourses;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.routecourses.utils.Constants;

public class CourcesActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_cources);
    }

    @Override
    public void onClick(View v) {
if (v.getId() == R.id.imv_andriod  || v.getId()==R.id.btn_android){
  startcourseDetailsActivity(Constants.ANDROID_COURSE);
  return;
}
if (v.getId() == R.id.imv_ios || v.getId() == R.id.btn_ios){
    startcourseDetailsActivity(Constants.Ios_COURSE);
return;
}
if (v.getId()== R.id.imv_fullstack|| v.getId()==R.id.btn_fullstack){
        startcourseDetailsActivity(Constants.fullStack_Course);

}
    }

    private void startcourseDetailsActivity(String course) {
        Intent intent = new Intent(this,CourseDetailsActivity.class);
        Intent intent1 = intent.putExtra(Constants.COURSE, course);
        startActivity(intent1);
    }
}