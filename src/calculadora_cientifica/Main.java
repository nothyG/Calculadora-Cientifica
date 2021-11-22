/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora_cientifica;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.*;
/**
 *
 * @author nothyG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ScriptException{
        ScriptEngine engine = new ScriptEngineManager(null).getEngineByName("ECMAScript");
        System.out.println(engine.eval("2*3-(11*2)").toString());
        Calculadora cl = new Calculadora();
        cl.setVisible(true);
    }
    
}
