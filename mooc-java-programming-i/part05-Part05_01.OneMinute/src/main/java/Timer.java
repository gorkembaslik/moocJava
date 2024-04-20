/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GORKEM
 */
public class Timer {
    private ClockHand secHun;
    private ClockHand sec;
    
    public Timer() {
        this.secHun = new ClockHand(100);
        this.sec = new ClockHand(60);
    }
    
    public void advance() {
        this.secHun.advance();
        
        if (this.secHun.value() == 0){
            this.sec.advance();
            
        }
    }
    
    public String toString(){
        return sec + ":" + secHun;
    }
}
