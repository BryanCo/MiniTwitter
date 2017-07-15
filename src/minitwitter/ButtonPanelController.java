package minitwitter;

import javax.swing.JTextField;

/**
 *
 * @author Bryan
 * Abstract class for a controller that references a TreeView data model.
 */
abstract class ButtonPanelController implements ControllerInterface{
    protected TreeView tree;

    ButtonPanelController(TreeView tree){
        this.tree = tree;
    }

    public TreeView getTree() {
        return tree;
    }
    
    public void doAction(){};
}
