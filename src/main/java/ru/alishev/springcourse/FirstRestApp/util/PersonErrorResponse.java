package ru.alishev.springcourse.FirstRestApp.util;

import java.time.LocalDateTime;
import java.util.Date;

public class PersonErrorResponse {
    private String msg;
    private LocalDateTime dateTime;

    public PersonErrorResponse(String msg, LocalDateTime dateTime) {
        this.msg = msg;
        this.dateTime = dateTime;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
