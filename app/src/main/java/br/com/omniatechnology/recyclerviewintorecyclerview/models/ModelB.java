package br.com.omniatechnology.recyclerviewintorecyclerview.models;

import android.os.Parcel;
import android.os.Parcelable;

public class ModelB implements Parcelable {

    private String texto1;
    private String texto2;

    public ModelB(){

    }

    public ModelB(String texto1, String texto2){
        this();
        this.texto1 = texto1;
        this.texto2 = texto2;
    }

    public String getTexto1() {
        return texto1;
    }

    public void setTexto1(String texto1) {
        this.texto1 = texto1;
    }

    public String getTexto2() {
        return texto2;
    }

    public void setTexto2(String texto2) {
        this.texto2 = texto2;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.texto1);
        dest.writeString(this.texto2);
    }

    protected ModelB(Parcel in) {
        this.texto1 = in.readString();
        this.texto2 = in.readString();
    }

    public static final Creator<ModelB> CREATOR = new Creator<ModelB>() {
        @Override
        public ModelB createFromParcel(Parcel source) {
            return new ModelB(source);
        }

        @Override
        public ModelB[] newArray(int size) {
            return new ModelB[size];
        }
    };
}
