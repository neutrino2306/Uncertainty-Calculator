package com.ec.ynu;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private EditText add,edit_num,edit_data,del_num,typeB;

    private TextView uaDisp,ucDisp,avgDisp,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,data20,data21,data22,data23,data24,data25,data26,data27,data28,data29,data30,data31,data32,data33,data34,data35,data36,data37,data38,data39,data40,data41,data42,data43,data44,data45,data46,data47,data48,data49,data50;

    private Button btn_change,btn_add,btn_reset,btn_delete_recent,btn_delete_specific,btn_delete_all,btn_exe;


    private List<String> input_data=new ArrayList<>();


    private static final Pattern DOUBLE_PATTERN = Pattern.compile(
            "[\\x00-\\x20]*[+-]?(NaN|Infinity|((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)" +
                    "([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|" +
                    "(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))" +
                    "[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*");

    public static boolean isNumeric(String s)
    {
        return DOUBLE_PATTERN.matcher(s).matches();
    }

    public static final String MyPREFERENCES = "MyPrefs" ;
    SharedPreferences sharedpreferences;
private void setBtn_exe(){
    declare();

    String ub_temp;
    ub_temp=typeB.getText().toString();
    if(input_data.size()==0){
        Toast.makeText(getApplicationContext(), "请输入数据！",
                Toast.LENGTH_SHORT).show();
    }
    else{
        if(isNumeric(ub_temp)){
            double uaVal,ubVal,ucVal;
            uaVal=avgCalc(input_data);
            ubVal=parseDouble(ub_temp);
            ucVal=ucCalc(uaVal,ubVal);
            if(Math.abs(uaVal)<0.001||Math.abs(uaVal)>=1.0E7)
                uaDisp.setText(String.valueOf(uaVal));
            else
                uaDisp.setText(String.format("%.6f", uaVal));

            if(Math.abs(uaVal)<0.001||Math.abs(ucVal)>=1.0E7)
                ucDisp.setText(String.valueOf(ucVal));
            else
                ucDisp.setText(String.format("%.6f", ucVal));
        }


        else {
            Toast.makeText(getApplicationContext(), "B类不确定度无效",
                    Toast.LENGTH_SHORT).show();

        }
    }
}

    private void setIni(){
        declare();
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.apply();
        TextView[] disp_data ={data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,data20,data21,data22,data23,data24,data25,data26,data27,data28,data29,data30,data31,data32,data33,data34,data35,data36,data37,data38,data39,data40,data41,data42,data43,data44,data45,data46,data47,data48,data49,data50};
        if(isNumeric(sharedpreferences.getString("0","")))
        for(int i=0;i<parseInt(sharedpreferences.getString("0",""));i++){
            input_data.add(sharedpreferences.getString(String.valueOf(i+1),""));
            disp_data[i].setText("("+(i + 1)+")" + input_data.get(i));
        }
    }
    private void declare(){
        btn_add=(Button)findViewById(R.id.btn_add);
        btn_change=(Button)findViewById(R.id.btn_change);
        btn_exe=(Button)findViewById(R.id.btn_exe);
        btn_reset=(Button)findViewById(R.id.btn_reset);

        btn_delete_recent=(Button)findViewById(R.id.btn_delete_recent);
        btn_delete_specific=(Button)findViewById(R.id.btn_delete_specific);
        btn_delete_all=(Button)findViewById(R.id.btn_delete_all);
        add=(EditText) findViewById(R.id.add);
        edit_num=(EditText) findViewById(R.id.edit_num);
        edit_data=(EditText) findViewById(R.id.edit_data);
        del_num=(EditText) findViewById(R.id.del_num);
        typeB=(EditText) findViewById(R.id.typeB);
        uaDisp=(TextView) findViewById(R.id.uaDisp);
        ucDisp=(TextView) findViewById(R.id.ucDisp);
        avgDisp=(TextView) findViewById(R.id.avgDisp);
        data1=(TextView) findViewById(R.id.data1);
        data2=(TextView) findViewById(R.id.data2);
        data3=(TextView) findViewById(R.id.data3);
        data4=(TextView) findViewById(R.id.data4);
        data5=(TextView) findViewById(R.id.data5);
        data6=(TextView) findViewById(R.id.data6);
        data7=(TextView) findViewById(R.id.data7);
        data8=(TextView) findViewById(R.id.data8);
        data9=(TextView) findViewById(R.id.data9);
        data10=(TextView) findViewById(R.id.data10);
        data11=(TextView) findViewById(R.id.data11);
        data12=(TextView) findViewById(R.id.data12);
        data13=(TextView) findViewById(R.id.data13);
        data14=(TextView) findViewById(R.id.data14);
        data15=(TextView) findViewById(R.id.data15);
        data16=(TextView) findViewById(R.id.data16);
        data17=(TextView) findViewById(R.id.data17);
        data18=(TextView) findViewById(R.id.data18);
        data19=(TextView) findViewById(R.id.data19);
        data20=(TextView) findViewById(R.id.data20);
        data21=(TextView) findViewById(R.id.data21);
        data22=(TextView) findViewById(R.id.data22);
        data23=(TextView) findViewById(R.id.data23);
        data24=(TextView) findViewById(R.id.data24);
        data25=(TextView) findViewById(R.id.data25);
        data26=(TextView) findViewById(R.id.data26);
        data27=(TextView) findViewById(R.id.data27);
        data28=(TextView) findViewById(R.id.data28);
        data29=(TextView) findViewById(R.id.data29);
        data30=(TextView) findViewById(R.id.data30);
        data31=(TextView) findViewById(R.id.data31);
        data32=(TextView) findViewById(R.id.data32);
        data33=(TextView) findViewById(R.id.data33);
        data34=(TextView) findViewById(R.id.data34);
        data35=(TextView) findViewById(R.id.data35);
        data36=(TextView) findViewById(R.id.data36);
        data37=(TextView) findViewById(R.id.data37);
        data38=(TextView) findViewById(R.id.data38);
        data39=(TextView) findViewById(R.id.data39);
        data40=(TextView) findViewById(R.id.data40);
        data41=(TextView) findViewById(R.id.data41);
        data42=(TextView) findViewById(R.id.data42);
        data43=(TextView) findViewById(R.id.data43);
        data44=(TextView) findViewById(R.id.data44);
        data45=(TextView) findViewById(R.id.data45);
        data46=(TextView) findViewById(R.id.data46);
        data47=(TextView) findViewById(R.id.data47);
        data48=(TextView) findViewById(R.id.data48);
        data49=(TextView) findViewById(R.id.data49);
        data50=(TextView) findViewById(R.id.data50);
    }

    private void setDel(){
        declare();
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        TextView[] disp_data ={data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,data20,data21,data22,data23,data24,data25,data26,data27,data28,data29,data30,data31,data32,data33,data34,data35,data36,data37,data38,data39,data40,data41,data42,data43,data44,data45,data46,data47,data48,data49,data50};

    for(int i=0;i<parseInt(sharedpreferences.getString("0",""));i++){
        disp_data[i].setText("");
        editor.putString(String.valueOf(i+1),"");
        editor.apply();
        }
    editor.clear();
    editor.putString("0","0");
        editor.apply();
        input_data.clear();
        typeB.setText("");
        uaDisp.setText("");
        ucDisp.setText("");
        avgDisp.setText("");
    }
    private double avgCalc(List<String> input_data){
        int i;
        double sum=0;
        for(i=0;i<input_data.size();i++){
            sum=sum+Double.parseDouble(input_data.get(i));
        }
        return sum/input_data.size();
    }
    private double uaCalc(List<String> input_data,double avg){
        int i,listSize=input_data.size();
        double num=0,deno=listSize*(listSize-1);
        double ua;
        for(i=0;i<input_data.size();i++){
            num=Math.pow(Double.parseDouble(input_data.get(i))-avg,2);
        }
        ua=Math.sqrt(num/deno);
        return ua;
    }
    private double ucCalc(double ua,double ub){
        double uc;
        uc=Math.sqrt(Math.pow(ua,2)+Math.pow(ub,2));
        return uc;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setIni();

            btn_add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                TextView[] disp_data={data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,data20,data21,data22,data23,data24,data25,data26,data27,data28,data29,data30,data31,data32,data33,data34,data35,data36,data37,data38,data39,data40,data41,data42,data43,data44,data45,data46,data47,data48,data49,data50};

                if(input_data.size()<50){
                    String data_temp= add.getText().toString();
                    add.setText("");
                if(isNumeric(data_temp)) {
                    input_data.add(data_temp);

                    for (int i=0;i<input_data.size();i++) {
                        disp_data[i].setText("(" + (i + 1) + ")" + input_data.get(i));

                        editor.putString(String.valueOf(i + 1), input_data.get(i));
                        editor.apply();


                    }
                    editor.putString(String.valueOf(0), String.valueOf(input_data.size()));
                    editor.apply();
                }
                }
                    else {
                    Toast.makeText(getApplicationContext(), "已达到最大数据组数！",
                            Toast.LENGTH_SHORT).show();
                }
            }


        }
        );




        btn_change.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            String change_temp;
