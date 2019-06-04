package pl.kk.gpw;

import com.sun.org.apache.bcel.internal.generic.ALOAD;

import java.util.ArrayList;
import java.util.Iterator;

public class TikGenerator implements Iterable<Tik> {
	
	private int numberOfTicksToGenerate = 0;
	private String tickName;

	public TikGenerator(String tickName, int numberOfTicksToGenerate) {
		super();
		this.tickName = tickName;
		this.numberOfTicksToGenerate = numberOfTicksToGenerate;
	}

	@Override
	public Iterator<Tik> iterator() {

		return new Iterator<Tik>() {
			int current = 0;

			public Tik next() {
				current++;
				return new Tik(tickName, Math.random() * 100);
			}

			public boolean hasNext() {
				return current < numberOfTicksToGenerate;
			}
		};
	}

	public static void main(String[] args) {

		TikGenerator generator = new TikGenerator("FIS", 5);
		for (Tik tik : generator) {
			System.out.println(tik);
		}
		// Wersja z lambdami...
		generator.forEach(t -> System.out.println(t));
        // Wersja z consumerem
		generator.forEach(System.out::println);
		
	}
}
