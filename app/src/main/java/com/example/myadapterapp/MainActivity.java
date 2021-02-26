package com.example.myadapterapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList al;
    ArrayAdapter adapter;
    ListView elist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        al = new ArrayList();
        elist = findViewById(R.id.elist);
        al.add(new Employee(100, "Aman", 80000));
        al.add(new Employee(101, "Bman", 90000));
        al.add(new Employee(102, "Cman", 80000));
        al.add(new Employee(103, "Dman", 100000));
        al.add(new Employee(104, "Eman", 90000));
        al.add(new Employee(105, "Fman", 70000));
        al.add(new Employee(106, "Gman", 10000));

        adapter = new MyAdapter();
        elist.setAdapter(adapter);
    }


    class MyAdapter extends ArrayAdapter {

        public MyAdapter() {
          //  super(MainActivity.this,R.layout.my_adapter,al.size());
            super(MainActivity.this,R.layout.my_adapter,al);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View v = getLayoutInflater().inflate(R.layout.my_adapter,null);
            TextView eno = v.findViewById(R.id.txtEno);
            TextView ename = v.findViewById(R.id.txtName);
            TextView salary = v.findViewById(R.id.txtSalary);

            Employee emp = (Employee) al.get(position);
            eno.setText(emp.getEid() + "");
            ename.setText(emp.getEname());
            salary.setText(emp.getEsalary() + "");
            return v;
        }
    }
}