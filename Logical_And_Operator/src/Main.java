public class Main {
    public static void main(String[] args) {

        int topScore, mainScore;

        topScore=0;//incializálni kell feltétlenül
        mainScore=80;

        if (topScore > mainScore && topScore > 100){
            System.out.println("Greeter then mainScore = 100");

        }else if(topScore < mainScore){
            System.out.println("Greeter then mainScore");

        }else{
            System.out.println("Topscore is 0.");
        }
    }
}