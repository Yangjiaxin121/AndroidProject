package com.example.yangjiaxin.pocketcampus;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Thread.sleep;

public class zhuCe extends AppCompatActivity {

    private EditText passwordAgainEdit;
    private EditText passwordEdit;
    private EditText userNameEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhu_ce);
        passwordEdit = (EditText) findViewById(R.id.et_psw);
        passwordAgainEdit = (EditText) findViewById(R.id.et_psw_again);
        userNameEdit = findViewById(R.id.et_user_name);
        Button zhuCe1 = (Button)findViewById(R.id.btn_register);
        zhuCe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String password = passwordEdit.getText().toString();
                String passwordAgain = passwordAgainEdit.getText().toString();
                String userName = userNameEdit.getText().toString();
                if (!password.equals(passwordAgain)){
                    Toast.makeText(zhuCe.this,"两次密码不一致",
                            Toast.LENGTH_SHORT).show();
                } if (userName.equals("")){
                    Toast.makeText(zhuCe.this,"账号为空",
                            Toast.LENGTH_SHORT).show();
                } else{
                    try {
                        sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Toast.makeText(zhuCe.this,"注册成功",
                            Toast.LENGTH_SHORT).show();
                    Intent intent;
                    intent = new Intent(zhuCe.this,ZhuActivity.class);
                    startActivity(intent);
                }


            }

        });
    }
}
