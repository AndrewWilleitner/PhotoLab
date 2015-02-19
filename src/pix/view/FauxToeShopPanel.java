package pix.view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;

import javax.swing.*;

import pix.controller.FauxToeShopController;
import pixLab.classes.ImageDisplay;
import pixLab.classes.Picture;

public class FauxToeShopPanel extends JPanel
{
	public FauxToeShopPanel() {
	}
	private FauxToeShopController baseController;
	
	private JComboBox<String> filterBox;
	private JComboBox<String> imageBox;
	private JScrollPane imagePane;
	private SpringLayout baseLayout;
	private String [] imageArray;
	private Picture basePicture;
	
	public FauxToeShopPanel(FauxToeShopController baseController)
	{
		this.baseController = baseController;
		
		imagePane = new JScrollPane();
		basePicture = new Picture("beach.jpg");
		baseLayout = new SpringLayout();
		
		setupPicture();
		setupComboBox();
		setupPanel();
		setupLayout();
		setListeners();
	}
	
	private void setupComboBox()
	{
		String [] filterArray = {
			    "testZeroBlue();",
			    "testKeepOnlyBlue();",
			    "testKeepOnlyRed();",
			    "testKeepOnlyGreen();",
			    "testNegate();",
			    "testGrayscale();",
			    "testFixUnderwater();",
			    "testMirrorVertical();",
			    "testMirrorVerticalRightToLeft();",
			    "testMirrorHorizontal();",
			    "testMirrorHorizontalBottomToTop();",
			    "testCheckerboardFilter();",
			    "testRotateColorFilter();",
			    "testMirrorTemple();",
			    "testMirrorArms();",
			    "testMirrorGull();",
			    "testMirrorDiagonal();",
			    "testCollage();",
			    "testCopy();",
			    "testEdgeDetection();",
			    "testEdgeDetection2();",
			    "testChromakey();",
			    "testEncodeAndDecode();",
			    "testGetCountRedOverValue(250);",
			    "testSetRedToHalfValueInTopHalf();",
			    "testClearBlueOverValue(200);",
			    "testGetAverageForColumn(0);"
		};
		
		filterBox = new JComboBox<String>(filterArray);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(filterBox);
		this.add(imagePane);
	}
	
	private void setupPicture()
	{
		BufferedImage bufferedPic = basePicture.getBufferedImage();
		ImageDisplay picDisplay = new ImageDisplay(bufferedPic);
		imagePane.setViewportView(picDisplay);
	}
	
	private void loadPicture()
	{
		basePicture = new Picture(imageArray[imageBox.getSelectedIndex()]);
		setupPicture();
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setListeners()
	{
		filterBox.addItemListener(new ItemListener()
		{
			
			@Override
			public void itemStateChanged(ItemEvent currentEvent)
			{
				if(filterBox.getSelectedIndex() == 0)
				{
					basePicture.zeroBlue();
					setupPicture();
				}
				
				if(filterBox.getSelectedIndex() == 1)
				{
					basePicture.KeepOnlyBlue();
					setupPicture();
				}
			}
		});
	}
}
