package io.github.fdj32.app.dao;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.EmptyInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomInterceptor extends EmptyInterceptor {

	private static final long serialVersionUID = -3613500528098774774L;
	private static final Logger LOG = LoggerFactory.getLogger(CustomInterceptor.class);

	@Override
	public Boolean isTransient(Object entity) {
		Class<?> cls = entity.getClass();
		for (Field field : cls.getDeclaredFields()) {
			Annotation annoId = field.getAnnotation(Id.class);
			Annotation annoGeneratedValue = field.getAnnotation(GeneratedValue.class);
			if (null != annoId && null != annoGeneratedValue) {
				String fieldName = field.getName();
				String getterMethodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
				try {
					Method getter = cls.getMethod(getterMethodName);
					Object identityValue = getter.invoke(entity);
					if (GenerationType.IDENTITY == ((GeneratedValue) annoGeneratedValue).strategy()
							&& null == identityValue) {
						return true;
					}
				} catch (Exception e) {
					LOG.error("", e);
				}
			}
		}
		return null;
	}

}