package com.example.test01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Product> productList = new ArrayList<Product>();

        Product product01 = new Product(R.drawable.ca_nau_lau, "Ca nấu lẩu, nấu mì mini...", "Devang");
        Product product02 = new Product(R.drawable.ga_bo_toi, "1kg khô gà bơ tỏi...", "LTD Food");
        Product product03 = new Product(R.drawable.xa_can_cau, "Xe cần cẩu đa năng", "Thế giới đồ chơi");
        Product product04 = new Product(R.drawable.do_choi_dang_mo_hinh, "Đồ chơi dạng mô hình", "Thế giới đồ chơi");
        Product product05 = new Product(R.drawable.lanh_dao_gian_don, "Lãnh đạo giản đơn", "Minh long book");
        Product product06 = new Product(R.drawable.hieu_long_con_tre, "Hiểu lòng trẻ con", "Thế giới đồ chơi");

        productList.add(product01);
        productList.add(product02);
        productList.add(product03);
        productList.add(product04);
        productList.add(product05);
        productList.add(product06);

        ListView listView = findViewById(R.id.ListView);
        listView.setAdapter(new ProductAdapter(this , R.layout.custom_list_view_activity , productList));


    }
}