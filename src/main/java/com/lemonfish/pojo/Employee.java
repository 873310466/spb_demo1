package com.lemonfish.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("职工")
public class Employee {

	/**
	 * 职工ID
	 */
	@ApiModelProperty(value = "职工ID", position = 0)
	private Integer empId;

	/**
	 * 职工姓名
	 */
	@ApiModelProperty(value = "职工姓名", position = 1)
	private String empName;

	/**
	 * 身份证号
	 */
	@ApiModelProperty(value = "身份证号", position = 2)
	private String empIdCard;

	/**
	 * 职工性别
	 */
	@ApiModelProperty(value = "职工性别", position = 3)
	private String empSex;

	/**
	 * 职工住址
	 */
	@ApiModelProperty(value = "职工住址", position = 4)
	private String empAddress;

	/**
	 * 职工邮箱
	 */
	@ApiModelProperty(value = "职工邮箱", position = 5)
	private String empEmail;

	/**
	 * 职工生日
	 */
	@ApiModelProperty(value = "职工生日", position = 6)
	private java.util.Date empBirth;

	/**
	 * 职工民族
	 */
	@ApiModelProperty(value = "职工民族", position = 7)
	private String empNation;

	/**
	 * 职工加入日期
	 */
	@ApiModelProperty(value = "职工加入日期", position = 8)
	private java.util.Date empEntryDate;

	/**
	 * 职工证件照
	 */
	@ApiModelProperty(value = "职工证件照", position = 9)
	private String empIdPhoto;

	/**
	 * 职工职称
	 */
	@ApiModelProperty(value = "职工职称", position = 10)
	private Integer empTitleId;

	/**
	 * 所属科室
	 */
	@ApiModelProperty(value = "所属科室", position = 11)
	private Integer empOfficeId;

	/**
	 * 权限
	 */
	@ApiModelProperty(value = "权限", position = 12)
	private Integer empAuthorityId;


}
