/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import javax.swing.JOptionPane;
import java.io.File;
/**
 *
 * @author Supresh
 */
public class OpenPdf {
    public static void openById(String id){
        try{
            if((new File("C:\\Users\\Supresh\\Desktop\\mysql-connector-j-8.0.33"+id+".pdf")).exists()){
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler C:\\Users\\Supresh\\Desktop\\mysql-connector-j-8.0.33"+id+".pdf");
            }
            else
                JOptionPane.showConfirmDialog(null, "File is Not Exists");
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
