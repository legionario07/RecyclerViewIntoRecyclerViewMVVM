package br.com.omniatechnology.recyclerviewintorecyclerview.models;

import android.os.Parcel;
import android.os.Parcelable;


import java.util.List;

public class ModelA implements Parcelable {

    private String texto1;
    private List<ModelB> modelsB;

    public ModelA(){

    }

    public ModelA(String texto1, List<ModelB> modelsB){
        this();
        this.texto1 = texto1;
        this.modelsB = modelsB;
    }

    public String getTexto1() {
        return texto1;
    }

    public void setTexto1(String texto1) {
        this.texto1 = texto1;
    }

    public List<ModelB> getModelsB() {
        return modelsB;
    }

    public void setModelsB(List<ModelB> modelsB) {
        this.modelsB = modelsB;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.texto1);
        dest.writeTypedList(this.modelsB);
    }

    protected ModelA(Parcel in) {
        this.texto1 = in.readString();
        this.modelsB = in.createTypedArrayList(ModelB.CREATOR);
    }

    public static final Creator<ModelA> CREATOR = new Creator<ModelA>() {
        @Override
        public ModelA createFromParcel(Parcel source) {
            return new ModelA(source);
        }

        @Override
        public ModelA[] newArray(int size) {
            return new ModelA[size];
        }
    };
}
