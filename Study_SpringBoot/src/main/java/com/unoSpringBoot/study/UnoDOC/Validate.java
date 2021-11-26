package com.unoSpringBoot.study.UnoDOC;

import com.unoSpringBoot.study.model.TodoEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Validate {
	public static void checkValidate(final TodoEntity entity) {
		if (entity == null) {
			log.warn("엔티티값이 널값임");
			throw new RuntimeException("엔티티에 널값이..ㅠ");
		}
		if (entity.getUserId() == null) {
			log.warn("해당하는 값이없다.");
			throw new RuntimeException("해당하는 값이없다.");
		}
	}
}