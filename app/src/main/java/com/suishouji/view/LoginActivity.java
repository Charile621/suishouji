package com.suishouji.view;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.suishouji.R;


public class LoginActivity extends BaseActivity {

    private RecyclerView mRecyclerView;
    TextView top;
    TextView bottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        top=(TextView)findViewById(R.id.top_text);
        bottom=(TextView)findViewById(R.id.bottom_text);
        mRecyclerView = (RecyclerView) findViewById(R.id.imageRecyclerView);
        Typeface topTypeface = Typeface.createFromAsset(getAssets(),"Yahoo.ttf");
        top.setTypeface(Typeface.create(topTypeface,Typeface.BOLD));
        top.setText("随手记");
        Typeface bottomTypeface = Typeface.createFromAsset(getAssets(),"Zeuty Demo.ttf");
        bottom.setTypeface(Typeface.create(bottomTypeface,Typeface.BOLD));
        bottom.setText("Enter In");
        mRecyclerView.setAdapter(new SplashAdapter(LoginActivity.this));
        mRecyclerView.setLayoutManager(new ScrollLinearLayoutManger(LoginActivity.this));
        mRecyclerView.smoothScrollToPosition(Integer.MAX_VALUE/2);
        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,InstructActivity.class);
                startActivity(intent);
            }
        });
    }
}
