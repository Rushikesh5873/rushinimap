package com.nimap.modal;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	
	private String type;
	
	@OneToMany
	private List<Product> prod;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(int cid, String type, List<Product> prod) {
		super();
		this.cid = cid;
		this.type = type;
		this.prod = prod;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Product> getProd() {
		return prod;
	}

	public void setProd(List<Product> prod) {
		this.prod = prod;
	}

}
