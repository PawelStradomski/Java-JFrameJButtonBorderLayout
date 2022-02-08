
package jframe.jbutton;
/**
 * author pawelstradomski
 */
import javax.swing.*;
import java.awt.*;

public class JFrameJButton extends JFrame
{

    public JFrameJButton() 
    {
        super("uklad graficzny - Layout");
        
        this.setBounds(600, 300, 400, 400);
        
        initComponent();
        
//        this.pack();                                     //kompensuje wielkosc/Size okna i componentow i ustawia componenty
        
        this.setDefaultCloseOperation(3);
            
    }
    public void initComponent()                                 //metoda w ktorej dodajemy/inicjalizujemy komponenty
    {
        centrum = new JButton("jestem w centrum");              //centrum przypisujemy nowy obiekt "new JButton"
        gora = new JButton("jestem na gorze");
        dol = new JButton("jestem na dole");
        prawa = new JButton("jestem po prawej");
        lewa = new JButton("jestem po lewej");
        
        Container kontener = this.getContentPane();             //pobieramy szybke i przypisujemy do kontenera
        
        kontener.add(centrum, BorderLayout.CENTER);             //dodajemy przycisk do kontenera, menedzer ukl.graf.Center
        kontener.add(gora,BorderLayout.PAGE_START);             //BorderLayout - uklad obramowania, granica ukl.graf
        kontener.add(dol, BorderLayout.PAGE_END);
        kontener.add(prawa, BorderLayout.LINE_END);
        kontener.add(lewa, BorderLayout.LINE_START);
        
        //inny sposob:
//        this.getContentPane().add(new JButton("jestem nowy"), BorderLayout.CENTER);
        
        //Przyklad pozycjonowania absolutnego komponentow tzn gdzie zapiszemy tam bedzie na stale np component "centrum"
        
//        kontener.setLayout(null);                           //null - usunelismy/wyzerowalismy menedzera ukl.graficznych powyzej
//        kontener.add(centrum);
//        centrum.setLocation(150, 150);   
//        centrum.setSize(centrum.getPreferredSize());       //centrum.getPrefferedSize - ustawia optymalna wielkosc przycisku
    }
    
    JButton centrum;                   //utworzenie zmiennej kl. JButton o nazwie np "centrum" - odwolanie do obiektu JButton
    JButton gora;
    JButton dol;
    JButton prawa;
    JButton lewa;
    
    public static void main(String[] args) {
        
        new JFrameJButton().setVisible(true);
    
        
    }
    
}
