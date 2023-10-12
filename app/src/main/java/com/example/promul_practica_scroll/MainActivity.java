package com.example.promul_practica_scroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    /*
    * Para crear un scroll vertical, debemos agregar el elemento Containers -> ScrollView.
    *
    * Hay que tener en cuenta, que el elemento ScrollView solo puede tener un hijo directo,
    * así que si queremos que varios elementos estén dentro del contenedor ScrollView,
    * debemos primero ponerlos en un layout (agregando un Layouts -> ConstraintLayout, LinearLayout, o el que sea),
    * y seguidamente, poner ese layout dentro del ScrollView.
    *
    * En este ejemplo, a sido un texto principal fuera del scroll, luego un ScrollView
    * que contiene un LinearLayout que a su vez contiene dos textos, uno que es el
    * título secundario y otro que es el cuerpo del texto.
    *
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}