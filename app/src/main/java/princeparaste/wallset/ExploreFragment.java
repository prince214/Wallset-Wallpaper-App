package princeparaste.wallset;


import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import princeparaste.wallset.ViewHolder.explorer_viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreFragment extends Fragment {

//    RecyclerView recyclerView;
//    DatabaseReference databaseReference;
//    FirebaseRecyclerOptions<ExploreLayout> options;
//    FirebaseRecyclerAdapter<ExploreLayout, explorer_viewholder> adapter;
//    ExploreLayout model;
//    explorer_viewholder holder;


    public ExploreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_explore, container, false);

//        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerView);
//        recyclerView.setHasFixedSize(true);
//        databaseReference = FirebaseDatabase.getInstance().getReference().child("explorer Background");
//        options = new FirebaseRecyclerOptions.Builder<ExploreLayout>().setQuery(databaseReference,ExploreLayout.class).build();
//        adapter = new FirebaseRecyclerAdapter<ExploreLayout, explorer_viewholder>(options) {
//            @Override
//            protected void onBindViewHolder(@NonNull explorer_viewholder explorer_viewholder, int i, @NonNull ExploreLayout exploreLayout) {
//                Picasso.get().load(model.getImageLink()).into(holder.i1, new Callback() {
//                    @Override
//                    public void onSuccess() {
//
//                    }
//
//                    @Override
//                    public void onError(Exception e) {
//                        Toast.makeText(getContext(),e.getMessage(), Toast.LENGTH_SHORT).show();
//                    }
//                });
//
//                holder.t1.setText(model.getName());
//            }
//
//            @NonNull
//            @Override
//            public explorer_viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.explore_item,parent,false);
//                return new explorer_viewholder(view);
//            }
//        };

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
//        recyclerView.setLayoutManager(gridLayoutManager);
//        adapter.startListening();
//        recyclerView.setAdapter(adapter);
        return v;
    }

//    @Override
//    public void onStart() {
//        super.onStart();
//        if (adapter!=null){
//            adapter.startListening();
//        }
//    }
//
//    @Override
//    public void onStop() {
//        super.onStop();
//        if(adapter!=null){
//            adapter.stopListening();
//        }
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        if(adapter!=null){
//            adapter.startListening();
//        }
//    }
}
