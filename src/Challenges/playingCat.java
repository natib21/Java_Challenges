package Challenges;

public class playingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,22));
    } public static boolean isCatPlaying(boolean summer,int temperature){
        if(temperature >= 25 && temperature <= 35 && summer == false){
            return true;
        }else if(summer == true && temperature >= 25 && temperature <= 45){
            return true;
        }else{
            return false;
        }
    }
}
