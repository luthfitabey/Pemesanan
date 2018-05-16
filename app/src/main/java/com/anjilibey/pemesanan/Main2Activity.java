package com.anjilibey.pemesanan;

import android.content.Intent;
import android.os.Message;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.anjilibey.pemesanan.MainActivity.EXTRA_JENIS;

public class Main2Activity extends AppCompatActivity {
    private Button mpesan;
    private CheckBox mc1, mc2, mc3;
    private TextView tot1, tot2, tot3;
    private String check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        CheckBox mc1 = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox mc2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox mc3 = (CheckBox) findViewById(R.id.checkBox3);
        TextView txt = (TextView) findViewById(R.id.textView2);
        EditText tot1 = (EditText) findViewById(R.id.txtTotal1);
        EditText tot2 = (EditText) findViewById(R.id.txtTotal2);
        EditText tot3 = (EditText) findViewById(R.id.txtTotal3);
        Button mpesan = (Button) findViewById(R.id.btnpesan);


        Intent intent = getIntent();
        String message = intent.getStringExtra(EXTRA_JENIS);
        if (message.equals("makanan")) {
            mc1.setText("Pecel Lele");
            mc2.setText("Sambal Terong");
            mc3.setText("Soto Ayam");
            txt.setText("Pilihan Makanan");
        } else if (message.equals("minuman")) {
            mc1.setText("Es Teh");
            mc2.setText("Es Jeruk");
            mc3.setText("Lemon Tea");
            txt.setText("Pilihan Minuman");
        } else if (message.equals("jajan")) {
            mc1.setText("Oreo");
            mc2.setText("Chitato");
            mc3.setText("Tahu Krispi");
            txt.setText("Pilihan Camilan");
        }
    }



    public void order(View view) {
        CheckBox mc1 = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox mc2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox mc3 = (CheckBox) findViewById(R.id.checkBox3);
        EditText tot1 = (EditText) findViewById(R.id.txtTotal1);
        EditText tot2 = (EditText) findViewById(R.id.txtTotal2);
        EditText tot3 = (EditText) findViewById(R.id.txtTotal3);


//                if (mc1.isChecked() && mc2.isChecked() && mc3.isChecked()){
//            check = "1";
//            Toast toast= Toast.makeText(getApplicationContext(), "Pesanan Anda Telah Diproses Harap Tungggu", Toast.LENGTH_SHORT);
//            toast.show();
//            finish();
//            Log.d(check,"IF");
//
//
//
//        }
//        else {check = "0";
//            Toast toast = Toast.makeText(getApplicationContext(), "Mohon isikan data", Toast.LENGTH_SHORT);
//            toast.show();
//            Log.d(check,"else");
//
//        }

////////////////////////////////////////////////////////


        String a = tot1.getText().toString();
        String b = tot2.getText().toString();
        String c = tot3.getText().toString();
//        String reply = "";

//        Toast toast;
//        toast = Toast.makeText(getApplicationContext(), "Pesanan Anda Ialah: " +
//                mc1.getText() + ": " + a + "/n" +
//                mc2.getText() + ": " + b + "/n" +
//                mc3.getText() + ": " + c + "/n sedang diproses", Toast.LENGTH_LONG);
//        toast.show();
//        finish();

        if( mc1.isChecked() && mc2.isChecked()){
            Toast toast;
            toast = Toast.makeText(getApplicationContext(), "Pesanan Anda Ialah: \n" +
                    mc1.getText() + ": " + a + "\n" +
                    mc2.getText() + ": " + b + "\n Sedang diproses", Toast.LENGTH_SHORT);
            toast.show();
            finish();
        }
        else if (mc1.isChecked() && mc3.isChecked()){
            Toast toast;
            toast = Toast.makeText(getApplicationContext(), "Pesanan Anda Ialah: \n" +
                    mc1.getText() + ": " + a + "\n" +
                    mc3.getText() + ": " + c + "\n Sedang diproses", Toast.LENGTH_SHORT);
            toast.show();
            finish();
        }
        else if (mc2.isChecked() && mc3.isChecked()){
            Toast toast;
            toast = Toast.makeText(getApplicationContext(), "Pesanan Anda Ialah: \n" +
                    mc2.getText() + ": " + b + "\n" +
                    mc3.getText() + ": " + c + "\n Sedang diproses", Toast.LENGTH_SHORT);
            toast.show();
            finish();
        }
        else if (mc2.isChecked() && mc1.isChecked() && mc3.isChecked()){
            Toast toast;
            toast = Toast.makeText(getApplicationContext(), "Pesanan Anda Ialah: \n" +
                    mc1.getText() + ": " + a + "\n" +
                    mc2.getText() + ": " + b + "\n" +
                    mc3.getText() + ": " + c + "\n Sedang diproses", Toast.LENGTH_SHORT);
            toast.show();
            finish();
        }
        else if (mc1.isChecked()){
            Toast toast;
            toast = Toast.makeText(getApplicationContext(), "Pesanan Anda Ialah: \n" +
                    mc1.getText() + ": " + a + "\n" +
                    "\n Sedang diproses", Toast.LENGTH_SHORT);
            toast.show();
            finish();
        }
        else if (mc2.isChecked()){
            Toast toast;
            toast = Toast.makeText(getApplicationContext(), "Pesanan Anda Ialah: " +
                    mc2.getText() + ": " + b + "\n" +
                    "\n Sedang diproses", Toast.LENGTH_SHORT);
            toast.show();
            finish();
        }
        else if (mc3.isChecked()){
            Toast toast;
            toast = Toast.makeText(getApplicationContext(), "Pesanan Anda Ialah: \n" +
                    mc3.getText() + ": " + c + "\n Sedang diproses", Toast.LENGTH_SHORT);
            toast.show();
            finish();
        }
        else if (mc1.isChecked() == false && mc2.isChecked()==false && mc3.isChecked()==false){
            Toast toast;
            toast = Toast.makeText(getApplicationContext(), "Silahkan Centang pilihan menu", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
