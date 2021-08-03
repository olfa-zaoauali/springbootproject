package com.olfa.springbootproject.exception;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ErrorDetails {
    private Date timestamp;
    private String message ;
    private String Details ;
    //constructor
    public ErrorDetails(Date timestamp , String message , String Details ){
       // @JsonFormat(shape = JsonFormat.shape.statue , pattern="dd-MM-YY hh:mm:ss")
        this.timestamp=timestamp;
        this.message=message;
        this.Details=Details;
    }

    public Date getTimestamp(){
        return this.timestamp;
    }
    public void setTimestamp(Date timestamp){
        this.timestamp=timestamp;
    }
    public String getMessage(){
        return this.message;
    }
    public void setMessage(String message){
        this.message=message;
    }
    public String getDetails(){
        return this.Details;
    }
    public void setDetails(String Details){
        this.Details=Details;
    }
}
