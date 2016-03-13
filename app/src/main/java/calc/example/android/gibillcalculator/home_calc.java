package calc.example.android.gibillcalculator;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Spinner;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.DecimalFormat;


public class home_calc extends AppCompatActivity {


    EditText q1Edit;
    ImageButton imageButton2;
    //TextView answerText;
    InputStream bahw15;
    InputStream is2;
    InputStream zipmha15;
    InputStream bahw16;
    InputStream zipmha16;
    String answer;
    ProgressBar progressBar;


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
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        progressBar.setVisibility(View.GONE);




        final Button button2 = (Button) findViewById(R.id.calcButton);
        button2.setOnClickListener(new View.OnClickListener() {
                                       // Perform action on click
                                       public void onClick(View v) {
                                           progressBar.setVisibility(View.VISIBLE);
                                           try {
                                               AssetManager assetManager = getAssets();
                                               bahw16 = getAssets().open("bahw16.txt");
                                               zipmha16 = getAssets().open("sorted_zipmha16.txt");
                                               bahw15 = getAssets().open("bahw15.txt");
                                               //is2 = getAssets().open("mhanames16.txt");
                                               zipmha15 = getAssets().open("sorted_zipmha15.txt");
                                           } catch (Exception e) {
                                               System.out.println("exception in assetmanger area");
                                           }

                                           // this makes the keyboard go away IT WORKS YAY!!!
                                           //InputMethodManager inputManager = (InputMethodManager)
                                           //        getSystemService(Context.INPUT_METHOD_SERVICE);

                                           //inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                                           //       InputMethodManager.HIDE_NOT_ALWAYS);

                                           //I think these ones just assign the variables to the view that they are assigned

                                           q1Edit = (EditText) findViewById(R.id.bah);

                                           //answerText = (TextView) findViewById(R.id.amount);

                                           try {
                                               //all of the int's are just changing the spinners and edit texts to values that java can understand. q3spinner has to be a float.
                                               //FOR SOME REASON THESE CANNOT BE MOVED UP TO THE TOP OUT OF THE TRY STATEMENT.
                                               String q1EditVar = q1Edit.getText().toString();

                                               Spinner q5spinner = (Spinner) findViewById(R.id.weeksspinner);
                                               int q5spinnerVar = Integer.parseInt(q5spinner.getSelectedItem().toString());//change to a string
                                               Spinner q2spinner = (Spinner) findViewById(R.id.spinnerCredits);
                                               float q2spinnerVar = Float.parseFloat(q2spinner.getSelectedItem().toString());
                                               Spinner q3spinner = (Spinner) findViewById(R.id.spinnerPercent);
                                               float q3spinnerVar = Float.parseFloat(q3spinner.getSelectedItem().toString());
                                               Spinner q4spinner = (Spinner) findViewById(R.id.Spinnercl);
                                               String q4spinnerVar = q4spinner.getSelectedItem().toString();
                                               Spinner q0Spinner = (Spinner) findViewById(R.id.q0Spinner);
                                               String q0SpinnerVar = q0Spinner.getSelectedItem().toString();
                                               //q5spinner.setVisibility(View.INVISIBLE);////if you wanted something invisible this is how you do it

                                               // insert a spinner for q5edit question to make app better//done
                                               DecimalFormat form = new DecimalFormat("0.00");
                                               String mha, bah;

                                               try {
                                                   Zipcalc zipcalculation = new Zipcalc();
                                                   if (q0SpinnerVar.equals("Spring 2016") || q0SpinnerVar.equals("Summer 2016")) {
                                                       mha = zipcalculation.readZiptoMha(q1EditVar, zipmha15);
                                                       bah = zipcalculation.readBahAmount(mha, bahw15);
                                                   } else {
                                                       mha = zipcalculation.readZiptoMha(q1EditVar, zipmha16);
                                                       bah = zipcalculation.readBahAmount(mha, bahw16);
                                                   }
                                                   //System.out.println(mha); debuging
                                                   // System.out.println(bah); debuging
                                                   ////////////////////////////////////////
                                                   double bahNumber = Double.parseDouble(bah);
                                                   BahCalc bahPrinttoScreen = new BahCalc();
                                                   //// turns the calculation into text then applies that text to answer text
                                                   answer = (bahPrinttoScreen.calc(bahNumber, q2spinnerVar, q3spinnerVar, q4spinnerVar, q5spinnerVar, form));
                                                   //answerText.setText(text);


                                               } catch (FileNotFoundException fnfe) {
                                                   System.out.println(fnfe);
                                                   fnfe.printStackTrace();
                                               }
                                           } catch (NumberFormatException nfe) {
                                               //answerText.setText("Answer all Questions");
                                               answer = "Answer all Questions";
                                           }
                                           progressBar.setVisibility(View.GONE);

                                           //////////// alert button instead of putting at the bottom of the screen
                                           AlertDialog alertDialog = new AlertDialog.Builder(home_calc.this).create();
                                           alertDialog.setTitle("Amount");
                                           alertDialog.setMessage(answer);
                                           alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                                                   new DialogInterface.OnClickListener() {
                                                       public void onClick(DialogInterface dialog, int which) {
                                                           dialog.dismiss();


                                                       }
                                                   });
                                           alertDialog.show();


                                       }
                                   }

        );
    }
}

