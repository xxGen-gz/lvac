
/** 
 * @Title 电影类型DAO接口测试
 * @Package com.xxgen.lvac.core.dao.category 
 * @Desription 电影类型DAO接口测试
 * @ClassName ICategoryDAOTest.java
 * @author xxGen
 * @CreateDate 2017年12月7日 下午11:27:59
 * @UpdateUser xxGen
 * @version v0.1 
 */

package com.xxgen.lvac.core.dao.category;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xxgen.lvac.core.model.category.Category;

/** 
 * @ClassName ICategoryDAOTest 
 * @Description 电影类型DAO接口测试
 * @author xxGen
 * @date 2017年12月7日 下午11:27:59 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring/common/*.xml" })
public class ICategoryDAOTest {
	@Autowired
	private ICategoryDAO categoryDAO;
	

	@Test
    public void countTest() {
		int count = -1;
		try {
			count = categoryDAO.count();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
    public void listTest() {
		List<Category> categories = null;
		try {
			categories = categoryDAO.list();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
