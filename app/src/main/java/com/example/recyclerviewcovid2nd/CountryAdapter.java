package com.example.recyclerviewcovid2nd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {
    private List<CountryModel> listCountry;
    private onCallBack onCB;

    public CountryAdapter(List<CountryModel> listCountry, onCallBack onCB) {
        this.listCountry = listCountry;
        this.onCB = onCB;
    }

    @NonNull
    @Override
    public CountryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.rvc_items, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryAdapter.ViewHolder holder, int position) {
        CountryModel countryModel = listCountry.get(position);
        holder.imgAvatar.setImageResource(countryModel.getImgId());
        holder.txtCountryName.setText(countryModel.getCountryName());
        holder.txtStatus.setText(countryModel.getStatus());
        holder.txtCases.setText(countryModel.getCases());
        holder.txtTodayCases.setText(countryModel.getTodayCases());
    }

    @Override
    public int getItemCount() {
        return listCountry.size();
    }

    public interface onCallBack {
        void onItemClick(int position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgAvatar;
        TextView txtCountryName;
        TextView txtStatus;
        TextView txtCases;
        TextView txtTodayCases;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAvatar = (ImageView) itemView.findViewById(R.id.imgCountry);
            txtCountryName = (TextView) itemView.findViewById(R.id.txtCountryName);
            txtStatus = (TextView) itemView.findViewById(R.id.txtStatus);
            txtCases = (TextView) itemView.findViewById(R.id.txtCases);
            txtTodayCases = (TextView) itemView.findViewById(R.id.txtTodayCases);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onCB.onItemClick(getPosition());
                }
            });
        }

    }

}
