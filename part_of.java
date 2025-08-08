/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqrt_sum_.jvm;

/**
 *
 * @author acherontas
 */
class part_of {
    

   double rtv;
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


   double get_the_part( double nbm,int till,int prc){

     sk=new String();
     rvt=new String();
     rtv=0;
     qrt=0;
     all_length=0;
     dot_pos=0; 
     sk+=Double.toString(nbm);
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
     rtv=Double.parseDouble(rvt);
     qrt=Math.sqrt(rtv);
     all_length=all_pos;
     dot_pos=pd;
     return 0;
}

}
