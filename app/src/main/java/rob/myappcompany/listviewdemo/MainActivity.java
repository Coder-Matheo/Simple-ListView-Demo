package rob.myappcompany.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String tutorials[] = { "Algorithms", "Data Structures", "Languages", "Interview Corner",
            "GATE", "ISRO CS", "UGC NET CS", "CS Subjects", "Web Technologies" };

    ListView listView;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, tutorials);

        listView = findViewById(R.id.ItemListView);
        listView.setAdapter(adapter);


    }
}