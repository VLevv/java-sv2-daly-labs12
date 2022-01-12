package day02;

public class MathAlgorithms {
    public int lNKO(int a ,int b){
        int max=1;
        for(int i = 1;i<=Math.min(a,b);++i){
            if(a%i==0&&b%i==0&&i>max){
                max=i;
            }
        }
        return max;
    }
}
