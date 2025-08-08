/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqrt_sum_.jvm;

/**
 *
 * @author acherontas
 */
class after_the_dot {
   
	String ml;
        String nl;
        char cr;
        int lr=-1;
        int ps=0;
        int tzi=0;
        int mv=0;
        int endmv=2;
        int stofz=0;
        int posi=0;
        double lde;


double gen_after_dot( double mnmb){
    ml=new String();
    ml+=Double.toString(mnmb);
    lr=-1;
    ps=0;
    nl=new String();
    tzi=0;
    mv=0;
    endmv=2;
    stofz=0;
    posi=0;
    for(int i=0;i<=ml.length()-1;i++){
       cr=ml.charAt(i);
       if(mv==endmv){break;}
       if(ps==1){
                    lr=Character.getNumericValue(cr);
                   // cout<<cr << " with " << lr <<" ";
                    if(lr==0 && stofz==0 && posi==0){
                       // cout<<"found a zero \n";
                        endmv=3;
                        stofz=1;
                    }
                    nl+=Integer.toString(lr);
                    mv+=1;
                    posi=1;
                }
        if(cr=='.'){
                    ps=1;
                  }

    }
   lde=0;
   lde=Double.parseDouble(nl);
   //if(stofz==1){lde=lde*10;}
   //cout<<"returning from get_after_dot with main " << ml  <<" and value " << lde <<"\n";
   return lde;
}
}
