package com.ekncyln.firstandroidproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentIkinci extends Fragment {

    private Button buttonFr2;
    private TextView txtFr2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_layout_2, container, false);

        buttonFr2 = rootView.findViewById(R.id.button_fr_2);
        txtFr2 = rootView.findViewById(R.id.txtFr2);

        buttonFr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtFr2.setText("Merhaba2");
            }
        });

        return rootView;
    }
}
