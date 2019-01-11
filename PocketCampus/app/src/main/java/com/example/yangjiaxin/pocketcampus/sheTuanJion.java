package com.example.yangjiaxin.pocketcampus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class sheTuanJion extends AppCompatActivity {
    private String[] shetuan = {"计算机协会" , "idea精英汇" , "创客空间" , "微博协会" , "KAB创业俱乐部" ,
            "航模队" , "科技创新协会" , "数学建模协会" , "汽车爱好者协会" , "网络安全协会" , "VR创新实验室" ,
            "ERP沙盘协会" , "消防协会" , "软件协会" , "安全协会" , "北斗—华测人俱" , "安全急救协会" , "三农学社" , "爱心协会" ,
            "新空气环保协会" , "创业与就业指导协会" , "新长城西安科技大学自强社" , "陶艺协会" ,
            "社交礼仪协会" , "大学生摄影协会" , "读书协会" , "马克思主义理论研究会" , "心理协会" , "新新英语学社" ,
            "模拟联合国协会", "军事协会" , "争鸣口才协会" , "挑战者协会" , "嘤鸣学会" , "京锐联盟" , "外语协会" ,
            "星瀚考研协会", "燕宝爱心社" , "法律协会" , "羽毛球协会" , "排球协会" , "轮滑协会" , "太极柔力球协会" ,
            "乒乓球协会" , "狂龙棍舞双截棍协会" , "青年武术协会" , "自行车协会" , "腰鼓协会" , "足球协会" ,
            "跑步Hormone" , " 篮球协会" , "瑜伽协会" , "A+艺术协会" , "霍格沃茨魔术协会" , "Flying动漫社" ,
            "阳光话剧表演协会" , "棋友协会" , "潇湘古典文学社" , "国风书画协会" ,"百年文粹文学社" ,
            "影视评论协会" , "入木绘画社"};
    private EditText sheTuanName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_she_tuan_jion);
        sheTuanName = (EditText) findViewById(R.id.she_tuans_name);
        Button joinSheTuan = (Button)findViewById(R.id.sheTuanBaoMing);
        joinSheTuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = sheTuanName.getText().toString();
                boolean flag=false;    //查找之前，定义一个查找结果标志
                for(int i=0; i<shetuan.length; i++){
                    if(s.equals(shetuan[i])){
                        flag=true;
                        break;
                    }
                }
                if(flag){
                    Toast.makeText(sheTuanJion.this, "报名成功，请等待社联审核", Toast.LENGTH_SHORT).show();
                    Intent intent;
                    intent = new Intent(sheTuanJion.this,ZhuActivity.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(sheTuanJion.this, "未找到此社团", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

}


