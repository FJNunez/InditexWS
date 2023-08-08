package com.inditex.ws.model;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "price")
public class PriceEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long brandId;
    private Date startDate;
    private Date endDate;
    private Long priceList;
    private Long productId;
    private Integer priority;
    private Double price;
    private String currency;
   
    public PriceEntity() {}
    
   public PriceEntity(Long brandId, Date startDate, Date endDate, Long priceList, Long productId, Integer priority,
            Double price, String currency) {
   this.brandId = brandId;
   this.startDate = startDate;
   this.endDate = endDate;
   this.priceList = priceList;
   this.productId = productId;
   this.priority = priority;
   this.price = price;
   this.currency = currency;
    }
   
   public PriceEntity(Long brandId) {
	   this.brandId = brandId;
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
	 * @return the brandId
	 */
	public Long getBrandId() {
		return brandId;
	}
	/**
	 * @param brandId the brandId to set
	 */
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * @return the priceList
	 */
	public Long getPriceList() {
		return priceList;
	}
	/**
	 * @param priceList the priceList to set
	 */
	public void setPriceList(Long priceList) {
		this.priceList = priceList;
	}
	/**
	 * @return the productId
	 */
	public Long getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	/**
	 * @return the priority
	 */
	public Integer getPriority() {
		return priority;
	}
	/**
	 * @param priority the priority to set
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
   
    
}
