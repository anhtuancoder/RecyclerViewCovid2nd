package com.example.recyclerviewcovid2nd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements CountryAdapter.onCallBack {

    // Khai bao RecyclerView
    // Khai bao Adapter
    // Khai bao List CountryModel

    RecyclerView rcvShow;
    CountryAdapter countryAdapter;
    List<CountryModel> listCountry = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();
        rcvShow = (RecyclerView) findViewById(R.id.rcvShow); // Gan id rcvShow
        rcvShow.setHasFixedSize(true);
        rcvShow.setLayoutManager(new LinearLayoutManager(this)); // Gan giao dien linearLayout de  hien thi RecyclerView
        countryAdapter = new CountryAdapter(listCountry, this); // Tao Adapter chua dung List CountryModel
        rcvShow.setAdapter(countryAdapter); // Gan Apdapter vao RecyclerView
    }

    // Du lieu fix cung
    private void setData() {
        listCountry.add(new CountryModel(R.drawable.us, "United State", "Bi nhiem", "85700", "565"));
        listCountry.add(new CountryModel(R.drawable.italy, "Italy", "Bi nhiem", "56458", "5785"));
        listCountry.add(new CountryModel(R.drawable.germany, "Germany", "Bi nhiem", "17005", "256"));
    }

    @Override
    public void onItemClick(int position) {
        Toast.makeText(this, "Position: " + position, Toast.LENGTH_SHORT).show();
    }
}
