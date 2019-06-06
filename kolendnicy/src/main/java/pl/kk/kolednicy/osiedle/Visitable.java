package pl.kk.kolednicy.osiedle;

import pl.kk.kolednicy.visitor.Visitor;

public interface Visitable {
	public void accept(Visitor visitor);

	//Ta metoda tutaj jest dyskusyjna...
	public boolean pukPukMogeWejsc();
}
