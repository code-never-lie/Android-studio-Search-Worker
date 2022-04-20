package com.example.searchworker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CV_Builder_Clicked extends AppCompatActivity
{
    TextView person_information,Name,Address,Mobile,Email,Password,Education,Project,Reserch,Key_skill;
    EditText editname,editAddress,editNumber,editEmail,editpassword,editeducation,editproject,editbackground,editkey;
   Button Genrate_Cv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_v__builder__clicked);
                person_information=findViewById(R.id.person_information);
                Name=findViewById(R.id.Name);
                Address=findViewById(R.id.Address);
                Mobile=findViewById(R.id.Mobile);
                Email=findViewById(R.id.Password);
                Password=findViewById(R.id.Password);
                Education=findViewById(R.id.Education);
                Project=findViewById(R.id.Project);
                Reserch=findViewById(R.id.Reserch);
                Key_skill=findViewById(R.id.Key_skill);
                editname=findViewById(R.id.editname);
                editAddress=findViewById(R.id.editAddress);
                editNumber=findViewById(R.id.editNumber);
                editEmail=findViewById(R.id.editEmail);
                editpassword=findViewById(R.id.editpassword);
                editeducation=findViewById(R.id.editeducation);
                editproject=findViewById(R.id.editproject);
                editbackground=findViewById(R.id.editbackground);
                editkey=findViewById(R.id.editkey);
                Genrate_Cv=findViewById(R.id.Genrate_Cv);


    }
}