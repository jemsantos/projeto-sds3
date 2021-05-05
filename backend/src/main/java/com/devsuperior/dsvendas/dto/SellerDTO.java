/**
 * 
 */
package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

/**
 * @author José Eustaquio
 *
 */
public class SellerDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;

	public SellerDTO() {}

	/**
	 * @param id
	 * @param name
	 */
	public SellerDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/**
	 * @param id
	 * @param name
	 */
	public SellerDTO(Seller entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
