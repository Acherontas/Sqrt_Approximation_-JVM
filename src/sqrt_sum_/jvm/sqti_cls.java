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
public class sqti_cls {

        BigDecimal fractpart,intpart;
        BigDecimal epi_dio;
        BigDecimal dia_dio;
        BigDecimal section_temp;
        BigDecimal section_h;
        BigDecimal section_h_epi_dio;
        BigDecimal section_h_dia_dio;
        BigDecimal dia_dio_dio;
        BigDecimal dia_dio_four;
        BigDecimal afair;
        BigDecimal rsto[]=new BigDecimal[100];
	MathContext mc;
        int rt=0;

    after_the_dot aft=new after_the_dot();
    check_sqrti chsq=new check_sqrti();
    BigDec_get_intprt bgdf=new BigDec_get_intprt();

    BigDecimal get_appro_auto(){
	     return chsq.appro_auto;
    }

   int forward_show_lvec(int preci){
     for(int i=0;i<=chsq.lvec.size()-1;i++){
         System.out.println(chsq.lvec.get(i));
     }
	    return 0;
    }
  
   int forward_fnl_weirdo(int vl,int auto_v,int st_th){
	    chsq.show_fnl_weirdo(vl,auto_v,st_th);
	return 0;
    }

int sqti(BigDecimal mnm,
	int preci,
	int one,
        int two,
        int v_log,
        int cs,
        int st_th,
	BigDecimal[] cdis
	){

    System.out.println("-------------------------------------------------------------------------");
    rt=0;
    //rsto[rt]=(BigDecimal)mnm/(BigDecimal)one;
    mc=new MathContext(preci);
    rsto[rt]=mnm.divide(new BigDecimal(one),mc);
    //da try
    //intpart=(int)rsto[rt];
    //fractpart=rsto[rt]-intpart;
    intpart=bgdf.i_reci(rsto[rt],preci);
    fractpart=rsto[rt].subtract(intpart,mc);
    epi_dio=intpart.multiply(new BigDecimal(2),mc);
    dia_dio=intpart.divide(new BigDecimal(2),mc);
    section_temp=aft.gen_after_dot(rsto[rt]);
    //section_h=(BigDecimal)intpart/(BigDecimal)section_temp;
    if(section_temp.compareTo(new BigDecimal(0))==1){
			    section_h=intpart.divide(section_temp,mc);}
			    else{section_h=new BigDecimal(1);}
    if(v_log==1){
		 System.out.println("rsto[rt] "+ rsto[rt]);
                 System.out.println("section_temp "+section_temp);
                 System.out.println("section h " +section_h);
		 System.out.println("intpart " + intpart);
		 System.out.println("fractpart " + fractpart);
		}
    section_h_epi_dio=section_h.multiply(new BigDecimal(2),mc);
    //section_h_dia_dio=(BigDecimal)section_h/(BigDecimal)2;
    section_h_dia_dio=section_h.divide(new BigDecimal(2),mc);
    dia_dio_dio=dia_dio.divide(new BigDecimal(2),mc);
    dia_dio_four=dia_dio.divide(new BigDecimal(4),mc);
    if(v_log==1){
    System.out.println( mnm + "  / " +  one +  " ::== " +rsto[rt] );
                            System.out.println("             ----->  | *2 " + epi_dio );
                            System.out.println("             ----->  /2 " + dia_dio  );
                            System.out.println("                  --> " + dia_dio_dio  );
                            System.out.println("                  --> " + dia_dio_four  );
                            System.out.println("             ----->  section " +section_h  );
                            System.out.println("                  --> of section *2 " + section_h_epi_dio   );
                            System.out.println("                  --> of section /2 " +section_h_dia_dio  );
                            System.out.println(" " );
                            }
    chsq.check_sqrt(mnm,epi_dio,dia_dio,section_temp,section_h,section_h_epi_dio,section_h_dia_dio,dia_dio_dio,dia_dio_four,v_log,preci);
    rt+=1;
   if(v_log==1){ System.out.println("CDIS Start \n");}
    for(int i=1;i<=cs;i++){        
        //rsto[rt]=(BigDecimal)rsto[rt-1]/(BigDecimal)cdis[i];
	rsto[rt]=rsto[rt-1].divide(cdis[i],mc);
	System.out.println("@ sqrti_cls cdis i value " + cdis[i]);
        //da try
	//intpart=(int)rsto[rt];
	intpart=bgdf.i_reci(rsto[rt],preci);
	//fractpart=rsto[rt]-intpart;
        fractpart=rsto[rt].subtract(intpart,mc);
	epi_dio=intpart.multiply(new BigDecimal(2),mc);
        dia_dio=intpart.divide(new BigDecimal(2),mc);
        section_temp=aft.gen_after_dot(rsto[rt]);
        //section_h=(BigDecimal)intpart/(BigDecimal)section_temp;
        if(section_temp.compareTo(new BigDecimal(0))==1){
			    section_h=intpart.divide(section_temp,mc);}
			    else{section_h=new BigDecimal(1);}
	if(v_log==1){
		 System.out.println("rsto[rt] "+ rsto[rt]);
                 System.out.println("section_temp "+section_temp);
                 System.out.println("section h " +section_h);
		 System.out.println("intpart " + intpart);
		 System.out.println("fractpart " + fractpart);
		}
        section_h_epi_dio=section_h.multiply(new BigDecimal(2),mc);
        //section_h_dia_dio=(BigDecimal)section_h/(BigDecimal)2;
        section_h_dia_dio=section_h.divide(new BigDecimal(2),mc);
	dia_dio_dio=dia_dio.divide(new BigDecimal(2),mc);
        dia_dio_four=dia_dio.divide(new BigDecimal(4),mc);
        if(v_log==1){
        System.out.println(rsto[rt-1]+ "  / "+ cdis[i]  + " ::== " +rsto[rt]  );
                            System.out.println("             ----->  | *2 " + epi_dio  );
                            System.out.println("             ----->  /2 " + dia_dio  );
                            System.out.println("                  --> " + dia_dio_dio  );
                            System.out.println("                  --> " + dia_dio_four  );
                            System.out.println("             ----->  section " + section_h  );
                            System.out.println("                  --> of section *2 "  );
                            System.out.println("                  --> of section /2 " + section_h_dia_dio);
                            System.out.println(" " );}
        chsq.check_sqrt(mnm,epi_dio,dia_dio,section_temp,section_h,section_h_epi_dio,section_h_dia_dio,dia_dio_dio,dia_dio_four,v_log,preci);
        rt+=1;
        if(i>cs){break;}
    }
    if(v_log==1){System.out.println("CDIS End \n");}
    //rsto[rt]=(BigDecimal)mnm/(BigDecimal)two;
    rsto[rt]=mnm.divide(new BigDecimal(two),mc);
    //da try
    //intpart=(int)rsto[rt];
    intpart=bgdf.i_reci(rsto[rt],preci);
    fractpart=rsto[rt].subtract(intpart,mc);
    epi_dio=intpart.multiply(new BigDecimal(2),mc);
    dia_dio=intpart.divide(new BigDecimal(2),mc);
    section_temp=aft.gen_after_dot(rsto[rt]);
    //section_h=(BigDecimal)intpart/(BigDecimal)section_temp;
    if(section_temp.compareTo(new BigDecimal(0))==1){
			    section_h=intpart.divide(section_temp,mc);}
			    else{section_h=new BigDecimal(1);}
    if(v_log==1){
		 System.out.println("rsto[rt] "+ rsto[rt]);
                 System.out.println("section_temp "+section_temp);
                 System.out.println("section h " +section_h);
		 System.out.println("intpart " + intpart);
		 System.out.println("fractpart " + fractpart);
}
    section_h_epi_dio=section_h.multiply(new BigDecimal(2),mc);
    section_h_dia_dio=section_h.divide(new BigDecimal(2),mc);
    dia_dio_dio=dia_dio.divide(new BigDecimal(2),mc);
    dia_dio_four=dia_dio.divide(new BigDecimal(4),mc);
    if(v_log==1){
    System.out.println(mnm + " / " + two + " ::== " +rsto[rt]  );
                            System.out.println("             ----->  | *2 " + epi_dio  );
                            System.out.println("             ----->  /2 " + dia_dio );
                            System.out.println("                  --> " +dia_dio_dio  );
                            System.out.println("                  --> " +dia_dio_four  );
                            System.out.println("             ----->  section " +section_h  );
                            System.out.println("                  --> of section *2 " +section_h_epi_dio  );
                            System.out.println("                  --> of section /2 " +section_h_dia_dio  );
                            System.out.println(" " );
                            }
    chsq.check_sqrt(mnm,epi_dio,dia_dio,section_temp,section_h,section_h_epi_dio,section_h_dia_dio,dia_dio_dio,dia_dio_four,v_log,preci);
    rt+=1;
    //rsto[rt]=(BigDecimal)rsto[rt-1]/(BigDecimal)cdis[0];
    rsto[rt]=rsto[rt-1].divide(cdis[0],mc);
    //da try
    //intpart=(int)rsto[rt];
    intpart=bgdf.i_reci(rsto[rt],preci);
    fractpart=rsto[rt].subtract(intpart,mc);
    epi_dio=intpart.multiply(new BigDecimal(2),mc);
    dia_dio=intpart.divide(new BigDecimal(2),mc);
    section_temp=aft.gen_after_dot(rsto[rt]);
    //section_h=(BigDecimal)intpart/(BigDecimal)section_temp;
    if(section_temp.compareTo(new BigDecimal(0))==1){
			    section_h=intpart.divide(section_temp,mc);}
			    else{section_h=new BigDecimal(1);}
    if(v_log==1){
		 System.out.println("rsto[rt] "+ rsto[rt]);
                 System.out.println("section_temp ");
                 System.out.println("section h " +section_h);
		 System.out.println("intpart " + intpart);
		 System.out.println("fractpart " + fractpart);   
    }
    section_h_epi_dio=section_h.multiply(new BigDecimal(2),mc);
    section_h_dia_dio=section_h.divide(new BigDecimal(2),mc);
    dia_dio_dio=dia_dio.divide(new BigDecimal(2),mc);
    dia_dio_four=dia_dio.divide(new BigDecimal(4),mc);
    if(v_log==1){
    System.out.println( rsto[rt-1]  +" / "+  cdis[0] +" ::== " +rsto[rt] );
                            System.out.println("             ----->  | *2 " + epi_dio  );
                            System.out.println("             ----->  /2 " + dia_dio );
                            System.out.println("                  --> " +dia_dio_dio  );
                            System.out.println("                  --> " +dia_dio_four  );
                            System.out.println("             ----->  section " +section_h );
                            System.out.println("                  --> of section *2 " +section_h_epi_dio );
                            System.out.println("                  --> of section /2 " +section_h_dia_dio );
                            System.out.println(" ");
                            }
    chsq.check_sqrt(mnm,epi_dio,dia_dio,section_temp,section_h,section_h_epi_dio,section_h_dia_dio,dia_dio_dio,dia_dio_four,v_log,preci);
    //for(int i=0;i<=rt-1;i++){
    //  System.out.println(" " @i "+ i + " " +<<rsto[i] ;
    //}
    //System.out.println(" ;
    if(v_log==1){
    System.out.println("removals \n");
    System.out.println("reporing rt " + rt );}
     
    for(int i=0;i<=rt-1;i++){        
        if(rsto[i].compareTo(rsto[rt])==1){
                            //afair=rsto[i]-rsto[rt];
                            afair=rsto[i].subtract(rsto[rt],mc);
			    //da try
			    //intpart=(int)afair;
			    intpart=bgdf.i_reci(afair,preci);
			    fractpart=afair.subtract(intpart,mc);
                            epi_dio=intpart.multiply(new BigDecimal(2),mc);
                            dia_dio=intpart.divide(new BigDecimal(2),mc);
                            section_temp=aft.gen_after_dot(afair);
                            //section_h=(BigDecimal)intpart/(BigDecimal)section_temp;
                            if(section_temp.compareTo(new BigDecimal(0))==1){
			    section_h=intpart.divide(section_temp,mc);}
			    else{section_h=new BigDecimal(1);}
			    if(v_log==1){
					System.out.println("rsto[i] "+ rsto[i]);
					System.out.println("afair "+ afair);
                                        System.out.println("section_temp "+section_temp);
                                        System.out.println("section h " +section_h);
					System.out.println("intpart " + intpart);
					System.out.println("fractpart " + fractpart);   
}
                            section_h_epi_dio=section_h.multiply(new BigDecimal(2),mc);
                            section_h_dia_dio=section_h.divide(new BigDecimal(2),mc);
                            dia_dio_dio=dia_dio.divide(new BigDecimal(2),mc);
                            dia_dio_four=dia_dio.divide(new BigDecimal(4),mc);
                            if(v_log==1){
                            System.out.println( rsto[rt] +" ::== " +afair  );
                            System.out.println("             ----->  | *2 " + epi_dio  );
                            System.out.println("             ----->  /2 " + dia_dio );
                            System.out.println("                  --> " +dia_dio_dio );
                            System.out.println("                  --> " +dia_dio_four  );
                            System.out.println("             ----->  section " +section_h );
                            System.out.println("                  --> of section *2 " +section_h_epi_dio  );
                            System.out.println("                  --> of section /2 " +section_h_dia_dio );
                            System.out.println(" " );
                            }
       chsq.check_sqrt(mnm,epi_dio,dia_dio,section_temp,section_h,section_h_epi_dio,section_h_dia_dio,dia_dio_dio,dia_dio_four,v_log,preci);
        }
        if(rsto[i].compareTo(rsto[rt])==-1){
                            //afair=rsto[rt]-rsto[i];
                            afair=rsto[rt].subtract(rsto[i],mc);
			    //da try
			    //intpart=(int)afair;
			    intpart=bgdf.i_reci(afair,preci);
			    fractpart=afair.subtract(intpart,mc);
                            epi_dio=intpart.multiply(new BigDecimal(2),mc);
                            dia_dio=intpart.divide(new BigDecimal(2),mc);
                            section_temp=aft.gen_after_dot(afair);
                            //section_h=(BigDecimal)intpart/(BigDecimal)section_temp;
                            if(section_temp.compareTo(new BigDecimal(0))==1){
			    section_h=intpart.divide(section_temp,mc);}
			    else{section_h=new BigDecimal(1);}
			    if(v_log==1){
					System.out.println("rsto[i] "+ rsto[i]);
					System.out.println("afair "+ afair);
                                        System.out.println("section_temp "+section_temp);
                                        System.out.println("section h " +section_h );
					System.out.println("intpart " + intpart);
					System.out.println("fractpart " + fractpart);    
}
                            section_h_epi_dio=section_h.multiply(new BigDecimal(2),mc);
                            section_h_dia_dio=section_h.divide(new BigDecimal(2),mc);
                            dia_dio_dio=dia_dio.divide(new BigDecimal(2),mc);
                            dia_dio_four=dia_dio.divide(new BigDecimal(4),mc);
                            if(v_log==1){
                            System.out.println( rsto[rt] + " - " +  rsto[i] + "::== " +afair  );
                            System.out.println("             ----->  | *2 " + epi_dio  );
                            System.out.println("             ----->  /2 " + dia_dio );
                            System.out.println("                  --> " +dia_dio_dio  );
                            System.out.println("                  --> " +dia_dio_four  );
                            System.out.println("             ----->  section " + section_h );
                            System.out.println("                  --> of section *2 "  + section_h_epi_dio );
                            System.out.println("                  --> of section /2 " +section_h_dia_dio );
                            System.out.println(" " );
                            }
    chsq.check_sqrt(mnm,epi_dio,dia_dio,section_temp,section_h,section_h_epi_dio,section_h_dia_dio,dia_dio_dio,dia_dio_four,v_log,preci);
        }
    }
    if(v_log==1){System.out.println("ending sqti reporting the results \n");}
    chsq.show_xl(mnm,preci,v_log,st_th);
    chsq.show_xpl(mnm,preci,v_log,st_th);
    chsq.xl.clear();
    chsq.lx.clear();
    chsq.xpl.clear();
    System.out.println("-------------------------------------------------------------------------\n");
	    return 0;
 
}

}
