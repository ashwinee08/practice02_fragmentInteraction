package com.example.revisionjuly2019.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.revisionjuly2019.BackToMainCallback;
import com.example.revisionjuly2019.R;

public class BottomFragment extends Fragment {

    private Context context;
    private BackToMainCallback callback;
    @Override
    public void onAttach(Context context) {
        this.context=context;
        this.callback=(BackToMainCallback)context;
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState)
            throws NullPointerException{
        View view=inflater.inflate(R.layout.fragment_bottom_inflation_layout,parent,false);
        ListView listView=view.findViewById(R.id.bottom_fragment_list_view);
        final String[] menu=MenuItems.getMenu();
        BaseAdapter listViewBaseAdapter
                = new BaseAdapter(){
            @Override
            public int getCount() {
                return menu.length;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position,View convertView,ViewGroup parent) {
                View view=LayoutInflater.from(context).inflate(R.layout.individual_item_layout,parent,false);
                TextView menuItemTexView=view.findViewById(R.id.menu_item);
                menuItemTexView.setText(menu[position]);
                menuItemTexView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int id=R.drawable.default_welcome;
                        TextView menuItemTextView=v.findViewById(R.id.menu_item);
                        switch(menuItemTextView.getText().toString()){

                            case "Creamy Herbed Chicken":
                                id=R.drawable.creamy_herb_chicken;
                                break;
                            case "Easy Bourbon Chicken":
                                id=R.drawable.easy_bourbon_chicken;
                                break;
                            case "Honey Garlic Chicken":
                                id=R.drawable.honey_garlic_chicken;
                                break;
                            case "Asian Chilli Garlic Prawns":
                                id=R.drawable.asian_chilli_garlic_prawns;
                                break;
                            case "Honey Prawns":
                                id=R.drawable.honey_prawns;
                                break;
                            case "Salt and Pepper Prawns":
                                id=R.drawable.salt_and_pepper_prawns;
                                break;
                        }
                        callback.sendingDataToMain(id);
                    }
                });
                return view;
            }
        };
        listView.setAdapter(listViewBaseAdapter);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}

class MenuItems{
    private static String[] menu={  "Creamy Herbed Chicken",
            "Easy Bourbon Chicken",
            "Honey Garlic Chicken",
            "Asian Chilli Garlic Prawns",
            "Honey Prawns",
            "Salt and Pepper Prawns"};

    static String[] getMenu(){
        return menu;
    }
}

