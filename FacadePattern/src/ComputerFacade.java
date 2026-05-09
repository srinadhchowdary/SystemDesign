import SubSystems.*;

public class ComputerFacade {
    
    
    private PowerSupply powerSupply = new PowerSupply();
    private BIOS bios = new BIOS();
    private HardDrive hardDrive = new HardDrive();
    private CoolingSystem coolingSystem = new CoolingSystem();
    private Memory memory = new Memory();
    private OperatingSystems operatingSystems = new OperatingSystems();
    private CPU cpu = new CPU();
    
    
    public void startComputer(){
        
        System.out.println("---- Starting Computer ----");
        powerSupply.providePower();
        coolingSystem.startFans();
        hardDrive.spinUp();
        bios.boot(cpu,memory);
        operatingSystems.load();
        System.out.println("Computer Booted Successfully");
    }
}
