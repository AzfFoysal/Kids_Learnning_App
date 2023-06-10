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
 * Use the {@link NumberFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NumberFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public NumberFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NumberFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NumberFragment newInstance(String param1, String param2) {
        NumberFragment fragment = new NumberFragment();
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
            // TODO: Rename and change types of parameters
            String mParam1 = getArguments().getString(ARG_PARAM1);
            String mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_number, container, false);

        String[] alpha = {
                "0","1",    "০","১",
                "2","3",    "২","৩",
                "4","5",    "৪","৫",
                "6","7",    "৬","৭",
                "8","9",    "৮","৯",
                "10","11",  "১০","১১",
                "12","13",  "১২","১৩",
                "14","15",  "১৪","১৫",
                "16","17",  "১৬","১৭",
                "18","19",  "১৮","১৯",
                "20","21",  "২০","২১",
                "22","23",  "২২","২৩",
                "24","25",  "২৪","২৫",
                "26","27",  "২৬","২৭",
                "28","29",  "২৮","২৯",
                "30","31",  "৩০","৩১",
                "32","33",  "৩২","৩৩",
                "34","35",  "৩৪","৩৫",
                "36","37",  "৩৬","৩৭",
                "38","39",  "৩৮","৩৯",
                "40","41",  "৪০","৪১",
                "42","43",  "৪২","৪৩",
                "44","45",  "৪৪","৪৫",
                "46","47",  "৪৬","৪৭",
                "48","49",  "৪৮","৪৯",
                "50",System.getProperty("line.separator"), "৫০",
        };

        GridView gv = v.findViewById(R.id.gridview1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_expandable_list_item_1, alpha);
        gv.setAdapter(adapter);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent il = new Intent(getContext(), NumberActivity.class);
                il.putExtra("name", alpha[position]);

                boolean itemsLocked = false;
                if (position == 101) return;
                itemsLocked = true;

                startActivity(il);

            }
        });

        return v;
    }

}