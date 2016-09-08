package com.rad.training.helloDate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.deploy.util.StringUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by radical on 16-7-28.
 */
public class HelloDate {
    public static void main(String[] args) {
        final String str = "Hello World";
        System.out.println(reverse(str));
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 1);
        Date date2 = calendar.getTime();
        calendar.add(Calendar.DATE, -4);
        Date date1 = calendar.getTime();
        System.out.println("DATE：" + dateFormat.format(date2)); // 按照日期格式化
        System.out.println("DATE：" + dateFormat.format(date1)); // 按照日期格式化
        String sentence = "  I am a  Student. ";
        System.out.print(sentence+reverseSentence(sentence));
        /*String rev = "{\"code\":0,\"message\":\"success\",\"result\":{\"hr\":{\"imei\":\"865946020905707\",\"status\":1,\"upperLimit\":100,\"lowerLimit\":99,\"hrStartTime\":\"06:00\",\"hrEndTime\":\"22:30\",\"hrInterval\":1},\"sc\":{\"imei\":\"865946020905707\",\"scs\":\"08:40\",\"sce\":\"09:40\",\"sci\":60,\"stepGoal\":9000,\"status\":1},\"loc\":{\"los\":\"06:00\",\"loe\":\"16:00\",\"loi\":null,\"status\":1},\"fence\":{\"imei\":\"865946020905707\",\"lng\":114.367975,\"lat\":30.474051,\"radius\":2.212,\"status\":1},\"somnus\":{\"imei\":\"865946020905707\",\"startTime\":\"17:08\",\"endTime\":\"17:48\",\"status\":1},\"bp\":{\"imei\":\"865946020905707\",\"sbpUpperLimit\":2,\"sbpLowerLimit\":1,\"dbpUpperLimit\":4,\"dbpLowerLimit\":3,\"status\":1},\"bg\":{\"bgUpperLimit\":90.0,\"bgLowerLimit\":70.0,\"status\":1},\"sd\":{\"sdnum1\":\"18979525650\",\"sdnum2\":\"15364523457\",\"sdnum3\":\"15764568345\",\"sdnum4\":\"14364563455\"},\"sed\":{\"imei\":\"865946020905707\",\"startTime\":\"12:10\",\"endTime\":\"15:00\",\"status\":1},\"sos\":{\"imei\":\"865946020905707\",\"sos1\":\"110\",\"sos2\":\"234\",\"sos3\":\"345\",\"sosContent\":null},\"tp\":{\"imei\":\"865946020905707\",\"tpLowerLimit\":35.4,\"tpUpperLimit\":36.7,\"tps\":\"08:40\",\"tpe\":\"08:45\",\"tpi\":5,\"status\":1}}}";
        JSONObject json1= JSON.parseObject(rev);
        JSONObject json2= json1.getJSONObject("result");
        JSONObject jsonxinlv=json2.getJSONObject("hr");
        JSONObject jsonjibu=json2.getJSONObject("sc");
        JSONObject jsondingwei=json2.getJSONObject("loc");
        JSONObject jsonweilan=json2.getJSONObject("fence");
        JSONObject jsonshuijiao=json2.getJSONObject("somnus");
        JSONObject jsonxueya=json2.getJSONObject("bp");
        JSONObject jsonxuetang=json2.getJSONObject("bg");
        JSONObject jsontiwen=json2.getJSONObject("tp");
        int dingweifenzhong1 = jsondingwei.getIntValue("loi");//定位分钟间隔
        System.out.println("test"+dingweifenzhong1);
        System.out.println(jsonxinlv);
        System.out.println(jsonxinlv==null);
        System.out.println(jsonjibu==null);
        System.out.println(jsondingwei==null);
        System.out.println(jsonweilan==null);
        String xinlv1 = jsonxinlv.getString("status");
        System.out.println(xinlv1==null&&xinlv1.equals("0"));*/
    }

    public static String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static String reverseSentence(String sentence) {
        String[] words = sentence.trim().split(" ");
        System.out.print(words.length);
        StringBuilder sen_rev = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sen_rev.append(words[i]+" ");
        }
        return sen_rev.toString();
    }
}
