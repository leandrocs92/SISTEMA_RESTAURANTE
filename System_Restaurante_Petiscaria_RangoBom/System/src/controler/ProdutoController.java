package controler;

import DAO.ProdutoDAO;
import MODEL.Produto;

public class ProdutoController {

    public static Produto buscaProdutoCod(int codigo) {
        //chamar metodo DAO
        Produto produtoBusca = ProdutoDAO.buscaProduto(codigo);
        return produtoBusca;
    }
}
