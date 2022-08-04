package com.company.backtracking;

public class AllPaths {
    public static void main(String[] args) {
       boolean [][] arr={{true,true,true},
               {true,true,true},
               {true,true,true}};
       All(arr,0,0,"");
       
    }
    public static void All(boolean[][]a,int r,int c,String p)
    {

        if(!a[r][c])
        {
            return;
        }

        a[r][c]=false;

        if(r==2&&c==2)
        {
            System.out.println(p);
        }
        if(r<2)
        {
            All(a,r+1,c,p+"D");
        }

        if(c<2)
        {
            All(a,r,c+1,p+"R");
        }

        if(r>0)
        {
            All(a,r-1,c,p+"U");
        }

        if(c>0)
        {
            All(a,r,c-1,p+"l");
        }
        a[r][c]=true;

    }
}
