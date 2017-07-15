package minitwitter;

/**
 *
 * @author Bryan
 * Controller creates new window for user selected in TreeView.
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
