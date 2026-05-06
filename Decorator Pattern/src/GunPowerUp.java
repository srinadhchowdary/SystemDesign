public class GunPowerUp extends CharacterDecorator{
    
    
    public GunPowerUp(Character c){
        super(c);
    }
    
    @Override
    public String getAbilities() {
        return character.getAbilities()+" With Gun";
    }
}
