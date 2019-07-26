

package com.example.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PissaActivity extends AppCompatActivity {
    public static final String EXTRA_PISSAID = "pissaID";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pissa);

        int pissaID = (Integer) getIntent().getExtras().get(EXTRA_PISSAID);
        Pissa pissa = Pissa.pissa[pissaID];

        TextView name = findViewById(R.id.name_pissa);
        name.setText(pissa.getName());

        TextView desc = findViewById(R.id.description_pissa);
        desc.setText(pissa.getDescription());

        ImageView photo = findViewById(R.id.photo_pissa);
        photo.setImageResource(pissa.getImageResourceID());
        photo.setContentDescription(pissa.getName());


    }
}
