package com.lemonfish.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Patient {

	/**
	 * 病人ID
	 * 主键
	 */
	private Integer patientId;

	/**
	 * 姓名
	 */
	@ApiModelProperty(value = "姓名", position = 1)
	private String name;

	/**
	 * 性别
	 */
	@ApiModelProperty(value = "性别", position = 2)
	private String sex;

	/**
	 * 岁数
	 */
	@ApiModelProperty(value = "岁数", position = 3)
	private Integer age;

	/**
	 * 所属科室
	 */
	@ApiModelProperty(value = "所属科室", position = 4)
	private String depInfo;

	/**
	 * 访院时间
	 */
	@ApiModelProperty(value = "访院时间", position = 5)
	private java.util.Date time;

	/**
	 * 权限
	 */
	@ApiModelProperty(value = "权限", position = 6)
	private java.math.BigDecimal priority;

	/**
	 * 挂号类别
	 */
	@ApiModelProperty(value = "挂号类别", position = 7)
	private String regType;

	/**
	 * 看病次数
	 */
	@ApiModelProperty(value = "看病次数", position = 8)
	private Integer count;

	/**
	 * 就诊是否结束
	 */
	@ApiModelProperty(value = "就诊是否结束", position = 9)
	private String isDone;

	/**
	 * 是否有医保卡
	 */
	@ApiModelProperty(value = "是否有医保卡", position = 10)
	private String card;


}
