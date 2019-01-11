package com.example.yangjiaxin.pocketcampus;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;



public class Fragment2 extends Fragment {
    public RadioGroup RgSalary;
    public RadioGroup RgType;
    public String types;
    public String salarys;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fragment2,container,false);
        return view;
    }


    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        Button button = getActivity().findViewById(R.id.find_job);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.findJob");
                intent.putExtra("type",types);
                intent.putExtra("salary",salarys);
                startActivity(intent);
            }
        });

    }

    private void initView() {
        RgType = (RadioGroup) getActivity().findViewById(R.id.type_rg);
        RgSalary = (RadioGroup) getActivity().findViewById(R.id.salary);
        int type = RgType.getCheckedRadioButtonId();
        int salary = RgSalary.getCheckedRadioButtonId();
        if (salary == R.id.month_salary) {
            salarys = "times";
        }
        if (salary == R.id.day_salary) {
            salarys = "day";
        }
        if (salary == R.id.hour_salary) {
            salarys = "hour";
        }

        if (type == R.id.physical_strength) {
             types = "physical";

        }
        if (type == R.id.technology) {
            types = "technology";

        }
    }


}
