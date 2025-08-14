/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqrt_sum_.jvm;
import java.util.Vector;
import java.util.Collections;
import java.math.*;
/**
 *
 * @author acherontas
 */
class check_sqrti {

        Vector<BigDecimal> xl=new Vector<>();
        Vector<BigDecimal> lx=new Vector<>();
        Vector<BigDecimal> xpl=new Vector<>();
        Vector<BigDecimal> fnl_weirdo=new Vector<>();
        Vector<String> lvec=new Vector<>();
        String vecl;
        BigDecimal fractpart;
        BigDecimal intpart;
        BigDecimal ckxlip;
        BigDecimal ckep,ckdd,ckddd,ckddf;
        BigDecimal cksh,ckshep,ckshdd;
        BigDecimal appro_auto;
        BigDecimal x_dv;
        BigDecimal dif;
	BigDecimal axpl;
	MathContext mck;


int show_fnl_weirdo(int v_log,int auto_v,int st_th){
   System.out.println(" ");
    if(v_log==1){System.out.println("the size of fnl_weirdo vector is " + fnl_weirdo.size() +" " + fnl_weirdo.capacity());}
Collections.sort(fnl_weirdo);    
if(auto_v==1){appro_auto=fnl_weirdo.get(fnl_weirdo.size()-1);}
    for(int i=fnl_weirdo.size()-1;i>0;i--){      
      System.out.print(  fnl_weirdo.get(i).abs() + " "  ) ;
    }
   System.out.println(" ");
   return 0;
}

BigDec_get_intprt bdip=new BigDec_get_intprt();
int show_xpl(BigDecimal mynmb,int preci,int v_log,int st_th){
   int olp=0;
  if(v_log==1){
  System.out.println("the size of xpl vector is " +xpl.size()+" "+ xpl.capacity() );
  }
  Collections.sort(xpl);  
  BigDecimal mlp;
axpl=new BigDecimal(0);
  for(int i=0;i<=xpl.size()-1;i++){
     //System.out.println("xpl[i] <<" ";
      axpl=new BigDecimal(0);
      axpl=xpl.get(0).add(xl.get(i));
     if(axpl.compareTo(mynmb)==0){
                //x_dv=lx.get(i)*lx.get(i);
                x_dv=lx.get(i).multiply(lx.get(i));
		vecl=new String();
                if(v_log==1){System.out.println("  of " + lx.get(i) + " ^2 ::== " + x_dv + " as intpart " + xl.get(i) +"  diafora " + xpl.get(0) +" from " + mynmb);
                }
                //System.out.println(""da value " << std::setprecision(preci)<<lx[i] <<" ^2 " << xl[i] <<" diafora " << xpl[0] << ;
		
                vecl+=" ";
                //vecl+=BigDecimal.toString(lx.get(i));
		vecl+=lx.get(i).toString();
                vecl+=" ^2 ::== ";
                //vecl+=BigDecimal.toString(x_dv);
		vecl+=x_dv.toString();
                vecl+=" as intpart ";
                //vecl+=BigDecimal.toString(xl.get(i));
		vecl+=xl.get(i).toString();
                vecl+=" diafora ";
                //vecl+=BigDecimal.toString(xpl.get(0));
		vecl+=xpl.get(0).toString();
                vecl+=" from ";
                //vecl+=BigDecimal.toString(mynmb);
		vecl+=mynmb.toString();
                vecl+=" ";
                lvec.add(vecl);
               // intpart=new BigDecimal(lx.get(i).intValue());
                intpart=bdip.i_reci(lx.get(i),preci);
		fractpart=lx.get(i).subtract(intpart);
                fnl_weirdo.add(intpart);
                }
     olp+=1;
  }
 System.out.println( );
 return 0;
}


int show_xl(BigDecimal mynmb,int preci,int v_log,int st_th){
 if(v_log==1){
	System.out.println("reporting size of xl vector " + xl.size() +" " + xl.capacity() );}
  for(int it=0;it<=xl.size()-1;it++)
  {
     
    if(v_log==1){System.out.println("entering amfidromi loop of xl vector  with first ") ;}
    //dif=mynmb-xl.get(it);
    dif=mynmb.subtract(xl.get(it));
    if(v_log==1){
            //x_dv=lx.get(it)*lx.get(it);
	    x_dv=lx.get(it).multiply(lx.get(it));
            System.out.println("  of "+ lx.get(it) + " ^2 ::== " + x_dv + " as intpart "+ xl.get(it) + "  diafora " + dif + " from " + mynmb);
                }
    xpl.add(dif);
  }
return 0;
}


int check_sqrt(BigDecimal mani,
                            BigDecimal ep,
                            BigDecimal dd,
                            BigDecimal st,
                            BigDecimal sh,
                            BigDecimal shep,
                            BigDecimal shdd,
                            BigDecimal ddd,
                            BigDecimal ddf,
                            int v_log,
                            int preci)
{

fractpart=new BigDecimal(0);
intpart=new BigDecimal(0);
ckxlip=new BigDecimal(0);
//System.out.println("entering check sqrt with mani " + mani);
if(
Double.isInfinite(mani.doubleValue()) ||
Double.isInfinite(ep.doubleValue()) ||
Double.isInfinite(dd.doubleValue()) ||
Double.isInfinite(st.doubleValue()) ||
Double.isInfinite(sh.doubleValue()) ||
Double.isInfinite(shep.doubleValue()) ||
Double.isInfinite(shdd.doubleValue()) ||
Double.isInfinite(ddd.doubleValue()) ||
Double.isInfinite(ddf.doubleValue()))
  {
                System.out.println("error continue with the rest \n");
  }
if(v_log==1){
System.out.println("------------entering with ");
System.out.println("mani " + mani);
System.out.println("ep " + ep);
System.out.println("dd " + dd);
System.out.println("st " + st);
System.out.println("sh " + sh);
System.out.println("shep " + shep);
System.out.println("shdd " + shdd);
System.out.println("ddd " + ddd);
System.out.println("ddf " + ddf);
System.out.println("--------------------------");
}
mck=new MathContext(preci);
    if(!Double.isInfinite(ep.doubleValue())){
         //intpart=(int)ep;fractpart=ep-intpart;
         //ckxlip=intpart*intpart;
	 //intpart=new BigDecimal(ep.intValue(),mck);
	 intpart=bdip.i_reci(ep,preci);
	 fractpart=ep.subtract(intpart,mck);
	 ckxlip=intpart.multiply(intpart,mck);
	if(v_log==1){
        System.out.println("For " + ep);
        System.out.println("ckxlip " + intpart + " " + fractpart + " " + ckxlip);}
        if(ckxlip.compareTo(mani)==-1 || ckxlip.compareTo(mani)==0){xl.add(ckxlip);lx.add(ep);}
            if(ckxlip.compareTo(mani)==1){
                while(ckxlip.compareTo(mani)==1){             
		ep=ep.divide(new BigDecimal(10),mck);
		if(v_log==1){System.out.println("current value " + ep);}
		//intpart=new BigDecimal(ep.intValue(),mck);
		intpart=bdip.i_reci(ep,preci);
		fractpart=ep.subtract(intpart,mck);
		ckxlip=intpart.multiply(intpart,mck);
                if(ckxlip.compareTo(mani)==-1 || ckxlip.compareTo(mani)==0){xl.add(ckxlip);lx.add(ep);break;}
            }
        }
        if(v_log==1){System.out.println("i insert "+ckxlip +" " +ep );}
    }
ckep=new BigDecimal(0);
    if(!Double.isInfinite(dd.doubleValue())){
	//intpart=(int)dd;fractpart=dd-intpart;
        //ckep=intpart*intpart;
	//intpart=new BigDecimal(dd.intValue(),mck);
	intpart=bdip.i_reci(dd,preci);
	fractpart=dd.subtract(intpart,mck);
	ckep=intpart.multiply(intpart,mck);	
	if(v_log==1){
	System.out.println("For " + dd);
	System.out.println("ckep" + intpart + " " + fractpart + " " + ckep);}
            if(ckep.compareTo(mani)==-1 || ckep.compareTo(mani)==0){xl.add(ckep);lx.add(dd);}
            if(ckep.compareTo(mani)==1){
                while(ckep.compareTo(mani)==1){
                   //  
                    //dd=dd/10;
		    dd=dd.divide(new BigDecimal(10),mck);
		    if(v_log==1){System.out.println("current value " + dd);}
		    //intpart=new BigDecimal(dd.intValue(),mck);
		    intpart=bdip.i_reci(dd,preci);
		    fractpart=dd.subtract(intpart,mck);
		    ckep=intpart.multiply(intpart,mck);
                    if(ckep.compareTo(mani)==-1 || ckep.compareTo(mani)==0){xl.add(ckep);lx.add(dd);break;}
        }
    }
        if(v_log==1){System.out.println("i insert "+ckep +" " +dd  );}
    }
ckdd=new BigDecimal(0);
    if(!Double.isInfinite(st.doubleValue())){
	//intpart=(int)st;fractpart=st-intpart;
        //ckdd=intpart*intpart;
	//intpart=new BigDecimal(st.intValue(),mck); 
	intpart=bdip.i_reci(st,preci);
	fractpart=st.subtract(intpart,mck);
	ckdd=intpart.multiply(intpart,mck);
	if(v_log==1){
	System.out.println("For " + st);
	System.out.println("ckdd" + intpart + " " + fractpart + " " + ckdd);}
            if(ckdd.compareTo(mani)==-1 || ckdd.compareTo(mani)==0){xl.add(ckdd);lx.add(st);}
            if(ckdd.compareTo(mani)==1){
                while(ckdd.compareTo(mani)==1){
                   //  
                    //st=st/10;
                    st=st.divide(new BigDecimal(10),mck);
		    if(v_log==1){System.out.println("current value " + st);}
		    //intpart=new BigDecimal(st.intValue(),mck); 
		    intpart=bdip.i_reci(st,preci);
		    fractpart=st.subtract(intpart,mck);
		    ckdd=intpart.multiply(intpart,mck);
                    if(ckdd.compareTo(mani)==-1 || ckdd.compareTo(mani)==0){xl.add(ckdd);lx.add(st);break;}
                }
            }
        if(v_log==1){System.out.println("i insert "+ckdd +" " +st  );}
    }
ckddd=new BigDecimal(0);
    if(!Double.isInfinite(sh.doubleValue())){
        //intpart=(int)sh;fractpart=sh-intpart;
        //ckddd=intpart*intpart;
	//intpart=new BigDecimal(sh.intValue(),mck); 
	intpart=bdip.i_reci(sh,preci);
	fractpart=sh.subtract(intpart,mck);
	ckddd=intpart.multiply(intpart,mck);
	if(v_log==1){
	System.out.println("For " + sh);
	System.out.println("ckddd" + intpart + " " + fractpart + " " + ckddd);}
            if(ckddd.compareTo(mani)==-1 || ckddd.compareTo(mani)==0){xl.add(ckddd);lx.add(sh);}
            if(ckddd.compareTo(mani)==1){
                while(ckddd.compareTo(mani)==1){
                  //   
                    //sh=sh/10;
                    sh=sh.divide(new BigDecimal(10),mck);
		    if(v_log==1){System.out.println("current value " + sh);}
		    //intpart=new BigDecimal(sh.intValue(),mck);
		    intpart=bdip.i_reci(sh,preci);
		    fractpart=sh.subtract(intpart,mck);
		    ckddd=intpart.multiply(intpart,mck);
                    if(ckddd.compareTo(mani)==-1 || ckddd.compareTo(mani)==0){xl.add(ckddd);lx.add(sh);break;}
                }
            }
        if(v_log==1){System.out.println("i insert "+ckddd +" " +sh  );}
    }
ckddf=new BigDecimal(0);
    if(!Double.isInfinite(shep.doubleValue())){
            //intpart=(int)shep;fractpart=shep-intpart;
            //ckddf=intpart*intpart;
	    //intpart=new BigDecimal(shep.intValue(),mck); 
	    intpart=bdip.i_reci(shep,preci);
	    fractpart=shep.subtract(intpart,mck);
	    ckddf=intpart.multiply(intpart,mck);
	    if(v_log==1){
	    System.out.println("For " + shep);
	    System.out.println("ckddf" + intpart + " " + fractpart + " " + ckddf);}
            if(ckddf.compareTo(mani)==-1 || ckddf.compareTo(mani)==0){xl.add(ckddf);lx.add(shep);}
            if(ckddf.compareTo(mani)==1){
                while(ckddf.compareTo(mani)==1){
                    // 
                    //shep=shep/10;
                    shep=shep.divide(new BigDecimal(10),mck);
		    if(v_log==1){System.out.println("current value " + shep);}
		    //intpart=new BigDecimal(shep.intValue(),mck);
		    intpart=bdip.i_reci(shep,preci);
		    fractpart=shep.subtract(intpart,mck);
		    ckddf=intpart.multiply(intpart,mck);
                    if(ckddf.compareTo(mani)==-1 || ckddf.compareTo(mani)==0){xl.add(ckddf);lx.add(shep);break;}
                }
            }
        if(v_log==1){System.out.println("i insert "+ckddf +" " +shep  );}
    }
cksh=new BigDecimal(0);
    if(!Double.isInfinite(shdd.doubleValue())){
        //intpart=(int)shdd;fractpart=shdd-intpart;
        //cksh=intpart*intpart;
        //intpart=new BigDecimal(shdd.intValue(),mck);
	intpart=bdip.i_reci(shdd,preci);
	fractpart=shdd.subtract(intpart,mck);
	cksh=intpart.multiply(intpart,mck);
	if(v_log==1){
	System.out.println("For " + shdd);
	System.out.println("cksh" + intpart + " " + fractpart + " " + cksh);}
	if(cksh.compareTo(mani)==-1 || cksh.compareTo(mani)==0){xl.add(cksh);lx.add(shdd);}
        if(cksh.compareTo(mani)==1){
            while(cksh.compareTo(mani)==1){
                // 
                //shdd=shdd/10;
                shdd=shdd.divide(new BigDecimal(10),mck);
		if(v_log==1){System.out.println("current value " + shdd);}
		//intpart=new BigDecimal(shdd.intValue(),mck); 
		intpart=bdip.i_reci(shdd,preci);
		fractpart=shdd.subtract(intpart,mck);
		cksh=intpart.multiply(intpart,mck);
                if(cksh.compareTo(mani)==-1 || cksh.compareTo(mani)==0){xl.add(cksh);lx.add(shdd);break;}
            }
        }
        if(v_log==1){System.out.println("i insert "+cksh +" " +shdd  );}
    }
ckshep=new BigDecimal(0);
    if(!Double.isInfinite(ddd.doubleValue())){
        //intpart=(int)ddd;fractpart=ddd-intpart;
        //ckshep=intpart*intpart;
        //intpart=new BigDecimal(ddd.intValue(),mck); 
	intpart=bdip.i_reci(ddd,preci);
	fractpart=ddd.subtract(intpart,mck);
	ckshep=intpart.multiply(intpart);
	if(v_log==1){
	System.out.println("For " + ddd);
	System.out.println("ckshep" + intpart + " " + fractpart + " " + ckshep);}
	if(ckshep.compareTo(mani)==-1 || ckshep.compareTo(mani)==0){xl.add(ckshep);lx.add(ddd);}
        if(ckshep.compareTo(mani)==1){
            while(ckshep.compareTo(mani)==1){
               //  
                //ddd=ddd/10;
		ddd=ddd.divide(new BigDecimal(10),mck);
		if(v_log==1){System.out.println("current value " + ddd);}
                //intpart=new BigDecimal(ddd.intValue(),mck); 
		intpart=bdip.i_reci(ddd,preci);
		fractpart=ddd.subtract(intpart,mck);
		ckshep=intpart.multiply(intpart,mck);
                if(ckshep.compareTo(mani)==-1 || ckshep.compareTo(mani)==0){xl.add(ckshep);lx.add(ddd);break;}
            }
        }
        if(v_log==1){System.out.println("i insert "+ckshep +" " +ddd  );}
    }
ckshdd=new BigDecimal(0);
    if(!Double.isInfinite(ddf.doubleValue())){
        //intpart=(int)ddf;fractpart=ddf-intpart;
        //ckshdd=intpart*intpart;
        //intpart=new BigDecimal(ddf.intValue(),mck); 
	intpart=bdip.i_reci(ddf,preci);
	fractpart=ddf.subtract(intpart,mck);
	ckshdd=intpart.multiply(intpart);
	if(v_log==1){
	System.out.println("For " + ddf);
	System.out.println("ckshdd" + intpart + " " + fractpart + " " + ckshdd);}
	if(ckshdd.compareTo(mani)==-1 || ckshdd.compareTo(mani)==0){xl.add(ckshdd);lx.add(ddf);}
        if(ckshdd.compareTo(mani)==1){
        while(ckshdd.compareTo(mani)==1){
                // 
                //ddf=ddf/10;
                ddf=ddf.divide(new BigDecimal(10),mck);
		if(v_log==1){System.out.println("current value " + ddf);}
		//intpart=new BigDecimal(ddf.intValue(),mck); 
		intpart=bdip.i_reci(ddf,preci);
		fractpart=ddf.subtract(intpart,mck);
		ckshdd=intpart.multiply(intpart,mck);
                if(ckshdd.compareTo(mani)==-1 || ckshdd.compareTo(mani)==0){xl.add(ckshdd);lx.add(ddf);break;}
            }
        }
        if(v_log==1){System.out.println("i insert "+ckshdd +" " + ddf   );}
    }
    return 0;
}
    
}
