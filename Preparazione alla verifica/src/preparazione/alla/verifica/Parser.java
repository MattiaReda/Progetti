/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparazione.alla.verifica;

/**
 *
 * @author Gianluca
 */
import java.io.IOException;
import java.util.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class Parser {

    private List tabella;
    private List ricevimenti;

    DocumentBuilderFactory factory;
    DocumentBuilder builder;
    Document document;
    Element root, element, TD;
    NodeList nodelist;
    NodeList TDlist;
    String href;

    public Parser() {
        ricevimenti = new ArrayList();
    }

    public List parseDocument(String filename)
            throws ParserConfigurationException, SAXException, IOException {

        Ricevimento libro;
        // creazione dell’albero DOM dal documento XML
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        document = builder.parse(filename);
        root = document.getDocumentElement();
        // generazione della lista degli elementi "libro"
        nodelist = root.getElementsByTagName("tr");
        if (nodelist != null && nodelist.getLength() > 3) {
            for (int i = 0; i < nodelist.getLength(); i++) {
                element = (Element) nodelist.item(i);
                
                
                
                return ricevimenti;
            }

        }
        return tabella;//<-- da sistemare
    }
    
    public void TD_Element(Element e)
    {
        NodeList TDlist = element.getElementsByTagName("td");
        
        if (TDlist != null && TDlist.getLength() > 0) {
                    for (int k = 0; k < TDlist.getLength(); k++) {
                        TD = (Element) TDlist.item(k);
                        
                    }
                }
        
    }

}
