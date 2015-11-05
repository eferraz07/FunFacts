package insight.com.br.funfacts;

import java.util.Random;

/**
 * Created by Evandro on 15/10/2015.
 */
public class Facts {

    public String[] Mfacts = {
            "Ants stretch when they wake up in the morning.",
            "Only 1% of bacteria cause disease.",
            "If you fold a piece of A4 paper in half 44 times it will reach the moon.",
            "Until the 19th century, solid blocks of tea were used as money in Siberia",
            "The original name for butterfly was flutterby",
            "The Statue of Liberty arrived in New York City in 1885 aboard the French ship 'Isere'",
            "The Mona Lisa has no eyebrows. It was the fashion in Renaissance Florence to shave them off.",
            "21% of people don't make their bed in the morning.",
            "Polar bears have an excellent sense of smell, with the abiity to detect seals nearly a mile away.",
            "Coffee trees produce its first full crop after 5 years old.",
            "1 googol is the number 1 followed by 100 zeros.",
            "Is impossible to sneeze and keep one's eyes open at the same time.",
            "Whales can never focus both their eyes on the same object at once.",
            "Brazil accounts for almost 1/3 of the world's coffee production, producing over 3-1/3 billion pounds of coffee each year.",
            "Beavers can hold their breath for 45 minutes.",
            "Wonder Woman was the world's first comic book superheroine.",
            "Wonder Woman was introduced in All Star Comics in December 1941 and created by psychologist William Moulton Marston.",
            "Iowa has more independent telephone companies than any other state.",
            "Laser stands for 'Light Amplification by Stimulated Emission of Radiation.",
            "Humans have fewer muscles than a caterpillar.",
            "An enneahedron is solid with nine faces.",
            "A baby hippo is called a calf.",
            "Leonardo da Vinci invented scissors.",
            "All babies are color blind when they are born.",
            "Elephants are herbivores and can spend up to 16 hours days collecting leaves, twigs, bamboo and roots.",
            "Orange juice helps the body absorb iron easily when consumed with a meal.",
            "An amphibian can live both on land and in water.",
            "Xenophobia is the fear of strangers or foreigners.",
            "Lettuce is the worlds most popular green vegitable.",
            "Mystery writer Agatha Christie acquired her extensive knowledge of poisons while working in a hospital dispensary during World War I.",
            "The first artificial heart was patented by Paul Winchell in 1963.",
            "Dragonflies have six legs but cannot walk.",
            "Terrafugia is the world's first flying car."};

    public String getFact() {
        //The button was clicked, so update the fact with a new fact
        String fact = "";
        //Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new random generator

        int randomNumber = randomGenerator.nextInt(Mfacts.length);

        fact = Mfacts[randomNumber];
        return fact;

    }

}
