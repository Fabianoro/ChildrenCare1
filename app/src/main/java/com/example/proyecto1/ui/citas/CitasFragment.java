package com.example.proyecto1.ui.citas;

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

public class CitasFragment extends Fragment {

    private CitasViewModel CitasViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CitasViewModel =
                ViewModelProviders.of(this).get(CitasViewModel.class);
        View root = inflater.inflate(R.layout.fragment_citas, container, false);
        final TextView textView = root.findViewById(R.id.text_citas);
        CitasViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}