change_temp=edit_data.getText().toString();
if(isNumeric(change_temp)){
    if(isNumeric(edit_num.getText().toString())){
        int find_index=parseInt(edit_num.getText().toString());
        int find_data=parseInt(edit_num.getText().toString());
        if(find_index<=input_data.size()){
            input_data.set(find_index-1,change_temp);
            sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedpreferences.edit();
            TextView[] disp_data={data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,data20,data21,data22,data23,data24,data25,data26,data27,data28,data29,data30,data31,data32,data33,data34,data35,data36,data37,data38,data39,data40,data41,data42,data43,data44,data45,data46,data47,data48,data49,data50};

            for (int i=0;i<input_data.size();i++) {
                disp_data[i].setText("(" + (i+1) + ")" + input_data.get(i));
                editor.putString(String.valueOf(i + 1), input_data.get(i));
                editor.apply();


            }

    }
    }
}
                                        }
                                    }
        );

        btn_delete_recent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                declare();
                TextView[] disp_data={data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,data20,data21,data22,data23,data24,data25,data26,data27,data28,data29,data30,data31,data32,data33,data34,data35,data36,data37,data38,data39,data40,data41,data42,data43,data44,data45,data46,data47,data48,data49,data50};

                    if(input_data.size()>0){
    disp_data[input_data.size()-1].setText("");
                sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                int index=input_data.size()-1;


                input_data.remove(index);
                int i;
                for(i=0;i<input_data.size();i++){
                    editor.putString(String.valueOf(i+1),String.valueOf(input_data.get(i)));
                    editor.apply();
                }
                editor.putString("0",String.valueOf(i));
                editor.apply();
            }
            }
        }
        );

        btn_delete_specific.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                declare();
                TextView[] disp_data={data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,data20,data21,data22,data23,data24,data25,data26,data27,data28,data29,data30,data31,data32,data33,data34,data35,data36,data37,data38,data39,data40,data41,data42,data43,data44,data45,data46,data47,data48,data49,data50};
                String delnum_temp= del_num.getText().toString();
                if(isNumeric(delnum_temp)){
                    if (parseInt(delnum_temp)<=50&&parseInt(delnum_temp)>0&&parseInt(delnum_temp)<=input_data.size()){

                        disp_data[parseInt(delnum_temp)-1].setText("");

                        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();

                input_data.remove(parseInt(delnum_temp)-1);
                int i;
                for(i=0;i<50;i++)
                    disp_data[i].setText("");
                for(i=0;i<input_data.size();i++){
                    disp_data[i].setText("("+(i+1)+")"+input_data.get(i));
                    editor.putString(String.valueOf(i+1),String.valueOf(input_data.get(i)));
                    editor.apply();
                }
                editor.putString("0",String.valueOf(i));
                editor.apply();
                del_num.setText("");
                    }
                }
            }
        }
        );
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                declare();

                edit_num.setText("");
                edit_data.setText("");
            }
        }
        );
        btn_exe.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             declare();

                                             String ub_temp;
                                             ub_temp=typeB.getText().toString();
