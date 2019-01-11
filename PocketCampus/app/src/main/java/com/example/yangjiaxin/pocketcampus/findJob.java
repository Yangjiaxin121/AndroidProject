package com.example.yangjiaxin.pocketcampus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class findJob extends AppCompatActivity {
    public static String[] jobTitle = {"寻找一名家教","帮忙送个东西","帮我补补课","帮忙搬个桌子","寻找会修电子器件",
            "寻找一名会高数的学长学姐"};
    public static String[] jobMassage ={"小学六年级数学，每小时50元","16号教学楼到12号宿舍楼,10元"
            ,"补课一下午，100元","16教搬一小时桌子，20元/小时",
            "17教拧一天螺丝，200元","帮忙讲一天高数，300元"};
    public static String[] telephone ={"12345678945","5413216546" ,
            "1235997446" ,"122365845568" , "1264561321165" , "125549846446"};
    public static String[] jobSalary = {"hourtecnoloy","timesphysicial","timestechnology","hourphysical",
            "dayphysical","daytechnology"};
    public String[] jobTitleShow = new String[10];
    public String[] jobMassageshow = new String[10];
    public String[] jobTel = new String[10];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_job);
        final Intent intent = getIntent();
        String type = intent.getStringExtra("type");
        String salary = intent.getStringExtra("salary");
//        Log.d("findJob",type);
//        Log.d("findJob",salary);
        String S = salary + type;

        int j = 0;
        for(int i=0; i<jobTitle.length; i++){
            if(jobSalary.equals(S)) {
                jobTitleShow[j] = jobTitle[i];
                jobMassageshow[j] = jobMassage[i];
                jobTel[j] = telephone[i];
                j++;
            }
        }
        for(;j<jobTitle.length; j++){
            jobTitleShow[j] = null;
            jobMassageshow[j] = null;
            jobTel[j] = null;
        }

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(
                findJob.this, android.R.layout.simple_list_item_1, jobTitle);
        ListView listView = (ListView) findViewById(R.id.list_find_job);
        listView.setAdapter(adapter1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent1 = new Intent(findJob.this,Job.class);
                intent1.putExtra("job_massage",jobMassage[i]);
                intent1.putExtra("job_title",jobTitle[i]);
                intent1.putExtra("job_telephone",telephone[i]);
                startActivity(intent1);
            }

        });



    }
}
