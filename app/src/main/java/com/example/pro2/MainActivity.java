package com.example.pro2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spnMenu;
    private Button btnSearch;
    private ListView lstItems;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();
        populateSpiner();

       btnSearch.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               DatabaseItemes db= new DatabaseItemes();
               String cat=spnMenu.getSelectedItem().toString();

               List<MenuItem> result=db.getMenuItems(cat);
               MenuItem[] arr= result.toArray(new MenuItem[result.size()]);
               ArrayAdapter<MenuItem>adapter=new ArrayAdapter<MenuItem>(MainActivity.this, android.R.layout.simple_list_item_1,arr);
               lstItems.setAdapter(adapter);


           }
       });


    }

    private void populateSpiner() {
        DatabaseItemes db=new DatabaseItemes();
        String[] cats= db.getCategories();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
        (this, android.R.layout.simple_spinner_item,cats);
        spnMenu.setAdapter(adapter);
    }


    private void setupViews() {
        spnMenu = findViewById(R.id.spnMenu);
        btnSearch = findViewById(R.id.btnSearch);
        lstItems = findViewById(R.id.lstItems);
    }
}