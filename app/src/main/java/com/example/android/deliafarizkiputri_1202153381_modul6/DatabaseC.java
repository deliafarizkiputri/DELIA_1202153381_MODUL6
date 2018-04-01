package com.example.android.deliafarizkiputri_1202153381_modul6;

import com.google.firebase.firestore.IgnoreExtraProperties;

/**
 * Created by Delia farizki on 0001,01/Apr/2018.
 */

@IgnoreExtraProperties
public class DatabaseC {
    String commenters, comments, commentedImage;

    //method kosong untuk membaca data
    public DatabaseC(){
    }

    //konstruktor
    public DatabaseC(String commenters, String comments, String commentedImage) {
        this.commenters = commenters;
        this.comments = comments;
        this.commentedImage = commentedImage;
    }

    //method getter
    public String getCommenters() {
        return commenters;
    }

    public String getComments() {
        return comments;
    }

    public String getCommentedImage() {
        return commentedImage;
    }
}
