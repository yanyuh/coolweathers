package com.example.coolweathers.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhuxinlong on 2017/10/30.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
