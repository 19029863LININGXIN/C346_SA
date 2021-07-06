package sg.edu.rp.c346.id19029863.c346sa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class ItemListActivity extends AppCompatActivity {
    Spinner spn;
    EditText name, id;
    Button add, update, delete;
    ListView LV;
    DatePicker dp;
    ArrayAdapter aproduct;
    ArrayList product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
        spn = findViewById(R.id.spinner);
        name = findViewById(R.id.name);
        id = findViewById(R.id.ID);
        add = findViewById(R.id.buttonAdd);
        update = findViewById(R.id.buttonUpdate);
        delete = findViewById(R.id.buttonDelete);
        LV = findViewById(R.id.listViewProduct);

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Calendar calendar = Calendar.getInstance();
                int years = calendar.get(Calendar.YEAR);
                int months = calendar.get(Calendar.MONTH);
                int Monthdiff = (12 * (years - dp.getYear())) + (months - dp.getMonth()) + 1 ;

                switch(position){
                    case 0:
                        if(Monthdiff <= 1){
                            //
                        }
                    case 1:
                        if(Monthdiff <= 3){
                            //
                        }
                    case 2:
                        if(Monthdiff <= 6){
                            //
                        }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intDay = dp.getDayOfMonth();
                int intMonth = dp.getMonth() + 1;
                int intYear = dp.getYear();
                String newItem = name.getText().toString();
                String text = "Expires " + intYear + "-" + intMonth + "-" + intDay + " " + newItem;
                product.add(text);
                aproduct.notifyDataSetChanged();
                Collections.sort(product);
                Toast.makeText(ItemListActivity.this, R.string.Added, Toast.LENGTH_SHORT).show();
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int newIntDay = dp.getDayOfMonth();
                int newIntMonth = dp.getMonth() + 1;
                int newIntYear = dp.getYear();
                String newProduct = name.getText().toString();
                int pos = Integer.parseInt(id.getText().toString());
                String newText = "Expires " + newIntYear + "-" + newIntMonth + "-" + newIntDay + " " + newProduct;
                product.set(pos, newText);
                aproduct.notifyDataSetChanged();
                Toast.makeText(ItemListActivity.this, R.string.Updated, Toast.LENGTH_SHORT).show();
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = Integer.parseInt(id.getText().toString());
                if (product.isEmpty()){
                    Toast.makeText(ItemListActivity.this, R.string.Empty, Toast.LENGTH_SHORT).show();
                }else if (pos > product.size() -1 || pos < 0 ){
                    Toast.makeText(ItemListActivity.this, R.string.WrongID, Toast.LENGTH_SHORT).show();
                }else{
                    product.remove(pos);
                    aproduct.notifyDataSetChanged();
                    Toast.makeText(ItemListActivity.this, R.string.Removed, Toast.LENGTH_SHORT).show();
                }



            }
        });
    }
}