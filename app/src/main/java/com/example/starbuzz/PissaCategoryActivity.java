package com.example.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PissaCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pissa_category);

        ArrayAdapter<Pissa> listAdapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item,Pissa.pissa);

        ListView listView = findViewById(R.id.list_pissa);
        listView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listPissa, View itemView, int position, long id) {
                Intent intent = new Intent(PissaCategoryActivity.this, PissaActivity.class);
                intent.putExtra(PissaActivity.EXTRA_PISSAID,(int) id);
                startActivity(intent);
            }
        };

        listView.setOnItemClickListener(itemClickListener);
    }


}
