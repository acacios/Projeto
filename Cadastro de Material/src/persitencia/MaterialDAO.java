package persitencia;

import java.util.ArrayList;
import java.util.List;

import modelo.Material;

public class MaterialDAO {
	private static int CONT = 1;
	private static List<Material> LISTA = new ArrayList<Material>();

	public void salvar(Material mat){
	mat.setId(CONT++);
		LISTA.add(mat);

	
	}

	public List<Material> listar() {
		return LISTA;
		
	}

	public Material getByID(int id) {
		for (Material m : LISTA) {
			if (m.getId() == id) {
				return m;
			}
		}
		return new Material();
	}

	public void editar(Material material) {
		ArrayList<Material> _lista = new ArrayList<Material>();
		for (Material mat : LISTA) {
			if (mat.getId() == material.getId()) {
				_lista.add(material);
			} else
				_lista.add(mat);
		}
		LISTA.clear();
		LISTA.addAll(_lista);

	}

	public void excluir(int id) {
		ArrayList<Material> _lista = new ArrayList<Material>();
		for (Material mono : LISTA) {
			if (mono.getId() == id) {
				continue;
			} else
				_lista.add(mono);
		}
		LISTA.clear();
		LISTA.addAll(_lista);
	}

}
