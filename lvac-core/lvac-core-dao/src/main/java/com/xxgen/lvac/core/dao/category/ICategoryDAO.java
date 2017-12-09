
/** 
 * @Title 电影类型DAO接口
 * @Package com.xxgen.lvac.core.dao.category 
 * @Desription 电影类型DAO接口
 * @ClassName ICategoryDAO.java
 * @author xxGen
 * @CreateDate 2017年12月7日 下午11:18:30
 * @UpdateUser xxGen
 * @version v0.1 
 */

package com.xxgen.lvac.core.dao.category;

import java.util.List;

import com.xxgen.lvac.core.model.category.Category;
import com.xxgen.lvac.core.repository.annotation.Repository;

/** 
 * @ClassName ICategoryDAO 
 * @Description 电影类型DAO接口
 * @author xxGen
 * @date 2017年12月7日 下午11:18:30 
 */

@Repository
public interface ICategoryDAO {
	
	int count();
	
	List<Category> list();
}
