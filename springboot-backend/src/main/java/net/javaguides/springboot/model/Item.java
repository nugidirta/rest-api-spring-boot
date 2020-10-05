package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "item_code")
	private String itemCode;

	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "item_type") // jenis
	private String itemType;
	
	@Column(name = "item_unit") // satuan
	private String itemUnit;

	@Column(name = "item_brand") // Merek
	private String itemBrand;

	@Column(name = "item_warehouse") // Gudang
	private String itemWarehouse;

	public Item() {
		
	}
	
	public Item(String itemCode, String itemName, String itemType,
				String itemUnit, String itemBrand, String itemWarehouse) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemUnit = itemUnit;
		this.itemBrand = itemBrand;
		this.itemWarehouse = itemWarehouse;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemUnit() {
		return itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}

	public String getItemBrand() {
		return itemBrand;
	}
	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}

	public String getItemWarehouse() {
		return itemWarehouse;
	}
	public void setItemWarehouse(String itemWarehouse) {
		this.itemWarehouse = itemWarehouse;
	}
}
