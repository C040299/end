package com.example.myapplication005.bean;

import com.example.myapplication005.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "满天星", "脏橙", "蓝色情人节", "情人节限定", "白斑马", "倒钩","最后一舞","蓝黄"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "yeezy 350 满天星",
            "yeezy 350 脏橙",
            "SB Dunk 白蓝金 蓝色情人节",
            "SB Dunk 情人节限定",
            "yeezy 350 白斑马",
            "AJ1 high 倒钩",
            "韦德之道7 最后一舞 白金",
            "Dunk Low 蓝黄"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {3199, 2109, 3389, 6899, 3009,7899, 999,4299};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.oo, R.drawable.tt, R.drawable.thth,
            R.drawable.ff,R.drawable.fifi, R.drawable.ss,
            R.drawable.sese, R.drawable.ee
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.o, R.drawable.t, R.drawable.th,
            R.drawable.f, R.drawable.fi, R.drawable.s,
            R.drawable.se, R.drawable.e
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}