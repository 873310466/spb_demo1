package com.lemonfish.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("科室")
public class Office {

	/**
	 * 科室ID
	 */
	@ApiModelProperty(value = "科室ID", position = 0)
	private Integer officeId;

	/**
	 * 科室名称
	 */
	@ApiModelProperty(value = "科室名称", position = 1)
	private String officeName;

	/**
	 * 科室成立日期
	 */
	@ApiModelProperty(value = "科室成立日期", position = 2)
	private java.util.Date officeBirDate;

	/**
	 * 科室所属部门
	 */
	@ApiModelProperty(value = "科室所属部门", position = 3)
	private Integer officeInDep;


}
