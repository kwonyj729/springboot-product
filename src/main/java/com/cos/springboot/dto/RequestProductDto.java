package com.cos.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestProductDto {
	private int id;
	private String prodname;
	private int price;
	private int orderCount;
	private String type;

}
