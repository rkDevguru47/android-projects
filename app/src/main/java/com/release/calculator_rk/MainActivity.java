package com.release.calculator_rk;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    // creating variables for our text view and button
    String pi = "3.14159265";
    TextView tvsec, tvMain;
    Button bac, bc, bbrac1, bbrac2, bsin, bcos, btan, blog, bln, bfact, bsquare, bsqrt, binv, b0, b9, b8, b7, b6, b5, b4, b3, b2, b1, bpi, bmul, bminus, bplus, bequal, bdot, bdiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing all our variables.
        tvsec = findViewById(R.id.idTVSecondary);
        tvMain = findViewById(R.id.idTVprimary);
        bac = findViewById(R.id.bac);
        bc = findViewById(R.id.bc);
        bbrac1 = findViewById(R.id.bbrac1);
        bbrac2 = findViewById(R.id.bbrac2);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        btan = findViewById(R.id.btan);
        blog = findViewById(R.id.blog);
        bln = findViewById(R.id.bln);
        bfact = findViewById(R.id.bfact);
        bsquare = findViewById(R.id.bsquare);
        bsqrt = findViewById(R.id.bsqrt);
        binv = findViewById(R.id.binv);
        b0 = findViewById(R.id.b0);
        b9 = findViewById(R.id.b9);
        b8 = findViewById(R.id.b8);
        b7 = findViewById(R.id.b7);
        b6 = findViewById(R.id.b6);
        b5 = findViewById(R.id.b5);
        b4 = findViewById(R.id.b4);
        b3 = findViewById(R.id.b3);
        b2 = findViewById(R.id.b2);
        b1 = findViewById(R.id.b1);
        bpi = findViewById(R.id.bpi);
        bmul = findViewById(R.id.bmul);
        bminus = findViewById(R.id.bminus);
        bplus = findViewById(R.id.bplus);
        bequal = findViewById(R.id.bequal);
        bdot = findViewById(R.id.bdot);
        bdiv = findViewById(R.id.bdiv);

        // adding on click listener to our all buttons.
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // on below line we are appending
                // the expression to our text view.
                tvMain.setText(tvMain.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText(tvMain.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + ".");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            // on clicking on ac button we are clearing
            // our primary and secondary text view.
            @Override
            public void onClick(View v) {
                tvMain.setText("");
                tvsec.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            // on clicking on c button we are clearing
            // the last character by checking the length.
            @Override
            public void onClick(View v) {
                String val = tvMain.getText().toString();
                val = val.substring(0, val.length() - 1);
                tvMain.setText(val);
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "+");
            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            // on clicking on minus we are checking if
            // the user has already a minus operation on screen.
            // if minus operation is already present
            // then we will not do anything.
            @Override
            public void onClick(View v) {
                String str = tvMain.getText().toString();
                char[] chars = str.toCharArray();
                char a = chars[chars.length - 1];
                if (!(a == '-')) {
                    tvMain.setText(tvMain.getText() + "-");
                }
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            // if mul sign is not present in our
            // text view then only we are adding
            // the multiplication operator to it.
            @Override
            public void onClick(View v) {
                String str = tvMain.getText().toString();
                char[] chars = str.toCharArray();
                char a = chars[chars.length - 1];
                if (!(a == '*')) {
                    tvMain.setText(tvMain.getText() + "*");
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "÷");
            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvMain.getText().toString().isEmpty()) {
                    // if the entered number is empty we are displaying an error message.
                    Toast.makeText(v.getContext(), "Please enter a valid number..", Toast.LENGTH_SHORT).show();
                } else {
                    String val = tvMain.getText().toString();
                    // on below line we are calculation
                    // square root of the given number.
                    double r = Math.sqrt(Double.parseDouble(val));
                    // on below line we are converting our double
                    // to string and then setting it to text view.
                    tvMain.setText(String.valueOf(r));
                }
            }
        });
        bbrac1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "(");
            }
        });
        bbrac2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + ")");
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            // on clicking on pi button we are adding
            // pi value as 3.142 to our current value.
            @Override
            public void onClick(View v) {
                tvsec.setText(bpi.getText());
                tvMain.setText(tvMain.getText() + pi);
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "sin");
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "cos");
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "tan");
            }
        });
        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "^" + "(-1)");
            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvMain.getText().toString().isEmpty()) {
                    // if the entered number is empty we are displaying an error message.
                    Toast.makeText(v.getContext(), "Please enter a valid number..", Toast.LENGTH_SHORT).show();
                } else {
                    // on below line we are getting int value
                    // and calculating the factorial value of the entered number.
                    int val = Integer.parseInt(tvMain.getText().toString());
                    int fact = factorial(val);
                    tvMain.setText(String.valueOf(fact));
                    tvsec.setText(val + "!");
                }
            }
        });
        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvMain.getText().toString().isEmpty()) {
                    // if the entered number is empty we are displaying an error message.
                    Toast.makeText(v.getContext(), "Please enter a valid number..", Toast.LENGTH_SHORT).show();
                } else {
                    // on below line we are getting the expression and then calculating the square of the number
                    double d = Double.parseDouble(tvMain.getText().toString());
                    // on below line we are calculating the square.
                    double square = d * d;
                    // after calculating the square we
                    // are setting it to text view.
                    tvMain.setText(String.valueOf(square));
                    // on below line we are setting
                    // the d to secondary text view.
                    tvsec.setText(d + "²");
                }
            }
        });
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "ln");
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText() + "log");
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvMain.getText().toString();
                String replacedstr = val.replace('÷', '/').replace('×', '*');
                // on below line we are calling an evaluate
                // method to calculate the value of expressions.
                double result = eval(replacedstr);
                // on below line we are getting result
                // and setting it to text view.
                tvMain.setText(String.valueOf(result));
                tvsec.setText(val);
            }
        });

    }

    //factorial function
    int factorial(int n) {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }


    //eval function
    public static double eval(final String str) {
        return new Object() {
            // on below line we ar creating variable
            // for tracking the position and char pos.
            int pos = -1, ch;
            // below method is for moving to next character.
            void nextChar() {
                // on below line we are incrementing our position
                // and moving it to next position.
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            // this method is use to check the extra space
            // present int the expression and removing it.
            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                // on below line we are checking the char pos
                // if both is equal then we are returning it to true.
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }
            // below method is to parse our
            // expression and to get the ans
            // in this we are calling a parse
            // expression method to calculate the value.
            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            // in this method we will only perform addition and
            // subtraction operation on the expression.
            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }
            // in below method we will perform
            // only multiplication and division operation.
            double parseTerm() {
                double x = parseFactor();
                for (; ; ) {
                    if (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }
            // below method is use to parse the factor
            double parseFactor() {
                //on below line we are checking for addition
                // and subtraction and performing unary operations.
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                // on below line we are creating
                // a variable for position.
                int startPos = this.pos;
                // on below line we are checking
                // for opening and closing parenthesis.
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                        // f we get any error then
                        // we simply return the exception.
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    // if the condition not satisfy then we are returning the exception
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }
                // on below line we are calculating the power of the expression.
                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            } // at last calling a parse for our expression.
        }.parse();
    }
}