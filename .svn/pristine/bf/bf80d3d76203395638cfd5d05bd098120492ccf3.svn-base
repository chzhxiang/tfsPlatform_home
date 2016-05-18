package com.asiainfo.tfsPlatform.web.common.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

/**
* 类说明：与页面进行交互的工具类
* @author cuichao
* @date 2016年5月13日 下午1:43:04
*/
public class ActionUtil {

	public static void PrintWriter(String message, HttpServletResponse response) {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = null;
        try {
            printWriter = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        printWriter.print(message);
        printWriter.close();
    }
}
