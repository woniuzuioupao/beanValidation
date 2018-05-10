package com.ibm.bean.test;


import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

public class Book {
	private long id;

	/**
	 * 书名
	 */
	@NotEmpty(message = "书名不能为空")
	private String bookName;
	/**
	 * ISBN号
	 */
	@NotNull(message = "ISBN号不能为空")
	private String bookIsbn;
	/**
	 * 单价
	 */
	@DecimalMin(value = "0.1",message = "单价最低为0.1")
	private double price; // getter setter .......  }
}
