package com.example.kids_learning_app;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GeneralKnowledgeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GeneralKnowledgeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ListView listView;
    private Drawable knowledgebg;

    public GeneralKnowledgeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GeneralKnowledgeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GeneralKnowledgeFragment newInstance(String param1, String param2) {
        GeneralKnowledgeFragment fragment = new GeneralKnowledgeFragment();
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
        View v = inflater.inflate(R.layout.fragment_general_knowledge, container, false);


        String[] items = {
                "Animals",
                "Birds",
                "Bangladesh",
                "Body & Face",
                "Colors",
                "Dress",
                "Fruits",
                "Foods",
                "Flowers",
                "Family",
                "Poems",
                "Professions",
                "Vegetables",
                "Vehicles",
               };


        ListView lv = v.findViewById(R.id.listview);
        lv.setBackground(knowledgebg);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_expandable_list_item_1, items);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(getContext(), AnimalsActivity.class));
                } else if (position == 1) {
                    startActivity(new Intent(getContext(), BirdsActivity.class));
                } else if (position == 2) {
                    startActivity(new Intent(getContext(), BangladeshActivity.class));
                } else if (position == 3) {
                    startActivity(new Intent(getContext(), BodyFaceActivity.class));
                } else if (position == 4) {
                    startActivity(new Intent(getContext(), ColorsActivity.class));
                } else if (position == 5) {
                    startActivity(new Intent(getContext(), DressActivity.class));
                } else if (position == 6) {
                    startActivity(new Intent(getContext(), FruitsActivity.class));
                } else if (position == 7) {
                    startActivity(new Intent(getContext(), FoodsActivity.class));
                } else if (position == 8) {
                    startActivity(new Intent(getContext(), FlowersActivity.class));
                } else if (position == 9) {
                    startActivity(new Intent(getContext(), FamilyActivity.class));
                } else if (position == 10) {
                    startActivity(new Intent(getContext(), PoemsActivity.class));
                } else if (position == 11) {
                    startActivity(new Intent(getContext(), ProfessionsActivity.class));
                } else if (position == 12) {
                    startActivity(new Intent(getContext(), VegetablesActivity.class));
                } else if (position == 13) {
                    startActivity(new Intent(getContext(), VehiclesActivity.class));
                }
            }
        });
        return v;
    }

}