package com.tts.ECommerce.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

	
		  @Id
		  @GeneratedValue(strategy = GenerationType.AUTO)
		  @Column(name = "Product_id")
		  private Long id;
		  
		  
		  private String Name;
		  private String Brand;
		  private String Category;
		  

}
