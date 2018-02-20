package com.example.root.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BundleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);

        Bundle b=new Bundle();
        b=getIntent().getExtras();
        String name=b.getString("name","hieee");
        String surname=b.getString("surname","byeeee");

        TextView tv_name=findViewById(R.id.tv_name);
        TextView tv_surname=findViewById(R.id.tv_surname);

        tv_name.setText(name);
        tv_surname.setText(surname);


    }
}
