package com.example.databindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserEntity user = new UserEntity();
        user.setAge(34);
        user.setUsername("zhang san");
        user.setNickname("张三");
        activityMainBinding.setUser(user);
//        setContentView(R.layout.activity_main);

    }
}
