
/** 
 * @Title 电影类型 
 * @Package com.xxgen.lvac.core.model.category 
 * @Desription 电影类型 
 * @ClassName Category.java
 * @author xxGen
 * @CreateDate 2017年12月7日 下午11:11:57
 * @UpdateUser xxGen
 * @version v0.1 
 */

package com.xxgen.lvac.core.model.category;


/** 
 * @ClassName Category 
 * @Description 电影类型 
 * @author xxGen
 * @date 2017年12月7日 下午11:11:57 
 */

public class Category {
	public Integer id;
	public String categoryName;
	public String description;
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
