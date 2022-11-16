package com.example.profiletest;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.io.Serializable;

import kotlin.text.UStringsKt;

public class CauThu{
    private static String ten,dtu;
    private static int add;



    public CauThu(String ten, String dtu, int add) {
        this.ten = ten;
        this.dtu = dtu;
        this.add = add;
    }

    public static String getten() {
        return ten;
    }

    public void setten(String ten) {
        this.ten = ten;
    }

    public static String getDtu() {
        return dtu;
    }

    public void setDtu(String dtu) {
        this.dtu = dtu;
    }

    public static int getAdd() {
        return add;
    }

    public void setAdd(int add) {
        this.add = add;
    }
}
