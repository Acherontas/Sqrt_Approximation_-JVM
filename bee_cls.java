/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqrt_sum_.jvm;
import java.util.Vector;

/**
 *
 * @author acherontas
 */
class bee_cls {

	int lxpre=-1;int f_dit=0;int xp=-1;int lk;
        int myfunc=-1,xpp=1,stop=-1,status=-1,lx=1,tmp_lk=-1,tms=0,go_down=0;
        int insr=0;int st=0;int fbd=0;
        double first,second,rst;
        double fr_f,fr_s,fr_rs;
        double int_f,int_s,int_rsl;
        double get_dfr;
        double newd,new_int_t=-1,nr_lw;
        double da_rst,da_sq_rst,fr_da,int_da;
        double recheck_them;
        double frck;
        double intck;
        double ddddr;
        char mk;
        Vector<String> all_s=new Vector<>();
        String sal;
        double drf;
        Vector<Integer> da_psifia=new Vector<>();
        int rtr=0;


int bee_show(int lxpre){
 System.out.println("--------------------------------------\n");
 System.out.println("Psifia,Power,Result of Power,Diafora from Main,Diairesi from Main\n");
 System.out.println("--------------------------------------\n");
 for(int ip=0;ip<=all_s.size()-1;ip++){
    System.out.println(all_s.get(ip) + "\n");

 }
 System.out.println("--------------------------------------\n");
    all_s.clear();
    rtr=0;
    drf=0;
 return 0;
}

   


int bee_man( double fr, double sc,int rts,int logl){
    rtr=0;lxpre=-1; first=0;second=0;rst=0; f_dit=0;xp=-1;lk=0;
    drf=0;fr_f=0;int_f=0;fr_s=0;int_s=0;fr_rs=0;int_rsl=0; get_dfr=0;
    newd=0;new_int_t=-1;nr_lw=0;myfunc=-1;xpp=1;stop=-1;status=-1;lx=1;tmp_lk=-1;tms=0;go_down=0;
    da_rst=0;da_sq_rst=0;fr_da=0;int_da=0;recheck_them=0;frck=0;intck=0; ddddr=0;
    insr=0;st=0;fbd=0;
    System.out.println("first number second number is the qube one dimension and third the precision \n");
    eql_digits_cnt b_d=new eql_digits_cnt();
    first=fr;
    second=sc;
    lxpre=rts;
    if(logl==0){b_d.fcnt(0,first,lxpre,1,0);}
    if(logl==1){b_d.fcnt(0,first,lxpre,1,1);}
    f_dit=b_d.mnarcnt;
    System.out.println("Main Number " + first + " has number of digits " + f_dit +"\n");
    System.out.println("Using Power of " + second + "\n");
    rst=(double)first/(double)second;
    int_f=(int)first; fr_f=first-int_f;
    int_s=(int)second;fr_s=second-int_s;
    int_rsl=(int)rst;fr_rs=rst-int_rsl;
    System.out.println("\n");
    System.out.println("first " + int_f + " \n");
    System.out.println("     doted " + fr_f + "\n");
    System.out.println("     makes " + first+"\n");
    System.out.println("\n");
    System.out.println("second " +int_s + " \n");
    System.out.println("     doted "  +fr_s + " \n");
    System.out.println("     makes "  +second +"\n");
    System.out.println("\n");
    System.out.println("result " + int_rsl + " \n");
    System.out.println("     doted " +  fr_rs + " \n");
    System.out.println("     makes " + rst +"\n");
    if(int_s>int_rsl){get_dfr=int_s-int_rsl;}
    if(int_s<int_rsl){get_dfr=int_rsl-int_s;}
    System.out.println("\n");
    if(get_dfr==1){System.out.println("u can easily almost retrieve the dots digits \n");}
    //getting the last digit of the int_rsl
    String last_digit;
    last_digit=Double.toString(int_rsl);
    for(int i=0;i<=last_digit.length()-1;i++){
            if(last_digit.charAt(i)!='.'){xp+=1;}
            if(last_digit.charAt(i)=='.'){
            mk=last_digit.charAt(i-1);
            lk=Character.getNumericValue(mk);
            break;}
            }
            xp+=1;
     
    System.out.println("\n");
    System.out.println("for the integer string "+ last_digit + "\n");
    System.out.println("the numbers are " + xp +"\n");
    System.out.println("the retrievable integer digit is " + lk +"\n");
    System.out.println("\n");
    //lowering
    new_int_t=lk;
    newd=new_int_t+fr_rs;
    System.out.println("entering with number of " + newd +"\n");
    String int_string;
    String mn_string = null;
    mn_string+=Double.toString(newd);
    //mn_string+=to_string(newd);
    tmp_lk=lk;
    //sometimes the value of power of the second is bigger than the first so we use the second-1;
    //so we recheck
    recheck_them=second*second;
    intck=(int)recheck_them;frck=recheck_them-intck;
    System.out.println("recheck values of " + second + " and result of " + recheck_them + " with intpart "+  intck +"\n");
    System.out.println("\n");
    if(intck>first){
      //if the second power is bigger than the actual first power we lower it;
      if(logl==1){System.out.println("recheck power " + second + " of result " +recheck_them +"\n");}
      if(logl==1){System.out.println("lowering second to value of " + second +"\n"); 
     System.out.println("\n");}
      second=second-1;
    }
    for(;;){
        drf=0;da_rst=0;da_sq_rst=0;
         System.out.println("bee second agnostic for \n");
        if(logl==1){System.out.println("     ----> using " + newd) ;
                       //System.out.println("" with string " << mn_string;
                   }
        nr_lw=(double)newd/(double)2;
        tms+=1;
        if(logl==1){System.out.println(" rst is " + nr_lw +"\n");}
        da_rst=-1;
        intck=(int)nr_lw;frck=nr_lw-intck;
        if(logl==1){System.out.println("     ----> using " + nr_lw + " with intpart " + intck + " and fract " + frck + "\n");}
        da_rst=second+frck;
        da_sq_rst=da_rst*da_rst;
        int_da=(int)da_sq_rst;fr_da=da_sq_rst-int_da;
        if(logl==1){System.out.println("trying to retrieve digits \n");
		   b_d.fcnt(0,int_da,lxpre,0,1);
}
        if(logl==0){b_d.fcnt(0,int_da,lxpre,0,0);}
        fbd=b_d.f_cnt;
        if(logl==1){System.out.println("digits retrieved " + fbd +"\n");}
        if(insr>0 && st==1){
            if(insr>fbd){
                drf=0;
                if(da_sq_rst<first){drf=first-da_sq_rst;
                                    }
                if(da_sq_rst>first){drf=da_sq_rst-first;
                                    }
                ddddr=(double)first/(double)da_sq_rst;
                insr=fbd;
                sal=new String();
                sal+=Double.toString(fbd);
                sal+=" PWR: ";                
                sal+=Double.toString(da_rst);
                sal+=" | ";
                sal+=Double.toString(da_sq_rst);
                sal+=" ";
                sal+=Double.toString(drf);
                sal+=" ";
                sal+=Double.toString(ddddr);
                all_s. add(sal);
            }
        }
        if(insr==0 && st==0){
                            drf=0;
                            if(da_sq_rst<first){drf=first-da_sq_rst;
                                                }
                            if(da_sq_rst>first){drf=da_sq_rst-first;
                                                }
                            ddddr=(double)first/(double)da_sq_rst;
                            insr=fbd;
                            st=1;
                            sal=new String();
                            sal+=Double.toString(fbd);
                            sal+=" PWR tw ";                          
                            sal+=Double.toString(da_rst);
                            sal+=" ";
                            sal+=Double.toString(da_sq_rst);
                            sal+=" ";
                            sal+=Double.toString(drf);
                            sal+=" ";
                            sal+=Double.toString(ddddr);
                            all_s. add(sal);
                            }
        if(logl==1){
          System.out.println("                     with combination da_rst " + da_rst + " sq of rst " + da_sq_rst + "\n");
          System.out.println("                     with intpart " +int_da +" and other part " + fr_da  +"\n");
        }
        if(int_da==first){
        System.out.println("\n");
        System.out.println("     ----> using " + newd + " \n");
        System.out.println("     ----> with rst " + nr_lw +" \n");
        System.out.println("     ----> the times i run " +  tms +"\n");
        System.out.println("     ----> i just go down :" + go_down +"\n");
        System.out.println("     ------------------- found  @--------------------------- \n");
        System.out.println("     for number " + first +"  \n");
        System.out.println("     power result is  " + da_rst + "\n");
        System.out.println("     with result of the power * power  " + da_sq_rst +"\n");
        System.out.println("\n");
                            sal=new String();
                            sal+="**FOUND** ";
                            sal+="using ";
                            sal+=Double.toString(newd);
                            sal+=" ";
                            sal+=Double.toString(nr_lw);
                            sal+=" /i run times: ";
                            sal+=Double.toString(tms);
                            sal+=" i just go down: ";
                            sal+=Double.toString(go_down);
                            sal+=" / for ur number ";
                            sal+=Double.toString(first);
                            sal+="  |power result is ";
                            sal+=Double.toString(da_rst);
                            sal+="  | ";
                            sal+=Double.toString(da_sq_rst);
                            all_s. add(sal);


        rtr=1;
        }
        int_string=new String();
        int_string+=Double.toString(nr_lw);
        if(logl==1){
          System.out.println("                     the int string is " + int_string +"\n");
          System.out.println("\n");}
        if(lx==2){lx=1;}
        if(mn_string.charAt(0)=='0' && int_string.charAt(2)=='0' && new_int_t==0){
           stop=1;
        }
        if(mn_string.charAt(0)!='0' && int_string.charAt(2)=='0'){
            go_down+=1;
            if(logl==1){System.out.println("from new int t  of " +  new_int_t +" ---> ");}
          new_int_t=tmp_lk-1;
          newd=new_int_t+fr_rs;
          mn_string=new String();
          mn_string+=Double.toString(newd);
          int_string=new String();
          nr_lw=-1;
          if(logl==1){System.out.println(" with " + newd +"\n");}
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
