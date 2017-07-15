package minitwitter;

/**
 *
 * @author Bryan
 * The interface for the visitable classes.
 */
public interface Visitable {
  public void accept(Visitor visitor);
}
