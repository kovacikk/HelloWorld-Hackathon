import javax.swing.*;
import java.util.*;

public class WheelRPG {
    final static String welcome = "Welcome to Hweely Good RPG in honor of Professor Dunsmore and his Hweel Class";

    final static String inroduction = "The good man Buster Dunsmore is traveling in the name of Computer Science." + "\n" +
            "During his travels he goes to Indiana University where CS students there are in despair because their codes have failed to compile correctly." + "\n" +
            "It's up to you fix this and bring order once again." + "\n";
    final static String rpgSetUP = "You see one kid coded a VR game in Java, for some reason. He tells you it runs but there are still some and seeing how curious you are about how well an IU kid's game is, you decide play it." + "\n" +
            "You put on the headset and the kid runs the program and the virtual world starts to form around Dunsmore and and prompt opens up.";
    final static String charClass = "Hello [Player] to the world of Wheeltopia, please select what class you want to choose." + "\n" +
            "(1) Computer Engineer" + "\n" + "(2) Mechanical Engineer" + "\n" + "(3) Aviation Engineer";

    final static String plot1act1 = "Act 1" + "\n" + "\n" + "You as [Player] work well paid job at [Company] and every day to take a nice mourning commute with racecar there by going to the local McDonald" + "\n" + "\n" +
            "Dunsmore said: There are a lot of errors and and lack of detail here." + "\n" +
            "The kid said: I'm sort of lazy." + "\n" + "\n" +
            "On way to work after getting the Biggest of Breakfasts you see on a giant TV screen in the center of town that nearly 85% of America uses machine production." + "\n" +
            "[Player] thought to [your]self: My job could be next, it could happen to me any day now." + "\n" +
            "Dunsmore then noticed the Michelin Man walk by in the virtual world and wondered why he's there, but didn't think much of it." + "\n" +
            "While distracted his vehicle gets hit in a collision. Dunsmore gets out to check what he hit and finds out it's a wheel." + "\n" + "\n" +
            "Dunsmore thinks to himself: Is this supposed to happen" + "\n" + "\n" +
            "Before he could ask the kid what's going on the wheel jump at him and the game battle screen opened up." + "\n" + "\n" +
            "Dunsmore asked: What do I do?" + "\n" +
            "The kid responded: You fight it." + "\n" + "\n";

    final static String plot1act2 = "Dunsmore clearly had enough of this and paused to the game and tried to take the headset off but it wouldn't budge." + "\n" +
            "Dunsmore asked: Why won't this come off?" + "\n" + "The kid responded: I don't know sir, it looks like it's stuck to your face. The harness around your head is fairly loose so I don't know why it's doing this. Let me get some help. Just keep playing in the mean time." + "\n" +
            "Dunsmore unpaused the game and saw people running in panic. He looked back at the direction they were fleeing from and saw a gaggle of wheels." + "\n" + "\n" +
            "Dunsmore just screamed: HWWEELLSS and just stated running." + "\n" + "\n" +
            "He kept running until he found himself in an alleyway and started hearing a voice." + "\n" + "\n" +
            "All citizens of Wheeltopia escape while you can!!" + "\n" +
            "Dunsmore thought to himself: What's the point of all this, the kid never told me what my goal was." + "\n" + "\n" +
            "He then heard something moving about in the dumpster." + "\n" + "\n" +
            "Dunsmore yelled: Who's there?!?" + "\n" + "\n" +
            "A small creature came out and introduced itself: " +
            "Hi, I'm the Robot Class" + "\n" + "\n" +
            "The Robot Class was a small white robot with a screen for a face that displayed emotions via emoticons a la George Lopez." + "\n" + "\n" +
            "Dunsmore said: Hi there little fella, do happen to know what's going on by chance?" + "\n" + "\n" +
            "The Robot Class then explained that someone tampered with the factory's code for the machine production line and somehow all the wheels are turning evil." + "\n" + "\n" +
            "Before it could explain any further a wheel appeared and jumped them and the battle begins" + "\n" + "\n";
    final static String plot1act3 = "\n" + "\n" + "The Robot Class exclaimed: Please [Player], you must help save this town from destruction." + "\n" +
            "Dunsmore replied: Don't worry little one, I know my code" + "\n" + "\n" + "ACT 1 FIN" + "\n" + "\n" + "\n";

