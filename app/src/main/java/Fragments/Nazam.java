package Fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.rekhta.R;

public class Nazam extends Fragment {
    private static final String TAG = "NAZAM FRAGMENT";

    private TextView misrah_1;
    private TextView misrah_2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nazam,container,false);
        misrah_1 = view.findViewById(R.id.misrah);
        misrah_2 = view.findViewById(R.id.misrah2);

        misrah_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "TESTING BUTTON CLICK 3",Toast.LENGTH_SHORT).show();


            }
        });

        misrah_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "TESTING   CLICK 3",Toast.LENGTH_SHORT).show();


            }
        });

        return view;
    }
}
