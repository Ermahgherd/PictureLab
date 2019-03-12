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
  
  public static void testkeepOnlyBlue()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.keepOnlyBlue();
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
  
  public static void testMirrorVerticalRighttoLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRighttoLeft();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontalToptoBottom()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalToptoBottom();
    caterpillar.explore();
  }
 
  public static void testMirrorHorizontalBottomtoTop()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBottomtoTop();
    caterpillar.explore();
  }
  
  public static void testmirrorDiagonalBottomLinetoTopLine()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.mirrorDiagonalBottomLinetoTopLine();
      beach.explore();
  }
  
  public static void testmirrorDiagonalTopLinetoBottomLine()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.mirrorDiagonalBottomLinetoTopLine();
      beach.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testmirrorArms()
  {
      Picture snowman = new Picture("snowman.jpg");
      snowman.explore();
      snowman.mirrorArms();
      snowman.explore();
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
  
  public static void testNegate()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.negate();
      beach.explore();
  }
  
  public static void testgreyscale()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.greyscale();
      beach.explore();
  }
  
  public static void testFixUnderwater()
  {
      Picture underwater = new Picture("water.jpg");
      underwater.explore();
      underwater.fixUnderwater();
      underwater.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testkeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testgreyscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorVerticalRighttoLeft();
    //testMirrorHorizontalToptoBottom();
    //testMirrorHorizontalBottomtoTop();
    //testmirrorDiagonalBottomLinetoTopLine();
    //testmirrorDiagonalTopLinetoBottomLine();
    testmirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}