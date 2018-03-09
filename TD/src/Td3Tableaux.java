import java.util.Scanner;


public class Td3Tableaux {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //exo1();
        //exo2();
        //exo3();
        //exo4();
        //exo5();
        //exo6();
        exo7();
        //exo8();
        //exo9();
    }


    
static int[] saisieTab(){
    System.out.println("n = ");
    int n=sc.nextInt();
    System.out.println("Saisissez:");
    int[]t=new int [n];
    for(int i=0;i<t.length;i++){
        t[i]=sc.nextInt();
    }
    return t;
}

static int maxTableau(int []t){
    int m=t[0];
    for(int i=1;i<t.length;i++){
        if (t[i]>m)
            m=t[i];
    }
    return m;
}

static void exo1(){
    int[]t=saisieTab();
    int m=maxTableau(t);
    System.out.println("max = "+m);
}

static void exo2(){
    int[]t=new int[32];
    int x=0;
    int i=0;
    do{
        t[i++]=x%2;
        x/=2;
    }while(x !=0);
    while(--i>=0){
        System.out.print(t[i]);
    }
}

static void exo3(){
    int[]t=saisieTab();
    int x=23;
    boolean bool = appartientTableauTrie(t,x);
    System.out.println(bool);
       
                
    }

static boolean appartientTableau(int []t,int x){
    for(int i =0;i<t.length;i++){
        if(t[i] ==x)
            return true;
    }
    return false;
}

static boolean appartientTableauTrie(int[]t,int x){
    int inf=0;
    int sup=t.length-1;
    while(inf != sup){
        if(x<=t[(inf+sup)/2])
            sup=(inf+sup)/2;
        else
            inf=(inf+sup)/2+1;
    }
    return(x==t[sup]); 
}

static void exo4(){
    int []t = saisieTab();
    boolean bool = croissant(t);
    System.out.println(bool);
}

static boolean croissant(int[]t){
    
    for (int i =1;i<t.length;i++){
        if(t[i-1]>t[i])
            return false;
    }
    return true;
}

static void exo6(){ 
    System.out.println("Quel est le degré?");
    int n=sc.nextInt();
    int []t=new int[n+1]; 

    for(int i =0;i<=n;i++){
        System.out.println("Quel est le coeff de dégré"+i);
        t[i]=sc.nextInt();
    }
    System.out.println("Entrer x :");
    int x=sc.nextInt();
    
    int p=polynome2(x,t);
    System.out.println(p);
}

static int polynome1(int x, int []t){
    int p=t[0];
    int x1=x;
    for(int i=1;i<t.length;i++){
        p+=t[i]*x1;
        x1*=x;
    }
    return p;
}

static int polynome2(int x, int[]t){
        int p = 0;
        System.out.println(t.length);
        for(int i=t.length-1; i>=0; i--){
            p = x*p+t[i];
        }
        return p;
    }


static void exo5(){
    int []t=saisieTab();

    boolean bool = estPalin(t);
    System.out.println(bool);
    
}

static boolean estPalindrome(int []t){
    int i=0;
    int j=t.length-1;
    while(i<j){
        if(t[i]!=t[j])
            return false;
        i++;
        j--;
    }
    return true;
}

static boolean estPalin(int[]t){
    for(int i=0;i<(t.length)/2;i++){
        if(t[i]!=t[(t.length-1)-i])
            return false;
    }
    return true;
}

static void exo7moi(){
    int n=20;
    int []t=new int[n];
    t[0]=0;
    t[1]=0;
    for(int i=2;i<t.length;i++){
        t[i]=i;
    }
    
    for(int i=0;i<t.length;i++){
        if(t[i]!=0){
            for(int j=2;j<i;j++){
                    
            }
                
                
        }
    }
}
    

static void affPremiers(int n){
    boolean [] estBarre = new boolean[n+1];
    estBarre[0]=estBarre[1]=true;
    for(int i=2;i<estBarre.length;i++){
        if(!estBarre[i]){ //if(estBarre[i]==false)
            System.out.print(i+" ");
            for(int j=i+i;j<estBarre.length;j+=i)
                estBarre[j]=true;
        }
    }
    System.out.println();    
    
}
    
static void exo7(){
    int n=32;
    affPremiers(n);
}
    
    


    
  


static void exo8(){
    int []t={2,18,-22,20,8,-6,10,-24,13,3};
    plusGrand2(t);
}

static void plusGrand1(int[]t){
    int max=t[0];
    int ind1=0;
    int ind2=1;
    for (int i=0;i<t.length;i++){
        int s=0;
        for (int j=i;j<t.length-i;j++){
            s+=t[j];
            if (s>max){
                ind1=i;
                ind2=j;
                max=s;
            }
        }
    }
            System.out.println(max);
            System.out.println(ind1);
            System.out.println(ind2);
}

static void plusGrand2(int []t){
    int somMax=0;
    int debMax=0;
    int finMax=0;
    int som=0;
    int deb=0;
    for(int fin=0;fin<t.length;fin++){
        som+=t[fin];
        if(som>=somMax){
            somMax=som;
            debMax=deb;
            finMax=fin;
        }
        if(som<0){
            som=0;
            deb=fin+1;
        }
    }
    System.out.println(debMax);
    System.out.println(finMax);
    System.out.println(somMax);
}



static void exo9(){
    int n=5;
    affichDecomp(n);
}

static void affichDecomp(int n){
    int[]t=new int[n];
    int l=n;
    for(int i=0;i<t.length;i++){ //(1,1,1,1,...,1)
        t[i]=1;
    }
    for(;;){            //while(true)
        for(int i=0;i<l;i++)
            System.out.print(t[i]+" ");
        System.out.println();
        if(l==1)        //if(t[0]==n) 
            break;// pas while(l!=1) car on veut afficher la dernière solution aussi
        l--;
        t[l-1]++;       //on incrémentre l'avant dernier
        int nb1=t[l]-1;
        for(int k=1;k<=nb1;k++){
            t[l++]=1;
        }
    }
}


}