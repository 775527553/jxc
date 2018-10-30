package com.soft.base.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Accessors(chain = true)
public class ResultData {

    private int code;

    private String msg;

    private Object data;




    public static ResultData success(){
        ResultData json=new ResultData();
        json.setData("").setCode(0).setMsg("");
        return json;
    }
    public static ResultData success(Object o){
        ResultData json=new ResultData();
        json.setData(o).setCode(0).setMsg("");
        return json;
    }

    public static ResultData error(){
        ResultData json=new ResultData();
        json.setData("").setCode(1).setMsg("");
        return json;
    }

    public static ResultData error(String msg){
        ResultData json=new ResultData();
        json.setData("").setCode(1).setMsg(msg);
        return json;
    }


}
