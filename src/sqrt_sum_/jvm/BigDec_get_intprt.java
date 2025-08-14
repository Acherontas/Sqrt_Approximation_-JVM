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
public class BigDec_get_intprt {
	
	BigDecimal i_rec;
	BigDecimal i_ret_int;
	BigDecimal i_ret_dec;
	String srec;
	Character ck;
	Integer lk;
	Integer prc;
	Integer pos_before=0;
	Integer pos_after=0;
	MathContext mc;
	String brec;
	String afrec;
	Integer bi=0;
	Integer afi=0;

BigDecimal i_reci(BigDecimal mynmb,int preci){
	    //System.out.println("entering i_reci with " + mynmb);
	    mc=new MathContext(preci);
	    i_rec=new BigDecimal(0,mc);
	    i_ret_int=new BigDecimal(0,mc);
	    i_ret_dec=new BigDecimal(0,mc);
	    srec=new String();
	    brec=new String();
	    afrec=new String();
	    lk=0;
	    prc=0;
	    srec+=mynmb.toString();
	    pos_before=0;
	    pos_after=0;
	    bi=0;
	    afi=0;
	    for(int i=0;i<=srec.length()-1;i++){		
		ck=srec.charAt(i);
		if(ck=='.'){pos_after=1;}
		if(ck!='.' && pos_after==0){
		    brec+=ck; bi+=1;
	 	}
		if(pos_after==1){
		    afrec+=ck; afi+=1;
		}
	    }
	    //i_ret_int=new BigDecimal(brec,mc);
	    //i_ret_dec=new BigDecimal(afrec,mc);
	    if(bi>0){i_ret_int=new BigDecimal(brec,mc);}
	    if(bi==0){i_ret_int=new BigDecimal(0,mc);}
	    if(afi>0){i_ret_dec=new BigDecimal(afrec,mc);}
	    if(afi==0){i_ret_dec=new BigDecimal(0,mc);}
	    //System.out.println("leaving BigDec_get_intprt " + i_ret_int + " " + i_ret_dec);
	    return i_ret_int;
}

}
