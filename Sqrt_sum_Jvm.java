/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sqrt_sum_.jvm;
import sqrt_sum_.jvm.*;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author acherontas
 */
public class Sqrt_sum_Jvm {

   

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
	eql_digits_cnt eqdg=new eql_digits_cnt();
	double mynmb;
	double sqrti;
	double cdis[]=new double[1000];
	int cs=0;
	int preci;
	double bee_tmpf;
	int st_th;
	int v_log=-1;
	int auto_v=0;
	int bee_x_stp=0;
        int v_bee_log=-1;
	int sxli=0;

    System.out.println("voyeristic behaviours and others have fun \n");
    System.out.println("ur number ,ur precision , ur sleep time , ur log ,ur automation 0 no 1 auto , ur bee auto 0 for no log 1 for log \n");
    System.out.println("the approximation while loops times to run if -1 infinite loop will occur until other equations gets equal \n");
    mynmb=Double.parseDouble(args[0]);
    preci=Integer.parseInt(args[1]);
    st_th=Integer.parseInt(args[2]);
    v_log=Integer.parseInt(args[3]);
    auto_v=Integer.parseInt(args[4]);
    v_bee_log=Integer.parseInt(args[5]);
    sxli=Integer.parseInt(args[6]);
   //mynmb=2785;preci=15;st_th=0;v_log=0;auto_v=0;v_bee_log=0;sxli=-1;
    System.out.println("with main number without precision " + " " + mynmb  );
    System.out.println("with main number "+ " " + mynmb  );
    if(v_log==0){eqdg.fcnt(0,mynmb,preci,1,0);}
    if(v_log==1){eqdg.fcnt(0,mynmb,preci,1,1);}
    System.out.println(eqdg.mnarcnt );
    System.out.println(" @ CDIS : with main number "+   " " + mynmb ) ;
    get_the_sum gti=new get_the_sum();
    cdis[cs]=gti.get_da_number(mynmb,1,preci);
    System.out.println("Main cdi " + cdis[cs] ) ;
    if(cdis[cs]>9){
       while(cdis[cs]>9){
            cs+=1;
            cdis[cs]=gti.get_da_number(cdis[cs-1],1,preci);
            System.out.println("Secondary cdi " + cdis[cs] ) ;
            if(cdis[cs]<=9){
                System.out.println("Exiting Secondary cdi " + cdis[cs] ) ;
                break;
            }
       }
    }
    sqrti=Math.sqrt(mynmb);
    sqti_cls sqcls=new sqti_cls();
    System.out.println("with sqrt of math " + + sqrti ) ;
 
    System.out.println("9 25 |34 16| " +  sqrti +"  and main " + mynmb ) ;
    sqcls.sqti(mynmb,preci,34,16,v_log,cs,st_th,cdis);
      
   
    System.out.println("9 |25| 34 |16| "  + sqrti +"  and main " + mynmb );
    sqcls.sqti(mynmb,preci,25,16,v_log,cs,st_th,cdis);
      
    System.out.println("9 26 |35 17| " +  sqrti +"  and main " +  mynmb ) ;
    sqcls.sqti(mynmb,preci,35,17,v_log,cs,st_th,cdis);
      
    System.out.println("9 |26| 35 |17| " +  sqrti +"  and main " +  mynmb ) ;
    sqcls.sqti(mynmb,preci,26,17,v_log,cs,st_th,cdis);
      
    System.out.println("10 25 |35 15| " +  sqrti +"  and main " +  mynmb ) ;
    sqcls.sqti(mynmb,preci,35,15,v_log,cs,st_th,cdis);
      
    System.out.println("10 |25| 35 |15| " +  sqrti +"  and main " +  mynmb ) ;
    sqcls.sqti(mynmb,preci,25,15,v_log,cs,st_th,cdis);
    System.out.println("10 26 |36 16| " +  sqrti +"  and main " +  mynmb ) ;
    sqcls.sqti(mynmb,preci,36,16,v_log,cs,st_th,cdis);
      
