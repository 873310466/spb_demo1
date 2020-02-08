package com.lemonfish.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("职称")
public class Title {

	/**
	 * 职称ID
	 */
	@ApiModelProperty(value = "职称ID", position = 0)
	private Integer titleId;

	/**
	 * 职称名
	 */
	@ApiModelProperty(value = "职称名", position = 1)
	private String titleName;


}
