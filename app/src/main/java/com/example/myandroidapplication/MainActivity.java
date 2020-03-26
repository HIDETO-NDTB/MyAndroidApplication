package com.example.myandroidapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txt1;
    Button btn1,btn2,btn3,btn4;
    ImageView imageView;
    CheckBox cb;
    EditText et;

    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("lifecycle","Oncreate Invoked");

        txt1 = findViewById(R.id.txt);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);

        imageView = findViewById(R.id.imageView);
        cb = findViewById(R.id.checkBox);
        et = findViewById(R.id.editText);


        builder = new AlertDialog.Builder(this);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);


//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                txt1.setText("Button Clicked");
//            }
//        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                if(cb.isChecked()) {
                    txt1.setText("Image 1");
                    imageView.setImageResource(R.drawable.logo1);
                }
                String name = et.getText().toString();
                Toast.makeText(this, "Button1 Clicked by "+name, Toast.LENGTH_SHORT).show();
                  break;
            case R.id.button2:
                if(cb.isChecked()) {
                    txt1.setText("Image 2");
                    imageView.setImageResource(R.drawable.logo6);
                }
                Toast.makeText(this, "Button2 Clicked", Toast.LENGTH_SHORT).show();
                  break;
            case R.id.button3:
                builder.setMessage("Do you want to close this application?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert = builder.create();
                alert.setTitle("Alert Dialog");
                alert.show();
                  break;
            case R.id.button4:

                //Explicit Intent - switch from one activity to another activity
                Intent intent = new Intent(this,GridViewActivity.class);
                startActivity(intent);

                break;
            default:
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","Onstart Invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","OnResume Invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","OnPause Invoked");
    }



    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","OnRestart Invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","Onstop Invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","Ondestroy Invoked");
    }


}
