
/** 
 * @Title 初始化测试 
 * @Package com.xxgen.lvac.core.dao 
 * @Desription 初始化测试 
 * @ClassName InitTest.java
 * @author xxGen
 * @CreateDate 2017年11月29日 下午11:13:40
 * @UpdateUser xxGen
 * @version v0.1 
 */

package com.xxgen.lvac.core.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;

/** 
 * @ClassName InitTest 
 * @Description 初始化测试 
 * @author xxGen
 * @date 2017年11月29日 下午11:13:40 
 */

public class InitTest {

	/**  
	 * @Description  初始化测试 
	 * @author xxGen
	 * @date 2017年11月29日 下午11:13:40 
	 *
	 * @param args 
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
            Date dd = new Date();
            System.out.println(dd.getTime());
            Connection conn = null; //定义一个MYSQL链接对象
            Class.forName("com.mysql.jdbc.Driver").newInstance(); //MYSQL驱动
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lvac_db", "root", "123456"); //链接本地MYSQL
            System.out.println("yes");
        } catch (Exception ex) {
            System.err.println("MYSQL ERROR:" + ex.getMessage());
        }
	}

}
