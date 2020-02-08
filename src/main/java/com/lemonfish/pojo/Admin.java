package com.lemonfish.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

	/**
	 * 用户ID
	 */
	@ApiModelProperty(value = "用户ID", position = 0)
	@TableId(value = "userID",type = IdType.AUTO)
	private Integer userID;

	/**
	 * 用户名
	 */
	@ApiModelProperty(value = "用户名", position = 1)
	private String username;

	/**
	 * 密码
	 */
	@ApiModelProperty(value = "密码", position = 2)
	private String password;

	/**
	 * 权限等级
	 */
	@ApiModelProperty(value = "权限等级", position = 3)
	@TableField("levelID")
	private Integer levelID;


}
