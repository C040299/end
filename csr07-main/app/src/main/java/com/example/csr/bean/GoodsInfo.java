package com.example.csr.bean;

import com.example.csr.R;

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
            "威尔胜（Wilson）", "斯伯丁Spalding", "李宁 LI-NING", "斯伯丁Spalding", "李宁篮球", "斯伯丁Spalding", "威尔胜（Wilson）", "智特优"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "威尔胜（Wilson）成人7号PU材质室内外通用比赛篮球 WB6230000",
            "斯伯丁Spalding 比赛篮球74-604Y 室内外PU耐磨7号NBA蓝球",
            "李宁 LI-NING 彩虹篮球室外成人儿童比赛7号彩色橡胶蓝球 LBQK657-1",
            "斯伯丁Spalding NBA比赛篮球室内外兼用耐磨PU材质蓝球 76-167Y",
            "李宁篮球室外7号耐磨吸湿PU皮韦德成人青少年男女儿童室内蓝球比赛街头软手感 迪芙尼绿（7号/吸湿）",
            "斯伯丁Spalding比赛篮球经典掌控74-600Y室内外7号PU蓝球",
            "威尔胜（Wilson） EOS GOLD中国特供款专业比赛室内室外篮球 7号成人PU抓握控制耐久WTB6201IB07CN",
            "智特优 儿童篮球 幼儿园小学生入门训练儿童篮球小孩拍拍球橡胶小皮球4号球街头篮球 4号 红蓝白+打气筒球针网兜"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {119, 166, 89, 155,109, 321, 167, 39};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.b1, R.drawable.b2, R.drawable.b3,R.drawable.b4, R.drawable.b5, R.drawable.b6,R.drawable.b7, R.drawable.b8
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.b1, R.drawable.b2, R.drawable.b3,R.drawable.b4, R.drawable.b5, R.drawable.b6,R.drawable.b7, R.drawable.b8
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