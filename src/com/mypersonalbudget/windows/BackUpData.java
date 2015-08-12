package com.mypersonalbudget.windows;


import java.io.File;
import javax.swing.JOptionPane;

public class BackUpData{
 
 
 public static void Backupdbtosql() {
    try {

               /*NOTE: Creating Database Constraints*/
        String dbName = "mybudgetdatabase";
        String dbUser = "root";
        String dbPass = "tomcat";

        /*NOTE: Creating Path Constraints for folder saving*/
        /*NOTE: Here the backup folder is created for saving inside it*/
        String folderPath = "D:\\MyBudget\\";

        /*NOTE: Creating Folder if it does not exist*/
        File f1 = new File(folderPath);
        f1.mkdir();

        /*NOTE: Creating Path Constraints for backup saving*/
        /*NOTE: Here the backup is saved in a folder called backup with the name backup.sql*/
         String savePath =  "D:\\MyBudget\\backup.sql\"";

        /*NOTE: Used to create a cmd command*/
        String executeCmd = "C://Program Files//MySQL/MySQL Server 5.6//bin//mysqldump -u" + dbUser + " -p" + dbPass + " --database " + dbName + " -r " + savePath;

        /*NOTE: Executing the command here*/
        Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);
        int processComplete = runtimeProcess.waitFor();

        /*NOTE: processComplete=0 if correctly executed, will contain other values if not*/
        if (processComplete == 0) {
            JOptionPane.showMessageDialog(null,"BackUp Complete.");
        } else {
            JOptionPane.showMessageDialog(null,"Oops! BackUp Not Complete.");
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error at Backuprestore" + ex.getMessage());
    }
}
 
 
}