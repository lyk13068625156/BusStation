package org.gdou.busstation.Util;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.DefaultConversionService;

import java.beans.PropertyDescriptor;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class ObjectUtils {
	private static DefaultConversionService conversionService;

	static {
		conversionService = new DefaultConversionService();
		conversionService.addConverter(Date.class, Long.class, new Converter<Date, Long>() {
			@Override
			public Long convert(Date date) {
				return date.getTime();
			}
		});
	}

	public static Set<Class<?>> basicClasses = Sets.newHashSet(
			Boolean.class, boolean.class,
			Byte.class, byte.class,
			Short.class, short.class,
			Integer.class, int.class,
			Long.class, long.class,
			Float.class, float.class,
			Double.class, double.class,
			Character.class, char.class,
			String.class, Class.class, Date.class);

	public static boolean isBasicClass(Class<?> clazz) {
		return clazz.isPrimitive() || basicClasses.contains(clazz);
	}

	private static void doCopy(Object source,
							   Object target,
							   boolean notNull,
							   String... excludes) {
		BeanWrapper sourceBean = new BeanWrapperImpl(source);
		BeanWrapper targetBean = new BeanWrapperImpl(target);
		targetBean.setConversionService(conversionService);

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dateFormat.setLenient(false);
		targetBean.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));

		Set<String> excludeProps = Sets.newHashSet(excludes);
		for (PropertyDescriptor descriptor: sourceBean.getPropertyDescriptors()) {
			String propName = descriptor.getName();
			if (!excludeProps.contains(propName) && targetBean.isWritableProperty(propName)) {
				Object sourceValue = sourceBean.getPropertyValue(propName);
				if (notNull && sourceValue == null) {
					continue;
				}
				if (sourceValue == null) {
					targetBean.setPropertyValue(propName, null);
				} else {
					Class<?> targetClass = targetBean.getPropertyType(propName);
					if (conversionService.canConvert(sourceValue.getClass(), targetClass)) {
						targetBean.setPropertyValue(propName, sourceValue);
					}
				}
			}
		}
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	private static void doCopy(Object source, Map target, boolean notNull, String... excludes) {
		BeanWrapper sourceBean = new BeanWrapperImpl(source);

		Set<String> excludeProps = Sets.newHashSet(excludes);
		for (PropertyDescriptor descriptor: sourceBean.getPropertyDescriptors()) {
			Object sourceValue = sourceBean.getPropertyValue(descriptor.getName());
			if (!excludeProps.contains(descriptor.getName()) && (!notNull || sourceValue != null)) {
				target.put(descriptor.getName(), sourceValue);
			}
		}
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	private static void doCopy(Map<String, ?> source, Object target, boolean notNull, String... excludes) {
		BeanWrapper targetBean = new BeanWrapperImpl(target);
		targetBean.setConversionService(conversionService);

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dateFormat.setLenient(false);
		targetBean.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));

		Set<String> excludeProps = Sets.newHashSet(excludes);
		for (String prop: source.keySet()) {
			Object sourceValue = source.get(prop);
			if (!excludeProps.contains(prop) && (!notNull || sourceValue != null)) {
				PropertyDescriptor pd = targetBean.getPropertyDescriptor(prop);
				if (pd.getWriteMethod() != null) {
					targetBean.setPropertyValue(prop, sourceValue);
				}
			}
		}
	}

	public static void copyNotNull(Object source, Object target, String... excludes) {
		doCopy(source, target, true, excludes);
	}

	public static void copy(Object source, Object target, String... excludes) {
		doCopy(source, target, false, excludes);
	}

	@SuppressWarnings("rawtypes")
	public static void copyNotNull(Object source, Map target, String... excludes) {
		doCopy(source, target, true, excludes);
	}

	@SuppressWarnings("rawtypes")
	public static void copy(Object source, Map target, String... excludes) {
		doCopy(source, target, false, excludes);
	}

	public static void copy(Map<String, ?> source, Object target, String... excludes) {
		doCopy(source, target, false, excludes);
	}

	public static void copyNotNull(Map<String, ?> source, Object target, String... excludes) {
		doCopy(source, target, true, excludes);
	}

	public static <T> T mapNotNull(Object source, Class<T> targetClass, String... excludes) {
		try {
			T target = targetClass.newInstance();
			doCopy(source, targetClass.newInstance(), true, excludes);
			return target;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static <T> T map(Object source, Class<T> targetClass, String... excludes) {
		if (source == null) {
			return null;
		}
		try {
			T target = targetClass.newInstance();
			doCopy(source, target, false, excludes);
			return target;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static <T> List<T> mapList(List<?> sources, Class<T> targetClass, String... excludes) {
		return sources.stream().map(s -> map(s, targetClass, excludes)).collect(Collectors.toList());
	}

	public static String underscore2CamelCase(String key) {
		if (key.contains("_")) {
			return StringUtils.uncapitalize(Joiner.on("").join(
					Splitter.on("_").splitToList(key).stream().map(StringUtils::capitalize).collect(Collectors.toList())));
		} else {
			return key;
		}
	}

	public static String camelCase2Underscore(String key) {
		return Arrays.stream(StringUtils.splitByCharacterTypeCamelCase(key))
				.map(String::toLowerCase)
				.reduce("", (a, b) -> a + b);
	}

	public static String identityTransform(String key) {
		return key;
	}
}
