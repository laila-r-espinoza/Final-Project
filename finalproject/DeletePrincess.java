package finalproject;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class DeletePrincess {
    
 
    /**
     * deletes the princess of your choice
     * @param pri 
     */
    public static void delete(ArrayList<Princess> pri){
       String name = JOptionPane.showInputDialog("Enter a Name to Delete");
        for (int i = 0; i < pri.size(); i++) {
            if(pri.get(i).equals(name))
            {
                String asdf = JOptionPane.showInputDialog("Are You Sure You want to delete " + name);
                if(asdf.contains("Y")){
                    pri.remove(i);
                }
                
            }
            
        }
        
    
    }
}
