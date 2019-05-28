package princeparaste.wallset;


import android.graphics.ColorSpace;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


/**
 * A simple {@link Fragment} subclass.
 */
public class TrendingFragment extends Fragment {

    RecyclerView recyclerView;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;
    public TrendingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_trending, container, false);

//        recyclerView = v.findViewById(R.id.recyclerView);
//        recyclerView.setHasFixedSize(true);
//
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        firebaseDatabase = firebaseDatabase.getInstance();
//        reference = firebaseDatabase.getReference("Data");

        return v;
    }

    @Override
    public void onStart() {
        super.onStart();
//        FirebaseRecyclerAdapter<TrendingLayout,Trending_Viewholder> firebaseRecyclerAdapter =
//                new FirebaseRecyclerAdapter<TrendingLayout, Trending_Viewholder>(
//                TrendingLayout.class,
//                R.layout.trending_row,
//                TrendingFragment.class,
//                reference
//        ) {
//            @Override
//            protected void populateViewHolder(@NonNull Trending_Viewholder trending_viewholder, int i, @NonNull TrendingLayout trendingLayout) {
//
//            }
//
//            @NonNull
//            @Override
//            public Trending_Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//                return null;
//            }
//        };
    }
}
