package controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import modelo.Material;
import persitencia.MaterialDAO;

@RequestScoped
@ManagedBean 
public class MaterialControler {

	// campos do formularios
	private Material material = new Material();

		private DataModel<Material> materiais = new ListDataModel<Material>();

	private MaterialDAO dao = new MaterialDAO();

	// a?oes da p‡gina
	public String salvar() {
		dao.salvar(material);
		material = new Material();
		return "lista";
	}

	public String mostraFormEditar() {
		material = materiais.getRowData();
		return "editar";
	}

	public String gravaEdicao() {
		dao.editar(material);
		material = new Material();
		return "lista";
	}

	public String excluir() {
		material = materiais.getRowData();
		dao.excluir(material.getId());
		material = new Material();
		return "lista";
	}

	// gets e sets. afinal isso Ž um bean!
	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public DataModel<Material> getMateriais() {
		materiais = new ListDataModel<Material>(dao.listar());
		return materiais;
	}

	public void setMateriais(DataModel<Material> Materiais) {
		this.materiais = Materiais;
	}

}
