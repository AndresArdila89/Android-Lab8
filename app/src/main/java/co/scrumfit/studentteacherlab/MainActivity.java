package co.scrumfit.studentteacherlab;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import models.FileManagement;

import models.PersonAdapter;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lvPersons;
    ArrayList<models.Person> listOfPersons;
    PersonAdapter personAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        lvPersons = findViewById(R.id.lvPersons);
        lvPersons.setOnItemClickListener(this);
        listOfPersons = FileManagement.readFile(this, "person.txt");
        personAdapter = new PersonAdapter(this,listOfPersons);
        lvPersons.setAdapter(personAdapter);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}