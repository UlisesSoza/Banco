package soza.ulises.app.Recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HP on 14/2/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.HolderDatos>
{
    @Override
    public HolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(HolderDatos holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HolderDatos extends RecyclerView.ViewHolder {
        public HolderDatos(View itemView) {
            super(itemView);

        }
    }
}
