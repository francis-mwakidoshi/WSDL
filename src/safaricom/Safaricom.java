/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safaricom;

import com.safaricom.psd.ws.TestWS;
import com.safaricom.psd.ws.TestWS_Service;
import com.safaricom.psd.ws.TransactionResult;

/**
 *
 * @author Sly
 */
public class Safaricom {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        Safaricom.getKey();
        Safaricom.register();
      
    }
    
     public static void getKey(){
         
        String name = "red";
        
        TestWS_Service Key = new TestWS_Service();
        TestWS TWS = Key.getTestWSPort();
        TransactionResult TR = TWS.getKey(name);
        System.out.println(TR.getResponseCode());
        System.out.println(TR.getResponseDesc());
        System.out.println(TR.getHiddenKey());
        
        
    }
     
     public static void register() {
			TestWS_Service Create = new TestWS_Service();
			 TestWS TW = Create.getTestWSPort();
			 TransactionResult tr=TW.register("Francis", "29130423", "0708009360","v729aqqc");
			 System.out.println(tr.getResponseCode());
			  System.out.println(tr.getResponseDesc());
		}
    
}
