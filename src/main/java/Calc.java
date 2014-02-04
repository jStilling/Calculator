import com.sun.xml.internal.ws.api.pipe.TubelineAssembler;

import java.util.Stack;

/**
 * Created by jstilling on 03.02.14.
 */

public class Calc {

    private int memory;
    //private Stack<Integer> = new Stack<Integer>;

    Calc(int startValue){
        memory = startValue;
    }

    public int add(int var1, int var2){
        return memory = var1 + var2;
    }

    public int addToMemory(int var){
        return this.add(memory, var);

    }

    public int sub(int var1, int var2){
        return memory = var1 - var2;
    }

    public int subFromMemory(int var){
        return this.sub(memory, var);
    }

    public int mult(int var1, int var2){
        memory = var1 * var2;
        return memory;
    }

    public int multWithMemory(int var){
        return this.mult(memory, var);
    }

    public int div(int var1, int var2){
        memory = var1 / var2;
        return memory;
    }

    public int divWithMemory(int var){
        return this.div(memory, var);
    }

    public int getMemory() {
        return memory;
    }
}
