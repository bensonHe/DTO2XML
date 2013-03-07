package org.dtotxml.annotation.tag;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * create a customer annotation
 * @author JinbinHe
 * @QQ 277803242
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface XMLFiled {
	public String fildName();
	public String attributeName() default "";
}
