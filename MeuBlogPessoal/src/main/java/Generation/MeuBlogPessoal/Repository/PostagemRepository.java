package Generation.MeuBlogPessoal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Generation.MeuBlogPessoal.Model.Postagem;




@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	public List<Postagem>findAllByTituloContainingIgnoreCase (String titulo);

}
