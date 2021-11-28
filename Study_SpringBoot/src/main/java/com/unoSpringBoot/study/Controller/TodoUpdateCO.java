package com.unoSpringBoot.study.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.unoSpringBoot.study.DTO.TodoDTO;
import com.unoSpringBoot.study.UnoDOC.Return;
import com.unoSpringBoot.study.model.TodoEntity;
import com.unoSpringBoot.study.service.TodoService;

@Service
public class TodoUpdateCO {

	@Autowired
	private TodoService service;
	private final String USER_ID = "KIM_EUN_HO";

	public ResponseEntity<?> updateTodo(TodoDTO dto) {
		try {
			TodoEntity todoEntity = TodoDTO.setEntity(dto);
			todoEntity.setUserId(USER_ID);
			List<TodoEntity> entities = service.updateTodo(todoEntity);
			return Return.returnList(entities);
		} catch (Exception e) {
			return Return.returnError(e);
		}
	}
}
