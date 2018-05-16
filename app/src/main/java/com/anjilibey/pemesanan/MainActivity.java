package com.anjilibey.pemesanan;

import android.content.Intent;
import android.renderscript.Sampler;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private	EditText mShareTextEditText;
    private Button mMakanan, mMinuman, mCamilan;
    public static final String EXTRA_JENIS = new String();
    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShareTextEditText	= (EditText) findViewById(R.id.share_edittext);
        mMakanan = (Button) findViewById(R.id.btnMakanan);
        mMinuman = (Button) findViewById(R.id.btnMinuman);
        mCamilan= (Button) findViewById(R.id.btnCamilan);
    }

    public void shareText(View view) {
        String	txt	= mShareTextEditText.getText().toString();
        String	mimeType = "text/plain";

        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Share	this	text	with:	")
                .setText(txt)
                .startChooser();
    }

    public void food(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        String jenis = "makanan";
        intent.putExtra(EXTRA_JENIS, jenis);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    public void drink(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        String jenis = "minuman";
        intent.putExtra(EXTRA_JENIS, jenis);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    public void snack(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        String jenis = "jajan";
        intent.putExtra(EXTRA_JENIS, jenis);
        startActivityForResult(intent, TEXT_REQUEST);
    }
}
