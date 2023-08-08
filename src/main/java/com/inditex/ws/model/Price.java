package com.inditex.ws.model;

import java.util.Date;

public class Price {
	
	private Long brandId;
    private Date startDate;
    private Date endDate;
    private Long priceList;
    private Long productId;
    private Double price;
    
    /**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
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
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	
	
	

}
