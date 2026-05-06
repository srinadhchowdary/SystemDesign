public class HeightUp extends CharacterDecorator{
    
    
    public HeightUp(Character c){
        super(c);
    }
    
    @Override
    public String getAbilities() {
        return character.getAbilities()+" with Height Up";
    }
}
