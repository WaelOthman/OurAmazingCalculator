# OurAmazingCalculator
# We, Wael and Yahya, did this calculator for Android Mobiles.

package wael_othman.calculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9 , buttonAdd , buttonSub , buttonDiv ,
            buttonMul , button10 , buttonC , buttonEq , buttonNig , buttonBack;
    EditText edt1 , edt2;
    double mValueOne , mValueTwo ;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0   = (Button) findViewById(R.id.button0);
        button1   = (Button) findViewById(R.id.button1);
        button2   = (Button) findViewById(R.id.button2);
        button3   = (Button) findViewById(R.id.button3);
        button4   = (Button) findViewById(R.id.button4);
        button5   = (Button) findViewById(R.id.button5);
        button6   = (Button) findViewById(R.id.button6);
        button7   = (Button) findViewById(R.id.button7);
        button8   = (Button) findViewById(R.id.button8);
        button9   = (Button) findViewById(R.id.button9);
        button10  = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDiv = (Button) findViewById(R.id.buttondiv);
        buttonC   = (Button) findViewById(R.id.buttonC);
        buttonEq  = (Button) findViewById(R.id.buttoneql);
        buttonNig = (Button) findViewById(R.id.buttonnig);
        buttonBack= (Button) findViewById(R.id.buttonback);
        edt1      =(EditText)findViewById(R.id.edt1);
        edt2      =(EditText)findViewById(R.id.edt2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Double.parseDouble(edt1.getText().toString())==0)&&(!edt1.getText().toString().contains("."))){
                    edt1.setText("1");
                }else {
                    edt1.setText(edt1.getText() + "1");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Double.parseDouble(edt1.getText().toString())==0)&&(!edt1.getText().toString().contains("."))){
                    edt1.setText("2");
                }else {
                    edt1.setText(edt1.getText() + "2");
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Double.parseDouble(edt1.getText().toString())==0){
                    edt1.setText("3");
                }else {
                    edt1.setText(edt1.getText() + "3");
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Double.parseDouble(edt1.getText().toString())==0)&&(!edt1.getText().toString().contains("."))){
                    edt1.setText("4");
                }else {
                    edt1.setText(edt1.getText() + "4");
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Double.parseDouble(edt1.getText().toString())==0)&&(!edt1.getText().toString().contains("."))){
                    edt1.setText("5");
                }else {
                    edt1.setText(edt1.getText() + "5");
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Double.parseDouble(edt1.getText().toString())==0)&&(!edt1.getText().toString().contains("."))){
                    edt1.setText("6");
                }else {
                    edt1.setText(edt1.getText() + "6");
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Double.parseDouble(edt1.getText().toString())==0)&&(!edt1.getText().toString().contains("."))){
                    edt1.setText("7");
                }else {
                    edt1.setText(edt1.getText() + "7");
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Double.parseDouble(edt1.getText().toString())==0)&&(!edt1.getText().toString().contains("."))){
                    edt1.setText("8");
                }else {
                    edt1.setText(edt1.getText() + "8");
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Double.parseDouble(edt1.getText().toString())==0)&&(!edt1.getText().toString().contains("."))){
                    edt1.setText("9");
                }else {
                    edt1.setText(edt1.getText() + "9");
                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Double.parseDouble(edt1.getText().toString())==0)&&(!edt1.getText().toString().contains("."))){

                }else
                {
                    edt1.setText(edt1.getText() + "0");
                }
            }
        });

        buttonNig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().toString().charAt(0) == '-'){
                    edt1.setText(edt1.getText().delete(0,1));
                }else {
                    edt1.setText("-" + edt1.getText());
                }
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Double.parseDouble(edt1.getText().toString());
                mAddition = true;
                edt1.setText("0");
                edt2.setText(mValueOne + " + ");
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Double.parseDouble(edt1.getText().toString());
                mSubtract = true;
                edt1.setText("0");
                edt2.setText(mValueOne + " - ");

            }

        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Double.parseDouble(edt1.getText().toString());
                mMultiplication = true ;
                edt1.setText("0");
                edt2.setText(mValueOne + " x ");

            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Double.parseDouble(edt1.getText().toString());
                mDivision = true ;
                edt1.setText("0");
                edt2.setText(mValueOne + " ÷ ");

            }
        });

        buttonEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Double.parseDouble(edt1.getText() + "");
                if (!edt2.getText().toString().contains("=")) {
                    edt2.setText(edt2.getText().toString() + mValueTwo + " =");
                }
                if (mAddition == true){
                    edt1.setText(mValueOne + mValueTwo +"");
                    mAddition=false;
                }
                if (mSubtract == true){
                    edt1.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;
                }
                if (mMultiplication == true){
                    edt1.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    if (mValueTwo == 0){
                        Toast.makeText(MainActivity.this,
                                "Cannot DIVIDE!!!", Toast.LENGTH_LONG).show();
                        edt1.setText("0");
                        edt2.setText(edt2.getText().toString()+"  ^_^");
                        mValueTwo=0;
                        mValueOne=0;
                        mDivision = false;
                    }else {
                        edt1.setText(mValueOne / mValueTwo + "");
                        mDivision = false;
                    }
                }

            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("0");
                edt2.setText("");
                mValueOne=0;
                mValueTwo=0;
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().toString().length() != 1){
                    edt1.setText(edt1.getText().delete(edt1.getText().toString().length() - 1, edt1.getText().toString().length()));
                }else{
                    edt1.setText("0");
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().toString().contains(".")){
                    Toast.makeText(MainActivity.this,
                            "Dot already exists!!!", Toast.LENGTH_LONG).show();
                }else {
                    edt1.setText(edt1.getText() + ".");
                }
            }
        });
    }
}
