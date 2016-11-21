package com.android.pi.ejercicioclaseimagenes;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
ImageButton bmortadelo;
ImageButton bmafalda;
    ImageView imagencentral;
    CheckBox cb1;
    CheckBox cb2;
    CheckBox cb3;
    RelativeLayout layout;
    RadioGroup radiogrupo;
    RadioButton rbpulsado;

//Drawable imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bmortadelo = (ImageButton) findViewById(R.id.imortadelo);
        bmafalda = (ImageButton) findViewById(R.id.imafalda);
        imagencentral = (ImageView) findViewById(R.id.imageView);
        cb1 = (CheckBox) findViewById(R.id.cbfr);
        cb2= (CheckBox) findViewById(R.id.cbtr);
        cb3 = (CheckBox) findViewById(R.id.cbav);
        layout = (RelativeLayout) findViewById(R.id.layout);
        radiogrupo = (RadioGroup) findViewById(R.id.radiogrupo);


        radiogrupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                 rbpulsado = (RadioButton) findViewById(i);
                if (rbpulsado.getId()==R.id.rbc){
                    imagencentral.setScaleType(ImageView.ScaleType.CENTER);
                }
                else if (rbpulsado.getId()==R.id.rbe){
                    imagencentral.setScaleType(ImageView.ScaleType.FIT_XY);
                }


            }
        });
        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (cb1.isChecked()){
                    imagencentral.setBackgroundColor(getResources().getColor(R.color.rojo));
                }
                else imagencentral.setBackgroundColor(getResources().getColor(R.color.blanco));
            }
        });



        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (cb2.isChecked()){
                    imagencentral.setAlpha(new Float(0.5));
                }
                else imagencentral.setAlpha(new Float(1));
            }
        });

        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (cb3.isChecked()){

                    layout.setBackgroundColor(getResources().getColor(R.color.verde));
                }
                else layout.setBackgroundColor(getResources().getColor(R.color.blanco));
            }
        });
        bmafalda.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                imagencentral.setImageDrawable(bmafalda.getDrawable());
            }
        });

        bmortadelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imagencentral.setImageDrawable(bmortadelo.getDrawable());

            }
        });
    }
}
