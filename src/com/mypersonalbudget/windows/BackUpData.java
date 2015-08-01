package com.mypersonalbudget.windows;


import javax.swing.JOptionPane;

public class BackUpData{
 
 
 public void restoreDB(String path){
 
    String executeCmd = "C:\\Program Files\\MySQL\\MySQL Server 5.6\\bin\\mysqldump -u root -ptomcat mybudgetdatabase -B mybudgetdatabase -r " + path;
 
    System.out.println(executeCmd);
 
    Process runtimeProcess;
 
    try
    {
       runtimeProcess = Runtime.getRuntime().exec(new String[] { "cmd.exe", "/c", executeCmd });
 
       int processComplete = runtimeProcess.waitFor();
 
       System.out.println(processComplete);
 
       if(processComplete == 0)
       {
          System.out.println("Backup Created Successfully !");
           JOptionPane.showMessageDialog(null,"Success");
       }
       else
       {
          JOptionPane.showMessageDialog(null,"Oops! Not Success");
          
       }
    }
    catch(Exception ex)
    {
       ex.printStackTrace();
    }
 
   }
 
 public static void main(String args[]){
     new BackUpData().restoreDB("C:\\BudgetFileBackupOn.sql");
 }
 
}