package cursojava.execao;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
    public static void main(String[] args) {
        String text = "Anthony, curso Java, 90, 100, 80, 90";

        String[] valoresArray = text.split(",");

        System.out.println(valoresArray);

        //Convertendo Array em uma lista

        List<String> list = Arrays.asList(valoresArray);

        for(String valorString : list){
            System.out.println(valorString);
        }

        //Convertendo Lista em um Array
        String[] conversaoArray = list.toArray(new String[6]);
        System.out.println(conversaoArray);

        for(int pos = 0; pos < conversaoArray.length; pos++){
            System.out.println(conversaoArray[pos]);
        }
    }
}
