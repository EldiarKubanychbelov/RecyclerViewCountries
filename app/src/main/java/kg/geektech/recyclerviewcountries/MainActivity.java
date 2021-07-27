package kg.geektech.recyclerviewcountries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<country> list;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        recyclerView=findViewById(R.id.recyclerView);

        adapter = new Adapter(list);
        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }

    private void initData() {
        list = new ArrayList<>();

        list.add(new country(R.drawable.kg,"Kyrgyzstan","Bishkek"));
        list.add(new country(R.drawable.uz,"Узбекистан","Ташкент"));
        list.add(new country(R.drawable.tr,"Туркия","Стамбул"));
        list.add(new country(R.drawable.tj,"Таджикистан","Душанбе"));
        list.add(new country(R.drawable.sa,"Саудовская Аравия","Эр-Рияд"));
        list.add(new country(R.drawable.pk,"Пакистан","Исламабад"));
        list.add(new country(R.drawable.kz,"Казакстан","Нур-Султан"));
    }
}