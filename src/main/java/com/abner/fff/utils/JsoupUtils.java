package com.abner.fff.utils;

import com.abner.fff.exception.AnyException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class JsoupUtils {
    private static final String UA_PC = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.102 Safari/537.36";
    private static final String ERROR_DESC = "网址请求失败：";
    private static final int TIME_OUT = 10 * 1000;
    public static Document getDocWithPC(String url) {
        try {
            return Jsoup.connect(url).userAgent(UA_PC).timeout(TIME_OUT).ignoreContentType(true).get();
        } catch (IOException e) {
            System.out.print(ERROR_DESC + url);
            throw new AnyException(ERROR_DESC + url);
//            throw new AnyException(ERROR_DESC + url);
        }
    }
}
