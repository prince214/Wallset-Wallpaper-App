package princeparaste.wallset.Testing;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import princeparaste.wallset.R;

public class CategoryViewHolder extends RecyclerView.ViewHolder {

    public TextView t1;
    public ImageView i1;

    public CategoryViewHolder(View itemView) {
        super(itemView);
        t1 = (TextView) itemView.findViewById(R.id.name);
        i1 = (ImageView) itemView.findViewById(R.id.image);
    }

}
