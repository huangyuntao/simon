package com.hyt.simon.util;

import java.io.File;

import javax.servlet.ServletContext;
/**
 * 文件操作工具类
 *
 */
public class FileUtil {
    /**
     * 获取
     * @return
     */
	public static String getStaticPath(){
         ServletContext servletContext = ServletAPIUtil.getRequest().getServletContext();
         String realPath = servletContext.getRealPath("/");
         String filePath = realPath + "WEB-INF"+File.separator + "classes" + File.separator +"static" + File.separator + "resource";
         return filePath;
	}
}
