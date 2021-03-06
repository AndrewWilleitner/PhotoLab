package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
////////////////////////new methods///////////////////////////////////// 
  
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.KeepOnlyBlue();
    beach.explore();
  }
  
  /** Method to test keepOnlyRed */
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("beach.jpg");
    beach.KeepOnlyRed();
    beach.explore();
  }
  
  /** Method to test keepOnlyGreen */
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("beach.jpg");
    beach.KeepOnlyGreen();
    beach.explore();
  }
  
  
  /** Method to test Negate */
  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.Negate();
    beach.explore();
  }
  
  
  /** Method to test Grayscale */
  public static void testGrayscale()
  {
    Picture beach = new Picture("beach.jpg");
    beach.Grayscale();
    beach.explore();
  }
  
  /** Method to test FixUnderwater */
  public static void testFixUnderwater()
  {
    Picture water = new Picture("water.jpg");
    water.FixUnderwater();
    water.explore();
  }
  
  /** Method to test MirrorVerticalRightToLeft */
  public static void testMirrorVerticalRightToLeft()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.MirrorVerticalRightToLeft();
    swan.explore();
  }
  
  /** Method to test MirrorHorizontal */
  public static void testMirrorHorizontal()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.MirrorHorizontal();
    beach.explore();
  }
  
  /** Method to test MirrorHorizontalBottomToTop */
  public static void testMirrorHorizontalBottomToTop()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.MirrorHorizontalBottomToTop();
    beach.explore();
  }
  
  /** Method to test CheckerboardFilter */
  public static void testCheckerboardFilter()
  {
    Picture  beach = new Picture("beach.jpg");
    beach.explore();
    beach.checkerboardFilter();
    beach.explore();
  }
  
  /** Method to test RotateColorFilter */
  public static void testRotateColorFilter()
  {
    Picture beach = new Picture("beach.jpg");
    beach.rotateColorFilter();
    beach.explore();
  }
  
  /** Method to test MirrorDiagonal */
  public static void testMirrorDiagonal()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.MirrorDiagonal();
    swan.explore();
  }
  
  
  public static void testChromakey()
  {
    Picture front = new Picture("blue-mark.jpg");
    Picture background = new Picture("springtrap-jumpscare.jpg");
    front.explore();
    front.chromakey(front, background);
    front.explore();
  }
    
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//    testZeroBlue();
//    testKeepOnlyBlue();
//    testKeepOnlyRed();
//    testKeepOnlyGreen();
//    testNegate();
//    testGrayscale();
//    testFixUnderwater();
//    testMirrorVertical();
//    testMirrorVerticalRightToLeft();
//    testMirrorHorizontal();
//    testMirrorHorizontalBottomToTop();
//    testCheckerboardFilter();
//    testRotateColorFilter();
//    testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
//    testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}