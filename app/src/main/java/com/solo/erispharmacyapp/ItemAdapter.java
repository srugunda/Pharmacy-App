package com.solo.erispharmacyapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.NonNull;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.WordViewHolder>{

    private final ArrayList<Item> mItemList;
    private LayoutInflater mInflater;

    public ItemAdapter(Context context,
                                  ArrayList<Item> itemList) {
        mInflater = LayoutInflater.from(context);
        this.mItemList = itemList;
    }

    @NonNull
    @Override
    public ItemAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.list_item,
                parent, false);
        return new WordViewHolder(mItemView, this);
    }

    //The onBindViewHolder() method connects your data to the view holder.
    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.WordViewHolder holder, int position) {
        Item mCurrent = mItemList.get(position);
        holder.nameView.setText(mCurrent.getName());
        holder.descriptionView.setText(mCurrent.getDescription());
        holder.priceView.setText(mCurrent.getPrice());
        holder.quantityView.setText(mCurrent.getQuantity());
        holder.imageView.setImageResource(mCurrent.image);
    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }

    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView nameView;
        public final TextView descriptionView;
        public final TextView priceView;
        public final TextView quantityView;
        public final ImageView imageView;
        //public final Drawable drawable;
        final ItemAdapter mAdapter;

        public WordViewHolder(View itemView, ItemAdapter adapter) {
            super(itemView);
            nameView = itemView.findViewById(R.id.item_name);
            descriptionView = itemView.findViewById(R.id.item_description);
            priceView = itemView.findViewById(R.id.item_price);
            quantityView = itemView.findViewById(R.id.quantity_value);
            imageView = itemView.findViewById(R.id.item_image);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            /*
            // Get the position of the item that was clicked.
            int mPosition = getLayoutPosition();
            // Use that to access the affected item in mWordList.
            Item mItem = mItemList.get(mPosition);
            //String ItemName = mItem.name;
            //Start a new activity passing in that string/object.
            Intent intent = new Intent(v.getContext(), ItemDetails.class);
            intent.putExtra("Item Item", mItem);
            v.getContext().startActivity(intent);
*/


            //Toast.makeText(getApplicationContext(),"I have been clicked on",Toast.LENGTH_SHORT).show();
            // Get the position of the item that was clicked.
            //int mPosition = getLayoutPosition();
            // Use that to access the affected item in mWordList.
            //String element = mItemsList.get(mPosition);
            // Change the word in the mWordList.
            //mItemsList.set(mPosition, "Clicked! " + element);
            // Notify the adapter, that display the data.
            //            //mAdapter.notifyDataSetChanged();the data has changed so it can
            // update the RecyclerView to
        }
    }
}
