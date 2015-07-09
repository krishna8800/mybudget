/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypersonalbudget.windows;

import com.bean.AddEntry;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Krishna
 */
public class SumOfMonth {
    
       
    public double getSumOfMonth()
    {
        double sum1=0;
        try
        {
            Calendar calendar = Calendar.getInstance();
            int month = (calendar.get(Calendar.MONTH))+1;
            int year = (calendar.get(Calendar.YEAR));
            System.out.println(month);
            Session session = new SessFactory().getSessionFactory().openSession();
            session.beginTransaction();
            AddEntry ae = new AddEntry();
            Query query1= session.createQuery("select sum(itemCost) from AddEntry where date BETWEEN '"+year+"-"+month+"-01' AND '"+year+"-"+month+"-31')");
            List sum = query1.list();
            session.getTransaction().commit();
            session.close();
            double total = (Double)sum.get(0);
            
            if(total>1){
                sum1 = total;
                return sum1;
            }
            
            else {System.out.println("else executed");return sum1=0;}
            
        }catch(Exception e){
            
            e.printStackTrace();
        
        }
        return sum1;
    }
    public static void main(String args[]){
        SumOfMonth sm = new SumOfMonth();
        sm.getSumOfMonth();
    }
    
}