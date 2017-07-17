package ngocamha.com.demofragment.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ngocamha.com.demofragment.R;
import ngocamha.com.demofragment.fragment.FacebookFragment;
import ngocamha.com.demofragment.fragment.HomeFragment;

public class MainActivity extends AppCompatActivity implements FacebookFragment.OnFacebookFragmentActionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction  = fragmentManager.beginTransaction();
        HomeFragment homeFragment  = HomeFragment.newInstance();
        fragmentTransaction.replace(R.id.fragment_home, homeFragment, "HomeFragment");
        fragmentTransaction.addToBackStack("Home");
        fragmentTransaction.commit();
    }

    @Override
    public void onFacebookSetName() {
        FragmentManager fragmentManager  =  getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =  fragmentManager.beginTransaction();
        FacebookFragment facebookFragment =  FacebookFragment.newInstance();
        HomeFragment homeFragment = (HomeFragment) fragmentManager.findFragmentByTag("HomeFragment");
        fragmentTransaction.hide(homeFragment);
        fragmentTransaction.add(R.id.fragment_home, facebookFragment);
        fragmentTransaction.addToBackStack("FacebookFragment");
        fragmentTransaction.commit();

    }
}
