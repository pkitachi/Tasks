package com.example.tasks;

public class MyTasks {
    String titTask,descTask;

    public MyTasks(String titTask, String descTask) {
        this.titTask = titTask;
        this.descTask = descTask;
    }

    public void setTitTask(String titTask) {
        this.titTask = titTask;
    }

    public void setDescTask(String descTask) {
        this.descTask = descTask;
    }

    public String getTitTask() {
        return titTask;
    }

    public String getDescTask() {
        return descTask;
    }
}
