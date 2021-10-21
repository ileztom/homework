package lesson2;

public class lesson2 {
    public static void main(String[] args){
        System.out.println(ex1(20,10));
        ex2(5);
        System.out.println(ex3(3));
        ex4(5,6);
        System.out.println(ex5(2021));
    }


    public static boolean ex1(int a,int b){
        int sum = a + b;
        if(sum >= 10){
            if (sum <= 20)
                return true;
        }
        else{
            return false;
        }
        return false;
    }

    public static void ex2(int a){
        if(a >= 0){
            System.out.println("положительное");
        }
        else{
            System.out.println("отрицательное");
        }
    }

    public static boolean ex3(int a){
        if (a < 0){
            return true;
        }
        return false;
    }

    public static void ex4(int a, int b){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("_");
            }
            System.out.println();

        }
    }
    public static boolean ex5(int a){
        if (a % 4 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
