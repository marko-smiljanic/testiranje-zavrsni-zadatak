/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z3;

/**
 *
 * @author Mladen
 */
public class Procena {
    
    private Procenitelj procenitelj;
    private Procenitelj pomocnik;
    
    
    public void setProcenitelj(Procenitelj p){
        this.procenitelj = p;
    }
    
    public void setPomocnik(Procenitelj p){
        this.pomocnik = p;
    }
    
    public Procenitelj getProcenitelj(){
        return this.procenitelj;
    }
    
    public Procenitelj getPomocnik(){
        return this.pomocnik;
    }
    
    public void odrediCenu(Knjiga k){
        Knjiga p = new Knjiga("", k.getTitle(), k.getAuthor());
        procenitelj.proveriStetu(k);
        procenitelj.izvrsiProcenu(p);
        pomocnik.detaljnaAnaliza(k);
        pomocnik.detaljnaAnaliza(k);
        pomocnik.izvrsiProcenu(k);
        procenitelj.izvrsiProcenu(p);
        procenitelj.izvrsiProcenu(p);
    }
    
}
