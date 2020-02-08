package com.lemonfish.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Masics 张超
 * @date 2020/2/8 20:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GithubUser {
    private String name;
    private Long id;
    private String bio;

}
