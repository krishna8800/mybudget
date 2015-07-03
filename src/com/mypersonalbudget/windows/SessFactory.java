/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypersonalbudget.windows;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author Krishna
 */
public class SessFactory {
    
    public SessionFactory getSessionFactory(){
    
        SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
        return sessionfactory;
    
    }
    
    
}
