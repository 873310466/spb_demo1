package com.lemonfish.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("部门")
public class Department {

	/**
	 * 部门ID
	 */
	@ApiModelProperty(value = "部门ID", position = 0)
	private Integer depId;

	/**
	 * 部门名称
	 */
	@ApiModelProperty(value = "部门名称", position = 1)
	private String depName;

	/**
	 * 部门成立日期
	 */
	@ApiModelProperty(value = "部门成立日期", position = 2)
	private java.util.Date depBirDate;


}
