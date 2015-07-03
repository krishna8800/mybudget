/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 *
 * @author Krishna
 */
@Entity
@Table(name = "Entrys")
public class AddEntry {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    @Column(name = "Item_Name")
    private String itemName;
    @Column(name = "Item_Cost")
    private Double itemCost;
    @Column(name = "Item_Date")
    private String date;
    @Column(name = "Item_Description")
    private String itemDesc;
    @Column(name = "MoneySpendBy")
    private String moneySpendBy;

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the itemCost
     */
    public Double getItemCost() {
        return itemCost;
    }

    /**
     * @param itemCost the itemCost to set
     */
    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the itemDesc
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * @param itemDesc the itemDesc to set
     */
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    /**
     * @return the moneySpendBy
     */
    public String getMoneySpendBy() {
        return moneySpendBy;
    }

    /**
     * @param moneySpendBy the moneySpendBy to set
     */
    public void setMoneySpendBy(String moneySpendBy) {
        this.moneySpendBy = moneySpendBy;
    }
    
    
    
    
}
