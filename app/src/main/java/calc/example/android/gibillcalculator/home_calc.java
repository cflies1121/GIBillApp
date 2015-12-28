package calc.example.android.gibillcalculator;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.inputmethod.InputMethodManager;


import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.List;


public class home_calc extends AppCompatActivity {


    EditText q1Edit;
    ImageButton imageButton2;
    TextView answerText;


    public static void array123(String[] args) {

        int arrInt[] = new int[99999];
        {
            arrInt[0] = 1;

            int i = 1;
            while (i <= 99999) {
                arrInt[i] = i + i;
                i++;
            }

        }

    }

    public void addListenerOnImageButton() {

        imageButton2 = (ImageButton) findViewById(R.id.uberbutton);
        imageButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://get.uber.com/drive/?invite_code=x29wa&signup_source=facebook_timeline"));
                startActivity(browserIntent);

            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_calc);
        setTitle("Gi Bill Calculator");
        addListenerOnImageButton();


        final Button button2 = (Button) findViewById(R.id.calcButton);
        button2.setOnClickListener(new View.OnClickListener() {
                                       // Perform action on click
                                       public void onClick(View v) {
                                           // this makes the keyboard go away IT WORKS YAY!!!
                                           InputMethodManager inputManager = (InputMethodManager)
                                                   getSystemService(Context.INPUT_METHOD_SERVICE);

                                           inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                                                   InputMethodManager.HIDE_NOT_ALWAYS);

                                           //this is where the csv stuff begins --->
                                           //InputStream inputStream = getResources().openRawResource(R.raw.zip_code);
                                           //CSVFile csvFile = new CSVFile(inputStream);
                                           // List zip_code_var = csvFile.read();

                                           //<---and ends


                                           //I think these ones just assign the variables to the view that they are assigned

                                           q1Edit = (EditText) findViewById(R.id.bah);

                                           answerText = (TextView) findViewById(R.id.amount);

                                           try {
                                               //all of the int's are just changing the spinners and edit texts to values that java can understand. q3spinner has to be a float.
                                               long q1EditVar = Long.parseLong(q1Edit.getText().toString());

                                               Spinner q5spinner = (Spinner) findViewById(R.id.weeksspinner);
                                               int q5spinnerVar = Integer.parseInt(q5spinner.getSelectedItem().toString());
                                               Spinner q2spinner = (Spinner) findViewById(R.id.spinnerCredits);
                                               long q2spinnerVar = Long.parseLong(q2spinner.getSelectedItem().toString());
                                               Spinner q3spinner = (Spinner) findViewById(R.id.spinnerPercent);
                                               float q3spinnerVar = Float.parseFloat(q3spinner.getSelectedItem().toString());
                                               Spinner q4spinner = (Spinner) findViewById(R.id.Spinnercl);
                                               String q4spinnerVar = q4spinner.getSelectedItem().toString();

                                               // insert a spinner for q5edit question to make app better
                                               DecimalFormat form = new DecimalFormat("0.00");


                                               //source for semester equation http://www.sunyacc.edu/sites/default/files/images/va_semester_equivalency_hours_chart.pdf

                                               if (q1EditVar == -100) {
                                                   answerText.setText("Please enter proper Zip Code.");
                                               } else if (q1EditVar == -200) {
                                                   answerText.setText("Please email thegibillcalculator@gmail.com to add zip");
                                               } else if (q4spinnerVar.equals("Semester")) {
                                                   if (q5spinnerVar >= 15) {
                                                       if (q2spinnerVar == 12) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 11) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 10) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 9) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 8) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 7) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 6) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 14) {
                                                       if (q2spinnerVar >= 10) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 9) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 8) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 7) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 6) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 5) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 13) {
                                                       if (q2spinnerVar >= 9) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 8) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 7) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 6) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 5) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 4) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 12) {
                                                       if (q2spinnerVar >= 8) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 7) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 6) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 5) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 4) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 11) {
                                                       if (q2spinnerVar >= 8) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 7) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 6) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 5) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 4) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 10) {
                                                       if (q2spinnerVar >= 7) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 6) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 5) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 4) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 3) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 9) {
                                                       if (q2spinnerVar >= 6) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 5) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 4) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 3) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 8) {
                                                       if (q2spinnerVar >= 6) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 5) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 4) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 3) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 7) {
                                                       if (q2spinnerVar >= 5) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 4) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 3) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 2) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 6) {
                                                       if (q2spinnerVar >= 4) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 3) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 2) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 5) {
                                                       if (q2spinnerVar >= 4) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 3) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 2) {
                                                           answerText.setText("$0");
                                                       }

                                                   } else if (q5spinnerVar == 4) {
                                                       if (q2spinnerVar >= 3) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 2) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 1) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 3) {
                                                       if (q2spinnerVar >= 2) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 1) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 2) {
                                                       if (q2spinnerVar >= 2) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 1) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 1) {
                                                       if (q2spinnerVar >= 1) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar < 1) {
                                                           answerText.setText("$0");
                                                       }
                                                   }
                                                   //everything that follows is for quarter based, essentially same equations as above
                                               } else if (q4spinnerVar.equals("Quarter")) {
                                                   if (q5spinnerVar >= 11) {
                                                       if (q2spinnerVar >= 12) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 11) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 10) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 9) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 8) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 7) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 6) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 10) {
                                                       if (q2spinnerVar >= 10) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 9) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 8) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 7) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 6) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 5) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 9) {
                                                       if (q2spinnerVar >= 9) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 8) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 7) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 6) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 5) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 4) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 8) {
                                                       if (q2spinnerVar >= 8) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 7) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 6) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 5) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 4) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 7) {
                                                       if (q2spinnerVar >= 8) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 7) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 6) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 5) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 4) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 6) {
                                                       if (q2spinnerVar >= 7) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 6) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 5) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 4) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 3) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 5) {
                                                       if (q2spinnerVar >= 6) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 5) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 4) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 3) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 4) {
                                                       if (q2spinnerVar >= 6) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 5) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 4) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 3) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 3) {
                                                       if (q2spinnerVar >= 5) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 4) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 3) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 2) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 2) {
                                                       if (q2spinnerVar >= 4) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 3) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 2) {
                                                           answerText.setText("$0");
                                                       }
                                                   } else if (q5spinnerVar == 1) {
                                                       if (q2spinnerVar >= 4) {
                                                           answerText.setText("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar == 3) {
                                                           answerText.setText("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                                                       } else if (q2spinnerVar <= 2) {
                                                           answerText.setText("$0");
                                                       }

                                                   }


                                               }


                                           } catch (NumberFormatException nfe) {
                                               answerText.setText("Answer all Questions");
                                           }
                                       }
                                   }

        );
    }


    //  @Override
    // public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    //    getMenuInflater().inflate(R.menu.menu_home_calc, menu);
    //   return true;
    // }

    //@Override
    //public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    //int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    // if (id == R.id.action_settings) {
    //    answerText.setText("Reset");
    //     return true;
    // }

    // return super.onOptionsItemSelected(item);
}

