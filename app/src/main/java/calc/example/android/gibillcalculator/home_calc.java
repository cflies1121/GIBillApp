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


import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.List;


public class home_calc extends AppCompatActivity {


    EditText q1Edit;
    ImageButton imageButton2;
    TextView answerText;


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

                                           //I think these ones just assign the variables to the view that they are assigned

                                           q1Edit = (EditText) findViewById(R.id.bah);

                                           answerText = (TextView) findViewById(R.id.amount);

                                           try {
                                               //all of the int's are just changing the spinners and edit texts to values that java can understand. q3spinner has to be a float.
                                               //FOR SOME REASON THESE CANNOT BE MOVED UP TO THE TOP OUT OF THE TRY STATEMENT.
                                               long q1EditVar = Long.parseLong(q1Edit.getText().toString());

                                               Spinner q5spinner = (Spinner) findViewById(R.id.weeksspinner);
                                               int q5spinnerVar = Integer.parseInt(q5spinner.getSelectedItem().toString());//change to a string
                                               Spinner q2spinner = (Spinner) findViewById(R.id.spinnerCredits);
                                               long q2spinnerVar = Long.parseLong(q2spinner.getSelectedItem().toString());
                                               Spinner q3spinner = (Spinner) findViewById(R.id.spinnerPercent);
                                               float q3spinnerVar = Float.parseFloat(q3spinner.getSelectedItem().toString());
                                               Spinner q4spinner = (Spinner) findViewById(R.id.Spinnercl);
                                               String q4spinnerVar = q4spinner.getSelectedItem().toString();

                                               // insert a spinner for q5edit question to make app better
                                               DecimalFormat form = new DecimalFormat("0.00");

                                               //try {
                                               //Zipcalc zipcalculation = new Zipcalc();//figure out how to throw the exception
                                               //String mha = zipcalculation.readZiptoMha("93725");
                                               //String bah = zipcalculation.readBahAmount(mha);
                                               BahCalc bahPrinttoScreen = new BahCalc();
                                               bahPrinttoScreen.calc(q1EditVar, q2spinnerVar, q3spinnerVar, q4spinnerVar, q5spinnerVar, form, answerText);


                                               //} catch (FileNotFoundException fnfe){//// these are still needed to move foward just took out to test program
                                               //answerText.setText("the file is not found");
                                               //}
                                           } catch (NumberFormatException nfe) {
                                               answerText.setText("Answer all Questions");
                                           }
                                       }
                                   }

        );
    }
}

