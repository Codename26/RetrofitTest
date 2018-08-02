package com.example.codename26.retrofittest.view.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.codename26.retrofittest.R;
import com.example.codename26.retrofittest.data.model.Item;

import java.util.List;

public class AnswersAdapter extends RecyclerView.Adapter<AnswersAdapter.ViewHolder> {

    private List<Item> items;
    private Context mContext;
    private PostItemListener mItemListener;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView titleTv;
        PostItemListener mItemListener;

        public ViewHolder(@NonNull View itemView, PostItemListener postItemListener) {
            super(itemView);
            titleTv = itemView.findViewById(R.id.tvTitle);

            this.mItemListener = postItemListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Item item = getItem(getAdapterPosition());
            this.mItemListener.onPostClick(item.getAnswerId());

            notifyDataSetChanged();
        }
    }

    public AnswersAdapter(Context context, List<Item> posts, PostItemListener itemListener) {
        items = posts;
        mContext = context;
        mItemListener = itemListener;
    }

    @NonNull
    @Override
    public AnswersAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View postView = inflater.inflate(R.layout.item, viewGroup, false);
        AnswersAdapter.ViewHolder viewHolder = new AnswersAdapter.ViewHolder(postView, this.mItemListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AnswersAdapter.ViewHolder viewHolder, int i) {
        Item item = items.get(i);
        viewHolder.titleTv.setText(item.getOwner().getDisplayName());


    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    private Item getItem(int adapterPosition) {
        return items.get(adapterPosition);
    }

    public void updateAnswers(List<Item> items) {
        this.items = items;
        notifyDataSetChanged();
    }

    public interface PostItemListener {
        void onPostClick(long id);
    }
}
