package Generation.MeuBlogPessoal.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Generation.MeuBlogPessoal.Model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public List<Usuario> findAllByNomeContainingIgnoreCase (String nome);
	public Optional<Usuario> findByUsuarioAndSenha(String usuario, String senha);
	public Optional<Usuario> findByUsuario(String usuario);
	
}
