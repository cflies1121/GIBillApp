package calc.example.android.gibillcalculator;

import android.widget.TextView;

import java.text.DecimalFormat;

/**
 * Created by codysmac on 2/4/16.
 */
public class BahCalc {

    public void calc(double q1EditVar, long q2spinnerVar, float q3spinnerVar, String q4spinnerVar, int q5spinnerVar, DecimalFormat form, TextView answerText) {
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
    }
}
