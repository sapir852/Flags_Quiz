package com.sapir.flags_quiz;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class LevelAdapter extends RecyclerView.Adapter<LevelAdapter.levelViewHolder> {

    private Context context;
    private ArrayList<Level> levels;
  //  private CallBack_level callBackLevel;

    public LevelAdapter(Context context, ArrayList<Level> levels) {
        this.context = context;
        this.levels = levels;
       // this.callBackLevel = callBackLevel;
    }

    @Override
    public int getItemCount() {
        return levels == null ? 0 : levels.size();
    }

    @Override
    public levelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_level_list, parent, false);
        levelViewHolder levelViewHolder = new levelViewHolder(view);
        return  levelViewHolder;
    }


    @Override
    public void onBindViewHolder(final levelViewHolder holder, final int position) {
        Level level = levels.get(position);

        holder.list_LBL_title.setText("" + position);
        holder.list_IMG_kind.setImageResource(level.getImage());
     //   holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Handle item click, you can implement this part based on your requirement
//                callBackLevel.onClicked();
//            }
   //     });


    }

    static class levelViewHolder extends RecyclerView.ViewHolder {

        private MaterialTextView list_LBL_title;
        private AppCompatImageView list_IMG_kind;

        public levelViewHolder(View itemView) {
            super(itemView);
            list_LBL_title = itemView.findViewById(R.id.list_LBL_title);
            list_IMG_kind = itemView.findViewById(R.id.list_IMG_kind);
        }
    }
}
