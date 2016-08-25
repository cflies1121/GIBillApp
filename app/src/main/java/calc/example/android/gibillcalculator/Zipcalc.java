package calc.example.android.gibillcalculator;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by codysmac on 2/4/16.
 */
public class Zipcalc {

    public Zipcalc() throws FileNotFoundException {


    }

    /**
     * Gets the military housing area from the zip code given.
     *
     * @param zipCode the zip code of the area as a string.
     * @return the military housing area in proper format or "nope" if zip is not found.
     * @throws FileNotFoundException
     */
    public final String readZiptoMha(String zipCode, InputStream zipMhaFile) throws FileNotFoundException {
        //File file = AssetManager.AssetInputStream{new File ("raw/sorted_zipmha16.txt");}
        String zip, mha = "", line;
        try {
            Scanner read = new Scanner(zipMhaFile);
            read.useDelimiter("\n");


            while (read.hasNext()) {
                line = read.next();
                String[] parts = line.split(",");
                zip = parts[0];
                mha = parts[1];
                if (zipCode.equals((zip))) {
                    System.out.println(mha);
                    break;
                } else {
                    mha = "error";
                }
            }
            read.close();
        } catch (Exception e1) {
            System.out.println(e1);
            return "Please enter zip code";
        }
        return mha;

    }

    /**
     * Gets the BAH amount from the Military Housing Area given.
     *
     * @param mHA the Military Housing Area.
     * @return The BAH amount as a string.
     * @throws FileNotFoundException
     */
    public final String readBahAmount(String mHA, InputStream bahwFile) throws FileNotFoundException {
        //String zipString = Integer.toString(zipCode);
        //File file = AssetManager.AssetInputStream{new File("res/bahw16.txt");}
        String mha, line;
        String e5 = "";
        //String e1, e2, e3, e4, e5 = "", e6, e7, e8, e9, w1, w2, w3, w4, w5, o1e, o2e, o3e;
        //String o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, newline;
        try {
            Scanner read = new Scanner(bahwFile);//creates a new scanner and reads from file
            read.useDelimiter("\n");//establishes that the , and new line are different values

            while (read.hasNext()) {
                line = (read.next());
                String parts[] = line.split(",");

                mha = (parts[0]);//assigns the value that is listed first per line

                e5 = parts[5];
                mHA = mHA.replace("\r", "");
                //need to have this as the file has new lines with commas

                if (mHA.equals(mha)) {//if the mha listed here = the mha assigned by the ziptobah function
                    break;
                }
            }
            read.close();
            return e5;
        } catch (Exception e) {
            System.out.println("exception in readBah method");


        }

        return "nope";

    }
}
