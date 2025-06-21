public class Main {
    public static void main(String[] args) {

        int topScore, mainScore;

        topScore=0;//incializálni kell feltétlenül
        mainScore=90;

        if (topScore > mainScore && topScore > 100){
            System.out.println("Greeter then mainScore = 100");

        }else if (topScore > 90 || mainScore == 90){
            System.out.println("Topscore is 90 good");
        } else if(topScore < mainScore) {
            System.out.println("Greeter then mainScore");
        }else{
            System.out.println("Topscore is 0.");
        }
    }
}
/*A sorrend számít mivel 90 pont van az elsi if ág
felülröl lefelé halladd tehát ha lentebb lenne  így
if (topScore > mainScore && topScore > 100){
            System.out.println("Greeter then mainScore = 100");

        }else if(topScore < mainScore) {
            System.out.println("Greeter then mainScore");
        }else if (topScore > 90 || mainScore == 90){//ez nem futna le
            System.out.println("Topscore is 90 good");
        }else{
            System.out.println("Topscore is 0.");
            akkor a90== else if ág nem futna le.
 */