package com.thinkgem.jeesite.test;

/**
 * ****************************
 * CreateTime Dec 30, 2013 11:54:15 AM
 * Author MaBingYang
 * FileName Print.java
 * FilePath com.common
 * Explain 热敏打印机
 * ******************************
 */
public class Print {

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			
			com.inossem.print.Print.execute("000107020080001655,,,150500001A","2311040086875394", "23000039130", "01",
					"包装材料、标识-包装材料-胶纸","中国石油化工股份有限公司物资装备部中国石油化工股份有限公司物资装备部","","", "GP-3120TU HOUSE1CODE",0);
		
			
		}
	}
}
