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
class check_sqrti {

        Vector<Double> xl=new Vector<>();
        Vector<Double> lx=new Vector<>();
        Vector<Double> xpl=new Vector<>();
        Vector<Integer> fnl_weirdo=new Vector<>();
        Vector<String> lvec=new Vector<>();
        String vecl;
        double fractpart;
        int intpart;
        double ckxlip;
        double ckep,ckdd,ckddd,ckddf;
        double cksh,ckshep,ckshdd;
        double appro_auto;
        double x_dv;
        double dif;


int show_fnl_weirdo(int v_log,int auto_v,int st_th){
   System.out.println("\n");
    if(v_log==1){System.out.println("the size of fnl_weirdo vector is " + fnl_weirdo.size() +" " + fnl_weirdo.capacity()+"\n");}
Collections.sort(fnl_weirdo);    
if(auto_v==1){appro_auto=fnl_weirdo.get(fnl_weirdo.size()-1);}
    for(int i=fnl_weirdo.size()-1;i>0;i--){
       
      System.out.println(  fnl_weirdo.get(i) ) ;
    }
   System.out.println("\n");
   return 0;
}


int show_xpl(double mynmb,int preci,int v_log,int st_th){
   int olp=0;
  if(v_log==1){
  System.out.println("the size of xpl vector is " +xpl.size()+" "+ xpl.capacity() +"\n");
  }
  Collections.sort(xpl);  
  double mlp;
  for(int i=0;i<=xpl.size()-1;i++){
     //System.out.println("xpl[i] <<" ";
      
     if(xpl.get(0)+xl.get(i)==mynmb){
                x_dv=lx.get(i)*lx.get(i);
                vecl=new String();
                if(v_log==1){System.out.println("  of " + lx.get(i) + " ^2 ::== " + x_dv + " as intpart " + xl.get(i) +"  diafora " + xpl.get(0) +" from " + mynmb+"\n");
                }
                //System.out.println(""da value " << std::setprecision(preci)<<lx[i] <<" ^2 " << xl[i] <<" diafora " << xpl[0] <<"\n";
                vecl+=" ";
                vecl+=Double.toString(lx.get(i));
                vecl+=" ^2 ::== ";
                vecl+=Double.toString(x_dv);
                vecl+=" as intpart ";
                vecl+=Double.toString(xl.get(i));
                vecl+=" diafora ";
                vecl+=Double.toString(xpl.get(0));
                vecl+=" from ";
                vecl+=Double.toString(mynmb);
                vecl+=" ";
                lvec.add(vecl);
                intpart=lx.get(i).intValue();
                fractpart=lx.get(i)-intpart;
                fnl_weirdo.add(intpart);
                }
     olp+=1;
  }
 System.out.println("\n");
 return 0;
}


int show_xl(double mynmb,int preci,int v_log,int st_th){
 if(v_log==1){
	System.out.println("reporting size of xl vector " + xl.size() +" " + xl.capacity() +"\n");}
  for(int it=0;it<=xl.size()-1;it++)
  {
     
    if(v_log==1){System.out.println("entering amfidromi loop of xl vector  with first \n") ;}
    dif=mynmb-xl.get(it);
    if(v_log==1){
            x_dv=lx.get(it)*lx.get(it);
            System.out.println("  of "+ lx.get(it) + " ^2 ::== " + x_dv + " as intpart "+ xl.get(it) + "  diafora " + dif + " from " + mynmb+"\n");
                }
    xpl.add(dif);
  }
return 0;
}


int check_sqrt(double mani,
                            double ep,
                            double dd,
                            double st,
                            double sh,
                            double shep,
                            double shdd,
                            double ddd,
                            double ddf,
                            int v_log,
                            int preci)
{

fractpart=0;intpart=0;ckxlip=0;

if(
Double.isInfinite(mani) ||
Double.isInfinite(ep) ||
Double.isInfinite(dd) ||
Double.isInfinite(st) ||
Double.isInfinite(sh) ||
Double.isInfinite(shep) ||
Double.isInfinite(shdd) || 
Double.isInfinite(ddd) || 
Double.isInfinite(ddf)
)
  {
                System.out.println("error continue with the rest \n");
  }

    if(!Double.isInfinite(ep)){
         intpart=(int)ep;fractpart=ep-intpart;
         ckxlip=intpart*intpart;
        if(ckxlip<=mani){xl.add(ckxlip);lx.add(ep);}
            if(ckxlip>mani){
                while(ckxlip>mani){
                // 
                ep=ep/10;               
		intpart=(int)ep;fractpart=ep-intpart;
                ckxlip=intpart*intpart;
                if(ckxlip<=mani){xl.add(ckxlip);lx.add(ep);break;}
            }
        }
        if(v_log==1){System.out.println("i insert "+ckxlip +" " +ep +"\n");}
    }
ckep=0;
    if(!Double.isInfinite(dd)){
	intpart=(int)dd;fractpart=dd-intpart;
        ckep=intpart*intpart;
            if(ckep<=mani){xl.add(ckep);lx.add(dd);}
            if(ckep>mani){
                while(ckep>mani){
                   //  
                    dd=dd/10;
		    intpart=(int)dd;fractpart=dd-intpart;
                    ckep=intpart*intpart;
                    if(ckep<=mani){xl.add(ckep);lx.add(dd);break;}
        }
    }
        if(v_log==1){System.out.println("i insert "+ckep +" " +dd +"\n");}
    }
ckdd=0;
    if(!Double.isInfinite(st)){
	intpart=(int)st;fractpart=st-intpart;
        ckdd=intpart*intpart;
            if(ckdd<=mani){xl.add(ckdd);lx.add(st);}
            if(ckdd>mani){
                while(ckdd>mani){
                   //  
                    st=st/10;
                    intpart=(int)st;fractpart=st-intpart;
                    ckdd=intpart*intpart;
                    if(ckdd<=mani){xl.add(ckdd);lx.add(st);break;}
                }
            }
        if(v_log==1){System.out.println("i insert "+ckdd +" " +st +"\n");}
    }
ckddd=0;
    if(!Double.isInfinite(sh)){
        intpart=(int)sh;fractpart=sh-intpart;
        ckddd=intpart*intpart;
            if(ckddd<=mani){xl.add(ckddd);lx.add(sh);}
            if(ckddd>mani){
                while(ckddd>mani){
                  //   
                    sh=sh/10;
                    intpart=(int)sh;fractpart=sh-intpart;
                    ckddd=intpart*intpart;
                    if(ckddd<=mani){xl.add(ckddd);lx.add(sh);break;}
                }
            }
        if(v_log==1){System.out.println("i insert "+ckddd +" " +sh +"\n");}
    }
ckddf=0;
    if(!Double.isInfinite(shep)){
            intpart=(int)shep;fractpart=shep-intpart;
            ckddf=intpart*intpart;
            if(ckddf<=mani){xl.add(ckddf);lx.add(shep);}
            if(ckddf>mani){
                while(ckddf>mani){
                    // 
                    shep=shep/10;
                    intpart=(int)shep;fractpart=shep-intpart;
                    ckddf=intpart*intpart;
                    if(ckddf<=mani){xl.add(ckddf);lx.add(shep);break;}
                }
            }
        if(v_log==1){System.out.println("i insert "+ckddf +" " +shep +"\n");}
    }
cksh=0;
    if(!Double.isInfinite(shdd)){
        intpart=(int)shdd;fractpart=shdd-intpart;
        cksh=intpart*intpart;
        if(cksh<=mani){xl.add(cksh);lx.add(shdd);}
        if(cksh>mani){
            while(cksh>mani){
                // 
                shdd=shdd/10;
                intpart=(int)shdd;fractpart=shdd-intpart;
                cksh=intpart*intpart;
                if(cksh<=mani){xl.add(cksh);lx.add(shdd);break;}
            }
        }
        if(v_log==1){System.out.println("i insert "+cksh +" " +shdd +"\n");}
    }
ckshep=0;
    if(!Double.isInfinite(ddd)){
        intpart=(int)ddd;fractpart=ddd-intpart;
        ckshep=intpart*intpart;
        if(ckshep<=mani){xl.add(ckshep);lx.add(ddd);}
        if(ckshep>mani){
            while(ckshep>mani){
               //  
                ddd=dd/10;
                intpart=(int)ddd;fractpart=ddd-intpart;
                ckshep=intpart*intpart;
                if(ckshep<=mani){xl.add(ckshep);lx.add(ddd);break;}
            }
        }
        if(v_log==1){System.out.println("i insert "+ckshep +" " +ddd +"\n");}
    }
ckshdd=0;
    if(!Double.isInfinite(ddf)){
        intpart=(int)ddf;fractpart=ddf-intpart;
        ckshdd=intpart*intpart;
        if(ckshdd<=mani){xl.add(ckshdd);lx.add(ddf);}
        if(ckshdd>mani){
        while(ckshdd>mani){
                // 
                ddf=ddf/10;
                intpart=(int)ddf;fractpart=ddf-intpart;
                ckshdd=intpart*intpart;
                if(ckshdd<=mani){xl.add(ckshdd);lx.add(ddf);break;}
            }
        }
        if(v_log==1){System.out.println("i insert "+ckshdd +" " + ddf + "\n");}
    }
    return 0;
}
    
}
