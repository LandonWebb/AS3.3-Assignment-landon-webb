
abstract class Skill {
    
    private String name;
    private String type;
    private int skillLevel;

   
    public Skill(String name, String type, int skillLevel) {
        this.name = name;
        this.type = type;
        this.skillLevel = skillLevel;
    }

    
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

   
    public abstract void identifySkill();
}


class HardSkill extends Skill {
    public HardSkill(String name, int skillLevel) {
        super(name, "Hard", skillLevel);
    }

   
    public void identifySkill() {
        System.out.println("Hard Skill of " + getName() + " has a level of " + getSkillLevel());
    }
}


class SoftSkill extends Skill {
    public SoftSkill(String name, int skillLevel) {
        super(name, "Soft", skillLevel);
    }

    
    public void identifySkill() {
        System.out.println("Soft Skill of " + getName() + " has a level of " + getSkillLevel());
    }
}


class GiftSkill extends Skill {
    public GiftSkill(String name, int skillLevel) {
        super(name, "Gift", skillLevel);
    }

   
    public void identifySkill() {
        System.out.println("Gift Skill of " + getName() + " has a level of " + getSkillLevel());
    }
}


class TalentSkill extends Skill {
    public TalentSkill(String name, int skillLevel) {
        super(name, "Talent", skillLevel);
    }

   
    public void identifySkill() {
        System.out.println("Talent Skill of " + getName() + " has a level of " + getSkillLevel());
    }
}


public class Main {
    public static void main(String[] args) {
      
        Skill programming = new HardSkill("Programming", 6);
        Skill negotiation = new SoftSkill("Negotiation", 8);
        Skill empathy = new GiftSkill("Empathy", 7);
        Skill leadership = new TalentSkill("Leadership", 9);

        
        programming.identifySkill();
        negotiation.identifySkill();
        empathy.identifySkill();
        leadership.identifySkill();
    }
}
