package com.example.root.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;

public class  LifecycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        //final Animation animFade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        //final Animation animFade_out = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        //final Animation animScale_in = AnimationUtils.loadAnimation(this, R.anim.scale_in);
        //final Animation animScale_out = AnimationUtils.loadAnimation(this, R.anim.scale_out);
        final Animation animTrans_right = AnimationUtils.loadAnimation(this, R.anim.translate_right);
        final Animation animTrans_left = AnimationUtils.loadAnimation(this, R.anim.translate_left);

        final Button btn_save = (Button) findViewById(R.id.btn_save);
        final Button btn_clear = (Button) findViewById(R.id.btn_clear);
    final EditText tv_name=findViewById(R.id.tv_name);
    final EditText tv_surname=findViewById(R.id.tv_surname);



        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_save.startAnimation(animTrans_left);
                Intent i=new Intent(LifecycleActivity.this,BundleActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("name",tv_name.getText().toString().trim());
                bundle.putString("surname",tv_surname.getText().toString().trim());
                i.putExtras(bundle);
                startActivity(i);

/*                 btn_save.startAnimation(animFade_in);
                EditText tv_name = findViewById(R.id.tv_name);
              EditText tv_surname = findViewById(R.id.tv_surname);

               String name = tv_name.getText().toString().trim();
               String surname = tv_surname.getText().toString().trim();
              Toast.makeText(LifecycleActivity.this, "Name : " + name + "Surname : " + surname, Toast.LENGTH_LONG).show();*/
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_clear.startAnimation(animTrans_right);
            }
        });
    }
}
