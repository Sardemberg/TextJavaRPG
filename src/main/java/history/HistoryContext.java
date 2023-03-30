/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package history;

/**
 *
 * @author sardemberg
 */
public class HistoryContext{
    private HistoryStep step;
    
    public HistoryContext(HistoryStep step){
        this.step = step;
    }
    
    public Object executeStep(){
        return step.execute();
    } 
    
    public void setStep(HistoryStep step){
       this.step = step;
    }
}
