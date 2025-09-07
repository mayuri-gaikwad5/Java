/*4. Interface – Sports
Create two interfaces Playable and Tournament. Implement them in Cricket
and Football. Demonstrate multiple interface implementation. */
// Interface 1
interface Playable {
    void play();
}

// Interface 2
interface Tournament {
    String getTournamentType();
}

// Cricket class implementing both interfaces
class Cricket implements Playable, Tournament {
    @Override
    public void play() {
        System.out.println("Playing Cricket with bat and ball...");
    }

    @Override
    public String getTournamentType() {
        return "Cricket World Cup";
    }
}

// Football class implementing both interfaces
class Football implements Playable, Tournament {
    @Override
    public void play() {
        System.out.println("Playing Football with a round ball...");
    }

    @Override
    public String getTournamentType() {
        return "FIFA World Cup";
    }
}
public class Sports {
    public static void main(String[] args)
    {
        Playable p1 = new Cricket();
        Tournament t1 = new Cricket();

        Playable p2 = new Football();
        Tournament t2 = new Football();

        System.out.println("=== Cricket ===");
        p1.play();
        System.out.println("Tournament: " + t1.getTournamentType());

        System.out.println("\n=== Football ===");
        p2.play();
        System.out.println("Tournament: " + t2.getTournamentType());
    }
}
/*Output
 === Cricket ===
Playing Cricket with bat and ball...
Tournament: Cricket World Cup

=== Football ===
Playing Football with a round ball...
Tournament: FIFA World Cup
 */