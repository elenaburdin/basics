package Game;

public class EncapsulationSimpleApp {

        public static void main(String[] args) {
            
            Medic goodMedic = new Medic("Valera");
            Medic badMedic = new Medic("Vovan");
            
            Sniper accurateSniper = new Sniper("Killan");
            Sniper missSniper = new Sniper("Looser");
            
            accurateSniper.shoot(badMedic);
            accurateSniper.shoot(missSniper);
            
            goodMedic.heal(badMedic);
            goodMedic.heal(missSniper);
            
            //ne daiot 50 points
            goodMedic.printInfo();
            badMedic.printInfo();
            accurateSniper.printInfo();
            missSniper.printInfo();

        }

    }

    // Medic, Sniper
    class Player {
        
        private String  name;
        private int     score;
        private int     hp;
        private boolean alive;
        
        Player () { // default
            
        }
        
        Player (String name) {
          setName(name);
          setHp(100); // health
          setScore(0); // points
          setAlive(true);
          
        }

        void setName(String name) {
                this.name = name;
        }

        String getName() {
            return name;
        }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
        	if(hp >= 0 && hp <= 100)
    		    this.hp = hp;
            if(hp == 0)
                setAlive(false);
        }

        public int getScore() {
            
            return score;
        }

        public void setScore(int score) {
        	this.score = score;

        }

        public boolean isAlive() {
            return alive;
        }

        public void setAlive(boolean alive) {
            this.alive = alive;
        }
        
        public void printInfo(String playerId) {
            System.out.println("#########################" + playerId + "########################");
            System.out.printf("%18s %3dHP %5dPoints %s\n", name, hp, score, alive?"ok":"X"); //HW: alive -> ok, dead -> X
            System.out.println("#########################################################");
        }
    }

////////////// Descendants //////
class Medic extends Player {
    
    Medic (String name) {
        super(name);

        }
    // overload - > polymorphism
    // self heal
    public void heal() {
        setHp(100);
    }
    // heal somebody else
    public void heal(Player other) {
        other.setHp(100);
        setScore(getScore() + 50);
    }
//  public void heal(Sniper other) {
//      other.setHp(100);
//      setScore(getScore() + 50);
//  }
    public void printInfo() { // hw2 super logic
        
        super.printInfo( " MEDIC " );
        //System.out.println("######################### MEDIC ########################"); 
        //System.out.printf("%18s %3dHP %5dPoints ???\n", getName(), getHp(), getScore()); //HW: alive -> ok, dead -> X
        //System.out.println("#########################################################");
    }
}
class Sniper extends Player {
    Sniper (String name) {
        super(name);
    }
    public void shoot(Player other) {
        other.setHp(0);
        setScore(getScore() + 10);
    }
//  public void shoot(Sniper other) {
//      other.setHp(0);
//      setScore(getScore() + 10);
//  }
        // override
        public void printInfo() {
        System.out.println("######################### SNIPER ########################"); 
        System.out.printf("%18s %3dHP %5dPoints ????\n", getName(), getHp(), getScore()); //HW: alive -> ok, dead -> X
        System.out.println("#########################################################");
 }
}

