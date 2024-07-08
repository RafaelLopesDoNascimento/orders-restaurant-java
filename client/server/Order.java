package client.server;

import java.util.ArrayList;
import java.util.List;

import entities.Menu;

public class Order {
	private Menu item;
	private Double itemValue;
	
	List<Menu> listMenu = new ArrayList<Menu>();
	public Order() {
		
	}
	public Order(Menu item, Double itemValue) {
		this.item = item;
		this.itemValue = itemValue;
	}
	
	public Menu getItem() {
		return item;
	}
	public void setItem(Menu item) {
		this.item = item;
		
	}
	public Double getItemValue() {
		return itemValue;
	}
	public void setItemValue(Double itemValue) {
		this.itemValue = itemValue;
	}
	
	public List<Menu> ListMenu() {
		listMenu.add(Menu.BACALHAU_A_BRAS);
		listMenu.add(Menu.BIFE_A_PARMEGIANA);
		listMenu.add(Menu.CARNE_DE_PANELA_COM_BATATAS);
		listMenu.add(Menu.CEVICHE);
		listMenu.add(Menu.ESCONDIDINHO_DE_CARNE_SECA);
		listMenu.add(Menu.FEIJOADA);
		listMenu.add(Menu.FRANGO_A_MILANESA);
		listMenu.add(Menu.FRANGO_GRELHADO_COM_LEGUMES);
		listMenu.add(Menu.HAMBURGUER_COM_BATATAS_FRITAS);
		listMenu.add(Menu.LASANHA_A_BOLONHESA);
		listMenu.add(Menu.MOQUECA_DE_PEIXE);
		listMenu.add(Menu.PAELLA);
		listMenu.add(Menu.PIZZA_MARGHERITA);
		listMenu.add(Menu.POLPETONE_RECHEADO);
		listMenu.add(Menu.RISOTO_DE_CAMARAO);
		listMenu.add(Menu.SALMAO_GRELHADO);
		listMenu.add(Menu.SPAGHETTI_AO_ALHO_E_OLEO);
		listMenu.add(Menu.STROGONOFF_DE_FRANGO);
		listMenu.add(Menu.SUSHI_VARIADO);
		listMenu.add(Menu.TACOS_MEXICANOS);
		
		return listMenu;
	}
	
}
