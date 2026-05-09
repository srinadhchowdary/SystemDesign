package SubSystems;

public class BIOS {
    
    public void boot(CPU cpu,Memory memory){
        System.out.println("BIOS: Booting CPU and Memory Checks...");
        cpu.initialize();
        memory.selfTest();
    }
}
