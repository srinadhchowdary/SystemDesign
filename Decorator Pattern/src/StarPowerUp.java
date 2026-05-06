public class StarPowerUp extends CharacterDecorator{
    
    
    public StarPowerUp(Character c){
        super(c);
    }
    
    @Override
    public String getAbilities() {
        return character.getAbilities() + " with Star Power ( Limited Time) ";
    }
}
