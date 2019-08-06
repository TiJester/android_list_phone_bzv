package com.example.android_list_phone_bzv_local;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.ViewGroup.LayoutParams;

public class MainActivity extends AppCompatActivity {

    int number [] = {1, 2, 3, 4, 5, 6, 7, 8};
    String[] name = { "Аптека 1", "Аптека 2", "Аптека 3", "Аптека 4", "Аптека 5", "Аптека 6",
            "Аптека 7", "Аптека 8" };
    String[] adress = { "Адресс, 1", "Адресс, 2", "Адресс, 3", "Адресс, 4", "Адресс, 5", "Адресс, 6",
            "Адресс, 8", "Адресс, 9" };
    String[] phone = { "093-xxx-xxx-xx","093-xxx-xxx-xx","093-xxx-xxx-xx","093-xxx-xxx-xx",
            "093-xxx-xxx-xx","093-xxx-xxx-xx","093-xxx-xxx-xx","093-xxx-xxx-xx"};

    String[] work = {"8.00 - 20.00", "8.00 - 20.00", "8.00 - 20.00", "8.00 - 20.00", "8.00 - 20.00", "8.00 - 20.00", "8.00 - 20.00", "8.00 - 20.00" };

    int[] colors = new int[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colors[0] = Color.parseColor("#559966CC");
        colors[1] = Color.parseColor("#55336699");
        colors[2] = Color.parseColor("#55339966");

        LinearLayout linLayout = (LinearLayout) findViewById(R.id.liner_layout);

        LayoutInflater ltInflater = getLayoutInflater();

        for (int i = 0; i < name.length; i++) {
            Log.d("myLogs", "i = " + i);
            View item = ltInflater.inflate(R.layout.item, linLayout, false);

            TextView tvNumber = (TextView) item.findViewById(R.id.tv_number);
            tvNumber.setText("№" + String.valueOf(number[i]));

            TextView tvName = (TextView) item.findViewById(R.id.tv_name);
            tvName.setText(name[i]);

            TextView tvAdress = (TextView) item.findViewById(R.id.tv_adress);
            tvAdress.setText("Адресс: " + adress[i]);

            TextView tvPhone = (TextView) item.findViewById(R.id.tv_phone);
            tvPhone.setText("Номер: " + phone[i]);

            TextView tvJob = (TextView) item.findViewById(R.id.tv_time_job);
            tvJob.setText("Время работы: " + work[i]);

            item.getLayoutParams().width = LayoutParams.MATCH_PARENT;
            item.setBackgroundColor(colors[i % 3]);
            linLayout.addView(item);
        }
    }
}
