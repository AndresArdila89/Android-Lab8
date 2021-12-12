package models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import co.scrumfit.studentteacherlab.R;

public class PersonAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Person> listOfPersons;

    Person person;

    public PersonAdapter(Context context, ArrayList<Person> listOfPersons) {
        this.context = context;
        this.listOfPersons = listOfPersons;
    }

    @Override
    public int getCount() {
        return listOfPersons.size();
    }

    @Override
    public Object getItem(int position) {
        return listOfPersons.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View personItem;
        ImageView imPhoto, imMore;
        TextView tvName, tvAge, tvSalary, tvCommission;
        String roll;


        LayoutInflater inflater = LayoutInflater.from(context);

        person = (Person)getItem(position);
        roll = person.getRoll();

        if(roll.equals("Student")){

            Student std = (Student)getItem(position);

            personItem = inflater.inflate(R.layout.item_student,parent,false);
            imPhoto = personItem.findViewById(R.id.ivStudentPhoto);
            tvName = personItem.findViewById(R.id.tvStudentName);
            tvAge = personItem.findViewById(R.id.tvAge);

            tvName.setText(std.getName());
            tvAge.setText(std.getAge());
            String photoName = std.getPicture();
            int photoResourceId = context.getResources().getIdentifier("drawable/"+photoName, null, context.getPackageName());
            imPhoto.setImageResource(photoResourceId);
        }
        else {
            Teacher tech = (Teacher)getItem(position);

            personItem = inflater.inflate(R.layout.item_teacher,parent,false);
            imPhoto = personItem.findViewById(R.id.ivTeacherPhoto);
            tvName = personItem.findViewById(R.id.tvTeacherName);
            tvSalary = personItem.findViewById(R.id.tvSalary);
            tvCommission = personItem.findViewById(R.id.tvCommission);

            tvName.setText(tech.getName());
            Double sal = tech.getSalary();
            tvSalary.setText(sal.toString());
            Double com = tech.getCommission();
            tvCommission.setText(com.toString());
            String photoName = tech.getPicture();
            int photoResourceId = context.getResources().getIdentifier("drawable/"+photoName, null, context.getPackageName());
            imPhoto.setImageResource(photoResourceId);



        }






        return personItem;
    }
}
