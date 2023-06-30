package com.example.trofeujoinha;

import android.graphics.Bitmap;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TrofeuJoinhaViewModel extends ViewModel {
    public LiveData <String> nome;
    public LiveData <String> sobrenome;
    public MutableLiveData<Integer> likes;

    public MutableLiveData<Integer> imagemLikes;

    public void trofeuJoinhaViewModel() {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.likes.setValue(0);
        this.imagemLikes= new MutableLiveData<>(R.drawable.joia);

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

    public void getImagemLikes(){
        if (this.likes.getValue()<=3){
            imagemLikes.setValue(R.drawable.joia);
        } else if(this.likes.getValue()>=4 && this.likes.getValue()<=9){
            imagemLikes.setValue(R.drawable.coracao);
        } else {
            imagemLikes.setValue(R.drawable.fogo);
        }
    }
}
