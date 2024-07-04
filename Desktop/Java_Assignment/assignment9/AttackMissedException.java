// Custom exception for when an attack misses
package assignment9;
public class AttackMissedException extends Exception {
    public AttackMissedException(String message){
        super(message);
    }
}
