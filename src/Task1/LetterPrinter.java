package Task1;

public class LetterPrinter {

    private LetterPrinter(){


    }

    public static void methodA(String input){
        if(!input.equals("boring")) {
                System.out.println("J");
            if (input.length() > 3){
                System.out.println("b");
            }else{
                methodB(true,0);
                methodD(input.length());
            }
        }else{
            System.out.println("c");
        }
    }
    public static void methodA(String input,boolean input2){
        if(!input.equals("boring")) {
            System.out.println("J");
            if (input.length() > 3){
                System.out.println("b");
            }else{
                methodB(true,0);
                methodD(input.length());
            }
        }else if(input2){
            System.out.println("e");
            methodC(input.length());
        }else{
            System.out.println("s");
            methodC(2);
        }
    }

    public static void methodB(boolean input,int input2){
        if(!input) {
            System.out.println("");
            if(input2 == 0) {
                methodA("boring", true);
            } else if(input2 == 1){
                methodA("boring", false);
                /// nået her til!! mengler at skrive J O V T
            }
        }else{
            System.out.println("a");
        }
    }
    public static void methodC(int input) {
        if (input * 2 == 6) {
            methodB(true, 0);
            methodB(false, 0);
        } else if (input > 5) {
            System.out.println("r");
            methodB(false, 1);
        } else if(input == 2) {
            System.out.println("j");
            methodD(input);
            System.out.println("v");
        }else{
            System.out.println("t");
        }
    }
    public static void methodD(int input){
        if(input%2 != 0) {
            System.out.println("v");
            methodC(input);
        }else if(input == 2){
            System.out.println("o");
        }
    }
}
