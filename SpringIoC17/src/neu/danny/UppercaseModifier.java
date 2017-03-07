package neu.danny;

import java.lang.reflect.Field;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.
             config.BeanPostProcessor;

public class UppercaseModifier implements BeanPostProcessor {
/*
 * postProcessBeforeInitialization()��������Bean�౻��ʼ��֮ǰ(����InitializingBean��afterPropertiesSet()����
 * ���Զ����init����)��ִ�У���postProcessAfterInitialization()��������Bean�౻��ʼ��֮��������ִ�С�
 */
    public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
        
        // ȡ��Bean��Field��Ա
        Field[] fields = bean.getClass().getDeclaredFields();
        
        for(int i = 0; i < fields.length; i++) {
            // ���String��̬��Field��Ա��������
            if(fields[i].getType().equals(String.class)) {
                fields[i].setAccessible(true);
                try {
                    String original = (String) fields[i].get(bean);
                    // ��Ϊ��д
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

