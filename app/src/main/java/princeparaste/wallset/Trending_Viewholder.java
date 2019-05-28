package princeparaste.wallset;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import androidx.recyclerview.widget.RecyclerView;

public class Trending_Viewholder extends RecyclerView.ViewHolder {
    View nview;

    public Trending_Viewholder(View itemView){
        super(itemView);
        nview = itemView;
    }

    public void setDetails(Context ctx,String title,String description, String image){
        TextView Title= nview.findViewById(R.id.trending_title);
        TextView Details = nview.findViewById(R.id.trending_description);
        ImageView Image = nview.findViewById(R.id.trending_image);
        Title.setText(title);
        Details.setText(description);
        Picasso.get().load(image).into(Image);
    }
}
