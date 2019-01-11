package com.example.yangjiaxin.pocketcampus;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class qiye extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qiye);

        Button button = (Button)findViewById(R.id.qiye_register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(qiye.this, "发布成功，请等待审核",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
