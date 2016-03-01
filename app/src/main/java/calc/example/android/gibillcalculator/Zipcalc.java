package calc.example.android.gibillcalculator;

import android.content.res.AssetManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import android.content.res.Resources;

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
    public String readZiptoMha(String zipCode, InputStream zipMhaFile) throws FileNotFoundException {
        //File file = AssetManager.AssetInputStream{new File ("raw/sorted_zipmha16.txt");}
        try {
            Scanner read = new Scanner(zipMhaFile);
            read.useDelimiter(",||\n");
            String zip, mha;

            while (read.hasNext()) {
                zip = read.next();
                mha = read.next();
                if (zip.equals(zipCode)) {
                    return mha;
                }
            }
            read.close();
        } catch (Exception e1) {
            System.out.println(e1);
            return "exception";
        }
        return "nope";

    }

    /**
     * Gets the BAH amount from the Military Housing Area given.
     *
     * @param mHA the Military Housing Area.
     * @return The BAH amount as a string.
     * @throws FileNotFoundException
     */
    public String readBahAmount(String mHA, InputStream bahwFile) throws FileNotFoundException {
        //String zipString = Integer.toString(zipCode);
        //File file = AssetManager.AssetInputStream{new File("res/bahw16.txt");}
        try {
            Scanner read = new Scanner(bahwFile);//creates a new scanner and reads from file
            read.useDelimiter(",|\n");//establishes that the , and new line are different values
            String mha;
            String e1, e2, e3, e4, e5, e6, e7, e8, e9, w1, w2, w3, w4, w5, o1e, o2e, o3e;
            String o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, newline;

            if (read.hasNext()) {
                mha = (read.next() + "\r");//assigns the value that is listed first per line
                e1 = read.next();//each rank has its own value listed after the mha
                e2 = read.next();//have to have every rank due to the way file works
                e3 = read.next();//could be used later for bah calculator...
                e4 = read.next();
                e5 = read.next();
                e6 = read.next();
                e7 = read.next();
                e8 = read.next();
                e9 = read.next();
                w1 = read.next();
                w2 = read.next();
                w3 = read.next();
                w4 = read.next();
                w5 = read.next();
                o1e = read.next();
                o2e = read.next();
                o3e = read.next();
                o1 = read.next();
                o2 = read.next();
                o3 = read.next();
                o4 = read.next();
                o5 = read.next();
                o6 = read.next();
                o7 = read.next();
                o8 = read.next();
                o9 = read.next();
                o10 = read.next();
                newline = read.next();//need to have this as the file has new lines with commas
                if (mha.equals(mHA)) {//if the mha listed here = the mha assigned by the ziptobah function
                    return e5;
                }
            } else {
                read.close();
            }
        } catch (Exception e) {
            System.out.println("exception in readBah method");

        }

        return "null";

    }
}
