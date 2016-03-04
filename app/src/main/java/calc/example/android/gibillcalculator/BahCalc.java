package calc.example.android.gibillcalculator;


import java.text.DecimalFormat;

/**
 * Created by codysmac on 2/4/16.
 */
public class BahCalc {

    public String calc(double q1EditVar, float q2spinnerVar, float q3spinnerVar, String q4spinnerVar, int q5spinnerVar, DecimalFormat form) {
        //source for semester equation http://www.sunyacc.edu/sites/default/files/images/va_semester_equivalency_hours_chart.pdf
        String text = "";
        if (q1EditVar == -100) {
            text = ("Please enter proper Zip Code.");
        } else if (q1EditVar == -200) {
            text = ("Please email thegibillcalculator@gmail.com to add zip");
        } else if (q4spinnerVar.equals("Semester")) {
            if (q5spinnerVar >= 15) {
                if (q2spinnerVar == 12) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 11) {
                    text = ("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 10) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 9) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 8) {
                    text = ("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 7) {
                    text = ("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 6) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 14) {
                if (q2spinnerVar >= 10) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 9) {
                    text = ("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 8) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 7) {
                    text = ("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 6) {
                    text = ("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 5) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 13) {
                if (q2spinnerVar >= 9) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 8) {
                    text = ("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 7) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 6) {
                    text = ("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 5) {
                    text = ("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 4) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 12) {
                if (q2spinnerVar >= 8) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 7) {
                    text = ("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 6) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 5) {
                    text = ("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 4) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 11) {
                if (q2spinnerVar >= 8) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 7) {
                    text = ("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 6) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 5) {
                    text = ("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 4) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 10) {
                if (q2spinnerVar >= 7) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 6) {
                    text = ("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 5) {
                    text = ("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 4) {
                    text = ("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 3) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 9) {
                if (q2spinnerVar >= 6) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 5) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 4) {
                    text = ("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 3) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 8) {
                if (q2spinnerVar >= 6) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 5) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 4) {
                    text = ("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 3) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 7) {
                if (q2spinnerVar >= 5) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 4) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 3) {
                    text = ("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 2) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 6) {
                if (q2spinnerVar >= 4) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 3) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 2) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 5) {
                if (q2spinnerVar >= 4) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 3) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 2) {
                    text = ("$0");
                }

            } else if (q5spinnerVar == 4) {
                if (q2spinnerVar >= 3) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 2) {
                    text = ("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 1) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 3) {
                if (q2spinnerVar >= 2) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 1) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 2) {
                if (q2spinnerVar >= 2) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 1) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 1) {
                if (q2spinnerVar >= 1) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar < 1) {
                    text = ("$0");
                }
            }
            //everything that follows is for quarter based, essentially same equations as above
        } else if (q4spinnerVar.equals("Quarter")) {
            if (q5spinnerVar >= 11) {
                if (q2spinnerVar >= 12) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 11) {
                    text = ("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 10) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 9) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 8) {
                    text = ("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 7) {
                    text = ("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 6) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 10) {
                if (q2spinnerVar >= 10) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 9) {
                    text = ("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 8) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 7) {
                    text = ("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 6) {
                    text = ("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 5) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 9) {
                if (q2spinnerVar >= 9) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 8) {
                    text = ("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 7) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 6) {
                    text = ("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 5) {
                    text = ("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 4) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 8) {
                if (q2spinnerVar >= 8) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 7) {
                    text = ("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 6) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 5) {
                    text = ("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 4) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 7) {
                if (q2spinnerVar >= 8) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 7) {
                    text = ("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 6) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 5) {
                    text = ("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 4) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 6) {
                if (q2spinnerVar >= 7) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 6) {
                    text = ("$ " + (form.format((q1EditVar * 0.90) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 5) {
                    text = ("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 4) {
                    text = ("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 3) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 5) {
                if (q2spinnerVar >= 6) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 5) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 4) {
                    text = ("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 3) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 4) {
                if (q2spinnerVar >= 6) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 5) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 4) {
                    text = ("$ " + (form.format((q1EditVar * 0.70) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 3) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 3) {
                if (q2spinnerVar >= 5) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 4) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 3) {
                    text = ("$ " + (form.format((q1EditVar * 0.60) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 2) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 2) {
                if (q2spinnerVar >= 4) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 3) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 2) {
                    text = ("$0");
                }
            } else if (q5spinnerVar == 1) {
                if (q2spinnerVar >= 4) {
                    text = ("$ " + (form.format(q1EditVar * (q3spinnerVar / 100))));
                } else if (q2spinnerVar == 3) {
                    text = ("$ " + (form.format((q1EditVar * 0.80) * (q3spinnerVar / 100))));
                } else if (q2spinnerVar <= 2) {
                    text = ("$0");
                }

            }


        }
        return text;
    }
}
