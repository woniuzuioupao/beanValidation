package com.ibm.bean.test;

import javax.validation.*;
import java.util.Set;



public class Order {
	@Valid
	private Book book;

	public Book getPerson() {
		return book;
	}

	public void setPerson(Book book) {
		this.book = book;
	}
	public static void main(String[] args){
		Order order = new Order();
		Book person = new Book();
		order.setPerson(person);
		ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
		Validator validator = vf.getValidator();
		Set<ConstraintViolation<Order>> set = validator.validate(order);
		for (ConstraintViolation<Order> constraintViolation : set) {
			System.out.println(constraintViolation.getMessage());
		}
	}
}
