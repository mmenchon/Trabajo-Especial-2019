import java.util.Comparator;

public class OrdenRanking implements Comparator<Vecino> {

	@Override
	public int compare(Vecino o1, Vecino o2) {
		if(o1.getPuntaje() <= o2.getPuntaje())
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}
