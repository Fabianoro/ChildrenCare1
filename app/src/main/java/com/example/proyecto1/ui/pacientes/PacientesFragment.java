package com.example.proyecto1.ui.pacientes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.proyecto1.R;
import com.example.proyecto1.ui.pacientes.PacientesViewModel;

public class PacientesFragment extends Fragment {

    private PacientesViewModel PacientesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PacientesViewModel =
                ViewModelProviders.of(this).get(PacientesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pacientes, container, false);
        final TextView textView = root.findViewById(R.id.text_pacientes);
        PacientesViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}