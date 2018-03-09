import java.util.Scanner;
public class TriTab {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[]t={2,20,18,3};
        triInsert(t);
        afficheTab(t);        
    }

static void afficheTab(int []t){
    for(int i=0;i<t.length;i++){
            System.out.print(t[i]+" ");
}
    System.out.println();
}
    
static int[] triBulle(int []t){
    boolean trie;
    do{
        trie=true;
        for(int i=0;i<t.length-1;i++){
            int tmp;
            if(t[i]>t[i+1]){
                tmp=t[i];
                t[i]=t[i+1];
                t[i+1]=tmp;
                trie = false;
            }
        }            
    }while(!trie);
    return t;}

 static int[] triExtract(int[]t){  //        int[]t={2,20,18,3};
    for(int i = t.length-1;i>0;i--){ //i =3
        int max=0;
        int tmp;
        for(int j =1;j<=i;j++){ //j=1 j=2
            if(t[j]>t[max])
                max=j; //1
                    System.out.println("max = "+max);

        } 
        tmp=t[i]; //tmp=3
        t[i]=t[max]; //20
        t[max]=tmp;//t max =
        
    }
    return t;
}
 
 static int[] triInsert(int []t){//        int[]t={2,18,20,3};

     int j;
     for(int i=1;i<t.length;i++){
         int x=t[i];  //x=3
         System.out.println(x);
         for(j = i;j>0 && t[j-1]>x;j--){ //j=1
             t[j]=t[j-1];  //2 18 20 20 PUIS 2 18 18 20 PUIS 
         }
         t[j]=x; //t
     }
     return t;
 }
 
 static public int[] triFusion(int[]t) {
	int[]taux = new int[t.length] ;
	triFusionRec(t, 0, t.length-1, taux) ;
        return(t);
}

static public void triFusionRec(int[]t, int deb, int fin, int[]taux) {
	if(deb >= fin)                          //tableau de 0 ou 1 élément
		return ;                         //lorsqu'on arrive à untableau à un élément, le tableau est déjà trié
	int mil = (deb+fin)/2 ;                 //indice du milieu	
	triFusionRec(t, deb, mil, taux) ;	//on trie la partie gauche
	triFusionRec(t, mil+1, fin, taux) ;	//on trie la partie droite
	int i = deb;               		//fusion des 2 tableaux dans taux
	int j = mil+1;
	int k = deb;
	while(i<=mil && j<=fin)
                taux[k++] = t[i] < t[j] ? t[i++] : t[j++] ;
	while(i<=mil)                           //cas ou impair
		taux[k++] = t[i++] ;
	while(j<=fin)
		taux[k++] = t[j++] ;
	for(i=deb ; i<=fin ; i++)		//on copie taux  t
		t[i] = taux[i] ;
        return;
	}

}
 
