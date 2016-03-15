package krirk.punjawoot.snakesandladders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    //Explicit
    private EditText nameEditText, userEditText, passwordEditText;
    private RadioGroup avataRadioGroup;
    private RadioButton avata1RadioButton, avata2RadioButton, avata3RadioButton,
            avata4RadioButton, avata5RadioButton;
    private String nameString, userString, passwordString, avataString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget
        bindWidget();

        //Avata Controller
        avataController();


    }   //  Main Method

    private void avataController() {

        avataRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {
                    case R.id.radioButton:
                        avataString = "0";
                        break;
                    case R.id.radioButton2:
                        avataString = "1";
                        break;
                    case R.id.radioButton3:
                        avataString = "2";
                        break;
                    case R.id.radioButton4:
                        avataString = "3";
                        break;
                    case R.id.radioButton5:
                        avataString = "4";
                        break;
                }   // switch

            }   // onChecked
        });

    }   // avataController

    public void clickSignUpSign(View view) {

        nameString = nameEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        //Check Space
        if (nameString.equals("") || userString.equals("") || passwordString.equals("")) {
            //Have Space
            Toast.makeText(SignUpActivity.this, "กรุณากรอกทุกช่อง คะ", Toast.LENGTH_SHORT).show();

        } else if (!checkAvataChoose()) {
            //Not Choose Avata
            Toast.makeText(SignUpActivity.this, "กรุณาเลือก Avata ด้วยคะ", Toast.LENGTH_SHORT).show();

        } else {
            //Choose Avata Finish
            confirmData();

        }


    }   // clickSignUpSign

    private void confirmData() {

    }   // confirmData

    private boolean checkAvataChoose() {

        boolean bolAvataChoose = true; // Choose Avata

        bolAvataChoose = avata1RadioButton.isChecked() ||
                avata2RadioButton.isChecked() ||
                avata3RadioButton.isChecked() ||
                avata4RadioButton.isChecked() ||
                avata5RadioButton.isChecked();

        return bolAvataChoose;
    }


    private void bindWidget() {

        nameEditText = (EditText) findViewById(R.id.editText);
        userEditText = (EditText) findViewById(R.id.editText2);
        passwordEditText = (EditText) findViewById(R.id.editText3);
        avataRadioGroup = (RadioGroup) findViewById(R.id.ragAvata);
        avata1RadioButton = (RadioButton) findViewById(R.id.radioButton);
        avata2RadioButton = (RadioButton) findViewById(R.id.radioButton2);
        avata3RadioButton = (RadioButton) findViewById(R.id.radioButton3);
        avata4RadioButton = (RadioButton) findViewById(R.id.radioButton4);
        avata5RadioButton = (RadioButton) findViewById(R.id.radioButton5);

    }   // bindWidget

}   // Main Class
