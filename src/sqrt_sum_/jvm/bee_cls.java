/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqrt_sum_.jvm;
import java.util.Vector;
import java.math.*;

/**
 *
 * @author acherontas
 */
class bee_cls {

	int lxpre=-1;int f_dit=0;int xp=-1;int lk;
        int myfunc=-1,xpp=1,stop=-1,status=-1,lx=1,tmp_lk=-1,tms=0,go_down=0;
        int insr=0;int st=0;int fbd=0;
        BigDecimal first,second,rst;
        BigDecimal fr_f,fr_s,fr_rs;
        BigDecimal int_f,int_s,int_rsl;
        BigDecimal get_dfr;
        BigDecimal newd,new_int_t=new BigDecimal(-1),nr_lw;
        BigDecimal da_rst,da_sq_rst,fr_da,int_da;
        BigDecimal recheck_them;
        BigDecimal frck;
        BigDecimal intck;
        BigDecimal ddddr;
        char mk;
        Vector<String> all_s=new Vector<>();
        String sal;
        BigDecimal drf;
        Vector<Integer> da_psifia=new Vector<>();
        int rtr=0;
	MathContext mcb;


int bee_show(int lxpre){
 System.out.println("--------------------------------------");
 System.out.println("Psifia,Power,Result of Power,Diafora from Main,Diairesi from Main");
 for(int ip=0;ip<=all_s.size()-1;ip++){
    System.out.println(all_s.get(ip)   );
 }
 System.out.println("--------------------------------------");
    all_s.clear();
    rtr=0;
    drf=new BigDecimal(0);
 return 0;
}

   

BigDec_get_intprt bgp=new BigDec_get_intprt();
int bee_man( BigDecimal fr, BigDecimal sc,int rts,int logl){
    mcb=new MathContext(rts);
    rtr=0;
    lxpre=-1; 
    first=new BigDecimal(0);
    second=new BigDecimal(0);
    rst=new BigDecimal(0);
    f_dit=0;
    xp=-1;
    lk=0;
    drf=new BigDecimal(0);
    fr_f=new BigDecimal(0);
    int_f=new BigDecimal(0);
    fr_s=new BigDecimal(0);
    int_s=new BigDecimal(0);
    fr_rs=new BigDecimal(0);
    int_rsl=new BigDecimal(0);
    get_dfr=new BigDecimal(0);
    newd=new BigDecimal(0);
    new_int_t=new BigDecimal(-1);
    nr_lw=new BigDecimal(0);
    myfunc=-1;
    xpp=1;
    stop=-1;
    status=-1;
    lx=1;
    tmp_lk=-1;
    tms=0;
    go_down=0;
    da_rst=new BigDecimal(0);
    da_sq_rst=new BigDecimal(0);
    fr_da=new BigDecimal(0);
    int_da=new BigDecimal(0);
    recheck_them=new BigDecimal(0);
    frck=new BigDecimal(0);
    intck=new BigDecimal(0);
    ddddr=new BigDecimal(0);
    insr=0;
    st=0;
    fbd=0;
    System.out.println("first number second number is the qube one dimension and third the precision");
    eql_digits_cnt b_d=new eql_digits_cnt();
    first=fr;
    second=sc;
    lxpre=rts;
    if(logl==0){b_d.fcnt(new BigDecimal(0),first,lxpre,1,0);}
    if(logl==1){b_d.fcnt(new BigDecimal(0),first,lxpre,1,1);}
    f_dit=b_d.mnarcnt;
    System.out.println("Main Number " + first + " has number of digits " + f_dit );
    System.out.println("Using Power of " + second );
    //rst=(BigDecimal)first/(BigDecimal)second;
    rst=first.divide(second,mcb);
    //int_f=new BigDecimal(first.intValue(),mcb); 
    int_f=bgp.i_reci(first,rts);
    fr_f=first.subtract(int_f,mcb);
    //int_s=new BigDecimal(second.intValue(),mcb); 
    int_s=bgp.i_reci(second,rts);
    fr_s=second.subtract(int_s,mcb);
    //int_rsl=new BigDecimal(rst.intValue(),mcb); 
    int_rsl=bgp.i_reci(rst,rts);
    fr_rs=rst.subtract(int_rsl,mcb);
    System.out.println(" ");
    System.out.println("first " + int_f );
    System.out.println("     doted " + fr_f );
    System.out.println("     makes " + first);
    System.out.println(" ");
    System.out.println("second " +int_s );
    System.out.println("     doted "  +fr_s );
    System.out.println("     makes "  +second );
    System.out.println(" ");
    System.out.println("result " + int_rsl );
    System.out.println("     doted " +  fr_rs );
    System.out.println("     makes " + rst );
    if(int_s.compareTo(int_rsl)==1){get_dfr=int_s.subtract(int_rsl,mcb);}
    if(int_s.compareTo(int_rsl)==-1){get_dfr=int_rsl.subtract(int_s,mcb);}
    System.out.println(" ");
    if(get_dfr.compareTo(new BigDecimal(1))==0){
	System.out.println("u can easily almost retrieve the dots digits");
    }
    //getting the last digit of the int_rsl
    String last_digit;
    //last_digit=BigDecimal.toString(int_rsl);
    last_digit=int_rsl.toString();
    System.out.println("the last digit to work with comes from " + last_digit);
    //for(int i=0;i<=last_digit.length()-1;i++){
    //        if(last_digit.charAt(i)!='.'){xp+=1;}
    //        if(last_digit.charAt(i)=='.'){
    //		mk=last_digit.charAt(i-1);
    //	        lk=Character.getNumericValue(mk);
    //		break;
    //	    }
    //}
    mk=last_digit.charAt(last_digit.length()-1);
    lk=Character.getNumericValue(mk);
    System.out.println("with mk " + mk + " and lk " + lk );
    xp+=1;   
    System.out.println(" ");
    System.out.println("for the integer string "+ last_digit );
    System.out.println("the numbers are " + xp );
    System.out.println("the retrievable integer digit is " + lk );
    System.out.println(" ");
    //lowering
    new_int_t=new BigDecimal(lk,mcb);
    newd=new_int_t.add(fr_rs,mcb);
    System.out.println("entering with number of " + newd );
    String int_string;
    String mn_string = null;
    //mn_string+=BigDecimal.toString(newd);
    //mn_string+=to_string(newd);
    mn_string=newd.toString();
    tmp_lk=lk;
    //sometimes the value of power of the second is bigger than the first so we use the second-1;
    //so we recheck
    //recheck_them=second*second;
    recheck_them=second.multiply(second,mcb);
    //intck=(int)recheck_them;frck=recheck_them-intck;
    //intck=new BigDecimal(recheck_them.intValue(),mcb); 
    intck=bgp.i_reci(recheck_them,rts);
    frck=recheck_them.subtract(intck,mcb);
    System.out.println("recheck values of " + second + " and result of " + recheck_them + " with intpart "+  intck );
    System.out.println( );
    if(intck.compareTo(first)==1 || recheck_them.compareTo(first)==1){
      //if the second power is bigger than the actual first power we lower it;
      if(logl==1){System.out.println("recheck power " + second + " of result " +recheck_them );}
      if(logl==1){System.out.println("lowering second to value of " + second ); 
     System.out.println( );}
      //second=second-1;
      second=second.subtract(new BigDecimal(1),mcb);
    }
    for(;;){
        drf=new BigDecimal(0);da_rst=new BigDecimal(0);da_sq_rst=new BigDecimal(0);
        System.out.println("bee second agnostic for");
        if(logl==1){System.out.println("     ----> using " + newd) ;
                       //System.out.println("" with string " << mn_string;
                   }
        nr_lw=newd.divide(new BigDecimal(2),mcb);
	tms+=1;
        if(logl==1){System.out.println(" rst is " + nr_lw );}
        da_rst=new BigDecimal(-1,mcb);
        //intck=(int)nr_lw;frck=nr_lw-intck;
	//intck=new BigDecimal(nr_lw.intValue(),mcb); 
	intck=bgp.i_reci(nr_lw,rts);
	frck=nr_lw.subtract(intck,mcb);
        if(logl==1){System.out.println("     ----> using " + nr_lw + " with intpart " + intck + " and fract " + frck  );}
        //da_rst=second+frck;
        da_rst=second.add(frck,mcb);
	//da_sq_rst=da_rst*da_rst;
        da_sq_rst=da_rst.multiply(da_rst,mcb);
	//int_da=(int)da_sq_rst;fr_da=da_sq_rst-int_da;
	//int_da=new BigDecimal(da_sq_rst.intValue(),mcb); 
	int_da=bgp.i_reci(da_sq_rst,rts);
	fr_da=da_sq_rst.subtract(int_da,mcb);
        if(logl==1){System.out.println("trying to retrieve digits \n");
		   b_d.fcnt(new BigDecimal(0),int_da,lxpre,0,1);
}
        if(logl==0){b_d.fcnt(new BigDecimal(0),int_da,lxpre,0,0);}
        fbd=b_d.f_cnt;
        if(logl==1){System.out.println("digits retrieved " + fbd );}
        if(insr>0 && st==1){
            if(insr>fbd){
                drf=new BigDecimal(0);
                if(da_sq_rst.compareTo(first)==-1){drf=first.subtract(da_sq_rst,mcb);
                                    }
                if(da_sq_rst.compareTo(first)==1){drf=da_sq_rst.subtract(first,mcb);
                                    }
                //ddddr=(BigDecimal)first/(BigDecimal)da_sq_rst;
                ddddr=first.divide(da_sq_rst,mcb);
		insr=fbd;
                sal=new String();
                sal+=Integer.toString(fbd);
                sal+=" PWR: ";                
                //sal+=BigDecimal.toString(da_rst);
                sal+=da_rst.toString();
		sal+=" | ";
                //sal+=BigDecimal.toString(da_sq_rst);
                sal+=da_sq_rst.toString();
		sal+=" ";
                //sal+=BigDecimal.toString(drf);
                sal+=drf.toString();
		sal+=" ";
                //sal+=BigDecimal.toString(ddddr);
                sal+=ddddr.toString();
		all_s. add(sal);
            }
        }
        if(insr==0 && st==0){
                            drf=new BigDecimal(0);
                            if(da_sq_rst.compareTo(first)==-1){drf=first.subtract(da_sq_rst,mcb);
                                                }
                            if(da_sq_rst.compareTo(first)==1){drf=da_sq_rst.subtract(first,mcb);
                                                }
                            //ddddr=(BigDecimal)first/(BigDecimal)da_sq_rst;
                            ddddr=first.divide(da_sq_rst,mcb);
			    insr=fbd;
                            st=1;
                            sal=new String();
                            sal+=Integer.toString(fbd);
                            sal+=" PWR tw ";                          
                            //sal+=BigDecimal.toString(da_rst);
                            sal+=da_rst.toString();
			    sal+=" ";
                            //sal+=BigDecimal.toString(da_sq_rst);
                            sal+=da_sq_rst.toString();
			    sal+=" ";
                            //sal+=BigDecimal.toString(drf);
                            sal+=drf.toString();
			    sal+=" ";
                            //sal+=BigDecimal.toString(ddddr);
                            sal+=ddddr.toString();
			    all_s. add(sal);
                            }
        if(logl==1){
          System.out.println("                     with combination da_rst " + da_rst + " sq of rst " + da_sq_rst   );
          System.out.println("                     with intpart " +int_da +" and other part " + fr_da  );
        }
        if(int_da.compareTo(first)==0){
        System.out.println( );
        System.out.println("     ----> using " + newd );
        System.out.println("     ----> with rst " + nr_lw );
        System.out.println("     ----> the times i run " +  tms );
        System.out.println("     ----> i just go down :" + go_down );
        System.out.println("     ------------------- found  @--------------------------- ");
        System.out.println("     for number " + first);
        System.out.println("     power result is  " + da_rst   );
        System.out.println("     with result of the power * power  " + da_sq_rst );
        System.out.println( );
                            sal=new String();
                            sal+="**FOUND** ";
                            sal+="using ";
                            //sal+=BigDecimal.toString(newd);
			    sal+=newd.toString();
                            sal+=" ";
                            //sal+=BigDecimal.toString(nr_lw);
                            sal+=nr_lw.toString();
			    sal+=" /i run times: ";
                            //sal+=BigDecimal.toString(tms);
                            sal+=Integer.toString(tms);
			    sal+=" i just go down: ";
                            //sal+=BigDecimal.toString(go_down);
                            sal+=Integer.toString(go_down);
			    sal+=" / for ur number ";
                            //sal+=BigDecimal.toString(first);
			    sal+=first.toString();
                            sal+="  |power result is ";
                            //sal+=BigDecimal.toString(da_rst);
			    sal+=da_rst.toString();
                            sal+="  | ";
                            //sal+=BigDecimal.toString(da_sq_rst);
			    sal+=da_sq_rst.toString();
                            all_s. add(sal);
        rtr=1;
        }
        int_string=new String();
        //int_string+=BigDecimal.toString(nr_lw);
	int_string+=nr_lw.toString();
        if(logl==1){
          System.out.println("                     the int string is " + int_string );
          System.out.println( );}
        if(lx==2){lx=1;}
        if(mn_string.charAt(0)=='0' && int_string.charAt(2)=='0' && 
	    new_int_t.compareTo(new BigDecimal(0))==0 )
	{
           stop=1;
        }
        if(mn_string.charAt(0)!='0' && int_string.charAt(2)=='0'){
            go_down+=1;
            if(logl==1){System.out.println("from new int t  of " +  new_int_t +" ---> ");}
          BigDecimal tml;
	  tml=new BigDecimal(tmp_lk,mcb);
	  new_int_t=tml.subtract(new BigDecimal(1),mcb);
	  //newd=new_int_t+fr_rs;
          newd=new_int_t.add(fr_rs);
	  mn_string=new String();
          //mn_string+=BigDecimal.toString(newd);
	  mn_string+=newd.toString();
          int_string=new String();
          nr_lw=new BigDecimal(-1);
          if(logl==1){System.out.println(" with " + newd );}
          lx=2;
          if(tmp_lk>=0){tmp_lk=tmp_lk-1;}
        }
        if(lx==1){newd=nr_lw;}
        if(stop==1){break;}
        if(rtr==1){break;}
     }
//bee_show(lxpre);
     return 0;
}


 
}
