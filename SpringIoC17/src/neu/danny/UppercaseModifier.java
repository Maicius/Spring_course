package neu.danny;

import java.lang.reflect.Field;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.
             config.BeanPostProcessor;

public class UppercaseModifier implements BeanPostProcessor {
/*
 * postProcessBeforeInitialization()方法会在Bean类被初始化之前(例如InitializingBean的afterPropertiesSet()方法
 * 或自定义的init方法)被执行，而postProcessAfterInitialization()方法会在Bean类被初始化之后立即被执行。
 */
    public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
        
        // 取得Bean的Field成员
        Field[] fields = bean.getClass().getDeclaredFields();
        
        for(int i = 0; i < fields.length; i++) {
            // 针对String型态的Field成员加以修正
            if(fields[i].getType().equals(String.class)) {
                fields[i].setAccessible(true);
                try {
                    String original = (String) fields[i].get(bean);
                    // 改为大写
                    fields[i].set(bean, original.toUpperCase());
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return bean;
    }

    public Object postProcessAfterInitialization(
                   Object bean, String name) throws BeansException {
        return bean;
    }

}

