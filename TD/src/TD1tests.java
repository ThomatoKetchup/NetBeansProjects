
import java.util.Scanner;

public class TD1tests {

    static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
    
    }

    static void exo1() {
        System.out.println("entrer 2 nb: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int tmp = x;
        x = y;
        y = tmp;
        System.out.println("x vaut: " + x + " et y vaut: " + y);

    }

    static void exo3() {
        System.out.println("Entrez a:");
        int a = sc.nextInt();
        System.out.println("Entrer b:");
        int b = sc.nextInt();
        System.out.println("Entrez c:");
        int c = sc.nextInt();

        int tmp;

        tmp = a;
        a = b;
        b = c;
        c = tmp;
        System.out.println("a=" + a + "b=" + b + "c=" + c);

    }

    static void exo4() {
        System.out.println("Entrez a:");
        int a = sc.nextInt();
        System.out.println("Entrer b:");
        int b = sc.nextInt();
        System.out.println("Entrez c:");
        int c = sc.nextInt();

        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println("le maximum est:" + max);
    }

    static void exo5() {
        System.out.println("Entrez a:");
        int a = sc.nextInt();
        System.out.println("Entrer b:");
        int b = sc.nextInt();
        System.out.println("Entrez c:");
        int c = sc.nextInt();
        int tmp;

        if (a < b) {
            if (b < c) { //a b c
            } else if (a < c) { //a c b
                tmp = b;  //on permute b et c
                b = c;
                c = tmp;
            } else {
                tmp = a;
                a = c;
                c = b;
                b = tmp;
            }

        } else if (b > c) { //a>b cba=>abc
            tmp = c;
            c = a;
            a = tmp;

        } else if (a < c) //bac, b<a et b<c
        {
            tmp = a;
            a = b;
            b = tmp;
        } else {
            tmp=a;
            a = b;
            b = c;
            c = tmp;
        }
        System.out.println("Lorsqu'on trie les variables, on obtient: " + a + " " + b + " " + c);
    }

    static void exo7() {
        int a;
        int p = 39;
        a = p / 20;
        p = p - a * 20;

        int b = p / 10;
        p = p - b * 10;

        int c = p / 5;
        p = p - c * 5;

        int d = p / 2;
        p = p - d * 2;
        System.out.println(+a + "*20e" + b + "*10e" + c + "*5e" + d + "*2e" + p + "*1e");
        System.out.println(+20 % 45);

    }

    static void exo7bis(){
        int n;
        int b=20;   //Etape 1
        int p=0;       
        do  //Etape 2
        {
            n=p/b;
            p=p%b;
            System.out.println(n+" billets/pièces de "+b);
            b=b/2;  //Etape 3
        }
        while(p!=0);
    }
    static void test(){
        char x;
        int i =0;
        while((x=f.read())!=-1){
            t[i++]=x;
        }
    }
}
