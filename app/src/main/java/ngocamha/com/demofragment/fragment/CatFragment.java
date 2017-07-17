package ngocamha.com.demofragment.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import ngocamha.com.demofragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CatFragment extends Fragment {


    public CatFragment() {
        // Required empty public constructor
    }

    public static CatFragment newInstance() {
        CatFragment catFragment = new CatFragment();
        return catFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_cat, container, false);
        TextView textView = (TextView) view.findViewById(R.id.tv_cat_name);
        textView.setText("Mèo ba tư - Boss Trắng");

        return view;
    }


    //callBack func
    public interface OnCatFragmentEatListener{
        void onEat();
    }

}
