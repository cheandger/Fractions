




import java.util.Random;


public class Main {

    //java -jar Fraction.jar "18\135" "sub" "7\93"
    //java -jar Fractions-1.0-SNAPSHOT.jar "18\135" "add" "7\93"
    //"18\135" "add" "7\93"




    public static void main(String[] args) throws Exception {
        ZR Z0 = new ZR(args[0]);
        ZR Z1 = new ZR(args[2]);

        ZR RESULT = null;

        switch (args[1]) {
            case "sum":
                RESULT = Z0.sum(Z1);
                break;
            case "sub":
                RESULT = Z0.sub(Z1);
                break;
            case "mul":
                RESULT = Z0.mul(Z1);
                break;
            case "div":
                RESULT = Z0.div(Z1);
                break;

        }


        ZR[] ZRArray = new ZR[256];
        Random random = new Random();
        for (int i = 0; i < ZRArray.length; i++) {
            int num = (short) (random.nextBoolean() ? 1 : -1 )*random.nextInt(Short.MAX_VALUE + 1);
            int den = (short) (random.nextBoolean() ? 1 : -1 )*random.nextInt(Short.MAX_VALUE + 1);

           /* short a = (short)n;
            short b = (short)d;
            Integer num = Integer.valueOf((short)a);
            Integer den = Integer.valueOf((short)b);//Alt method;*/

            if (den < 0)
                den = den * (-1);{

           ZRArray[i] = new ZR(num, den);
            }
            System.out.println(ZRArray[i]);
        }
        System.out.println(Z0.toString() + " " + args[1] + " " + Z1.toString() + " = " + RESULT.toString());




        }
            }





       // int indexOfMax(int[] array)

        /* for (int l = 0; l < ZRArray.length - 1; l++){
           ZR mincomden(ZRArray[l]);}


        int count = 0;
        for (int l = 0; l < ZRArray.length - 1; l++)
            if ((ZRArray[l].mincomden()) > ZRArray[l + 1]) {
                int temp = arrUnsort[i];
                arrUnsort[i] = arrUnsort[i + 1];
                arrUnsort[i + 1] = temp;
                count++;
            }
        if (count > 0) {
            bubbleSort(arrUnsort);*/



// Integer den1 = Integer.valueOf(a.getDen());
// Integer den2 = Integer.valueOf(b.getDen());


       // System.out.println(Z0.toString() + " " + args[1] + " " + Z1.toString() + " = " + RESULT.toString());




/* if(args[1].equalsIgnoreCase("sum")){
            RESULT=Z0.sum(Z1);
        } else if(args[1].equalsIgnoreCase("sub")){
            RESULT=Z0.sub(Z1);
        }else if(args[1].equalsIgnoreCase("mul")){
            RESULT=Z0.mul(Z1);
        }else if(args[1].equalsIgnoreCase("div")) {
            RESULT = Z0.div(Z1);*/




/* for (Integer k = 0; k < ZRArray.length-1; k++) {
            for (Integer j = ZRArray.length - 1; j > k; j++){

            ZR a = ZRArray[j].mincomden(ZRArray[j ]).evc();
            ZR b = ZRArray[j + 1].evc().mincomden(ZRArray[j]);
            Integer num1 = a.getNum();
            Integer num2 = b.getNum();

            if (num1 > num2) {
                ZR temp = ZRArray[j];
                ZRArray[j-1] = ZRArray[j - 1];
                ZRArray[j] = temp.evc();

                System.out.println(ZRArray[j]);
                }*/