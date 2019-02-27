package com.tist;

import com.tist.service.DemoFormService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

    public static void main(String[] args) {
        File file2 = new File("\\\\192.168.1.10\\03_專案管理\\107年建置案");
        FileWriter fw;
        FileWriter fw2;

        try {
            fw = new FileWriter("D:/record.txt");
            fw2 = new FileWriter("D:/record2.txt");

            for (File file : file2.listFiles()) {
                System.out.println(file);
                if(file.isDirectory()){
                    if (file.listFiles().length > 0){
                        System.out.println(file.listFiles().length);
                        fw.write(file.getName()+"\n");
                        fw.flush();
                    }
                    if(file.getName().matches("(.*).xls")){

                    }

                }else{
                    fw2.write(file.getName()+"\n");
                    fw2.flush();

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
