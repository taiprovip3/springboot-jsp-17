package phb.group.phb.dev.employ.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AnimalFeed implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private String address;
	private Double costPrice;
	private String type;
	private String supplier;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
	public AnimalFeed() {
		super();
	}
	
	public AnimalFeed(String name, String address, Double costPrice, String type, String supplier) {
		super();
		this.name = name;
		this.address = address;
		this.costPrice = costPrice;
		this.type = type;
		this.supplier = supplier;
	}
	
	public AnimalFeed(long id, String name, String address, Double costPrice, String type, String supplier) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.costPrice = costPrice;
		this.type = type;
		this.supplier = supplier;
	}
	
	@Override
	public String toString() {
		return "AnimalFeed [id=" + id + ", name=" + name + ", address=" + address + ", costPrice=" + costPrice
				+ ", type=" + type + ", supplier=" + supplier + "]";
	}
}
