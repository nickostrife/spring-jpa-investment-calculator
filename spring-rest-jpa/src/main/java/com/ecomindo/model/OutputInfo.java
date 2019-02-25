package com.ecomindo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OutputInfo {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long oid;
	
	private Integer month;
	
	// Begin column variables 
	private Integer begStock;
	private Integer begCash;
	private Integer begTot;
	
	// Transaction column variables
	private Integer traStock;
	private Integer traCash;
	private Integer traTot;
	
	// Rebalance column variables
	private Integer rebStock;
	private Integer rebCash;
	
	// Ending column variables
	private Integer endStock;
	private Integer endCash;
	private Integer endTot;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id", name = "INPUT_DATA_ID")
	private InputData inputData;
	
//	public OutputInfo(Integer month, Integer begStock, Integer begCash, Integer begTot, Integer traStock, Integer traCash, Integer traTot,
//			Integer rebStock, Integer rebCash, Integer endStock, Integer endCash, Integer endTot) {
//		this.month = month;
//		this.begStock = begStock;
//		this.begCash = begCash;
//		this.begTot = begTot;
//		this.traStock = traStock;
//		this.traCash = traCash;
//		this.traTot = traTot;
//		this.rebStock = rebStock;
//		this.rebCash = rebCash;
//		this.endStock = endStock;
//		this.endCash = endCash;
//		this.endTot = endTot;
//		
//	}
	
	@Override
	public String toString() {
		return "OutputInfo [oid=" + oid + ", month=" + month + ", begStock=" + begStock + ", begCash=" + begCash
				+ ", begTot=" + begTot + ", traStock=" + traStock + ", traCash=" + traCash + ", traTot=" + traTot
				+ ", rebStock=" + rebStock + ", rebCash=" + rebCash + ", endStock=" + endStock + ", endCash=" + endCash
				+ ", endTot=" + endTot + "]";
	}
	
	public Long getOid() {
		return oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getBegStock() {
		return begStock;
	}
	public void setBegStock(Integer begStock) {
		this.begStock = begStock;
	}
	public Integer getBegCash() {
		return begCash;
	}
	public void setBegCash(Integer begCash) {
		this.begCash = begCash;
	}
	public Integer getBegTot() {
		return begTot;
	}
	public void setBegTot(Integer begTot) {
		this.begTot = begTot;
	}
	public Integer getTraStock() {
		return traStock;
	}
	public void setTraStock(Integer traStock) {
		this.traStock = traStock;
	}
	public Integer getTraCash() {
		return traCash;
	}
	public void setTraCash(Integer traCash) {
		this.traCash = traCash;
	}
	public Integer getTraTot() {
		return traTot;
	}
	public void setTraTot(Integer traTot) {
		this.traTot = traTot;
	}
	public Integer getRebStock() {
		return rebStock;
	}
	public void setRebStock(Integer rebStock) {
		this.rebStock = rebStock;
	}
	public Integer getRebCash() {
		return rebCash;
	}
	public void setRebCash(Integer rebCash) {
		this.rebCash = rebCash;
	}
	public Integer getEndStock() {
		return endStock;
	}
	public void setEndStock(Integer endStock) {
		this.endStock = endStock;
	}
	public Integer getEndCash() {
		return endCash;
	}
	public void setEndCash(Integer endCash) {
		this.endCash = endCash;
	}
	public Integer getEndTot() {
		return endTot;
	}
	public void setEndTot(Integer endTot) {
		this.endTot = endTot;
	}
	
	

}
