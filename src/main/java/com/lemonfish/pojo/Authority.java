package com.lemonfish.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("权限")
public class Authority {

	/**
	 * 权限ID
	 */
	@ApiModelProperty(value = "权限ID", position = 0)
	private Integer authorityId;

	/**
	 * 权限名称
	 */
	@ApiModelProperty(value = "权限名称", position = 1)
	private String authorityName;

	/**
	 * 具体权限
	 */
	@ApiModelProperty(value = "具体权限", position = 2)
	private String authorityRole;


}