    //ACT2
    final static String plot2act1 = "Act 2" + "\n" + "\n" + "Dunsmore and the Robot Class both went on their way to the Good Year Tire factory the source of all of this." + "\n" + "\n" +
            "Dunsmore asked: Do you know who would do this." + "\n" +
            "The Robot Class responded with: I'm not sure, I'm just a simple Robot class with out a constructor. My creator died saving me. That how you found me in the dumpster." + "\n" + "\n" +
            "Dunsmore realizing this was all fake was still touched by the Robot Class's story but before he could add anything another tire attacked the two." + "\n" + "\n";
    final static String plot2act2 = "\n" + "\n" + "Dunsmore took a deep breath, this was all virtual yet it felt very real." + "\n" + "\n" +
            "Dunsmore asked: How far would you say we are from the plant." + "\n" +
            "The Robot Class responded with: I don't know, my program doesn't come with GPS installed." + "\n" +
            "Dunsmore added: Then we better get to high ground to see where we are heading." + "\n" +
            "The Robot Class responded with: Let me take a look" + "\n" + "\n" + "The Robot Class looked around and saw the factory and all the wheels coming out of it and came down and pointed in the direction where the factory was located." + "\n" + "\n" +
            "After walking for nearly an hour in-game time they saw factory within the distance." + "\n" + "\n" +
            "The Robot Class said: We're almost there sir." + "\n" +
            "Dunsmore responded with: Excellent." + "\n" +
            "The Robot Class exclaimed: Detecting Hostiles!" + "\n" +
            "Dunsmore shouted: Now you tell me." + "\n" + "\n" + "A Forged Steel Wheel appeared" + "\n" + "\n";
    final static String plot2act3 = "\n" + "\n" + "Dunsmore said: They are getting tougher it seems. Are you alright?" + "\n" +
            "The Robot Class responded with: I believe so." + "\n" +
            "Dunsmore exclaimed: Let's go for it then!" + "\n" + "\n" +
            "The pair walked up to the door and open only to be greeted by a GIANT Ferris Wheel nearly crushing the two." + "\n" + "\n" +
            "Dunsmore cryed out: Why is there a Ferris Wheel in a tire factory!" + "\n" + "\n";
    final static String plot2act4 = "Dunsmore getting fed up with this asked to see if the kid was there again." + "\n" + "\n" +
            "The kid responded: Yeah I'm here." + "\n" +
            "Dunsmore asked: Did you get help." + "\n" +
            "The kid responded with a plain: No." + "\n" +
            "Dunsmore then asked: Well why not?!?" + "\n" +
            "The merely said: Cause." + "\n" +
            "Dunsmore, clearly angry, stated: Young man if you don't help me get out of you'll get the whoppen of a life time." + "\n" +
            "The kid responded with: Whatever you say won't let you go till you say Miami University it the best." + "\n" +
            "Dunsmore responded: Miami?! I thought you were from IU!" + "\n" +
            "The kid repsonded with: Nope, born and raised in Ohio. But as long as you say Purdue sucks and Miami or IU rules then I'll let you free." + "\n" +
            "Dunsmore responded with fiery passion: Never! I'll beat this silly game and then I'll show you why Purdue will always be on top." + "\n" +
            "The kid walked away and responded with: Have fun gramps!" + "\n" +
            "Dunsmore asked: What did you even use?" + "\n" +
            "The kid responded with: Superglue."
            + "\n" + "ACT 2 FIN" + "\n" + "\n";

