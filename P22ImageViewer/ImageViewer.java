
import java.awt.* ;
import java.io.* ;
import javax.swing ;

/*
 * A program for viewing images.
 * @version 1.30 2014-02-27
 * @author Cay Horstmann
 */

public class ImageViewer{
  public static void main(String [] args){
    EventQueue.incokeLater(() -> {
      JFrame frame = new ImageViewerFrame() ;
      frame.setTitle("ImageViewer") ;
      
    });  
  }
}
