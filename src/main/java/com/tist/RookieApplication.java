package com.tist;

import com.tist.model.Animal;
import com.tist.model.DemoForm;
import com.tist.service.DemoFormService;
import com.tist.service.RookieService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootApplication
public class RookieApplication {

    public static void main(String[] args) {
        SpringApplication.run(RookieApplication.class, args);
    }

    @Resource
    RookieService rookieService;

    @PostConstruct
    public void run() throws IOException {
        /**System.out.println(rookieService.getMessage());*/
        //2019-01-16
        /*int i = 1, sum = 0;

        for (i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("%2:" + i);
                if (i % 4 == 0) {
                    System.out.println("square:" + i * i);
                }
            } else if (i % 3 == 0) {
                System.out.println("float:" + (float) i);
            }
        }*/
        //2019-01-16
        Animal animal = new Animal();
        animal.bark("meow");
        System.out.println("move:" + animal.move());
        animal.setAge(10);
        animal.setName("alex");
        System.out.println(animal.toString());

        //2019-01-16
        DemoForm demoForm = new DemoForm();
        demoForm.setName("Sunny");

        //時間格式-1 , 獲取當前日期時間
        Date date = new Date();
        System.out.println(date.toString());

        //時間格式-2 可指定格式 eg. yyy/mm/dd
        SimpleDateFormat dNow = new SimpleDateFormat("yyyy-MM-dd");
        demoForm.setBirthday(date);
        System.out.println("當前時間為: " + dNow.format(demoForm.getBirthday()));

        //自介
        demoForm.setSelfMedia("喜歡麵食");

//        String[] obj = new String[5];  array建立方法1
//        obj[0]="123";
        String[] obj = {"離散數學", "線性代數", "嵌入式系統", "資料結構"};  //array建立方法2
        obj[2] = null;
        String[] ob2 = new String[3];
        int i = 0;
        for (String data : obj) {
            if (data != null) {
                ob2[i] = data;
                i++;
            }
        }
        for (int j = 0; j < obj.length; j++) {

        }

        demoForm.setClassName(obj);
//        demoForm.isFoodHabit();

/**
 * 2019-01-17 eg
 */

        //       demoForm.setName("Sunny");
        //       demoForm.setBirthday(date);
        //       demoForm.setSelfMedia("Hi!");
        //       demoForm.setClassName(obj);
        //System.out.printf(demoForm.setName("Sunny")+);

/**
 * 2019-01-18 list eg
 */
        List<String> list = new ArrayList<>();

        // list.add("離散數學");
        // list.add("線性代數");
        // list.add("嵌入式系統");
        // list.add("資料結構");
        // list.add("資料結構");
        // list.add("資料結構");
        // list.add("資料結構");
        // list.add("資料結構");
        // list.add("資料結構");
        // list.add("資料結構");
        // list.add("資料結構");
        // list.add("資料結構");
        // list.add("資料結構");
        // list.add("資料結構");
        // list.remove(0);
        // list.forEach(s -> System.out.println(s));


        DemoForm demoForm1 = new DemoForm();  //日期
        demoForm1.setBirthday(date);

        DemoForm demoForm2 = new DemoForm();  //姓名
        demoForm2.setName("Max");
        demoForm2.setName("Candy");
        demoForm2.setName("Sunny");

        DemoForm demoForm3 = new DemoForm(); //飲食習慣
        boolean foodHabit = demoForm3.isFoodHabit(true, false);

        DemoForm demoForm4 = new DemoForm();  //課程名稱
        demoForm4.setClassName("線性代數", "資料結構", "工程數學", "嵌入式系統");

        DemoForm demoForm5 = new DemoForm(); //自介
        demoForm5.setSelfMedia("Hi,家住日月潭伊達邵，在台北念書，目前在台中工作");

        DemoForm demoForm6 = new DemoForm(); //cardId
        demoForm6.getCardId();

        DemoFormService demoFormService =new DemoFormService();
        demoFormService.calAge(demoForm1);



        List<DemoForm> list1 = new ArrayList<>();
        for (int k = 0; k < list1.size(); k++) {
//            list1.get(k).getName();
            System.out.println(list1.get(k).getName());
        }

//       List<String> list2 = new ArrayList<>();
//       list2.add("Pinny");
//       list2.add("Tracy");
//       list2.add("Pen");
//       list2.add("Yui");
//       list2.remove(0);   //remove(); >刪除
//       list2.forEach(S -> System.out.println(demoForm3));

        List<DemoForm> list3 = new ArrayList<>();
        list3.add(demoForm2);
        list3.add(demoForm1);
        list3.add(demoForm4);
        list3.add(demoForm3);
        list3.add(demoForm5);

        for (int k = 0; k < list3.size(); k++) {
//            list3.get(k).getName();
            System.out.println(list3.get(k));
        }

        /**
         * HushMap eg.
         */
        Map<String, DemoForm> demoFormMap = new HashMap<>();
        demoFormMap.put("a", demoForm1);
        demoFormMap.put("b", demoForm2);
        demoFormMap.put("c", demoForm3);
        demoFormMap.put("d", demoForm4);
        demoFormMap.put("e", demoForm5);
        demoFormMap.put("f", demoForm6);
        System.out.println(demoFormMap.get("a"));

        int choice = 0;
        switch (choice) {
            case 0:
                System.out.println(demoFormMap.get("a"));
                break;
            case 1:
                System.out.println(demoFormMap.get("a"));
                break;
            case 2:
                System.out.println(demoFormMap.get("a"));
                break;
            case 3:
                System.out.println(demoFormMap.get("a"));
                break;
        }


        System.out.println(demoForm);
        System.out.println(demoFormService.generateUId(demoForm));


        /**
         * I/O控制eg. 2019-01-22
         */
        //TODO:產生csv
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("D:/test");
            for (DemoForm input : list3) {
                fileWriter.write(input.toString() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }

        //int a=4,b=5,c=6;

        demoFormService.math(4,5,6);







    }
}

