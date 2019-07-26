package com.example.dell.mygreeknews.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dell.mygreeknews.R;
import com.example.dell.mygreeknews.observer.BinaryObserver;
import com.example.dell.mygreeknews.observer.HexaObserver;
import com.example.dell.mygreeknews.observer.OctalObserver;
import com.example.dell.mygreeknews.observer.Subject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//观察者模式
//        Subject subject = new Subject();
//
//        new HexaObserver(subject);
//        new OctalObserver(subject);
//        new BinaryObserver(subject);
//
//        System.out.println("First state change: 15");
//        subject.setState(15);
//        System.out.println("Second state change: 10");
//        subject.setState(10);

    }
}
