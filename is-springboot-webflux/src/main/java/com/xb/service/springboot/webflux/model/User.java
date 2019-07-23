package com.xb.service.springboot.webflux.model;

import lombok.*;

/**
 * @ClassName: User
 * @Description:
 * @Author: Coding_wxb
 * @Date 2019.07.24 2:26
 */
@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;

    private String name;
}
