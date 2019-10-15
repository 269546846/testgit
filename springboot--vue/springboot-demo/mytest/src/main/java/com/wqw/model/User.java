package com.wqw.model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {

	private Integer id;
	private String username;
	private String password;

}
