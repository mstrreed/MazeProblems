package com.company.backtracking;

public class allp1 {
    public static void main(String[] args) {
        boolean[][] arr={{true,true,true},{true,true,true},{true,true,true}};
        int[][] p=new int[arr.length][arr[0].length];
           allpaths(arr,0,0,p,1);
    }
    public static void allpaths(boolean[][] a,int r,int c,int[][] path,int step)
    {
        if(r==a.length-1&&c==a[0].length-1)
        {
            path[r][c]=step;
            for(int[] i:path)
            {
               for(int j:i)
               {
                   System.out.print(j);
               }
                System.out.println();
            }
            System.out.println();
return;
        }
        if(!a[r][c])
        {
            return;
        }

        a[r][c]=false;
        path[r][c]=step;
        if(r<a[0].length-1)
        {

            allpaths(a,r+1,c,path,step+1);
        }

        if(c<a[0].length-1)
        {

            allpaths(a,r,c+1,path,step+1);
        }
        if(r>0)
        {
            allpaths(a,r-1,c,path,step+1);
        }
        if(c>0)
        {
            allpaths(a,r,c-1,path,step+1);
        }

        a[r][c]=true;
        path[r][c]=0;
    }
}
