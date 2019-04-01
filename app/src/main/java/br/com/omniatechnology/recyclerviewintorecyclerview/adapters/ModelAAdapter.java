package br.com.omniatechnology.recyclerviewintorecyclerview.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.com.omniatechnology.recyclerviewintorecyclerview.models.ModelA;
import br.com.omniatechnology.recyclerviewintorecyclerview.models.ModelB;

public class ModelAAdapter extends RecyclerView.Adapter<ModelAAdapter.ModelAViewHolder> {


    private List<ModelA> lista;

    public ModelAAdapter(List<ModelA> lista){
        this.lista = lista;
    }

    @NonNull
    @Override
    public ModelAViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ModelAViewHolder modelAViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ModelAViewHolder extends RecyclerView.ViewHolder {

        public ModelAViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
