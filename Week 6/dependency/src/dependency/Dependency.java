/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependency;

/**
 *
 * @author lenovo
 */
public class Dependency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Engine{
    public int cc;
    public String merek;
    public void On(){ 
        System.out.println("Mesin ON");
    }
    public void Off(){ 
        System.out.println("Mesin OFF");
    }
}
class Mobil{
    public int status;
    public void Start(Engine e)
    {
        e.On();
    }
    public void Run(){
        System.out.println("Run...!");
    }
    public void Stop(Engine e)
    {
        e.Off();
    }
}