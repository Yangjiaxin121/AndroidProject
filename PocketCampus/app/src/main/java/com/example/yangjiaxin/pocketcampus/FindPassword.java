package com.example.yangjiaxin.pocketcampus;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Thread.sleep;

public class FindPassword extends AppCompatActivity {
    private EditText passwordEdit;
    private EditText userNameEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_password);
        passwordEdit = (EditText) findViewById(R.id.qiye_mima);
        userNameEdit = (EditText) findViewById(R.id.qiye_zhanghao);
        AlertDialog.Builder dialog = new AlertDialog.Builder(FindPassword.this);
        dialog.setTitle("想申请企业请发布信息到邮箱");
        dialog.setMessage("koudaixiaoyuan@163.com");
        dialog.setCancelable(false);
        dialog.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        dialog.show();

        Button button = (Button)findViewById(R.id.qiye_queding);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = passwordEdit.getText().toString();
                String username = userNameEdit.getText().toString();


                if (!password.equals("123456789")) {
                    Toast.makeText(FindPassword.this, "密码错误",
                            Toast.LENGTH_SHORT).show();
                }
                else if (!username.equals("test")) {
                    Toast.makeText(FindPassword.this, "账号错误",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(FindPassword.this, "登录成功",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(FindPassword.this,qiye.class);
                    startActivity(intent);

                }

            }
        });

    }
}
