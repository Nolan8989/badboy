package nolan.anon;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//ע�������ã� ������ key-value
//value ��ע�����õ�ʱ��һ������� key ���ơ�


@Retention(RetentionPolicy.RUNTIME)//ע���������,Ĭ����class,��Ҫ�ĳ�runtime,�����޷����ص������
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface MyAnon {
	
	String value() default("xiaogao");
}
