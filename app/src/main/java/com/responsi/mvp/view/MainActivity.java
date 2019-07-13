package com.responsi.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.responsi.mvp.R;
import com.responsi.mvp.presenter.DataPresenter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecdata = findViewById(R.id.rv_data);
        //8
        mLayoutManager = new LinearLayoutManager(this);
        presenter = new DataPresenter(this);
        mRecdata.setLayoutManager(mLayoutManager);


        presenter.getResultsItem();

    }
}
