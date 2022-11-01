package interfaceMap;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorPagina implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Entry<String, Livro> liv1, Entry<String, Livro> liv2) {
		return liv1.getValue().getqtdPaginas().compareTo(liv2.getValue().getqtdPaginas());
	}
}
