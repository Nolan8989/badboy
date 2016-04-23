package norlando.anon;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//注解是配置， 里面是 key-value
//value 是注解配置的时候，一个特殊的 key 名称。


@Retention(RetentionPolicy.RUNTIME)//注解的作用域,默认是class,需要改成runtime,否则无法加载到虚拟机
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface MyAnon {
	
	String value() default("xiaogao");
}
