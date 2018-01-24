/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenkins;

import java.util.ArrayList;

/**
 *
 * @author josh
 * 
 */
public class JenkinsDemo {
    private int[] intArr;
    private ArrayList<String> al;

    public ArrayList<String> getAl() {
        return al;
    }

    public void setAl(ArrayList<String> al) {
        this.al = al;
    }

    public int[] getIntArr() {
        return intArr;
    }

    public void setIntArr(int[] intArr) {
        this.intArr = intArr;
    }
    
    public JenkinsDemo() {
        intArr = new int[10];
        
        for(int i = 0; i < 10; i++) {
            intArr[i] = i;
        }
        
        al = new ArrayList<>();
        
        
    }
    
    public void addString(String s) {
        al.add(s);
    }
}
