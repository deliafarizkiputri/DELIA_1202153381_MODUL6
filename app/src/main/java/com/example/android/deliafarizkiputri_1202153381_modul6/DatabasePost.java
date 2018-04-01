package com.example.android.deliafarizkiputri_1202153381_modul6;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Delia farizki on 0001,01/Apr/2018.
 */

@IgnoreExtraProperties
public class DatabasePost {
    String gmbr, judul, deskripsi, usr, key;

    //method kosong yang diperlukan untuk melakukan pengecekan
    public DatabasePost(){

    }

    //konstruktor
    public DatabasePost(String gmbr, String judul, String deskripsi,String usr){
        this.gmbr=gmbr;
        this.judul=judul;
        this.deskripsi=deskripsi;
        this.usr=usr;
    }

    //method getter
    public String getKey(){
        return key;
    }

    public void setKey(String key){
        key = key;
    }

    public String getGmbr() {
        return gmbr;
    }

    public String getJudul() {
        return judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getUsr() {
        return usr;
    }
}
