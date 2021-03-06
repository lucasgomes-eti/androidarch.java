package com.example.android.androidarchjava.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.androidarchjava.App;
import com.example.android.androidarchjava.R;
import com.example.android.androidarchjava.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((App) getApplication()).component.inject(this);
        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        TextView helloTextView = findViewById(R.id.tv_hello);

        viewModel.getHello().observe(this, helloTextView::setText);
    }
}
