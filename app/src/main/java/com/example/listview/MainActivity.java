package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //связываем
        ListView listView = findViewById(R.id.listView);
        ListView colorListView = findViewById(R.id.colorListView);


        //заполняем лист 20 элементами через цикл
        ArrayList<String> posts = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            posts.add("Post " + i);
            Log.i("posts: ", posts.get(i));
        }

        //заполняем лист цветами
        ArrayList<String> colorArrayList = new ArrayList<>();
        colorArrayList.add("Красный");
        colorArrayList.add("Белый");
        colorArrayList.add("Черный");
        colorArrayList.add("Синий");
        colorArrayList.add("Желтый");
        colorArrayList.add("Фиолетовый");


        //связываем элементами из массива и выбираем вид отображения
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, posts);
        //Устанавливаем адаптер для листвью
        listView.setAdapter(arrayAdapter);


        //связываем элементами из массива и выбираем вид отображения
        ArrayAdapter<String> colorArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, colorArrayList);
        //Устанавливаем адаптер для листвью
        colorListView.setAdapter(colorArrayAdapter);


        //добавляем клик на элемент листвью и выводим тост
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                //делаем невидимым весь список
//                parent.setVisibility(view.GONE);
//                //делаем невидимым элемент
//                view.setVisibility(view.GONE);


                //выводим тост по клику
                Toast.makeText(MainActivity.this, "Ууф!", Toast.LENGTH_SHORT).show();
            }
        });


        //добавляем клик на элемент листвью и выводим номер позиции и название
        colorListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Номер " + position + " - " + colorArrayList.get(position), Toast.LENGTH_SHORT).show();

            }
        });

    }
}