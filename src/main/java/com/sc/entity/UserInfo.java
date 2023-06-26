package com.sc.entity;

import com.sc.annotation.MaskingData;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "user_details")
@Data
public class UserInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	@MaskingData
	private String email;

	@MaskingData
	private String password;

	private String roles;

	@MaskingData
	@Column(name = "card_no")
	private String cardNo;
}
