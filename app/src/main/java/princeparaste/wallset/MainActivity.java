package princeparaste.wallset;

import androidx.annotation.NonNull;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    pageAdapter pageAdapter;
    TabItem tabTrending,tabExplore,tabFavourite;

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;

    NavigationView navigationView;

    /* FireBASE Components*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpToolbar();


        tabLayout = findViewById(R.id.tabLayout);
        tabTrending = findViewById(R.id.tabTrending);
        tabExplore = findViewById(R.id.tabExplore);
        tabFavourite = findViewById(R.id.tabFavourite);
        viewPager = findViewById(R.id.viewPager);

        pageAdapter = new pageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

        /** NavigationView */
        navigationView = findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.trending:
                        Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.explore:
                        Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.favourites:
                        Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.settings:
                        Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rate_us:
                        Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.about_us:
                        Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
    private void setUpToolbar(){
        drawerLayout = findViewById(R.id.drawerLayout);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name);
        actionBarDrawerToggle.syncState();
    }
}
