/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqrt_sum_.jvm;
import java.math.*;
/**
 *
 * @author acherontas
 */
class get_the_sum {

	int gt_leng=0;
        String jk;
        char mk;
        int lk=0;
        BigDecimal smbi=new BigDecimal(0);
        int lgt=0;
        String ltg;
	MathContext mgs;

BigDecimal get_da_number( BigDecimal nmbi,int st,int prc){
     //jk+=to_string(nmbi);
     //cout<<"using " << jk << " with " << nmbi <<"\n";
     mgs=new MathContext(prc);
     jk=new String();
     jk+=nmbi.toString();
     //cout<<"using get da number of " << jk <<"\n";
     System.out.println("@function get_da_number @ get_the_sum main is " + nmbi);
     lk=0;
     smbi=new BigDecimal(0);
     lgt=0;
     ltg=new String();
     for(int i=0;i<=jk.length()-1;i++){
        mk=jk.charAt(i);
        if(st==2){
                 lgt+=1;
        }
        if(mk=='.'){
        //cout<<"exiting with " << smbi <<"\n";
            //if(st==2){
                         gt_leng=lgt;//-1
                //     }
          break;
        }
        if(st==1){
                    lk=Character.getNumericValue(mk) ;
                    //smbi+=lk;
		    smbi=smbi.add(new BigDecimal(lk),mgs);
                 }
        gt_leng=lgt;//-1
     }
    System.out.println("Getting cdi of " + smbi);
    return smbi;
}








    
}
