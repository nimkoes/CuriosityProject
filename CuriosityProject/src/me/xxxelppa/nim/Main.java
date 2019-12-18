package me.xxxelppa.nim;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iTotNumber;
        int iOneTime;
        Stack<Integer> stk = new Stack<Integer>();
        
        iTotNumber = sc.nextInt();
        iOneTime = sc.nextInt();
  
        int tmp = 0;
        for(int i = 0;; ++i) {
            tmp = iTotNumber - ((iOneTime + 1) * i) - 1;
            if(tmp <= 0) break;
            stk.push(tmp);
        }
  
        if(stk.get(stk.size()-1) <= iOneTime) System.out.println("F");
        else System.out.println("L");
        
        Iterator<Integer> itr = stk.iterator();
        while(itr.hasNext()) {
            System.out.println(stk.pop());
        }
        sc.close();
    }
}