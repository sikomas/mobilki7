package com.example.practic77.UI.View;

import android.os.Bundle;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.example.practic77.DATA.Model.FragmentNavigatData;
import com.example.practic77.R;
public class Fragment1 extends Fragment {
    public FragmentNavigatData data = new FragmentNavigatData();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        Button toSecond = view.findViewById(R.id.to_second);
        toSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_Fragment1_to_Fragment2);
                Bundle bundle = new Bundle();
                String res = "Это переданные данные с 1 фрагмента";
                bundle.putString("res", res);
                Navigation.findNavController(view).navigate(R.id.Fragment2, bundle);
            }
        });
        return view;
    }
}
