package edu.edu.xsgmanage.constant;

import java.nio.charset.Charset;

import okhttp3.MediaType;

//静态常量
public class Constans {
    public static String BASEURL="http://192.168.16.106:8000/";
    public final static Charset CHARSET=Charset.forName("UTF-8");
    public final static MediaType FORM_CONTENT_TYPE= MediaType.parse("application/x-www-form-urlencoded; charset=utf-8");
}
