package com.example.yangjiaxin.pocketcampus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Job extends AppCompatActivity {

    private TextView textView1,textView2;
    public Job() {
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);
        final Intent intent = getIntent();
        String massage = intent.getStringExtra("job_massage");
        String telephone = intent.getStringExtra("job_telephone");
        String title = intent.getStringExtra("job_title");
        textView1=(TextView)findViewById(R.id.job_textView1);
        textView2=(TextView)findViewById(R.id.job_textView2);
        //设置需要显示的字符串
        String html="";
        html+="";
        html+="";
        //使用Html.fromHtml,把含HTML标签的字符串转换成可显示的文本样式
        CharSequence charSequence= Html.fromHtml(html);
        //通过setText给TextView赋值
        textView1.setText(charSequence);
        //设定一个点击的响应
        textView1.setMovementMethod(LinkMovementMethod.getInstance());

        String text=title+"\n";
        text+= massage+"\n";
        text+= telephone+"\n";
        //因为textView2中有autoLink=”all“的属性设定，所以会自动识别对应的连接，点击出发对应的Android程序
        textView2.setText(text);
    }
}
