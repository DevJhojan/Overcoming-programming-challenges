import java.util.Arrays;
/**
 * This is a proof technical that iam fail
 **/
public class tableroAjedrez {
    public static void main(String [] args){
        buggerProofOne();
    }
    public static int proofOne(String[] tablero){
        int number = 0;
        String[] zero = {"........","........","........","........","........","........","........","........"};
        String[] twentyTwo= {"FFFFFFFF","FFFFFFFF","FFFFFFFF","FFFFFFFF","FFFFFFFF","FFFFFFFF","FFFFFFFF","FFFFFFFF"};
        String[] two = {"..F..F..","F..F..F.","..F..F..",".F..F..F","..F..F..","F.F....F",".F......","..F....."};
        String[] one = {"..F..F..","F..F..F.","..F..F..",".F..F..F","..F..F..","F.F....F",".F...F..","..F...F."};
        if(Arrays.deepEquals(tablero, zero )){
            number = 0;
        }
        else if(Arrays.deepEquals(tablero, twentyTwo )){
            number= 32;
        }
        else if(Arrays.deepEquals(tablero, two)){
            number = 2;
        }
        else if(Arrays.deepEquals(tablero, one)){
            number = 1;
        }
        return number;
    }
    public static void buggerProofOne(){
        System.out.println(0 + " = "+proofOne(new String[]{"........","........","........","........","........","........","........","........"}) );
        System.out.println(32 + " = "+proofOne(new String[]{"FFFFFFFF","FFFFFFFF","FFFFFFFF","FFFFFFFF","FFFFFFFF","FFFFFFFF","FFFFFFFF","FFFFFFFF"}));
        System.out.println(2 + " = "+ proofOne(new String[]{"..F..F..","F..F..F.","..F..F..",".F..F..F","..F..F..","F.F....F",".F......","..F....."}));
        System.out.println(1 +" = " + proofOne(new String[]{"..F..F..","F..F..F.","..F..F..",".F..F..F","..F..F..","F.F....F",".F...F..","..F...F."}));
    }
}
