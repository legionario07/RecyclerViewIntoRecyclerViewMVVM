package br.com.omniatechnology.recyclerviewintorecyclerview.views;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import br.com.omniatechnology.recyclerviewintorecyclerview.R;
import br.com.omniatechnology.recyclerviewintorecyclerview.adapters.ModelAAdapter;
import br.com.omniatechnology.recyclerviewintorecyclerview.databinding.ActivityMainBinding;
import br.com.omniatechnology.recyclerviewintorecyclerview.models.ModelA;
import br.com.omniatechnology.recyclerviewintorecyclerview.models.ModelB;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private ModelAAdapter modelAAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        modelAAdapter = new ModelAAdapter(getLista());
        activityMainBinding.recyclerViewParent.setLayoutManager(new LinearLayoutManager(this));
        activityMainBinding.recyclerViewParent.setHasFixedSize(true);
        activityMainBinding.recyclerViewParent.setAdapter(modelAAdapter);
        activityMainBinding.executePendingBindings();

    }

    private List<ModelA> getLista(){

        List<ModelA> lista = new ArrayList<>();

        ModelA modelA1 = new ModelA("Test A", getModelB());
        ModelA modelA2 = new ModelA("Test B", getModelB());
        ModelA modelA3 = new ModelA("Test C", getModelB());

        lista.add(modelA1);
        lista.add(modelA2);
        lista.add(modelA3);

        return lista;

    }

    private List<ModelB> getModelB(){

        List<ModelB> lista = new ArrayList<>();

        ModelB modelB1 = new ModelB("TEST1", "TESTA");
        ModelB modelB2 = new ModelB("TEST2", "TESTB");
        ModelB modelB3 = new ModelB("TEST3", "TESTC");

        lista.add(modelB1);
        lista.add(modelB2);
        lista.add(modelB3);

        return lista;

    }
}
