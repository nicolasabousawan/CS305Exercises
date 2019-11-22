package ex3;

public interface ComputerFactory {
    Computer createComputer();

    /*
    This creates the interface to build the computer. Both a server and a PC are a computer
    object - This means we will create server objects and PC objects first and then convert them
    into computer objects after.
    the reason we do this is so we can create both objects using the same method and we do not
    need to know what "subtype" it is when processing the objects.


    As shown in the other factories - we create an object that is a PC/server but not quite
    Then we use the create computer method to allow us to create a computer regardless of whether
    it was a server or PC
     */
}
