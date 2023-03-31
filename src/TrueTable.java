public class TrueTable {
    public static boolean AND(boolean x, boolean y){
        if((x == y)&& x == true){
            return true;
        }
        return false;
    }
    public static boolean OR(boolean x, boolean y){
        if(x || y){
            return true;
        }
        return false;
    }
    public static boolean XOR(boolean x, boolean y){
        if(x!=y){
            return true;
        }
        return false;
    }
    public static boolean NOT(boolean x){
        return !x;
    }
    public static String ListOfTabel(boolean x,boolean y){
        return (x+"  |  "+y+"  |  "+AND(x,y)+"  |  "+OR(x,y)+"  |  "+XOR(x,y)+"  |  "+NOT(x));
    }
}
