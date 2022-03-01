package com.example.binod.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class Check{
        int userInput;

        public boolean isTriangular(){
            int triangularNumber=0;
            int counter=1;

            while(counter <=userInput){
                triangularNumber=triangularNumber+counter;
                counter++;
            }
            if(userInput==triangularNumber){
                return true;
            }else{
                return false;
            }
        }//method closed

        public boolean isSquare(){
            int counter=1;
            int sqrNumber=0;
            while(counter<=userInput){
                sqrNumber=counter*counter;
                counter++;
            }
            if(userInput==sqrNumber){
                return true;
            }else{
                return false;
            }
        }//method closed
    }//Class closed



    public void checkNumber(View view){
        EditText numberField=(EditText) findViewById(R.id.editText);
        Check obj=new Check();
        obj.userInput=Integer.parseInt(numberField.getText().toString());

        String message="";
        if(obj.isTriangular()){
            if(obj.isSquare()){
                message=obj.userInput+" is both triangular and square";
            }else{
                message=obj.userInput+" is triangular number but not square";
            }
        }else if(obj.isSquare()){
            message=obj.userInput+" is square number";
        }else{
            message=obj.userInput+" is neither triangular nor square";
        }Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
