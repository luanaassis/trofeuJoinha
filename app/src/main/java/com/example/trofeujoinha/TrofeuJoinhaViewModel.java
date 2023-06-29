package com.example.trofeujoinha;

import android.graphics.Bitmap;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TrofeuJoinhaViewModel extends ViewModel {
    public LiveData <String> nome;
    public LiveData <String> sobrenome;
    public MutableLiveData<Integer> likes = new MutableLiveData<>();

    public MutableLiveData<Bitmap> imagemLikes = new MutableLiveData<>();

    public void trofeuViewModel() {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.likes.setValue(0);
    }

    public LiveData <String> getNome() {
        return nome;
    }

    public LiveData <String> getSobrenome() {
        return sobrenome;
    }

    public MutableLiveData<Integer> getLikes() {
        return likes;
    }

    public void darLike() {
        this.likes.setValue(this.likes.getValue() + 1);
    }

    public MutableLiveData<Bitmap> getImagemLikes(){
        if (this.likes.getValue()<=3){
            return 1;
        } else if(this.likes.getValue()>=4 && this.likes.getValue()<=9){
            return 2;
        } else {
            return 3;
        }
    }
}
