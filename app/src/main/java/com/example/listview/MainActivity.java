package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        //заполняем лист 20 элементами через цикл
        ArrayList<String> posts = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            posts.add("Post " + i);
            Log.i("posts: ", posts.get(i));
        }

        //связываем элементами из массива и выбираем вид отображения
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,posts);
        //Устанавливаем адаптер для листвью
        listView.setAdapter(arrayAdapter);


    }
}