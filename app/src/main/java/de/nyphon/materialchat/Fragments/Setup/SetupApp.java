package de.nyphon.materialchat.Fragments.Setup;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import de.nyphon.materialchat.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SetupApp extends Fragment {


    public SetupApp() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_group_conversation, container, false);
    }


}
