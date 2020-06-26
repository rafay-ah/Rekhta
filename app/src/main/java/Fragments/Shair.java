package Fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.rekhta.R;

public class Shair extends Fragment {
    private static final String TAG = "SHAIR FRAGMENT";

    private TextView TEST;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.shair,container,false);
        TEST = view.findViewById(R.id.test);

       // CardView card = view.findViewById(R.id.card_view);
        //card.setCardBackgroundColor(Color.parseColor("#E6E6E6"));
        //card.setMaxCardElevation(0);
        //card.setRadius(5);

//        TEST.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity(), "TESTING BUTTON CLICK 3",Toast.LENGTH_SHORT).show();
//            }
//        });

        return view;
    }
}
