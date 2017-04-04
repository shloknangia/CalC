package com.example.android.calc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double number1 = 0;
    double number2 = 0;
    boolean point = false;
    boolean flag = false;
    int noAfterDec = 0;
    String result ="";
    double answer = 0;
    int operation;
    int non = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

//    public void del(View v){
//       // if (noAfterDec == 1)
//        String a = "";
//        if (!flag)
//        {  if (point) {
//           number1 = number1 / Math.pow(10,noAfterDec);
//            noAfterDec --;
//             }
//            else {
//            number1 = (int)number1 / 10;
//             }
//            if (number1 % 1 == 0) {
//                a = a + (int) number1/1;
//            }
//            a = String.valueOf(number1);
//            result = a;
//            display(result);
//        }
//        else
//        {if(point) {
//            number2 = number2 / Math.pow(10,noAfterDec);
//            noAfterDec --;
//             }
//            else {
//            number2 = number2 / 10;
//             }
//        }
//        non --;
//
//    }

    public void nine(View view) {
       if(point == true) {
           if (!flag) {

               number1 += 9 * Math.pow(10,-1*noAfterDec);
           } else
               number2 += 9 * Math.pow(10,-1*noAfterDec);
           noAfterDec ++;
       }
       else{
           if (!flag) {

               number1 = number1 * 10 + 9;
           } else
               number2 = number2 * 10 + 9;
       }

        result += 9;
        display(result);
        non ++;
    }

    public void eight(View view) {
        if(point == true) {
            if (!flag) {

                number1 += 8 * Math.pow(10,-1*noAfterDec);
            } else
                number2 += 8 * Math.pow(10,-1*noAfterDec);
            noAfterDec ++;
        }
        else{
            if (!flag) {

                number1 = number1 * 10 + 8;
            } else
                number2 = number2 * 10 + 8;
        }

        result += 8;
        display(result);
        non ++;
    }

    public void seven(View view) {
        if(point == true) {
            if (!flag) {

                number1 += 7 * Math.pow(10,-1*noAfterDec);
            } else
                number2 += 7 * Math.pow(10,-1*noAfterDec);
            noAfterDec ++;
        }
        else{
            if (!flag) {

                number1 = number1 * 10 + 7;
            } else
                number2 = number2 * 10 + 7;
        }

        result += 7;
        display(result);
        non ++;
    }

    public void six(View view) {
        if(point == true) {
            if (!flag) {

                number1 += 6 * Math.pow(10,-1*noAfterDec);
            } else
                number2 += 6 * Math.pow(10,-1*noAfterDec);
            noAfterDec ++;
        }
        else{
            if (!flag) {

                number1 = number1 * 10 + 6;
            } else
                number2 = number2 * 10 + 9;
        }

        result += 6;
        display(result);
        non ++;
    }

    public void five(View view) {
        if(point == true) {
            if (!flag) {

                number1 += 5 * Math.pow(10,-1*noAfterDec);
            } else
                number2 += 5 * Math.pow(10,-1*noAfterDec);
            noAfterDec ++;
        }
        else{
            if (!flag) {

                number1 = number1 * 10 + 5;
            } else
                number2 = number2 * 10 + 5;
        }

        result += 5;
        display(result);
        non ++;
    }

    public void four(View view) {
        if(point == true) {
            if (!flag) {

                number1 += 4 * Math.pow(10,-1*noAfterDec);
            } else
                number2 += 4 * Math.pow(10,-1*noAfterDec);
            noAfterDec ++;
        }
        else{
            if (!flag) {

                number1 = number1 * 10 + 4;
            } else
                number2 = number2 * 10 + 4;
        }

        result += 4;
        display(result);
        non ++;
    }

    public void three(View view) {
        if(point == true) {
            if (!flag) {

                number1 += 3 * Math.pow(10,-1*noAfterDec);
            } else
                number2 += 3 * Math.pow(10,-1*noAfterDec);
            noAfterDec ++;
        }
        else{
            if (!flag) {

                number1 = number1 * 10 + 3;
            } else
                number2 = number2 * 10 + 3;
        }

        result += 3;
        display(result);
        non ++;
    }

    public void two(View view) {
        if(point == true) {
            if (!flag) {

                number1 += 2 * Math.pow(10,-1*noAfterDec);
            } else
                number2 += 2 * Math.pow(10,-1*noAfterDec);
            noAfterDec ++;
        }
        else{
            if (!flag) {

                number1 = number1 * 10 + 2;
            } else
                number2 = number2 * 10 + 2;
        }

        result += 2;
        display(result);
        non ++;
    }

    public void one(View view) {
        if(point == true) {
            if (!flag) {

                number1 += 1 * Math.pow(10,-1*noAfterDec);
            } else
                number2 += 1 * Math.pow(10,-1*noAfterDec);

            noAfterDec ++;
        }
        else{
            if (!flag) {

                number1 = number1 * 10 + 1;
            } else
                number2 = number2 * 10 + 1;
        }

        result += 1;
        display(result);
        non ++;
    }

    public void zero(View view) {
        if(point == true) {
            if (!flag) {

                number1 += 0 * Math.pow(10,-1*noAfterDec);
            } else
                number2 += 0 * Math.pow(10,-1*noAfterDec);
            noAfterDec ++;
        }
        else{
            if (!flag) {

                number1 = number1 * 10 + 0;
            } else
                number2 = number2 * 10 + 0;
        }

        result += 0;
        display(result);
        non ++;
    }
     public void plus(View view){
         flag = true;
         point = false;
         noAfterDec = 0;
         result += "+";
        operation = 1;
         display(result);
         non ++;
     }

    public void minus(View view){
        flag = true;
        point = false;
        noAfterDec = 0;
        result += "-";
       operation = 2;
        display(result);
        non ++;
    }

    public void multiply(View view){
        flag = true;
        result += "*";
        operation = 3;
        point = false;
        noAfterDec = 0;
        display(result);
        non ++;
    }

    public void divide(View view){
        flag = true;
        point = false;
        noAfterDec = 0;
        result += "/";
        operation = 4;
        display(result);
        non ++;
    }

    public void equal(View view){
        String a = "";
      switch(operation){
              case 1:answer = number1 + number2;
                  break;
              case 2:answer = number1 - number2;
                  break;
              case 3:answer = number1 * number2;
                  break;
              case 4:answer = number1 / number2;
              break;
          }
        if (answer % 1 == 0) {
            a = a + (int) answer;
        }
        else
        a = a + answer;
        display(a);
        number1 = answer;
        number2 = 0.0;
        flag = true;
    }
    public void point(View view){
        point = true;
        noAfterDec ++;
        result += ".";
        display(result);
        non ++;
    }
    public void clear(View view){
        number1 = 0;
        number2 = 0;
        flag = false;
        result ="";
        answer = 0;
        display(result);
        non = 0;
        TextView resultt = (TextView) findViewById(R.id.text_view);
        resultt.setTextSize(100);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void display( String s){
        TextView resultt = (TextView) findViewById(R.id.text_view);
            resultt.setText("" + s);
        if (non >= 4)
        resultt.setTextSize(60);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.credits) {
            Toast.makeText(this, "Made By : Shlok", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
