package com.example.profiletest;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.profiletest.CauThu;
import com.example.profiletest.R;

public class fragment_legends_info extends AppCompatActivity {
    TextView txtHoten,txtquocgia;
    ImageView imgLengends;
    View view;
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         view = inflater.inflate(R.layout.fragment_legends_info,container,false);

//        AnhXa();
        Intent intent = getIntent();
        if(intent != null){
            CauThu cauThu = (CauThu) intent.getSerializableExtra("thongtinlengends");
        txtHoten.setText(CauThu.getten());
        txtquocgia.setText(CauThu.getDtu());
        imgLengends.setImageResource(CauThu.getAdd());
        }
        return view;
    }

//    private void AnhXa(){
//        txtHoten = view.findViewById(R.id.img_legends);
//        txtquocgia = view.findViewById(R.id.name_legends);
//        imgLengends = view.findViewById(R.id.name_quoctich);
//    }
}
