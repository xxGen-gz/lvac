
/** 
 * @Title 标识DAO注解
 * @Package com.xxgen.lvac.core.repository.annotation 
 * @Desription 标识为DAO的Repository，方便Spring Scanner的扫描.
 * @ClassName Repository.java
 * @author xxGen
 * @CreateDate 2017年12月7日 上午1:46:10
 * @UpdateUser xxGen
 * @version v0.1 
 */

package com.xxgen.lvac.core.repository.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

/** 
 * @ClassName Repository
 * @Description 标识为DAO的Repository，方便Spring Scanner的扫描
 * @author xxGen
 * @date 2017年12月7日 上午1:46:10
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Repository {

}
