public class Main {
    public static void main(String[] args) {

        boolean isAlien = false;

        if (!isAlien) {
            System.out.println("It is not an alien!");
        } else {
            System.out.println("It is an alien!");
        }
    }
}
/*
boolean isAlien = false;

if (isAlien == false) {     // true, mert false == false
    // Ez lefut!
}

if (isAlien) {              // false
    // Ez NEM fut le!
}

if (!isAlien) {             // true (false megfordítva)
    // Ez lefut!
}
Egyszerűen:

If feltétel akkor fut le, ha true
isAlien = false esetén:

if (isAlien) → if (false) → nem fut
if (!isAlien) → if (true) → lefut
if (isAlien == false) → if (true) → lefut



Szóval a false érték miatt pont hogy nem fut le az if (isAlien),
 csak akkor, ha megfordítod vagy explicit összehasonlítod!
 */