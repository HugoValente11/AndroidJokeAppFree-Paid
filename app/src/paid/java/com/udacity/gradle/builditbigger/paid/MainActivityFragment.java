package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private Button cleanButton;
    private Button dirtyButton;
    private Context mContext;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;

    }

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        cleanButton = root.findViewById(R.id.cleanButton);
        dirtyButton = root.findViewById(R.id.dirtyButton);

        cleanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new EndpointsAsyncTask(getContext(), true).execute(getContext());

            }
        });

        dirtyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean cleanChosen;
                switch (view.getId()) {
                    case R.id.dirtyButton:
                        cleanChosen = false;
                        break;
                    default:
                        cleanChosen = true;
                        break;

                }
                new EndpointsAsyncTask(mContext, cleanChosen).execute(mContext);
            }
        });

        return root;
    }
}
