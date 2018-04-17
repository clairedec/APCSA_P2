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
    Picture beach = new Picture("C:\\Users\\leec5854\\Desktop\\APCSA_P2\\Unit16\\pixLab\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("C:\\Users\\leec5854\\Desktop\\APCSA_P2\\Unit16\\pixLab\\images\\beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  public static void testKeepOnlyRed()
  {
	  Picture beach = new Picture("C:\\Users\\leec5854\\Desktop\\APCSA_P2\\Unit16\\pixLab\\images\\beach.jpg");
	  beach.explore();
	  beach.keepOnlyRed();
	  beach.explore();
  }
  
  public static void testKeepOnlyGreen()
  {
	  Picture beach = new Picture("C:\\Users\\leec5854\\Desktop\\APCSA_P2\\Unit16\\pixLab\\images\\beach.jpg");
	  beach.explore();
	  beach.keepOnlyGreen();
	  beach.explore();
  }
  
  public static void testNegate()
  {
	  Picture beach = new Picture("C:\\Users\\leec5854\\Desktop\\APCSA_P2\\Unit16\\pixLab\\images\\beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture beach = new Picture("C:\\Users\\leec5854\\Desktop\\APCSA_P2\\Unit16\\pixLab\\images\\beach.jpg");
	  beach.explore();
	  beach.grayScale();
	  beach.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture fish = new Picture("C:\\Users\\leec5854\\Desktop\\APCSA_P2\\Unit16\\pixLab\\images\\water.jpg");
	  fish.explore();
	  fish.fixUnderwater();
	  fish.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\leec5854\\Desktop\\APCSA_P2\\Unit16\\pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\leec5854\\Desktop\\APCSA_P2\\Unit16\\pixLab\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture arms = new Picture("C:\\Users\\leec5854\\Desktop\\APCSA_P2\\Unit16\\pixLab\\images\\snowman.jpg");
    arms.explore();
    arms.mirrorArms();
    arms.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture gull = new Picture("C:\\Users\\leec5854\\Desktop\\APCSA_P2\\Unit16\\pixLab\\images\\seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }
  
  public static void testMirrorDiagonal()
  {
    Picture beach = new Picture("C:\\Users\\leec5854\\Desktop\\APCSA_P2\\Unit16\\pixLab\\images\\beach.jpg");
    beach.explore();
    beach.mirrorDiagonal();
    beach.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:\\Users\\leec5854\\Desktop\\APCSA_P2\\Unit16\\pixLab\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCopy(Picture Pic, int begRow, int begCol)
  {
    Picture caterpillar = new Picture("C:\\Users\\leec5854\\Desktop\\APCSA_P2\\Unit16\\pixLab\\images\\caterpillar.jpg");
    caterpillar.copy(Pic, begRow, begCol);
    caterpillar.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\Users\\leec5854\\Desktop\\APCSA_P2\\Unit16\\pixLab\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    Picture caterpillar = new Picture("C:\\Users\\leec5854\\Desktop\\APCSA_P2\\Unit16\\pixLab\\images\\caterpillar.jpg");
    //testCopy(caterpillar, 30, 50);
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