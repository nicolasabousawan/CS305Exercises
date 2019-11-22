package ex3;

public class PCFactory implements ComputerFactory{
/*
We cannot extend computer class as there is no default costructor

We use the computer factory interface to allow the PC object to be created and converted
into a PC (as shown by the override function)
We use the PCFactory constructor as a building block to "prep the parts for construction"
and then turn it into the computer object.

 */
    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}
