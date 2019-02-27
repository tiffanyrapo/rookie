package com.tist.model;

import java.util.Arrays;
import java.util.Date;

public class DemoForm
{
    private String name;
    private Date birthday;
    private String selfMedia;  //自介
    private boolean foodHabit;  //飲食習慣
    private String[] className;
    private String cardId;


    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFoodHabit(boolean b, boolean b1) {
        return foodHabit;
    }

    public void setFoodHabit(boolean foodHabit) {
        this.foodHabit = foodHabit;
    }

    public String[] getClassName() {
        return className;
    }

    public void setClassName(String[] className) {
        this.className = className;
    }

    public Date getBirthday() {

        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSelfMedia() {
        return selfMedia;
    }

    public void setSelfMedia(String selfMedia) {
        this.selfMedia = selfMedia;
    }

    public boolean isFoodHabit() {
        return foodHabit;
    }

    @Override
    public String toString() {
        return "DemoForm{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", selfMedia='" + selfMedia + '\'' +
                ", foodHabit=" + foodHabit +
                ", className=" + Arrays.toString(className) +
                ", cardId='" + cardId + '\'' +
                '}';
    }

    public void setClassName(String 線性代數, String 資料結構, String 工程數學, String 嵌入式系統) {
    }


    }

