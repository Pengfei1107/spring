package com.shadow.zl;

import com.shadow.util.LubanImportBeanDefinitionRegistart;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@MapperScan
@Retention(RetentionPolicy.RUNTIME)
@Import(LubanImportBeanDefinitionRegistart.class)
public @interface CustomScan {
}
