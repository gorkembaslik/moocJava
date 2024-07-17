/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GORKEM
 */
import java.util.ArrayList;


public class Average {
    private ArrayList<Integer> list;
    
    public Average(){
        this.list = new ArrayList<>();
    }
    
    public void add(int val){
        if (val<0 || val>100){
            return;
        }
        
        this.list.add(val);
    }
    
    public void print(){
        double sum = 0;
        double passingSum=0;
        int numberOfPassing=0;
        
        for (int points:list){
            sum+=points;
            if (points>=50){
                passingSum+=points;
                numberOfPassing++;
            }
        }
        System.out.println("Point average (all): "+ sum/this.list.size());
        
        if (numberOfPassing>0){
            System.out.println("Point average (passing): "+passingSum/numberOfPassing);
        } else {
            System.out.println("Point average (passing): -");
        }
        
        System.out.println("Pass percentage: "+ numberOfPassing/this.list.size()*100);
        System.out.println("Grade distribuiton:");
        for (int i=5;i>=0;i--){
            System.out.println(i+": "+ printStars(i));
        }
    }
    // the following methods are only for internal use of the class, and as such have been defined as private,
    // i.e. not shown to other classes
    
    private String printStars(int grade){
        int amount = 0;
        
        for (int points: list){
            if (convertToGrade(points) == grade){
                amount++;
            }
        }
        return stars(amount);
    }
    
    private int convertToGrade(int point){
        int grade = 5;
        if (point <50){
           grade = 0;
        } else if (point < 60){
           grade = 1;
        } else if (point < 70){
            grade = 2;
        } else if (point < 80){
            grade = 3;
        } else if (point < 90){
            grade = 4;
        }
        
        return grade;
    }
    
    private String stars(int n){
        String s = "";
        for (int i=0;i<n;i++){
            s+="*";
        }
        return s;
    }
}
