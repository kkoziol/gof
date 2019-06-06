package pl.kk.kolednicy.visitor;


import pl.kk.kolednicy.osiedle.*;

public interface Visitor {
	public void visit(Mieszkanie mieszkanie);
	public void visit(Dom dom);
	public void visit(Apartament apartament);
	public void visit(Blok blok);
    public void visit(Osiedle osiedle);

    //ta ciekawa, nie koniecznie zgodna z GOF
    public void visit(Visitable visitable);

    //ta ok?
    public void printStats();
}
