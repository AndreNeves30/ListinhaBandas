package br.com.etecia.listinhabandas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView ListaBandas;

    int banda[] = {R.drawable.starset,R.drawable.imaginedragoes};
    String nome[] = {"Starset","Imagine Dragons"};
    String integrantes[] = {"Dustin Bates, Ron DeChant, Brock Richards, Adam Gilbert","Umas pessoas legais"};
    String genero[] = {"Rock Alternativo","Rock"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListaBandas = findViewById(R.id.idlistaBandas);
        MyAdapter adapter = new MyAdapter();

        ListaBandas.setAdapter(adapter);
    }

    public class MyAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            ImageView imgbanda;
            TextView txtnome, txtintegrantes, txtgenero;

            View v = getLayoutInflater().inflate(R.layout.modelo_bandas,null);

            imgbanda = v.findViewById(R.id.imgBanda);
            txtnome = v.findViewById(R.id.txtNome);
            txtintegrantes = v.findViewById(R.id.txtIntegrantes);
            txtgenero = v.findViewById(R.id.txtGenero);

            imgbanda.setImageResource(banda[i]);
            txtnome.setText(nome[i]);
            txtintegrantes.setText(integrantes[i]);
            txtgenero.setText(genero[i]);


            return v;
        }
    }
}