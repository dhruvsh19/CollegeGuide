package com.abc.collegeguide;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CollegeAdapter extends RecyclerView.Adapter<CollegeAdapter.CollegeViewHolder> {

    private Context mCtx;
    private List<college> collegeList;

    public CollegeAdapter(Context mCtx, List<college> collegeList) {
        this.mCtx = mCtx;
        this.collegeList = collegeList;
    }

    @Override
    public CollegeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(mCtx);
        View view=inflater.inflate(R.layout.list_layout,null);
        return new CollegeViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(CollegeViewHolder holder, int position) {
        college college=collegeList.get(position);
        holder.TVname.setText(college.getTVname());
        holder.TVadd.setText(college.getTVadd());
        holder.TVweb.setText(college.getTVweb());
        holder.TVno.setText(college.getTVno());

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(college.getImage(),null));


    }

    @Override
    public int getItemCount() {
        return collegeList.size();
    }

    class CollegeViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView TVname , TVadd ,TVweb ,TVno;
        public CollegeViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageview);
            TVadd=itemView.findViewById(R.id.TVadd);
            TVname=itemView.findViewById(R.id.TVname);
            TVno=itemView.findViewById(R.id.TVno);
            TVweb=itemView.findViewById(R.id.TVweb);

        }
    }
}
