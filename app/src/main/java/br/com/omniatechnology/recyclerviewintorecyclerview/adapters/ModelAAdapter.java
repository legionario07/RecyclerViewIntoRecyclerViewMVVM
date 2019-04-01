package br.com.omniatechnology.recyclerviewintorecyclerview.adapters;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import br.com.omniatechnology.recyclerviewintorecyclerview.R;
import br.com.omniatechnology.recyclerviewintorecyclerview.databinding.LayoutParentBinding;
import br.com.omniatechnology.recyclerviewintorecyclerview.models.ModelA;

public class ModelAAdapter extends RecyclerView.Adapter<ModelAAdapter.ModelAViewHolder> {


    private List<ModelA> lista;


    public ModelAAdapter(List<ModelA> lista){
        this.lista = lista;
    }

    @NonNull
    @Override
    public ModelAViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutParentBinding layoutParentBinding = DataBindingUtil.inflate(

                LayoutInflater.from(viewGroup.getContext()),
                        R.layout.layout_parent,
                viewGroup,
                false

        );

        return new ModelAViewHolder(layoutParentBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ModelAViewHolder modelAViewHolder, int i) {

        ModelA modelA = lista.get(i);



        modelAViewHolder.layoutParentBinding.setModelA(modelA);

        initRecyclerView(modelAViewHolder, modelA);

        if(i%2==0)
            modelAViewHolder.layoutParentBinding.ll.setBackgroundColor(Color.CYAN);


    }

    private void initRecyclerView(ModelAViewHolder modelAViewHolder, ModelA modelA) {

        modelAViewHolder.layoutParentBinding.recyclerViewInternal.setLayoutManager(
                new LinearLayoutManager(modelAViewHolder.itemView.getContext())
        );

        modelAViewHolder.layoutParentBinding.recyclerViewInternal.setHasFixedSize(true);
        ModelBAdapter modelBAdapter = new ModelBAdapter(modelA.getModelsB());
        modelAViewHolder.layoutParentBinding.recyclerViewInternal.setAdapter(modelBAdapter);


    }


    @Override
    public int getItemCount() {
        return lista.size();
    }

    public static class ModelAViewHolder extends RecyclerView.ViewHolder {

        private LayoutParentBinding layoutParentBinding;

        public ModelAViewHolder(@NonNull LayoutParentBinding itemView) {
            super(itemView.getRoot());
            layoutParentBinding = itemView;
        }
    }

}
