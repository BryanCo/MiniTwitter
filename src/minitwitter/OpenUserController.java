package minitwitter;

/**
 *
 * @author Bryan
 */
class OpenUserController extends ButtonPanelController{
    
    public OpenUserController(TreeView tree) {
        super(tree);
    }
    
    @Override
    public void doAction(){
        new UserWindow(tree);
    }
}
