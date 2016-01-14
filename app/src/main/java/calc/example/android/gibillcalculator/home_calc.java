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


    EditText q1Edit = (EditText) findViewById(R.id.bah);
    ImageButton imageButton2;
    TextView answerText = (TextView) findViewById(R.id.amount);
    long q1EditVar = Long.parseLong(q1Edit.getText().toString());
    Spinner q5spinner = (Spinner) findViewById(R.id.weeksspinner);
    int q5spinnerVar = Integer.parseInt(q5spinner.getSelectedItem().toString());
    Spinner q2spinner = (Spinner) findViewById(R.id.spinnerCredits);
    long q2spinnerVar = Long.parseLong(q2spinner.getSelectedItem().toString());
    Spinner q3spinner = (Spinner) findViewById(R.id.spinnerPercent);
    float q3spinnerVar = Float.parseFloat(q3spinner.getSelectedItem().toString());
    Spinner q4spinner = (Spinner) findViewById(R.id.Spinnercl);
    String q4spinnerVar = q4spinner.getSelectedItem().toString();





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

    public int calculation() {
        int calculationresult = 0;
        DecimalFormat form = new DecimalFormat("0.00");
        if (q4spinnerVar == "Semester") {
            calculationresult = 13;
        }

        return calculationresult;

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





                                           try {

                                               //this is the method that I am going to try to use
                                               answerText.setText(calculation());

                                               //source for semester equation http://www.sunyacc.edu/sites/default/files/images/va_semester_equivalency_hours_chart.pdf

                                           } catch (NumberFormatException nfe) {
                                               answerText.setText("Answer all Questions");
                                           }
                                       }
                                   }

        );
    }
}

