package com.tax.employees.restadvice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tax.employees.response.AppResponse;

@RestControllerAdvice
public class EmployeeExceptions {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public AppResponse handleValidation(MethodArgumentNotValidException exception) {
		Map<String, String> messages = new HashMap<>();
		exception.getBindingResult().getFieldErrors().forEach(e-> {
			messages.put(e.getField(),e.getDefaultMessage());
		});
		return new AppResponse("Error", messages);
	}
}
