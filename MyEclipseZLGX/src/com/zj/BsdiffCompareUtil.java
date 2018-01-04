package com.zj;

public class BsdiffCompareUtil {

	 static{
	        System.load("D:\\workspace1\\MyEclipseZLGX\\jni\\BsdiffDemo.dll");
	    }
	 
	 
	 
	 public static native void compareApk(String oldApkPath,String newApkPath,String patchPath);




}
