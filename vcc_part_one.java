/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqrt_sum_.jvm;
import java.util.Vector;
import java.util.Collections;
/**
 *
 * @author acherontas
 */
public class vcc_part_one {

	double baqr;
        double abqr;
        double ab,ba;
        double ldb;
        int by_one;
        double adb;
        int ad,pd,lap;
        double t_ten=10;
        double t_rst;
        double fractpart,intpart;
        double frc,intprt;
        double bee_tmpf;
        int xstp;
        int xli=0;
        double rst_f;
        int mad,mpd,mlap;
        int lshow=0;int xbrk=0;int rts=0;
        Vector<Double> v_cc=new Vector<>();
        Vector<Double> for_the_bee=new Vector<>();
        double xlk;
        double afr;
        double tmp_min;
        double tmp_vl;
        double tmp_xlk;
        int tmp_eq;
        double pwrd;
        int ent=0;
        int psifia_for_auto=0;
    


eql_digits_cnt eqdgq=new eql_digits_cnt();
int show_vcc(double entered,double mynmb,int preci,int v_log,int st_th,int sxli){
  if(v_log==1){System.out.println("entered show_vcc function @ vcc_part_one class \n");}
  eqdgq.fcnt(0,mynmb,preci,1,0);
  bee_tmpf=0;
  xli=0;
 System.out.println("----------------- v_cc vector reports -------- \n");
  xlk=0; afr=0; tmp_min=0; tmp_vl=0;
  tmp_xlk=0;tmp_eq=0; pwrd=0; ent=0;
  psifia_for_auto=0;
  Collections.sort(v_cc);
  System.out.println("u enter as approximation " + entered +" with main number to find the power " + mynmb +" with psifia " + eqdgq.mnarcnt +"\n");
  for_the_bee.add(entered);
  xlk=entered*entered;
  System.out.println("as of the entered \n");
  if(mynmb>xlk){afr=mynmb-xlk;}
  if(mynmb<xlk){afr=xlk-mynmb;}
  if(v_log==0){eqdgq.fcnt(0,xlk,preci,0,0);}
  if(v_log==1){eqdgq.fcnt(0,xlk,preci,0,1);}
  System.out.println(entered + " ^2 ::== " + xlk +" \n");
  System.out.println("              me idia psifia " + eqdgq.f_cnt + " ");
  System.out.println("              me diafora "+ afr +"\n");
  tmp_min=afr;
  tmp_vl=entered;
  tmp_eq=eqdgq.f_cnt;
  for(int ito=0;ito<=v_cc.size()-1;ito+=1)
  {     
     xlk=v_cc.get(ito)*v_cc.get(ito);
     if(v_log==0){eqdgq.fcnt(0,xlk,preci,0,0);}
     if(v_log==1){eqdgq.fcnt(0,xlk,preci,0,1);}
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
     if(mynmb>xlk){afr=mynmb-xlk;}
     if(mynmb<xlk){afr=xlk-mynmb;}
     System.out.println(v_cc.get(ito)+" ^2 ::== " + xlk +" ");
     System.out.println("           me idia psifia " + eqdgq.f_cnt + " ");
     System.out.println("           me diafora "+ afr +"\n");
     if(afr<tmp_min && afr>=0){
	tmp_min=afr;tmp_vl=v_cc.get(ito);tmp_xlk=xlk;tmp_eq=eqdgq.f_cnt;}
  }
  xlk=tmp_vl*tmp_vl;
  System.out.println("\n");
  System.out.println("\n");
  System.out.println("-------------------------Approximation Result Set-----------------------------------------------------\n");
  if(mynmb<=xlk){
  System.out.println("\n");
  System.out.println("possible approximation < ::== " + tmp_vl + " ^2 " + xlk + " ");
  System.out.println("              me idia psifia " + tmp_eq + " ");
  System.out.println("              me diafora "+ tmp_min +"\n");
  for_the_bee.add(tmp_vl);
  System.out.println("\n");
  }
  if(xlk>=mynmb){
  System.out.println("\n");
  System.out.println("possible approximation > ::== " + tmp_vl + " ^2 " + xlk + " ");
  System.out.println("              me idia psifia " + tmp_eq + " ");
  System.out.println("              me diafora "+ tmp_min +"\n");
  for_the_bee.add(tmp_vl);
  System.out.println("\n");
  }
  if(mynmb>=xlk){
  System.out.println("\n");
  System.out.println("possible approximation > ::== " + tmp_vl + " ^2 " + xlk);
  System.out.println("            me idia psifia " + tmp_eq + " ");
  System.out.println("            me diafora "+ tmp_min +"\n");
  for_the_bee.add(tmp_vl);
  System.out.println("\n");
  }
  //bee_tmpf=tmp_vl;
  xli=0;
  while(xlk<=mynmb){
     System.out.println("\n");     
     tmp_vl=tmp_vl+1;
     xlk=tmp_vl*tmp_vl;
     if(v_log==0){eqdgq.fcnt(0,xlk,preci,0,0);}
     if(v_log==1){eqdgq.fcnt(0,xlk,preci,0,1);}
     if(mynmb>xlk){afr=mynmb-xlk;}
     if(mynmb<xlk){afr=xlk-mynmb;}
     if(mynmb==xlk){afr=0;}
     System.out.println("possible approximation of addition ::== " + tmp_vl +" with ^2  " + xlk +" ");
     System.out.println("            me idia psifia " + eqdgq.f_cnt + " ");
     System.out.println("            me diafora " + afr +"\n");
     for_the_bee.add(tmp_vl);
     if(xlk>mynmb){ent+=1; bee_tmpf=tmp_vl;
        System.out.println("will pass value of "+ bee_tmpf +"\n"); break;}
     if(xlk==mynmb){ent+=1; bee_tmpf=tmp_vl;
        System.out.println("will pass value of "+ bee_tmpf +"\n"); break;}
     xli+=1;
     if(xli==sxli){break;}
  }
  xli=0;
  if(ent==0){
  System.out.println("----removing using main number " + mynmb +"\n");
  while(xlk>mynmb){
     System.out.println("\n");     
     tmp_vl=tmp_vl-1;
     xlk=tmp_vl*tmp_vl;
     if(v_log==0){eqdgq.fcnt(0,xlk,preci,0,0);}
     if(v_log==1){eqdgq.fcnt(0,xlk,preci,0,1);}
     if(xlk<mynmb){afr=mynmb-xlk;}
     if(xlk>mynmb){afr=xlk-mynmb;}
     if(mynmb==xlk){afr=0;}
     if(Double.isInfinite(afr)){afr=0;}
     for_the_bee.add(tmp_vl);
     System.out.println("possible approximation of minus ::== " + tmp_vl +" with ^2  " + xlk +" ");
     System.out.println("            me idia psifia " + eqdgq.f_cnt + " ");
     System.out.println("            me diafora " + afr +"\n" );
     if(xlk<=mynmb){
        bee_tmpf=tmp_vl;
        System.out.println("will pass value of "+ bee_tmpf +"\n");
        break;
        }
        xli+=1;
        if(xli==sxli){break;}
  }
  }
  System.out.println("\n");

 return 0;
}


part_of ptr=new part_of();
part_of prt=new part_of();
int fill_vcc(double mynmb,double lt_main,int preci,int v_log,int st_th,int ps_ask,int psif){
    psif=1;
    if(v_log==1){System.out.println("entered fill_vcc function @ vcc_part_one class \n");}
    for(;;){
    abqr=0;baqr=0;ab=0;ba=0;ldb=0;by_one=0;adb=0;ad=0;
    pd=0;lap=0;t_ten=10;t_rst=0;rst_f=0;frc=0;intprt=0;
    xstp=0;mad=0;mpd=0;mlap=0;
    lshow=0;xbrk=0;rts=0;
         
        System.out.println("-------------------------------------------------------\n");
        System.out.println("times " + psif +" ");
        prt.get_the_part(lt_main,psif-1,preci);
        abqr=prt.qrt;
        ptr.get_the_part(mynmb,psif-1,preci);
        baqr=ptr.qrt;
        System.out.println(ptr.rtv + " " + prt.rtv +"\n");
        System.out.println("main " + baqr + " second " + abqr +"\n");
        ab=baqr*baqr;
        ba=abqr*abqr;
        System.out.println("main " + ab + " second " + ba +"\n");
        ldb=(double)baqr/(double)ba;
        if(v_log==1){System.out.println("times of " + ldb +"\n");}
        System.out.println("new times of " + ldb +"\n");
        adb=lt_main*ldb;
        System.out.println("using " + lt_main + " * " + ldb +"\n");
        System.out.println(adb);
        ptr.get_the_part(adb,-1,preci);
        ad=ptr.all_length;
        pd=ptr.dot_pos;
        lap=(ad-1)-pd;
        System.out.println(" with length of " + (ad-1) +" and dot length "+ pd +" will move " + lap +"\n" );
        if(lap>10){System.out.println("lap for tens is more than ten will lower it \n");lap=10;}
        System.out.println("\n");
        rst_f=adb*adb;
        intpart=(int)mynmb;
        fractpart=mynmb-intpart;
        System.out.println(" trying to reach the main number " + mynmb +" ");
        ptr.get_the_part(intpart,-1,preci);
        mad=ptr.all_length; //main doesnt have a dot
        mpd=ptr.dot_pos;
        mlap=(ad-1)-pd;
        System.out.println(" main number intpart lenght " + mad + " \n"); // dot length " + mpd + " after dot " + mlap +"\n";
        if(v_log==1){System.out.println(" fract " +fractpart + " int " + intpart+"\n");
        System.out.println("    ----------------. " + adb+" ^2 ::== " + rst_f +"\n");}
	intprt=(int)rst_f;
	frc=rst_f-intprt;
        if(v_log==1){
		System.out.println(" temp fract "+  frc + " temp int " + intprt+"\n");}
        if(rst_f==mynmb)
        {
          System.out.println("power of 2 for "+ mynmb + " is " + rst_f +"\n");
          xstp=1;
        }
        if(intpart==intprt)
        {
          System.out.println("closest power of 2 for "+ mynmb + " is " + rst_f +"\n");
          xstp=2;
        }
        System.out.println("before loop xstp is " + xstp +"entering tens with lap of value " + lap +"\n");
        lshow=0;xbrk=0;rts=0;
        if(xstp==0){
            for(;;){ //int i=0;i<=lap;i++
                 
                lshow=0;
                t_rst=adb*t_ten;
                rst_f=t_rst*t_rst;
                if(v_log==1){System.out.println("using t_rst as "+t_rst +"\n");
                System.out.println("using for fract " + rst_f +"\n");}
		intprt=(int)rst_f;
		frc=rst_f-intprt;
                if(rts!=3){
                    if(v_log==1){System.out.println("getting the part of " + rst_f +" :: ");}
                    ptr.get_the_part(intprt,-1,preci);
                    ad=ptr.all_length; //the lenght of intpart of current floatted possibly number
                    pd=ptr.dot_pos;
                    if(v_log==1){System.out.println("ad " + ad + " and mad " + mad +"\n");}
                    rts=ad-mad;
                }
                if(ad>mad){System.out.println("have to exit bigger lenght with ad "+ ad +" and mad "+ mad +"\n");xbrk=1;}
                if(ad==mad || ad-mad==1 ||  mad-ad==1 || mad==ad)
                //ad-mad==2 || ad-mad==3 || || mad-ad==2 || mad-ad==3
                {
                   System.out.println("i add a near value of ");
		   intprt=(int)t_rst;
		   frc=t_rst-intprt;
                   v_cc.add(intprt);
                   System.out.println(intprt +"\n");
                   System.out.println("stopping with ad " + ad + " and mad of "+ mad +"\n");
                   lshow=0;
                   xbrk=1;
                }
                else{
                   lshow=1;
                }
                if(v_log==1 || v_log==2){
                System.out.println("    ----------------. " + +t_rst+" ^2 ::== " + rst_f+"\n");
                }
                if(rst_f==mynmb)
                {
                    System.out.println("power of 2 for "+ mynmb + " is " + rst_f +"\n");
                    System.out.println("temp fract "+ + frc + " temp int " + intprt+"\n");
                    xstp=1;
                }
                if(intpart==intprt)
                {
                    System.out.println("closest power of 2 for "+ mynmb + " is " + rst_f +"\n");
                    xstp=2;
                }
                t_ten=t_ten*10;
                if(v_log==1){System.out.println("t_ten increased \n");}
                if(xstp!=0){
                            System.out.println("breaking with xstp of value " + xstp +"\n");
                            break;
                           }
                if(xbrk==1){
                            System.out.println("breaking with xbrk of value "+ xbrk +"\n");
                            break;
                            }
            }
        }
        System.out.println("\n");
        psif+=1;
        if(v_log==1){System.out.println("increasing the digits " + psif +"\n");}
         
        if(psif==ps_ask){break;}
        System.out.println("-------------------------------------------------------\n");
    }
   return 0;
}



}
