package soza.ulises.app;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import soza.ulises.app.frags.MisReservas;
import soza.ulises.app.frags.Reservar_Home;
import soza.ulises.app.frags.Settings;

public class FragContainer extends AppCompatActivity {



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.Mis_Reservas_tab:
                    MisReservas misReservas = new MisReservas();
                    getSupportFragmentManager().beginTransaction().replace(R.id.Frag_Layout_container, misReservas).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                    return true;
                case R.id.Reservar_tab:
                    Reservar_Home reservar_home = new Reservar_Home();
                    getSupportFragmentManager().beginTransaction().replace(R.id.Frag_Layout_container, reservar_home).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                    return true;

                case R.id.Ajustes_tab:
                    Settings settings = new Settings();
                    getSupportFragmentManager().beginTransaction().replace(R.id.Frag_Layout_container, settings).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                    return true;

            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_container);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setSelectedItemId(R.id.Reservar_tab);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        FloatingActionButton floatingActionButton = (FloatingActionButton)findViewById(R.id.fabInit);
    }

}
