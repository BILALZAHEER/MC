package com.bilalzaheer.assignment_1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView tvhelloworld;
    Context mcontext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mcontext=this;
        tvhelloworld=findViewById(R.id.tv_hello_world);
        tvhelloworld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                     Intent intent=new Intent(mcontext,UniversityActivity.class);
                     intent.putExtra("message","i am coming from home");
                     startActivity(intent);

            }
        });
    }
}
