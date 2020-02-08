package com.lemonfish.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("工资")
public class Salary {

	/**
	 * 职称ID
	 */
	@ApiModelProperty(value = "职称ID", position = 0)
	private Integer titleId;

	/**
	 * 工资(单位:人民币)
	 */
	@ApiModelProperty(value = "工资(单位:人民币)", position = 1)
	private Integer salary;


}
