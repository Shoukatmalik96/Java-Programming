/**
 * Created by Shoukat Malik on 9/12/2016.
 */
public class Math {
    int a,b;
    double val1,val2;

    public void   min(int a ,int b){

        if(a<b){

            System.out.println(a+"is minimum");

        }else{

            System.out.println(b+"is minimum");
        }
    }

    public void   max(int a ,int b){

        if(a>b){

            System.out.println(a+"is maximum");

        }else{

            System.out.println(b+"is minimum");
        }
    }
    public int ciel(double a){


        if((int)a!=a){

            return (int)a+1;
        }
        return (int)a;



    }
    public int  abs(int a){

        if(a<0){
            return a*-1;
        }
        return a;
    }
}
