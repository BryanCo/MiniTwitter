package minitwitter;

/**
 *
 * @author Bryan
 * The interface for the classes that need to be a visitor
 * 
 */
public interface Visitor{
    public void visit(IndividualUser individualUser);
    public void visit(UserGroup userGroup);
}
