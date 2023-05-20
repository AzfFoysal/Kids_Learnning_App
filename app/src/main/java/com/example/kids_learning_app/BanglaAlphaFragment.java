package com.example.kids_learning_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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
        View v = inflater.inflate(R.layout.fragment_alphabet, container, false);

        String[] alpha = new String[65];
        for(int i=0, j=2437;i<65;i++,j++)
        {
            alpha[i] = Character.toString((char)j);
        }

        GridView gv = v.findViewById(R.id.gridview1);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_expandable_list_item_1, alpha);
        gv.setAdapter(adapter);

        gv.setOnItemClickListener((adapterView, view, position, l) -> {
            Intent i1 = new Intent(getContext(), AlphabetActivity.class);
            i1.putExtra("name",alpha[position]);
            startActivity(i1);
        });
        return v;
    }
}