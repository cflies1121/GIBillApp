package calc.example.android.gibillcalculator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.View.OnClickListener;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //lyft ad button
        // addListenerOnButton();


        final Button button = (Button) findViewById(R.id.accept);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                //Start your second activity
                Intent intent = new Intent(MainActivity.this, home_calc.class);
                startActivity(intent);
            }
        });

    }

    /*//for lyft ad button
    public void addListenerOnButton() {

        imageButton = (ImageButton) findViewById(R.id.lyftbutton);
        imageButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.lyft.com/drivers/gibillcalculator"));
                startActivity(browserIntent);

            }

        });
*/
    //}

    
}
