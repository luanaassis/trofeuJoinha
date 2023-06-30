package com.example.trofeujoinha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.trofeujoinha.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        TrofeuJoinhaViewModel viewModel = new ViewModelProvider(this).get(TrofeuJoinhaViewModel.class);
        binding.setLifecycleOwner(this);
        binding.setViewModel(viewModel);
    }
}