    System.out.println("10 |26| 36 |16| " +  sqrti +"  and main " +  mynmb );
    sqcls.sqti(mynmb,preci,26,16,v_log,cs,st_th,cdis);
       
    if(v_log==1){
         sqcls.forward_show_lvec(preci);
    }
    
    System.out.println("---------order of near approximation numbers--------");
    System.out.println("|----------bigger value is the nearest-------------|");
    sqcls.forward_fnl_weirdo(v_log,auto_v,st_th);
    System.out.println("----------------------------------------------------");
    double lt_main=0;
    double lt;
    if(auto_v==1){
                  lt_main=sqcls.get_appro_auto();
                  System.out.println("auto value is "+lt_main ) ;
                    
                 }
    if(auto_v==0){
                  System.out.println("enter a number from above");
		  Scanner myObj = new Scanner(System.in);
                  lt_main=Double.parseDouble(myObj.nextLine());
                  }
    System.out.println("lenght of " + + lt_main ) ;
    lt=gti.get_da_number(lt_main,2,preci);
    int k=gti.gt_leng;
    System.out.println(" + " + k ) ;
    lt=gti.get_da_number(mynmb,2,preci);
    int l=gti.gt_leng;
    System.out.println("lenght of " +  + mynmb +  " is " +   + l ) ;
    int psif=1;
    int ps_ask=0;
    if(auto_v==0){
                  System.out.println("default 4 loops enter 4 or more [4 is 3] ");
                  System.out.println("suggested value : " + (k+1)  );
		  Scanner myObj = new Scanner(System.in);
                  ps_ask=Integer.parseInt(myObj.nextLine());
                 }
    if(auto_v==1){
                  ps_ask=k+1;
                  System.out.println("moving with ps_ask " + ps_ask ) ;
                    
                 }
    System.out.println("creating  vcc_part_one instance .... ");
    vcc_part_one vcpo=new vcc_part_one();
    vcpo.fill_vcc(mynmb,lt_main,preci,v_log,st_th,ps_ask,psif);
    System.out.println("Approximated with value : "+ lt_main ) ;
    vcpo.show_vcc(lt_main,mynmb,preci,v_log,st_th,sxli);
    bee_cls bee = new bee_cls();
    System.out.println("------------------------Bee-----------------------------");
    for(;;){
          
        if(auto_v==0){
            System.out.println("enter one of the approximated number from above ");
	    Scanner myObj = new Scanner(System.in);
            bee_tmpf=Integer.parseInt(myObj.nextLine());
            System.out.println("enter log level 0 or 1");
	    Scanner myObjx = new Scanner(System.in);
            v_bee_log=Integer.parseInt(myObjx.nextLine());
            System.out.println("entering with "  +bee_tmpf +" and log of bee " + v_bee_log );
            bee.bee_man(mynmb,bee_tmpf,preci,v_bee_log);
            bee.bee_show(preci);
            System.out.println("enter 1 to exit ");
	    Scanner myObjy = new Scanner(System.in);
            bee_x_stp=Integer.parseInt(myObjy.nextLine());
        }
        if(auto_v==1){
            bee_x_stp=1;
           for(int it=0;it<=vcpo.for_the_bee.size();it++){
                  
                System.out.println("-------------------Calculation Bee--------------------------------");
                bee.bee_man(mynmb,vcpo.for_the_bee.get(it),preci,v_bee_log);
                if(bee_x_stp!=1){System.out.println("-------------------------------------------------");
                //if(bee->rtr==1){break;}
           }
           System.out.println("------------All Results From Bee----------- ");
           System.out.println("Higher number @ first columns nearest u are ");
           bee.bee_show(preci);
           //bee.~bee_cls();
        }
        if(bee_x_stp==1){break;}
        if(bee_x_stp!=1){
           System.out.println("-------------------------------------------------");
        }
    }
    double flt;
    flt=Math.sqrt(mynmb);
    System.out.println("with main number " +   " " + mynmb ) ;
    System.out.println("with the internal math.h sqrt function " +   " " + flt );
    
    }
	
    
}
}
