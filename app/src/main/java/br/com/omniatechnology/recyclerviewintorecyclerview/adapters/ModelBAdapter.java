package br.com.omniatechnology.recyclerviewintorecyclerview.adapters;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.com.omniatechnology.recyclerviewintorecyclerview.R;
import br.com.omniatechnology.recyclerviewintorecyclerview.databinding.LayoutInternalBinding;
import br.com.omniatechnology.recyclerviewintorecyclerview.models.ModelB;

public class ModelBAdapter extends RecyclerView.Adapter<ModelBAdapter.ModelBViewHolder> {


    private List<ModelB> lista;
    
    public ModelBAdapter(List<ModelB> lista){
        this.lista = lista;
    }
    
    @NonNull
    @Override
    public ModelBViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInternalBinding layoutInternalBinding = DataBindingUtil.inflate(
                LayoutInflater.from(viewGroup.getContext()),
                R.layout.layout_internal,
                viewGroup,
                false

        );

        return new ModelBViewHolder(layoutInternalBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ModelBViewHolder modelBViewHolder, int i) {

        ModelB modelB = lista.get(i);

        modelBViewHolder.layoutInternalBinding.setModelB(modelB);

        if(i%2==0)
            modelBViewHolder.layoutInternalBinding.llInternal.setBackgroundColor(Color.LTGRAY);
        else
            modelBViewHolder.layoutInternalBinding.llInternal.setBackgroundColor(Color.WHITE);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public static class ModelBViewHolder extends RecyclerView.ViewHolder {

        LayoutInternalBinding layoutInternalBinding;

        public ModelBViewHolder(@NonNull LayoutInternalBinding itemView) {
            super(itemView.getRoot());
            layoutInternalBinding = itemView;
        }
    }

}
