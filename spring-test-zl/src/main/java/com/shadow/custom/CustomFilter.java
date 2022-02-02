package com.shadow.custom;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class CustomFilter implements TypeFilter {
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
		boolean b = metadataReader.getAnnotationMetadata().hasAnnotation("com.shadow.zl.CustomBean");
		return b;
	}

}
