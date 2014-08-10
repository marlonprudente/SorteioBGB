/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package blindguardianbrasil.com.br;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Marlon Prudente
 */
public class Sorteio {
    private int numeropart;
    private int numerovenc;
    private List<Integer> possiveis = new ArrayList<Integer>();
       
    
    public Sorteio(int p, int v){
        this.numeropart = p;
        this.numerovenc = v;
           for (int i = 0; i < p; i++) {
           possiveis.add(i);
           }
           Collections.shuffle(possiveis);
    }  
       
    
    public Integer GetVencedor() {
        
        Integer vencedor = null;
        for (int i = 0; i < numerovenc; i++) {
        vencedor =  possiveis.get(i);
        }

        return vencedor;
    }    



}
