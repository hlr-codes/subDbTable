package com.sub.dt.dbRouting.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description
 * @Autohr supers【weChat:13031016567】
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Router {

	//分段属性
    String routerField() default RouterConstants.ROUTER_FIELD_DEFAULT;

    //表名规则
    String tableStyle() default RouterConstants.ROUTER_TABLE_SUFFIX_DEFAULT;
    
    //RULE_TYPE_STR
}
