package com.ruantong.dingding;

import com.alibaba.druid.support.json.JSONUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonValue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootTest
class DingdingApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("springboot集成Junit   ");
    }


    @Test
    public void test5(){
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
    }
    @Test
    public void test4() throws ParseException {
//        Date date = new Date();
////        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("2021年1月12日 17时00分");
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分");
//        String format = simpleDateFormat.format(date);
//        System.out.println(format);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分");
        Date now = new Date();
//        String birth
        String nowDate = sdf.format(now);
        long time = sdf.parse(nowDate).getTime();
        System.out.println(time);
        String s = JSONUtils.toJSONString(time);
        System.out.println(s);


    }

    @Test
    public void test3(){
        List<String> stringList = new ArrayList<>();
        stringList.add("wfb");
        stringList.add("wfj");
        stringList.add("fabao");
        stringList.add("wujie");
        String s = JSONUtils.toJSONString(stringList);
        System.out.println(s);

        JSONArray array = JSONObject.parseArray(s);
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

}
//
//     /**
//       * 测试mapper接口
//       **/
//     @Autowired
//    WfbMapper wfbMapper;
//      @Test
//     public void test1() throws Exception {
//          List<Wfb> wfbs = wfbMapper.findAll(null);
//          for (Wfb wfb : wfbs) {
//              System.out.println(wfb);
//          }
//      }

//       /**
//         * 测试service接口
//         **/
//       @Autowired
//        WfbService wfbService;
//        @Test
//       public void test2() throws Exception {
//            List<Wfb> wfbList = wfbService.findAll();
//            for (Wfb wfb : wfbList) {
//                System.out.println(wfb);
//            }
//        }

}
