package Generation.MeuBlogPessoal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Generation.MeuBlogPessoal.Model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{
public List<Tema> findAllByDescricaoContainingIgnoreCase( String descricao);
}
