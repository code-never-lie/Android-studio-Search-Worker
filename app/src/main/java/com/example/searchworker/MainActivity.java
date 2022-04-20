package com.example.searchworker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
   TextView textView;
   Button CV_Builder,Edit_C,Search_worker;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CV_Builder=findViewById(R.id.CV_Builder);
        Edit_C=findViewById(R.id.Edit_CV);
        Search_worker=findViewById(R.id.Search_worker);



    }
    public void Builder(View view)
   {
       Intent intent = new Intent(this,  CV_Builder_Clicked.class);

   }
   public void CV(View view)
   {
       Intent intent = new Intent(this, Edit_CV_Clicked.class);

   }
   public void worker(View view)
   {
       Intent intent = new Intent(this,  Search_worker_Clicked.class);

   }


}
