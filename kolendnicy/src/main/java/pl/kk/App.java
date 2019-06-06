package pl.kk;

import pl.kk.kolednicy.osiedle.Osiedle;
import pl.kk.kolednicy.visitor.Jechowy;
import pl.kk.kolednicy.visitor.Kominiarz;
import pl.kk.kolednicy.visitor.Ksiadz;
import pl.kk.kolednicy.visitor.Visitor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Kolendowanie czas zacząć" );
        Osiedle osiedle = new Osiedle();

        Visitor visitor = new Ksiadz();
        osiedle.accept(visitor);
        visitor.printStats();

        visitor=new Kominiarz();
        osiedle.accept(visitor);
        visitor.printStats();

        visitor=new Jechowy();
        osiedle.accept(visitor);
        visitor.printStats();
    }
}
