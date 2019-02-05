/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nbparsexml;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author scuola
 */
public class NBValidateXML {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        List libri = null;
        Parser dom = new Parser();
        try {
            libri = dom.parseDocument("Comune.xml");//nome file
        } catch (ParserConfigurationException | SAXException | IOException exception) {
            System.out.println("Errore nel file");
        }
        // iterazione della lista e visualizzazione degli oggetti
        System.out.println("Link trovati --> " + libri.size());
        
        
        
        Iterator iterator = libri.iterator();
        int count=0;
        while (iterator.hasNext()) {
            Libro l = (Libro) iterator.next();
            count++;
            System.out.println("Link numero "+String.valueOf(count)+": "+l.toStringLink());
        }

    }
   
}
