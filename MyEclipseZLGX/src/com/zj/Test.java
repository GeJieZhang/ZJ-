package com.zj;

public class Test {
	
	

	public static void main(String[] args) {
		String oldApkPath="version1.0.apk";
		String newApkPath="version2.0.apk";
		String patchPath="version1.0_2.0.patch";
		
		
		BsdiffCompareUtil.compareApk(oldApkPath, newApkPath, patchPath);
		
		
		
		System.out.print("Éú³ÉÍê±Ï");
		
	}

}
