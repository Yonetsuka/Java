import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController{
  @GetMapping
  public String home(){
    Pedido pedido = new Pedido();
    pedido.setNomeProduto("Big Mac");
    pedido.setUrlImagem();
    pedido.setUrlProduto();
    pedido.setUrlDescricao();
    List<Pedido> pedidos = Arrays.asList(pedido);
    model.addAttribute("pedidos", pedidos);
    return "home";
  }
}
