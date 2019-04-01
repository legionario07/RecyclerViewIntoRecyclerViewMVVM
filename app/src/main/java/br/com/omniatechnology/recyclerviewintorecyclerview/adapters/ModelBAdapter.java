package br.com.omniatechnology.recyclerviewintorecyclerview.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.com.omniatechnology.recyclerviewintorecyclerview.models.ModelB;

public class ModelBAdapter extends RecyclerView.Adapter<ModelBAdapter.ModelBViewHolder> {


    private List<ModelB> lista;
    
    public ModelBAdapter(List<ModelB> lista){
        this.lista = lista;
    }
    
    @NonNull
    @Override
    public ModelBViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ModelBViewHolder modelBViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ModelBViewHolder extends RecyclerView.ViewHolder {

        public ModelBViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
