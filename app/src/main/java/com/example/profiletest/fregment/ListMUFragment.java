package com.example.profiletest.fregment;

import android.os.Bundle;

import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.profiletest.CauThu;
import com.example.profiletest.R;

import java.util.ArrayList;


public class ListMUFragment extends ListFragment {

    ArrayList<CauThu> arrayCauThu;
    ListMuAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        arrayCauThu = new ArrayList<>();
        addArCt();
        adapter = new ListMuAdapter(getActivity(),R.layout.cauthu,arrayCauThu);
        setListAdapter(adapter);
        return inflater.inflate(R.layout.fragment_list_m_u,container,false);
    }
    private void addArCt(){
        arrayCauThu.add(new CauThu("TT Bùi Thành","Lào Cai",R.drawable.congan));
        arrayCauThu.add(new CauThu("TU Trần Tiến","Quảng Nam",R.drawable.congan));
        arrayCauThu.add(new CauThu("TT Anh Tú","Đà Nẵng ",R.drawable.congan));
        arrayCauThu.add(new CauThu("TA Anh Hoàng","Huế",R.drawable.congan));
        arrayCauThu.add(new CauThu("TT Bùi Trần","Quảng Ngãi",R.drawable.congan));







    }
}