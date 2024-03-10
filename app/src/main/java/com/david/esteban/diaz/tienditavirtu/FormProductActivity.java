package com.david.esteban.diaz.tienditavirtu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class FormProductActivity extends AppCompatActivity {

    private Button btn_save;
    private TextInputLayout nameTF, descriptioTF, priceTF, imageURL_TF;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_product);

        btn_save = findViewById(R.id.btn_save_product);

        nameTF = findViewById(R.id.et_name);
        descriptioTF = findViewById(R.id.et_decription);
        priceTF = findViewById(R.id.et_price);
        imageURL_TF = findViewById(R.id.et_url_image);
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = nameTF.getEditText().getText().toString().trim();
                String description = descriptioTF.getEditText().getText().toString().trim();
                String price = priceTF.getEditText().getText().toString().trim();
                String url_image = imageURL_TF.getEditText().getText().toString().trim();

                if (name.isEmpty()){
                    nameTF.setError("PORFAVOR INGRESE UN NOMBRE PARA EL PRODUCTO");
                    return;
                } else if (name.length()>20) {
                    nameTF.setError("EL NOMBRE DEBE SER MENOR DE 20 CARACTERES");
                    return;
                    
                }

                if (description.isEmpty()){
                    nameTF.setError("PORFAVOR INGRESE UNA DESCRIPCION PARA EL PRODUCTO");
                }

                if (price.isEmpty()){
                    nameTF.setError("PORFAVOR INGRESE UN PRECIO PARA EL PRODUCTO");
                }

                if (url_image.isEmpty()){
                    nameTF.setError("PORFAVOR INGRESE UNA URL DE IMAGEN PARA EL PRODUCTO");
                }

                product myNewProduct = new product("Computador", "descripcion","NO hay por ahora" , 50000.0);

                Toast.makeText(FormProductActivity.this, "Producto agregado", Toast.LENGTH_LONG);
            }

        });
    }
}