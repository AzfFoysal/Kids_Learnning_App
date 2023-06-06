package com.example.kids_learning_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BanglaAlphaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BanglaAlphaFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Button button;
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11;
    public BanglaAlphaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BanglaAlphaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BanglaAlphaFragment newInstance(String param1, String param2) {
        BanglaAlphaFragment fragment = new BanglaAlphaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_bangla_alpha, container, false);

        button1 = (android.widget.Button) v.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),BanglaAlphabetActivity.class));
            }
        });

        button2 = (android.widget.Button) v.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),BanglaAlphabetActivity.class));
            }
        });


        button3 = (android.widget.Button) v.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),BanglaAlphabetActivity.class));
            }
        });

        button4 = (android.widget.Button) v.findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),BanglaAlphabetActivity.class));
            }
        });

        button5 = (android.widget.Button) v.findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),BanglaAlphabetActivity.class));
            }
        });

        button6 = (android.widget.Button) v.findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),BanglaAlphabetActivity.class));
            }
        });

        button7 = (android.widget.Button) v.findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),BanglaAlphabetActivity.class));
            }
        });

        button8 = (android.widget.Button) v.findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),BanglaAlphabetActivity.class));
            }
        });

        button9 = (android.widget.Button) v.findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),BanglaAlphabetActivity.class));
            }
        });

        button10 = (android.widget.Button) v.findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),BanglaAlphabetActivity.class));
            }
        });

        button11 = (android.widget.Button) v.findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),BanglaAlphabetActivity.class));
            }
        });


        return v;
    }

}
