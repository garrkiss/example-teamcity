package plaindoll;

import java.util.Random;

public class Welcomer {

    private final String[] hunterReplies = {
        "The path of the hunter is never easy.",
        "Every hunter has a story worth telling.",
        "Even the strongest hunter must rest sometimes."
    };

    public String sayWelcome() {
        return "Welcome home, good hunter. What is it your desire?";
    }

    public String sayFarewell() {
        return "Farewell, good hunter. May you find your worth in waking world.";
    }

    public String sayNeedGold() {
        return "Not enough gold";
    }

    public String saySome() {
        return "Something in the way";
    }

    public String sayHunterReply() {
        Random random = new Random();
        int index = random.nextInt(hunterReplies.length);
        return hunterReplies[index];
    }
}
