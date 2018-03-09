
import java.util.Scanner;

public class Td2Boucles {

    static Scanner sc = new Scanner(System.in);
    
    

    public static void main(String[] args) {
        //exo1();
        //exo2();
        //exo3();
        //exo4();
        //exo5();
        //exo6();
        //exo7();
        //exo7bis();
        //exo8();
        //exo9();
        //exo10();
        //exo11();
        //exo12();
        //exo13();
        //exo14();
        //exo14bis();
        //exo15();
        exo16();
    }

        static void exo1(){
        System.out.println("Entrez un chiffre :");
        int n= sc.nextInt();
        
        int s=0;
        for(int i=1;i<=n;i++){
            s+=i;
        }
        System.out.println(s);
    }


    static void exo2() {
        int n = 0;
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        System.out.println(f);
    }

    static void exo3() {
        int x = 4;
        int p = 0;
        int y = 3;

        for (int i = 1; i <= x; i++) {
            p += y;
        }
        System.out.println(p);
    }

    static void exo4() {
        int x = 14;
        int y = 4;
        int q = 0;

        while (x >= y) {
            x = x - y;
            q++;
        }

        System.out.println("le quotient est " + q + " et le reste" + x);
    }

    static void exo5() {
        int x = 21;
        int y = 6;
        while (x != y) {
            if (x > y) {
                x -= y;
            } else {
                y -= x;
            }
        }
        System.out.println("Le PGCD est " + y);

    }

    static void exo6() {
        int n = 3;
        int u0 = 1;
        int u1 = 1;
        int u = 0;
        if (n == 0 || n == 1) {
            System.out.println("u[" + n + "]=1");
        } else {
            for (int i = 2; i <= n; i++) {
                u = u0 + u1;
                u0 = u1;
                u1 = u;

            }
            System.out.println("u[" + n + "]=" + u);
        }

    }

    static void exo7() {
        int n = 1000;
        double u = 0;
        System.out.println(u);
        double x = Math.PI / 4;
        System.out.println(x);
        
            for (double i = 0.0f; i <= n; i++) {
             }
            System.out.println(u);
        }      
    
static void exo8(){
    double n=5;
    double x=1;
    double s=1;
    double px=1;
    double f=1;
    for (int i=1;i<=n;i++){
        px*=x;
        f*=i;
        s=s+px/f;
        
    }
    System.out.println(s);
    System.out.println(Math.exp(x));
    
}

static void exo9(){
    System.out.println("Entrer un entier:");
    int x =sc.nextInt();
    int k=3;
    for (int i=1;i<k;i++){
    x/=10;
}
    System.out.println(x%10);
}

static void exo10(){
    int inf=1;
    int sup=1001;
    int rep;
    int mil;
    do{
        mil=(inf+sup)/2;
        System.out.println("Je propose le nb"+mil);
        rep=sc.nextInt();
        if (rep==1)
            inf = mil;            //Pour contrer le cas ou x=1000
        else
            sup = mil;
    }while (rep!=0);
    System.out.println("Le chiffre mystère est"+mil);
}

static void exo11(){
    int s;
    for(int i=1;i<=1000;i++){
        s=0;
        for(int j=1;j<i;j++){
            if(i%j==0)
                s+=j; 
        }
        if(s==i){
            System.out.println(i);     
        }
    }
    
}

static void exo12(){
    for(int i=0;i<=999;i++){
        double u=i%10;
        double d=(i/10)%10;
        double c=i/100;
        if((Math.pow(u, 3))+Math.pow(d, 3)+Math.pow(c, 3)==i)
            System.out.println(i);
    }
}

static void exo13(){
    int n=10;
    for (int i=1;i<=n;i++){
        for(int j=1;j<=i;j++)
                System.out.print("*");
        for(int j=1;j<=(2*n)-2*i;j++)
            System.out.print(" ");
        for(int j=1;j<=i;j++)
                System.out.print("*");
        System.out.println("");
    }
}

static void exo14(){
    double a=5;
    double un0=1;
    double un=(un0+a/un0)/2;
    double tmp;
    for(int i=0;i<=100;i++){
        tmp=un;
        un=(un0+a/un0)/2;
        un0=tmp;
        System.out.println(un);
    }
    System.out.println(un);
}

static void exo14bis(){
        System.out.println("Entrez un nombre positif :");
        double a = sc.nextInt();
        double xn = 1;
        int i;
        for( i=1; i<=0; i++){
            System.out.println(i);
            xn = (xn+a/xn)/2;
            System.out.println(xn);
        }
        double p = Math.pow(10.0, 8);
        xn = Math.floor(xn*p)/p;
        System.out.println("La valeur approchée de √"+a+" est "+xn);
        System.out.println(i);
    }

static void exo15(){    
    int n=1;
    int i=2;
    do{
        while(n%i!=0){
            i++;
        }
        n/=i;
        System.out.println(i);
    }while(n>1);
}

static void exo16(){
    int x=2;
    int n=3;
    int p=1;
    for (int i=1;i<=n;i++){
        int m=0;
        for(int j=1;j<=x;j++){
            m+=p;
        }
        p=m;
    }
    System.out.println(p);
}




}
