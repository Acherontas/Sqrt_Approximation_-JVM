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
class part_of {
    

	BigDecimal rtv;
        String rvt;
        double qrt;
        int all_length;
        int dot_pos;
        String sk;
        char ck;
        int lk=0;
        int all_pos=0;
        int tmp_till=0;
        int pd=0;
	MathContext pmc;

   int get_the_part( BigDecimal nbm,int till,int prc){
     pmc=new MathContext(prc);
     sk=new String();
     rvt=new String();
     rtv=new BigDecimal(0);
     qrt=0;
     all_length=0;
     dot_pos=0; 
     //sk+=Double.toString(nbm);
     sk+=nbm.toString();
     lk=0;
     all_pos=0;
     tmp_till=0;
     tmp_till=till;
     pd=0;
     if(till==-1){tmp_till=sk.length()-1;}
     //cout<<"using " << sk << " with " << tmp_till <<"\n";
     for(int i=0;i<=tmp_till;i++){
          ck=sk.charAt(i);
          if(ck!='.'){
                        lk=Character.getNumericValue(ck);
                        rvt+=Integer.toString(lk);
                     }
          if(till!=-1){
                        if(ck=='.'){break;}
                      }
          if(till==-1){
                        if(ck=='.'){pd=all_pos;}
                      }
        all_pos+=1;
     }
     //rtv=Double.parseDouble(rvt);
     rtv=new BigDecimal(rvt,pmc);
     //qrt=Math.sqrt(rtv);
     
     qrt=Math.sqrt(rtv.doubleValue());
     all_length=all_pos;
     dot_pos=pd;
     return 0;
}

}
