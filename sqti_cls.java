/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqrt_sum_.jvm;

/**
 *
 * @author acherontas
 */
public class sqti_cls {

        double fractpart,intpart;
        double epi_dio;
        double dia_dio;
        double section_temp;
        double section_h;
        double section_h_epi_dio;
        double section_h_dia_dio;
        double dia_dio_dio;
        double dia_dio_four;
        double afair;
        double rsto[]=new double[100];
        int rt=0;

    after_the_dot aft=new after_the_dot();
    check_sqrti chsq=new check_sqrti();

    double get_appro_auto(){
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

int sqti(double mnm,
	int preci,
	int one,int two,int v_log,int cs,int st_th,
	double[] cdis
	){

    System.out.println("-------------------------------------------------------------------------\n");
    rt=0;
    rsto[rt]=(double)mnm/(double)one;
    //da try
    intpart=(int)rsto[rt];
    fractpart=rsto[rt]-intpart;
    epi_dio=intpart*2;
    dia_dio=intpart/2;
    section_temp=aft.gen_after_dot(rsto[rt]);
    section_h=(double)intpart/(double)section_temp;
    if(v_log==1){
                 System.out.println("section_temp "+section_temp+"\n");
                 System.out.println("section h " +section_h+"\n");}
    section_h_epi_dio=section_h*2;
    section_h_dia_dio=(double)section_h/(double)2;
    dia_dio_dio=(double)dia_dio/2;
    dia_dio_four=(double)dia_dio/4;
    if(v_log==1){
    System.out.println(" mnm  /  one  ::== " +rsto[rt] + "\n");
                            System.out.println("             ----->  | *2 " + epi_dio+ "\n");
                            System.out.println("             ----->  /2 " + dia_dio + "\n");
                            System.out.println("                  --> " + dia_dio_dio + "\n");
                            System.out.println("                  --> " + dia_dio_four + "\n");
                            System.out.println("             ----->  section " +section_h + "\n");
                            System.out.println("                  --> of section *2 " + section_h_epi_dio  + "\n");
                            System.out.println("                  --> of section /2 " +section_h_dia_dio + "\n");
                            System.out.println("\n");
                            }
    chsq.check_sqrt(mnm,epi_dio,dia_dio,section_temp,section_h,section_h_epi_dio,section_h_dia_dio,dia_dio_dio,dia_dio_four,v_log,preci);
    rt+=1;
   if(v_log==1){ System.out.println("CDIS Start \n");}
    for(int i=1;i<=cs;i++){        
        rsto[rt]=(double)rsto[rt-1]/(double)cdis[i];
        //da try
	intpart=(int)rsto[rt];
	fractpart=rsto[rt]-intpart;
        epi_dio=intpart*2;
        dia_dio=intpart/2;
        section_temp=aft.gen_after_dot(rsto[rt]);
        section_h=(double)intpart/(double)section_temp;
        if(v_log==1){
                 System.out.println("section_temp "+section_temp+"\n");
                 System.out.println("section h " +section_h+"\n");}
        section_h_epi_dio=section_h*2;
        section_h_dia_dio=(double)section_h/(double)2;
        dia_dio_dio=(double)dia_dio/2;
        dia_dio_four=(double)dia_dio/4;
        if(v_log==1){
        System.out.println(" rsto[rt-1]  /  cdis[i]  ::== " +rsto[rt] + "\n");
                            System.out.println("             ----->  | *2 " + epi_dio + "\n");
                            System.out.println("             ----->  /2 " + dia_dio + "\n");
                            System.out.println("                  --> " + dia_dio_dio + "\n");
                            System.out.println("                  --> " + dia_dio_four + "\n");
                            System.out.println("             ----->  section " + section_h + "\n");
                            System.out.println("                  --> of section *2 " + "\n");
                            System.out.println("                  --> of section /2 " + section_h_dia_dio  + "\n");
                            System.out.println("\n");}
        chsq.check_sqrt(mnm,epi_dio,dia_dio,section_temp,section_h,section_h_epi_dio,section_h_dia_dio,dia_dio_dio,dia_dio_four,v_log,preci);
        rt+=1;
        if(i>cs){break;}
    }
    if(v_log==1){System.out.println("CDIS End \n");}
    rsto[rt]=(double)mnm/(double)two;
    //da try
    intpart=(int)rsto[rt];
    fractpart=rsto[rt]-intpart;
    epi_dio=intpart*2;
    dia_dio=intpart/2;
    section_temp=aft.gen_after_dot(rsto[rt]);
    section_h=(double)intpart/(double)section_temp;
    if(v_log==1){
                 System.out.println("section_temp "+section_temp+"\n");
                 System.out.println("section h " +section_h+"\n");}
    section_h_epi_dio=section_h*2;
    section_h_dia_dio=(double)section_h/(double)2;
    dia_dio_dio=(double)dia_dio/2;
    dia_dio_four=(double)dia_dio/4;
    if(v_log==1){
    System.out.println("mnm +  / " + two + " ::== " +rsto[rt] + "\n");
                            System.out.println("             ----->  | *2 " + epi_dio + "\n");
                            System.out.println("             ----->  /2 " + dia_dio +"\n");
                            System.out.println("                  --> " +dia_dio_dio + "\n");
                            System.out.println("                  --> " +dia_dio_four + "\n");
                            System.out.println("             ----->  section " +section_h + "\n");
                            System.out.println("                  --> of section *2 " +section_h_epi_dio + "\n");
                            System.out.println("                  --> of section /2 " +section_h_dia_dio + "\n");
                            System.out.println("\n");
                            }
    chsq.check_sqrt(mnm,epi_dio,dia_dio,section_temp,section_h,section_h_epi_dio,section_h_dia_dio,dia_dio_dio,dia_dio_four,v_log,preci);
    rt+=1;
    rsto[rt]=(double)rsto[rt-1]/(double)cdis[0];
    //da try
    intpart=(int)rsto[rt];
    fractpart=rsto[rt]-intpart;
    epi_dio=intpart*2;
    dia_dio=intpart/2;
    section_temp=aft.gen_after_dot(rsto[rt]);
    section_h=(double)intpart/(double)section_temp;
    if(v_log==1){
                 System.out.println("section_temp "+"\n");
                 System.out.println("section h " +section_h+"\n");}
    section_h_epi_dio=section_h*2;
    section_h_dia_dio=(double)section_h/(double)2;
    dia_dio_dio=(double)dia_dio/2;
    dia_dio_four=(double)dia_dio/4;
    if(v_log==1){
    System.out.println(" rsto[rt-1]  /  cdis[0]  ::== " +rsto[rt] +"\n");
                            System.out.println("             ----->  | *2 " + epi_dio + "\n");
                            System.out.println("             ----->  /2 " + dia_dio +"\n");
                            System.out.println("                  --> " +dia_dio_dio + "\n");
                            System.out.println("                  --> " +dia_dio_four + "\n");
                            System.out.println("             ----->  section " +section_h +"\n");
                            System.out.println("                  --> of section *2 " +section_h_epi_dio +"\n");
                            System.out.println("                  --> of section /2 " +section_h_dia_dio +"\n");
                            System.out.println("\n");
                            }
    chsq.check_sqrt(mnm,epi_dio,dia_dio,section_temp,section_h,section_h_epi_dio,section_h_dia_dio,dia_dio_dio,dia_dio_four,v_log,preci);
    //for(int i=0;i<=rt-1;i++){
    //  System.out.println(" " @i "+ i + " " +<<rsto[i] +"\n";
    //}
    //System.out.println(""\n";
    if(v_log==1){
    System.out.println("removals \n");
    System.out.println("reporing rt " + rt +"\n");}
     
    for(int i=0;i<=rt-1;i++){        
        if(rsto[i]>rsto[rt]){
                            afair=rsto[i]-rsto[rt];
                            //da try
			    intpart=(int)afair;
			    fractpart=afair-intpart;
                            epi_dio=intpart*2;
                            dia_dio=intpart/2;
                            section_temp=aft.gen_after_dot(afair);
                            section_h=(double)intpart/(double)section_temp;
                            if(v_log==1){
                                        System.out.println("section_temp "+section_temp+"\n");
                                        System.out.println("section h " +section_h+"\n");}
                            section_h_epi_dio=section_h*2;
                            section_h_dia_dio=(double)section_h/(double)2;
                            dia_dio_dio=(double)dia_dio/2;
                            dia_dio_four=(double)dia_dio/4;
                            if(v_log==1){
                            System.out.println(" - rsto[rt]  ::== " +afair + "\n");
                            System.out.println("             ----->  | *2 " + epi_dio + "\n");
                            System.out.println("             ----->  /2 " + dia_dio +"\n");
                            System.out.println("                  --> " +dia_dio_dio +"\n");
                            System.out.println("                  --> " +dia_dio_four + "\n");
                            System.out.println("             ----->  section " +section_h +"\n");
                            System.out.println("                  --> of section *2 " +section_h_epi_dio + "\n");
                            System.out.println("                  --> of section /2 " +section_h_dia_dio +"\n");
                            System.out.println("\n");
                            }
       chsq.check_sqrt(mnm,epi_dio,dia_dio,section_temp,section_h,section_h_epi_dio,section_h_dia_dio,dia_dio_dio,dia_dio_four,v_log,preci);
        }
        if(rsto[i]<rsto[rt]){
                            afair=rsto[rt]-rsto[i];
                            //da try
                            
			    intpart=(int)afair;
			    fractpart=afair-intpart;
                            epi_dio=intpart*2;
                            dia_dio=intpart/2;
                            section_temp=aft.gen_after_dot(afair);
                            section_h=(double)intpart/(double)section_temp;
                            if(v_log==1){
                                        System.out.println("section_temp "+section_temp+"\n");
                                        System.out.println("section h " +section_h +"\n");}
                            section_h_epi_dio=section_h*2;
                            section_h_dia_dio=(double)section_h/(double)2;
                            dia_dio_dio=(double)dia_dio/2;
                            dia_dio_four=(double)dia_dio/4;
                            if(v_log==1){
                            System.out.println(" rsto[rt]  -   rsto[i] + ::== " +afair + "\n");
                            System.out.println("             ----->  | *2 " + epi_dio + "\n");
                            System.out.println("             ----->  /2 " + dia_dio +"\n");
                            System.out.println("                  --> " +dia_dio_dio + "\n");
                            System.out.println("                  --> " +dia_dio_four + "\n");
                            System.out.println("             ----->  section " + section_h +"\n");
                            System.out.println("                  --> of section *2 "  + section_h_epi_dio +"\n");
                            System.out.println("                  --> of section /2 " +section_h_dia_dio +"\n");
                            System.out.println("\n");
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
