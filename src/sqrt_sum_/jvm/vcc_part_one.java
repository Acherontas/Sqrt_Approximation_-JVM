/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqrt_sum_.jvm;
import java.util.Vector;
import java.util.Collections;
import java.math.*;
import java.util.Scanner;
/**
 *
 * @author acherontas
 */
public class vcc_part_one {

	BigDecimal baqr;
        BigDecimal abqr;
        BigDecimal ab,ba;
        BigDecimal ldb;
        int by_one;
        BigDecimal adb;
        int ad,pd,lap;
        BigDecimal t_ten=new BigDecimal(10);
        BigDecimal t_rst;
        BigDecimal fractpart,intpart;
        BigDecimal frc,intprt;
        BigDecimal bee_tmpf;
        int xstp;
        int xli=0;
        BigDecimal rst_f;
        int mad,mpd,mlap;
        int lshow=0;int xbrk=0;int rts=0;
        Vector<BigDecimal> v_cc=new Vector<>();
        Vector<BigDecimal> for_the_bee=new Vector<>();
        BigDecimal xlk;
        BigDecimal afr;
        BigDecimal tmp_min;
        BigDecimal tmp_vl;
        BigDecimal tmp_xlk;
        int tmp_eq;
        BigDecimal pwrd;
        int ent=0;
        int psifia_for_auto=0;
	MathContext mcvcc;
    


eql_digits_cnt eqdgq=new eql_digits_cnt();
int show_vcc(BigDecimal entered,BigDecimal mynmb,int preci,int v_log,int st_th,int sxli){
  mcvcc=new MathContext(preci);
  if(v_log==1){System.out.println("entered show_vcc function @ vcc_part_one class \n");}
  eqdgq.fcnt(new BigDecimal(0),mynmb,preci,1,0);
  bee_tmpf=new BigDecimal(0);
  xli=0;
 System.out.println("----------------- v_cc vector reports -------- \n");
  xlk=new BigDecimal(0); afr=new BigDecimal(0); tmp_min=new BigDecimal(0); tmp_vl=new BigDecimal(0);
  tmp_xlk=new BigDecimal(0);tmp_eq=0; pwrd=new BigDecimal(0); ent=0;
  psifia_for_auto=0;
  Collections.sort(v_cc);
  System.out.println("u enter as approximation " + entered +" with main number to find the power " + mynmb +" with psifia " + eqdgq.mnarcnt );
  for_the_bee.add(entered);
  //xlk=entered*entered;
  xlk=entered.multiply(entered,mcvcc);
  System.out.println("as of the entered \n");
  if(mynmb.compareTo(xlk)==1) {afr=mynmb.subtract(xlk,mcvcc);}  //{afr=mynmb-xlk;}
  if(mynmb.compareTo(xlk)==-1){afr=xlk.subtract(mynmb,mcvcc);}//{afr=xlk-mynmb;}
  if(v_log==0){eqdgq.fcnt(new BigDecimal(0),xlk,preci,0,0);}
  if(v_log==1){eqdgq.fcnt(new BigDecimal(0),xlk,preci,0,1);}
  System.out.println(entered + " ^2 ::== " + xlk +" \n");
  System.out.println("              me idia psifia " + eqdgq.f_cnt + " ");
  System.out.println("              me diafora "+ afr );
  tmp_min=afr;
  tmp_vl=entered;
  tmp_eq=eqdgq.f_cnt;
  for(int ito=0;ito<=v_cc.size()-1;ito+=1)
  {     
     //xlk=v_cc.get(ito)*v_cc.get(ito);
     xlk=v_cc.get(ito).multiply(v_cc.get(ito));
     if(v_log==0){eqdgq.fcnt(new BigDecimal(0),xlk,preci,0,0);}
     if(v_log==1){eqdgq.fcnt(new BigDecimal(0),xlk,preci,0,1);}
     if(psifia_for_auto>0){
                            if ((eqdgq.f_cnt)>psifia_for_auto) {
                                 psifia_for_auto=eqdgq.f_cnt;
                                 pwrd=v_cc.get(ito);
                            }
                          }
     if(psifia_for_auto==0){
                                psifia_for_auto=eqdgq.f_cnt;
                                pwrd=v_cc.get(ito);
                           }
     if(mynmb.compareTo(xlk)==1){afr=mynmb.subtract(xlk,mcvcc);}//{afr=mynmb-xlk;}
     if(mynmb.compareTo(xlk)==-1){afr=xlk.subtract(mynmb,mcvcc);}//{afr=xlk-mynmb;}
     System.out.print(v_cc.get(ito)+" ^2 ::== " + xlk +" ");
     System.out.print("           me idia psifia " + eqdgq.f_cnt + " ");
     System.out.println("           me diafora "+ afr );
     if(afr.compareTo(tmp_min)==-1 || afr.compareTo(new BigDecimal(0))==0){
	tmp_min=afr;tmp_vl=v_cc.get(ito);tmp_xlk=xlk;tmp_eq=eqdgq.f_cnt;}
  }
  //xlk=tmp_vl*tmp_vl;
  //xlk=tmp_vl.multiply(tmp_vl,mcvcc);
  System.out.println("Will use value of " + tmp_vl);
  Scanner myObj = new Scanner(System.in);
  System.out.println("\n");
  System.out.println("\n");
  System.out.println("-------------------------Approximation Result Set-----------------------------------------------------\n");
  if(mynmb.compareTo(xlk)==1 || mynmb.compareTo(xlk)==0){
  System.out.println("\n");
  System.out.println("possible approximation < ::== " + tmp_vl + " ^2 " + xlk + " ");
  System.out.println("              me idia psifia " + tmp_eq + " ");
  System.out.println("              me diafora "+ tmp_min );
  for_the_bee.add(tmp_vl);
  System.out.println("\n");
  }
  if(xlk.compareTo(mynmb)==1 || xlk.compareTo(mynmb)==0){
  System.out.println("\n");
  System.out.println("possible approximation > ::== " + tmp_vl + " ^2 " + xlk + " ");
  System.out.println("              me idia psifia " + tmp_eq + " ");
  System.out.println("              me diafora "+ tmp_min );
  for_the_bee.add(tmp_vl);
  System.out.println("\n");
  }
  if(mynmb.compareTo(xlk)==-1 || mynmb.compareTo(xlk)==0){
  System.out.println("\n");
  System.out.println("possible approximation > ::== " + tmp_vl + " ^2 " + xlk);
  System.out.println("            me idia psifia " + tmp_eq + " ");
  System.out.println("            me diafora "+ tmp_min );
  for_the_bee.add(tmp_vl);
  System.out.println("\n");
  }
  //bee_tmpf=tmp_vl;
  xli=0;
  System.out.println("Enter 1 to continue ");
  int xlp=0;
  xlp=Integer.parseInt(myObj.nextLine());
  System.out.println("u enter " + xlp);
if(xlp==1){
  while(xlk.compareTo(mynmb)==-1 || xlk.compareTo(mynmb)==0){
     System.out.println("\n");     
     //tmp_vl=tmp_vl+1; 
    //xlk=tmp_vl*tmp_vl;
    tmp_vl=tmp_vl.add(new BigDecimal(1));
    xlk=tmp_vl.multiply(tmp_vl);
     if(v_log==0){eqdgq.fcnt(new BigDecimal(0),xlk,preci,0,0);}
     if(v_log==1){eqdgq.fcnt(new BigDecimal(0),xlk,preci,0,1);}
     if(mynmb.compareTo(xlk)==1){afr=mynmb.subtract(xlk,mcvcc);}//{afr=mynmb-xlk;}
     if(mynmb.compareTo(xlk)==-1){afr=xlk.subtract(mynmb,mcvcc);}//{afr=xlk-mynmb;}
     if(mynmb==xlk){afr=new BigDecimal(0);}
     System.out.println("possible approximation of addition ::== " + tmp_vl +" with ^2  " + xlk +" ");
     System.out.println("            me idia psifia " + eqdgq.f_cnt + " ");
     System.out.println("            me diafora " + afr );
     for_the_bee.add(tmp_vl);
     if(xlk.compareTo(mynmb)==1){ent+=1; bee_tmpf=tmp_vl;
        System.out.println("will pass value of "+ bee_tmpf ); break;}
     if(xlk==mynmb){ent+=1; bee_tmpf=tmp_vl;
        System.out.println("will pass value of "+ bee_tmpf ); break;}
     xli+=1;
     if(xli==sxli){break;}
  }
  xli=0;
  if(ent==0){
  System.out.println("----removing using main number " + mynmb );
  while(xlk.compareTo(mynmb)==1){
     System.out.println("\n");     
     //tmp_vl=tmp_vl-1;
     //xlk=tmp_vl*tmp_vl;
     tmp_vl=tmp_vl.add(new BigDecimal(1));
     xlk=tmp_vl.multiply(tmp_vl);
     if(v_log==0){eqdgq.fcnt(new BigDecimal(0),xlk,preci,0,0);}
     if(v_log==1){eqdgq.fcnt(new BigDecimal(0),xlk,preci,0,1);}
     if(xlk.compareTo(mynmb)==-1){afr=mynmb.subtract(xlk,mcvcc);}//{afr=mynmb-xlk;}
     if(xlk.compareTo(mynmb)==1){afr=xlk.subtract(mynmb,mcvcc);}//{afr=xlk-mynmb;}
     if(mynmb==xlk){afr=new BigDecimal(0);}
     if(Double.isInfinite(afr.doubleValue())){afr=new BigDecimal(0);}
     for_the_bee.add(tmp_vl);
     System.out.println("possible approximation of minus ::== " + tmp_vl +" with ^2  " + xlk +" ");
     System.out.println("            me idia psifia " + eqdgq.f_cnt + " ");
     System.out.println("            me diafora " + afr  );
     if(xlk.compareTo(mynmb)==-1 || xlk.compareTo(mynmb)==0){
        bee_tmpf=tmp_vl;
        System.out.println("will pass value of "+ bee_tmpf );
        break;
        }
        xli+=1;
        if(xli==sxli){break;}
  }
  }
}
  System.out.println("\n");

 return 0;
}


part_of ptr=new part_of();
part_of prt=new part_of();
BigDec_get_intprt bdit=new BigDec_get_intprt();
int fill_vcc(BigDecimal mynmb,BigDecimal lt_main,int preci,int v_log,int st_th,int ps_ask,int psif){
    mcvcc=new MathContext(preci);
    psif=1;
    if(v_log==1){System.out.println("entered fill_vcc function @ vcc_part_one class \n");}
    for(;;){
    abqr=new BigDecimal(0);
    baqr=new BigDecimal(0);
ab=new BigDecimal(0);
ba=new BigDecimal(0);
ldb=new BigDecimal(0);
by_one=0;
adb=new BigDecimal(0);
ad=0;
    pd=0;
lap=0;
t_ten=new BigDecimal(10);
t_rst=new BigDecimal(0);
rst_f=new BigDecimal(0);
frc=new BigDecimal(0);
intprt=new BigDecimal(0);
    xstp=0;mad=0;mpd=0;mlap=0;
    lshow=0;xbrk=0;rts=0;
         
        System.out.println("-------------------------------------------------------\n");
        System.out.println("times " + psif +" ");
	System.out.println("using the precision "+ mcvcc);
        prt.get_the_part(lt_main,psif-1,preci);
        abqr=BigDecimal.valueOf(prt.qrt);
        ptr.get_the_part(mynmb,psif-1,preci);
        baqr=BigDecimal.valueOf(ptr.qrt);
        System.out.println(ptr.rtv + " " + prt.rtv );
        System.out.println("main " + baqr + " second " + abqr );
        //ab=baqr*baqr;
        //ba=abqr*abqr;
	ab=baqr.multiply(baqr,mcvcc);
	ba=abqr.multiply(abqr,mcvcc);
        System.out.println("main " + ab + " second " + ba );
        //ldb=(BigDecimal)baqr/(BigDecimal)ba;
        ldb=baqr.divide(ba,mcvcc);
	if(v_log==1){System.out.println("times of " + ldb );}
        System.out.println("new times of " + ldb );
        //adb=lt_main*ldb;
        adb=lt_main.multiply(ldb,mcvcc);
	System.out.println("using " + lt_main + " * " + ldb );
        System.out.println(adb);
        ptr.get_the_part(adb,-1,preci);
        ad=ptr.all_length;
        pd=ptr.dot_pos;
        lap=(ad-1)-pd;
        System.out.println(" with length of " + (ad-1) +" and dot length "+ pd +" will move " + lap  );
        if(lap>10){System.out.println("lap for tens is more than ten will lower it \n");lap=10;}
        System.out.println("\n");
        rst_f=adb.multiply(adb);
        //intpart=(int)mynmb;
        //intpart=new BigDecimal(mynmb.intValue());
	intpart=bdit.i_reci(mynmb,preci);
	fractpart=mynmb.subtract(intpart,mcvcc);
        System.out.println(" trying to reach the main number " + mynmb +" ");
        ptr.get_the_part(intpart,-1,preci);
        mad=ptr.all_length; //main doesnt have a dot
        mpd=ptr.dot_pos;
        mlap=(ad-1)-pd;
        System.out.println(" main number intpart lenght " + mad + " \n"); // dot length " + mpd + " after dot " + mlap ;
        if(v_log==1){System.out.println(" fract " +fractpart + " int " + intpart);
        System.out.println("    ----------------. " + adb+" ^2 ::== " + rst_f );}
	//intprt=(int)rst_f;
	//intprt=new BigDecimal(rst_f.intValue(),mcvcc);
	intprt=bdit.i_reci(rst_f,preci);
	frc=rst_f.subtract(intprt);
        if(v_log==1){
		System.out.println(" temp fract "+  frc + " temp int " + intprt);}
        if(rst_f==mynmb)
        {
          System.out.println("power of 2 for "+ mynmb + " is " + rst_f );
          xstp=1;
        }
        if(intpart==intprt)
        {
          System.out.println("closest power of 2 for "+ mynmb + " is " + rst_f );
          xstp=2;
        }
        System.out.println("before loop xstp is " + xstp +"entering tens with lap of value " + lap );
        lshow=0;xbrk=0;rts=0;
        if(xstp==0){
            for(;;){ //int i=0;i<=lap;i++
                 
                lshow=0;
                t_rst=adb.multiply(t_ten,mcvcc);
                rst_f=t_rst.multiply(t_rst,mcvcc);
                if(v_log==1){System.out.println("using t_rst as "+t_rst );
                System.out.println("using for fract " + rst_f );}
		//intprt=(int)rst_f;
		//intprt=new BigDecimal(rst_f.intValue(),mcvcc);
		intprt=bdit.i_reci(rst_f,preci);
		frc=rst_f.subtract(intprt,mcvcc);
                if(rts!=3){
                    if(v_log==1){System.out.println("getting the part of " + rst_f +" :: ");}
                    ptr.get_the_part(intprt,-1,preci);
                    ad=ptr.all_length; //the lenght of intpart of current floatted possibly number
                    pd=ptr.dot_pos;
                    if(v_log==1){System.out.println("ad " + ad + " and mad " + mad );}
                    rts=ad-mad;
                }
                if(ad>mad){System.out.println("have to exit bigger lenght with ad "+ ad +" and mad "+ mad );xbrk=1;}
                if(ad==mad || ad-mad==1 ||  mad-ad==1 || mad==ad)
                //ad-mad==2 || ad-mad==3 || || mad-ad==2 || mad-ad==3
                {
                   System.out.println("i add a near value of ");
		   //intprt=(int)t_rst;
		   //intprt=new BigDecimal(t_rst.intValue(),mcvcc);
		   intprt=bdit.i_reci(t_rst,preci);
		   frc=t_rst.subtract(intprt,mcvcc);
                   v_cc.add(intprt);
                   System.out.println(intprt);
                   System.out.println("stopping with ad " + ad + " and mad of "+ mad );
                   lshow=0;
                   xbrk=1;
                }
                else{
                   lshow=1;
                }
                if(v_log==1 || v_log==2){
                System.out.println("    ----------------. " +t_rst+" ^2 ::== " + rst_f);
                }
                if(rst_f==mynmb)
                {
                    System.out.println("power of 2 for "+ mynmb + " is " + rst_f );
                    System.out.println("temp fract "+  frc + " temp int " + intprt);
                    xstp=1;
                }
                if(intpart==intprt)
                {
                    System.out.println("closest power of 2 for "+ mynmb + " is " + rst_f );
                    xstp=2;
                }
                //t_ten=t_ten*10;
                t_ten=t_ten.multiply(new BigDecimal(10),mcvcc);
		if(v_log==1){System.out.println("t_ten increased \n");}
                if(xstp!=0){
                            System.out.println("breaking with xstp of value " + xstp );
                            break;
                           }
                if(xbrk==1){
                            System.out.println("breaking with xbrk of value "+ xbrk );
                            break;
                            }
            }
        }
        System.out.println("\n");
        psif+=1;
        if(v_log==1){System.out.println("increasing the digits " + psif );}
         
        if(psif==ps_ask){break;}
        System.out.println("-------------------------------------------------------\n");
    }
   return 0;
}



}
