/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqrt_sum_.jvm;

/**
 *
 * @author acherontas
 */
class eql_digits_cnt {


	int f_cnt;
        int mn_ar[]=new int[1000];
        int mnarcnt=0;
        char ck;
        int lk;
        int brk=0;

  int fcnt( double mn, double da_number,int prc,int logic,int log_lvl)
{
    if(log_lvl==1){System.out.println("entering function fcnt @@ eql_digits_cnt.cpp/h ");}
    lk=0;
    
    if(log_lvl==1){System.out.println("will count the digit from  ");}
    String slk;
    slk=Double.toString(da_number);
    if(log_lvl==1){System.out.println("with string of it " + " " + slk) ;}
    brk=0;
    f_cnt=0;
    for(int i=0;i<=slk.length()-1;i++){
      ck=slk.charAt(i);
      lk=Character.getNumericValue(ck) ;
      if(logic==1){
        mn_ar[mnarcnt]=lk;
        mnarcnt+=1;
      }
      if(logic==0)
      {
       if(lk==mn_ar[i]){
             f_cnt+=1;
       }
       if(lk!=mn_ar[i]){
         brk+=1;
       }
      }
      if(brk==1){break;}
    }
    if(log_lvl==1){System.out.println("leaving function fcnt @@ eql_digits_cnt.cpp/h ");}
    return 0;
}
    
}
