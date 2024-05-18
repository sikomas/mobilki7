package com.example.practic77.UI.View;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

import com.example.practic77.DATA.Model.DataList;
import com.example.practic77.R;
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    private final static String TAG = "Tag";
    private final LayoutInflater inflater;
    private final ArrayList<DataList> items;
    public RecyclerAdapter(Context context, ArrayList<DataList> items) {
        this.items = items;
        this.inflater = LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DataList datalist = items.get(position);
        holder.text.setText(datalist.getName());
        holder.image.setImageDrawable(inflater.getContext().getDrawable(datalist.getImage()));
        holder.layout.setOnClickListener(view -> {
            Toast.makeText(inflater.getContext(), datalist.getName(), Toast.LENGTH_SHORT).show();
            Log.d(TAG, datalist.getName());
            Bundle bundle =  new Bundle();
            bundle.putString("itemId", datalist.getName());
            holder.itemView.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.Fragment5, bundle));
        });
    }
    @Override
    public int getItemCount() {
        return items.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView text;
        public ImageView image;
        public ViewGroup layout;
        public ViewHolder(View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.list_item_text_view);
            image = itemView.findViewById(R.id.list_item_image_view);
            layout = itemView.findViewById(R.id.item_root_container);
        }
    }
}
