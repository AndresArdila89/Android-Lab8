package models;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileManagement {
    // read the data from players.txt and return an array list of players

    public static ArrayList<Person> readFile(Context context, String filename){
        ArrayList<Person> listOfPersons = new ArrayList<Person>();

        AssetManager assetManager = context.getResources().getAssets();

        try {
            InputStreamReader isr = new InputStreamReader(assetManager.open(filename));

            BufferedReader br = new BufferedReader(isr);

            String oneLine = br.readLine();
            while (oneLine!=null){
                StringTokenizer st = new StringTokenizer(oneLine,",");
                String roll = st.nextToken();
                int id = Integer.parseInt(st.nextToken());
                String name = st.nextToken();
                if(roll.equals("S"))
                {
                    String age = st.nextToken();
                    String college = st.nextToken();
                    String photo = st.nextToken();
                    try{
                        listOfPersons.add(new Student(id,name,photo,age,college));
                    }catch (Exception e)
                    {
                        Log.d("ERROR", e.getMessage());
                    }

                }
                else {
                    double salary = Double.parseDouble(st.nextToken());
                    double commission = Double.parseDouble(st.nextToken());
                    String company = st.nextToken();
                    String photo = st.nextToken();
                    try{
                        listOfPersons.add(new Teacher(id,name,photo,salary,commission,company));
                    }catch (Exception e)
                    {
                        Log.d("ERROR", e.getMessage());
                    }
                }

                oneLine = br.readLine();

            }

            br.close();
            isr.close();

        } catch (IOException e) {
            Log.d("ERROR",e.getMessage());
        }

        return listOfPersons;
    }
}
