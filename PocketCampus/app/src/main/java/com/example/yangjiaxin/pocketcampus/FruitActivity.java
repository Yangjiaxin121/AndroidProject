package com.example.yangjiaxin.pocketcampus;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class FruitActivity extends AppCompatActivity {

    public static final String FRUIT_NAME = "fruit_name";

    public static final String FRUIT_IMAGE_ID = "fruit_image_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
        Intent intent = getIntent();
        String fruitName = intent.getStringExtra(FRUIT_NAME);
        int fruitImageId = intent.getIntExtra(FRUIT_IMAGE_ID, 0);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        ImageView fruitImageView = (ImageView) findViewById(R.id.fruit_image_view);
        TextView fruitContentText = (TextView) findViewById(R.id.fruit_content_text);
        //setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        collapsingToolbar.setTitle(fruitName);
        Glide.with(this).load(fruitImageId).into(fruitImageView);
        String fruitContent = generateFruitContent(fruitName);
        fruitContentText.setText(fruitContent);
    }

    private String generateFruitContent(String fruitName) {
        StringBuilder fruitContent = new StringBuilder();
//        for (int i = 0; i < 500; i++) {
//            fruitContent.append(fruitName);
//        }
        if (fruitName.equals("钢笔")){
            fruitContent.append("毕加索钢笔旗舰店T916成人商务办公男女学生用练字书法美工礼盒装生日新年春节礼物礼品笔定制可刻字送老师\n" +
                    "官方旗舰店 礼盒装送礼自用\n" +
                    "\n" +
                    "1月13日开卖，请提前加购！\n" +
                    "领津贴每满300减30 领取\n" +
                    "促销价\n" +
                    "¥ 128.00");
        } else if (fruitName.equals("海报")){
            fruitContent.append("青春猪头少年系列周边海报明信片不会梦到兔女郎学姐卡贴挂画壁画\n" +
                    "举报\n" +
                    "\n" +
                    "价格\n" +
                    "¥8.00-75.00");
        } else if (fruitName.equals("键盘")){
            fruitContent.append("CHERRY樱桃德国二色工艺GMK经典限定复古KA1953机械键盘兼容键帽\n" +
                    "举报\n" +
                    "\n" +
                    "价格\n" +
                    "¥1099.00-9999.00");
        } else if (fruitName.equals("图书")) {
            fruitContent.append("绘图地理五诀 赵玉才 九峰 阴宅寻龙点穴 堪舆著作 风水书籍 学习风水 正版\n" +
                    "点击 收藏 再加购，联系客服送书签！\n" +
                    "\n" +
                    "价格\n" +
                    "¥ 38.00\n" +
                    "促销价\n" +
                    "¥ 28.00");
        } else if (fruitName.equals("鞋子")){
            fruitContent.append("Nike 耐克官方FLEX EXPERIENCE RN 7 男子跑步鞋灵活轻便908985\n" +
                    "轻盈灵活 舒适包覆\n" +
                    "\n" +
                    "\uE6011月13日开卖，请提前加购！\n" +
                    "价格\n" +
                    "¥ 499.00\n" +
                    "年货价\n" +
                    "¥ 339.00-498.00");
        } else if (fruitName.equals("手表")){
            fruitContent.append("儿童电话手表初高中小学生成人防水天才智能手机插卡定位男女孩多功能移动联通电信版可爱\n" +
                    "1月13日开卖，请提前加购！\n" +
                    "领津贴每满300减30 领取\n" +
                    "促销价\n" +
                    "¥ 269.00-299.00   \n" +
                    "年货价\n" +
                    "¥ 2?9.00-2?9.00");
        } else if(fruitName.equals("口红")){
            fruitContent.append("【新年礼物】纪梵希口红小羊皮半哑光唇膏 口红女 滋润 官方正品\n" +
                    "真皮管身定制 高定轻奢口红\n" +
                    "\n" +
                    "1月13日开卖，请提前加购！\n" +
                    "价格\n" +
                    "¥ 355.00\n" +
                    "年货价\n" +
                    "¥ 355.00");
        } else if (fruitName.equals("数据线")){
            fruitContent.append("安卓数据线原装充电器线高速usb通用快充闪充适用小米三星oppo华为vivo酷派手机加长单头2米短\n" +
                    "快速充电 天猫正品 全国联保！！！！\n" +
                    "\n" +
                    "领津贴每满300减30 领取\n" +
                    "价格\n" +
                    "¥ 9.00-34.00\n" +
                    "促销价\n" +
                    "¥ 8.90-28.90");
        } else if (fruitName.equals("眼镜")){
            fruitContent.append("米家防蓝光眼镜男女手机护目镜电脑防蓝光眼镜\n" +
                    "35%蓝光阻隔率\n" +
                    "\n" +
                    "\uE6011月13日开卖，请提前加购！\n" +
                    "促销价\n" +
                    "¥ 89.00 爆款促销   \n" +
                    "年货价\n" +
                    "¥ 89.00");
        } else if (fruitName.equals("车模")){
            fruitContent.append("兰博LP770基尼汽车模型仿真合金车模跑车模型儿童玩具车男孩赛车\n" +
                    "合金车身 炫酷回力 带有声光\n" +
                    "\n" +
                    "1月13日开卖，请提前加购！\n" +
                    "领津贴每满300减30 领取\n" +
                    "促销价\n" +
                    "¥ 32.90-185.00   \n" +
                    "年货价\n" +
                    "¥ 32.80-183.90");
        }
        return fruitContent.toString();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