    final static String plot3act1 = "ACT 3" + "\n" + "\n" + "Dunsmore reentered the game world for the final act, prepared for the worst." + "\n" + "\n" +
            "The Robot Class asked: Why were you standing there ignoring everything sir?" + "\n" +
            "Dunsmore responded: It's beyond your comprehension. Let go." + "\n" + "\n" +
            "As the two walked in they noticed that the factory lines were fully operational with wheels being produced." + "\n" + "\n" +
            "Dunsmore said: I reckon if we find the main computer with the program we can fix if from there. You think you can find it?" + "\n" +
            "The Robot Class responded: I'll do my best sir." + "\n" + "\n" +
            "After several minutes, the Robot Class came back." + "\n" + "\n" +
            "The Robot Class: I suspect that the main computer is on the production floor itself." + "\n" +
            "Dunsmore responded: Let's see if we can find it then." + "\n" + "\n" +
            "The pair moved towards the production line." + "\n" + "When the approached it, the lines stopped and everything was quiet." + "\n" + "\n" +
            "Dunsmore whispered: Do you sens-" + "\n" + "\n" +
            "Before he could finish, the hweel guardian of the production floor appeared" + "\n" + "\n" +
            "Dunsmore yelled: Here hweel go again!" + "\n" + "\n";
    final static String plot3act2 = "\n" + "\n" + "Dunsmore said: That took a lot more effort than it usually does." + "\n" + "\n" +
            "The Factory PA started ringing and the pair heard a voice coming through." + "\n" + "\n" +
            "Why are you ruining my plans, what do you have to gain by doing so." + "\n" +
            "Dunsmore yelled: Who are you?!?" + "\n" +
            "Think about it Buster, you've seen me before in this world." + "\n" + "\n" +
            "Dunsmore though for a minute before it hit him." + "\n" + "\n" +
            "Michelin Man!!" + "\n" + "\n" +
            "A door was opened from the other side and out came the Micielin Man." + "\n" + "\n" +
            "Dunsmore said: So it was you the whole time, I wondered why I saw you about in the city. So why do this." + "\n" + "\n" +
            "The Michelin Man responded: Well why not I suppose." + "\n" +
            "Dunsmore thought to himself: That kid really did program this game." + "\n" +
            "Dunsmore exclaimed: For the sake of proving your creator wrong, I'll defeat you in battle" + "\n" + "\n";

    final static String plot3act3 = "\n" + "\n" + "The Michelin Man was on the ground in defeat." + "\n" + "\n" +
            "Dunsmore said confidently: It's time to fix some code." + "\n" + "\n" +
            "Without hims noticing, the Michelin Man grabbed a tire and threw it at Dunsmore." + "\n" +
            "He turned around and saw the tire flying at him unable to anything until he was saved by the Robot Class" + "\n" +
            "Dunsmore ran to the Robot Class, but before he could say anything. It's monitor died and all that was left was an empty shell." + "\n" +
            "Dunsmore held the shell in his hands before he realized what he must do." + "\n" + "\n" +
            "Dunsmore yelled: MICHELIN MAAN! and rushed at him";
    final static String finale = "\n" + "\n" + "The Michelin Man started deflating on the ground and Dunsmore stood over him triumphantly. Now to end this once for all." + "\n" + "\n" +
            "He walked over the the main computer and turn the boolean method for evil to false and all the tire rolling about the city stopped in their tracks and peace was achieved." + "\n" + "\n" +
            "Just as he did that, Logan Kulinski took the headset off Dunsmore." + "\n" + "\n" +
            "Dunsmre asked: Logan how did you find me?" + "\n" +
            "Logan responded: Hotseat. Plus I ran that kid out of here." + "\n" + "\n" +
            "Thanks Logan, let's go home." + "\n" + "\n" +
            "As they got to the car and Dunsmore looked at the wheel and thought to himself: Yup, that's ruined for me." + "\n" + "\n" + "\n" +
            "FIN!";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int charChoice;
        int encounter1;
        int encounter2;
        int encounter3;
        int encounter4;

