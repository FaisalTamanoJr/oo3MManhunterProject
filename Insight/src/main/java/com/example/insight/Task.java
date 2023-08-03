package com.example.insight;

public class Task {
    private String name;
    private String taskType;
    private String dayType;
    private String dayTime;
    private boolean accomplished;
    private Integer satisfactionRating;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getTaskType(){
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getDayType(){
        return dayType;
    }

    public void setDayType(String dayType){
        this.dayType = dayType;
    }

    public String getDayTime(){
        return dayTime;
    }

    public void setDayTime(String dayTime) {
        this.dayTime = dayTime;
    }

    public boolean getAccomplished(){
        return accomplished;
    }

    public void setAccomplished(boolean accomplished) {
        this.accomplished = accomplished;
    }

    public Integer getSatisfactionRating(){
        return satisfactionRating;
    }

    public void setSatisfactionRating(Integer satisfactionRating) {
        this.satisfactionRating = satisfactionRating;
    }
}
