import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M, W;
        N=sc.nextInt();
        M=sc.nextInt();
        W=sc.nextInt();
        int x, y;
        int[][] pole = new int [N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                pole[i][j]=0;
            }
        }
        for(int i=0; i<W; i++){
            x=sc.nextInt();
            y=sc.nextInt();
            pole[x-1][y-1]=-1;
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(pole[i][j]==-1){
                    if(i+1<N && j+1<M){
                        if(pole[i+1][j+1]!=-1)
                        pole[i+1][j+1]++;
                    }
                    if(i-1>=0 && j-1>=0){
                        if(pole[i-1][j-1]!=-1)
                            pole[i-1][j-1]++;
                    }
                    if(i-1>=0 && j+1<M){
                        if(pole[i-1][j+1]!=-1)
                        pole[i-1][j+1]++;
                    }
                    if(i+1<N && j-1>=0){
                        if(pole[i+1][j-1]!=-1)
                        pole[i+1][j-1]++;
                    }
                    if(i+1<N){
                        {if(pole[i+1][j]!=-1)
                            pole[i+1][j]++;
                        }
                    }
                    if(j+1<M) {
                        if(pole[i][j+1]!=-1)
                        pole[i][j+1]++;
                    }
                    if(i-1>=0) {
                        if(pole[i-1][j]!=-1)
                        pole[i-1][j]++;
                    }
                    if(j-1>=0) {
                        if(pole[i][j-1]!=-1)
                        pole[i][j-1]++;
                    }
                }
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(pole[i][j]!=-1)
                System.out.print(pole[i][j]+" ");
                else System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}