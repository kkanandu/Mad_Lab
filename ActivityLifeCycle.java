package com.example.mydear;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText w1;
//    EditText w2;
    EditText e1;
    Button btn;
    TextView Y;
//    TextView Y1;
    TextView e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("onCreate called");

        w1 = (EditText) findViewById(R.id.w1);
//        w2 = (EditText) findViewById(R.id.w2);
        e1 =(EditText) findViewById(R.id.e1);
        e2 =(TextView)findViewById(R.id.e2);
        Y = (TextView) findViewById(R.id.Y);
//        Y1 = (TextView) findViewById(R.id.Y1);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (w1.getText().toString().equals("admin")&& e1.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(),
                            "Redirecting.....",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"wrong",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    @Override

    protected void onStart() {
        super.onStart();
        showToast("OnStartcalled");
    }

    @Override

    protected void onRestart() {
        super.onRestart();
        showToast("onRestartecalled");
    }

    @Override

    protected void onResume() {
        super.onResume();
        showToast("onResumecalled");
    }

    @Override

    protected void onPause() {
        super.onPause();
        showToast("onPauseCalled");
    }
    @Override

    protected void onStop() {
        super.onStop();
        showToast("onStopCalled");
    }
    @Override

    protected void onDestroy() {
        super.onDestroy();
        showToast("onDestroyCalled");
    }
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
