package com.ecomindo.model;

import java.util.Random;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.ecomindo.service.SpringService;

@Entity
public class InputData {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@JoinColumn
	private Long id;
	
	private Integer amount;
	private Integer stockRatio;
	private Integer cashRatio;
	private Integer durationYear;
	private Integer stockReturn;
	private Integer cashReturn;
	
    @OneToMany(mappedBy = "inputData", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<OutputInfo> infos;
	
	public InputData() {};
	
	public InputData(Long id, Integer amount, Integer stockRatio, Integer cashRatio, Integer durationYear, Integer stockReturn,
			Integer cashReturn) {
	super();
	this.id = id;
	this.amount = amount;
	this.stockRatio = stockRatio;
	this.cashRatio = cashRatio;
	this.durationYear = durationYear;
	this.stockReturn = stockReturn;
	this.cashReturn = cashReturn;
}

	@Override
	public String toString() {
		return "InputData [id=" + id + ", amount=" + amount + ", stockRatio=" + stockRatio + ", cashRatio=" + cashRatio
				+ ", durationYear=" + durationYear + ", stockReturn=" + stockReturn + ", cashReturn=" + cashReturn
				+ "]";
	}
	
//	@Override
//    public String toString() {
//        String result = String.format(
//                "InputData[id=%d, amount='%d', stockRatio='%d', cashRatio='%d', durationYear='%d', stockReturn='%d', cashReturn='%d']%n",
//                id, amount, stockRatio, cashRatio, durationYear, stockReturn, cashReturn);
//        if (infos != null) {
//            for(OutputInfo info : infos) {
//                result += String.format(
//                        "OutputInfo[oid='%d', month='%d', begStock='%d', begCash='%d', begTot='%d', traStock='%d', traCash='%d', traTot='%d', rebStock='%d', rebCash='%d', endStock='%d', endCash='%d', endTot='%d']%n",
//                        info.getOid(), info.getMonth(), info.getBegStock(), info.getBegCash(), info.getBegTot(), info.getTraStock(), info.getTraCash(), info.getTraTot(), info.getRebStock(), info.getRebCash()
//                        ,info.getEndStock(), info.getEndCash(), info.getEndTot());
//            }
//        }
//
//        return result;
//    }
//	
//	@OneToMany(mappedBy = "inputData", cascade = CascadeType.ALL)
//    public Set<OutputInfo> getInfos() {
//        return infos;
//    }
	
//	@ElementCollection(targetClass=OutputInfo.class, fetch = FetchType.EAGER)
//    private Set<OutputInfo> getInfos;

//    public void setInfos(Set<OutputInfo> infos) {
//        this.infos = infos;
//    }
	
	public static int getRandomNumberInts(int min, int max){
	    Random random = new Random();
	    return random.ints(min,(max+1)).findFirst().getAsInt();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public int getStockRatio() {
		return stockRatio;
	}
	public void setStockRatio(Integer stockRatio) {
		this.stockRatio = stockRatio;
	}
	public int getCashRatio() {
		return cashRatio;
	}
	public void setCashRatio(Integer cashRatio) {
		this.cashRatio = cashRatio;
	}
	public int getDurationYear() {
		return durationYear;
	}
	public void setDurationYear(Integer durationYear) {
		this.durationYear = durationYear;
	}
	public int getStockReturn() {
		return stockReturn;
	}
	public void setStockReturn(Integer stockReturn) {
		this.stockReturn = stockReturn;
	}
	public int getCashReturn() {
		return cashReturn;
	}
	public void setCashReturn(Integer cashReturn) {
		this.cashReturn = cashReturn;
	}

	
}
