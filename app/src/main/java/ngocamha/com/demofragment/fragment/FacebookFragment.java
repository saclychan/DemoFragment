package ngocamha.com.demofragment.fragment;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ngocamha.com.demofragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FacebookFragment extends Fragment {


    public FacebookFragment() {
        // Required empty public constructor
    }

    public static FacebookFragment newInstance(){
        FacebookFragment facebookFragment = new FacebookFragment();
        return facebookFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_facebook, container, false);
        TextView textView = (TextView) view.findViewById(R.id.tv_facebook_name);
        textView.setText("Ngo Cam Ha - t0m4m0");

        return view;
    }

    public interface OnFacebookFragmentActionListener{
        void onFacebookSetName();
    }

}
