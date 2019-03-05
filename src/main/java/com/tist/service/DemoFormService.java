package com.tist.service;

import com.tist.model.DemoForm;

import java.text.SimpleDateFormat;
import java.util.*;

public class DemoFormService {
    public DemoForm generateUId(DemoForm demoForm) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        demoForm.setCardId(sdf.format(now));
        return demoForm;
    }

    //TODO:算出年紀
    public DemoForm calAge(DemoForm demoForm) {
        Date birthday = demoForm.getBirthday();
        Date now = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(birthday);
        int year = calendar.get(Calendar.YEAR);

        calendar.setTime(now);
        int nowyear = calendar.get(Calendar.YEAR);

        System.out.println("計算:" + (nowyear - year));
        return demoForm;
    }

    //TODO:驗證資料，全部有>true，否:false
    public boolean verify(DemoForm demoForm) {
        String formName = demoForm.getName();
        String formCardId = demoForm.getCardId();
        String formSelfMedia = demoForm.getSelfMedia();
        Date formDate = demoForm.getBirthday();
        boolean formFoodHabit = demoForm.isFoodHabit();
        String[] formClassName = demoForm.getClassName();
        boolean returnBoolean = false;
        if (formName != null && formCardId != null && formDate != null && formSelfMedia != null
                && formClassName != null && formFoodHabit != false) {
            //有資料
            returnBoolean = true;
        } else {
            //缺任一資料
            returnBoolean = false;
        }

        return returnBoolean;
        /*return  formName != null && formCardId != null && formDate != null && formSelfMedia != null
                && formClassName != null && formFoodHabit != false*/
    }

    //TODO:定義4個方法 加減乘除

    //乘法
    public int sum(int x, int y) {

        return x * y;
    }

    //除法
    public int divsion(int x, int y) {
        //int a=x/y;
        return x / y;
    }

    //加法
    public int addition(int x, int y) {
        return x + y;
    }

    //減法
    public int subtraction(int x, int y) {
        return x - y;
    }

    //TODO:3個input，前(1+2)相加，乘(2+3)，除(1+2+3)
    public int math(int a,int b, int c) {
        int Q = (a + b) * (b + c) / (a + b + c);
        return Q;
    }

    //TODO:利用for迴圈製造一個list，list裡面都是亂數，回傳list
    public List<Integer> testlist() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random ran = new Random();
            int input = ran.nextInt(100) + 1;
            list.add(input);
        }
        return list;
    }

    //TODO:輸入複數個list封裝到一個map，回傳map
    public Map<Object, List<Integer>> map(List<List<Integer>> integerList) {
        Map<Object, List<Integer>> map = new HashMap<>();
        for(int i=0;i<integerList.size();i++){
            map.put(i,integerList.get(i));
        }
        return map;
    }
}