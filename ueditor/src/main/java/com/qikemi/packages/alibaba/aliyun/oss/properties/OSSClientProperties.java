package com.qikemi.packages.alibaba.aliyun.oss.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.qikemi.packages.utils.SystemUtil;

public class OSSClientProperties {

    private static Properties OSSKeyProperties = new Properties();
    // 阿里云是否启用配置
    public static String bucketName = "";
    public static boolean useStatus = false;
    public static String key = "";
    public static String secret = "";
    public static String endPoint = "";
    public static String projectName = "";

    static {
	String OSSKeyPath = SystemUtil.getProjectClassesPath() + "OSSKey.properties";
	// 生成文件输入流
	FileInputStream inpf = null;
	try {
	    inpf = new FileInputStream(new File(OSSKeyPath));
	    OSSKeyProperties.load(inpf);
	    useStatus = "true".equalsIgnoreCase((String) OSSKeyProperties.get("useStatus")) ? true : false;
	    bucketName = (String) OSSKeyProperties.get("bucketName");
	    key = (String) OSSKeyProperties.get("key");
	    secret = (String) OSSKeyProperties.get("secret");
	    endPoint = (String) OSSKeyProperties.get("endPoint");
	    projectName = (String) OSSKeyProperties.get("projectName");
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}
