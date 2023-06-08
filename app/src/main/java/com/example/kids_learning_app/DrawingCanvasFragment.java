package com.example.kids_learning_app;

import static android.widget.Toast.LENGTH_LONG;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.Toast;

import java.util.zip.Inflater;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DrawingCanvasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DrawingCanvasFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Button continueBtn;
    public DrawingCanvasFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DrawingCanvasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DrawingCanvasFragment newInstance(String param1, String param2) {
        DrawingCanvasFragment fragment = new DrawingCanvasFragment();
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
        View v = inflater.inflate(R.layout.fragment_drawing_canvas, container, false);

        Button openDrawingBtn = (Button) v.findViewById(R.id.openDrawingBtn);
        openDrawingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(getActivity(), DrawingCanvasActivity.class);
//                i1.putExtra("name",alpha[position]);
                startActivity(i1);
            }

        });

//        View popupView = inflater.inflate(R.layout.popup_layout,null);
//        final PopupWindow popupWindow = new PopupWindow(popupView, WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);

// define your view here that found in popup_layout
// for example let consider you have a button

//        Button howtoBtn = (Button) v.findViewById(R.id.howtoBtn);
//
//        howtoBtn.setOnClickListener(new View.OnClickListener() {

//        public void howToDraw ;(View view){
//            try {
//                Toast.makeText(this,
//                        "Drawing Cleared!",
//                        Toast.LENGTH_LONG).show();
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

//        });

            // finally show up your popwindow

            return v;


        }

}