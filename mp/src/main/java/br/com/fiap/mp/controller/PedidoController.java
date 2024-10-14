package br.com.fiap.mp.controller;
import br.com.fiap.mp.model.dto.RequisicaoNovoPedido;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/pedido")
public class PedidoController{

  @Autowired
  private PedidoRepository pedidoRepository;

  @GetMapping("/formulario")
  public ModelAndView formulario(){
    ModelAndView mv = new ModelAndView("pedido/formulario");
    return mv;
  }

  @PostMapping("novo")
  public ModelAndView novo(RequisicaoNovoPedido requisicao){
    Pedido pedido = new Pedido(requisicao);
    pedidoRepository.save(pedido);
    ModelAndView mv = new ModelAndView("redirect:/home");
    return mv;
  }

  public Pedido(){
    
  }
  public Pedido(RequisicaoNovoPedido requisicao){
    this.nomeProduto = requisicao.nomeProduto();
    this.urlProduto = requisicao.urlProduto();
    this.urlImagem = requisicao.urlImagem();
    this.descricao = requisicao.descricao();
  }
}
