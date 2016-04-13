package parsing;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class Parser {
	
	public static void main(String[] args) {
		ParserAbout gui = new ParserAbout("XML-парсер");
		gui.setVisible(true);
		gui.setSize(360, 245);
		gui.setResizable(false);
		gui.setLocationRelativeTo(null);
				
	}
	public static void parsing(){
		Err error = new Err("");
		JFileChooser fileopen = new JFileChooser();
		int ret = fileopen.showDialog(null, "Открыть файл");
		
//Filter file extension
		
		if (ret == JFileChooser.APPROVE_OPTION) {
		File file = fileopen.getSelectedFile();
			if (file.getName().indexOf("xml") == -1){
				error.setVisible(true);
				error.setSize(160, 90);
				error.setResizable(false);
				error.setLocationRelativeTo(null);
				
				}		
			
//Parser properly
						
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			f.setValidating(false);
			DocumentBuilder builder;
			try {
				
				builder = f.newDocumentBuilder();
				Document doc = builder.parse(file);
				Element root = doc.getDocumentElement();
				NodeList methodNodes = root.getChildNodes();
				for(int i=0; i<methodNodes.getLength();i++ )
				
		    		methodNodes.item(i).getNodeName();
		    		Node el = root.getFirstChild();    		
		    		while(el!=null) {			    			
		    			System.out.print(el.getTextContent());		    			
		    			el = el.getNextSibling();
		      		  }
		    		
			} catch (ParserConfigurationException e) {
					e.printStackTrace();
			} catch (SAXException e) {				
					e.printStackTrace();
			} catch (IOException e) {
					e.printStackTrace();
			}			
		}		
	}		
}	
	