        System.out.println(welcome);
        System.out.println(inroduction);
        System.out.println(rpgSetUP);
        System.out.println(charClass);
        charChoice = sc.nextInt();
        Player p = new Player(charChoice);


        System.out.println(plot1act1);


        //Combat
        Combat c = new Combat();
        encounter1 = rnd.nextInt(10) + 1;
        if (encounter1 <= 5) {
            Enemy e = new Enemy("Hwooden Hweel", 40, 12, 10, 3, "I think this one is Oak!");
            c.battle(e, p);
        } else if (encounter1 > 6) {
            Enemy e = new Enemy("Stone Hweel", 40, 15, 15, 5, "That's Rock Solid!");
            c.battle(e, p);
        }


        System.out.println(plot1act2);

        encounter2 = rnd.nextInt(10)+1;
        if (encounter2 <= 5){
            Enemy e = new Enemy("Cast Iron Hweel", 60, 7, 15, 5, "This one must have some iron solid defence!");
            c.battle(e, p);
        }
        else if (encounter2>6){
            Enemy e = new Enemy("Square Hweel", 60, 20, 10, 5, "Is this a wheel at this point.");
            c.battle(e,p);
        }

        System.out.println(plot1act3);

        //Act 2

        System.out.println(plot2act1);
        encounter3 = rnd.nextInt(10)+1;
        if (encounter3<=5){
            Enemy e = new Enemy("Aluminum Hwell", 70, 14, 15, 7, "It's the third hweel!");
            c.battle(e, p);
        }
        else if (encounter3>6){
            Enemy e = new Enemy("Water Hweel", 100, 18,10,7, "Land hoo!");
            c.battle(e,p);
        }


        System.out.println(plot2act2);

        //Combat 2

        Enemy e = new Enemy("Forged Steel Hweel", 70, 15, 10, 10, "I wouldn't Steel anything from this one.");
        c.battle(e, p);
        System.out.println(plot2act3);

        //Combat3
        encounter4 = rnd.nextInt(10)+1;
        if (encounter4<=5){
            e = new Enemy("Ferris Hweel ", 100, 20, 50, 13, "What is this doing here!?!");
            c.battle(e, p);
        }
        else if (encounter4>6){
            e = new Enemy("X-treme Forged V-Grove Cast Iron Aluminium Steel Core Hweel", 250, 25, 70,15, "Read that name out three times in a row");
            c.battle(e,p);
        }

        System.out.println(plot2act4);

        //ACT 3
        System.out.println(plot3act1);

        e = new Enemy("Monster Truck Hweel", 200, 25, 15, 15, "The bigger they are, the harder they fall.");
        c.battle(e, p);

        System.out.println(plot3act2);

        e = new Enemy("Michelin Man", 500, 45, 15, 50, "That ain't the Pillsbury Doughboy");
        c.battle(e, p);

        System.out.println(plot3act3);

        p.setIsSnowballDeadToTrue();
        System.out.println("You now have access to your Ultimate Technique");
        e = new Enemy("Michelin Man (Stage 2)", 1000, 90, 15, 100, "Do you honestly read this still.");
        c.battle(e, p);

        System.out.println(finale);

        System.out.println("Press any button to see credits!!");
        String b = sc.next();
        if (b == "") {
            JOptionPane.showMessageDialog(null, "Credits go to: " + "\n" + "Kyle K. - Lead Programmer" + "\n" + "Jesse G.- Writer and Secondary Programmer", "Credits", 0);
            JOptionPane.showMessageDialog(null, "Special Thanks to the One and Only Professor Dunsmore", "Credits", 0);
            JOptionPane.showMessageDialog(null, "Special Thanks as well to:" + "\n" + "Reece C., Wynn S. Colin H., Gavin W., Logan K." + "\n" + "Andrew D., Jake H., Alex C.(From XTern)" + "\n", "Credits", 0);

        }

    }
}