if(input_data.size()==0){
    Toast.makeText(getApplicationContext(), "请输入数据！",
            Toast.LENGTH_SHORT).show();
}
else{
                                             if(isNumeric(ub_temp)){
                                                 double uaVal,ubVal,ucVal;
                                                 uaVal=uaCalc(input_data,avgCalc(input_data));
                                                 ubVal=parseDouble(ub_temp);
                                                 ucVal=ucCalc(uaVal,ubVal);
                                                 if(Math.abs(uaVal)<0.001||Math.abs(uaVal)>=1.0E7)
                                                     uaDisp.setText(String.valueOf(uaVal));
                                                 else
                                                     uaDisp.setText(String.format("%.6f", uaVal));

                                                 if(Math.abs(uaVal)<0.001||Math.abs(ucVal)>=1.0E7)
                                                     ucDisp.setText(String.valueOf(ucVal));
                                                 else
                                                     ucDisp.setText(String.format("%.6f", ucVal));
double avgVal=avgCalc(input_data);
                                                 if(Math.abs(avgVal)<0.001||Math.abs(avgVal)>=1.0E7)
                                                     avgDisp.setText(String.valueOf(avgVal));
                                                 else
                                                     avgDisp.setText(String.format("%.6f", avgVal));



                                             }


                                             else {
                                                 Toast.makeText(getApplicationContext(), "B类不确定度无效",
                                                         Toast.LENGTH_SHORT).show();

                                             }
}
                                         }
                                     }
        );

        btn_delete_all.setOnClickListener(new View.OnClickListener() {
            final static int COUNTS = 3;
            final static long DURATION = 1500;
            long[] mHits = new long[COUNTS];

            @Override
            public void onClick(View v) {
                System.arraycopy(mHits, 1, mHits, 0, mHits.length - 1);
                mHits[mHits.length - 1] = SystemClock.uptimeMillis();
                if (mHits[0] >= (SystemClock.uptimeMillis() - DURATION)) {
                    mHits = new long[COUNTS];
                    setDel();

                }
            }
        }
        );
    }
}

