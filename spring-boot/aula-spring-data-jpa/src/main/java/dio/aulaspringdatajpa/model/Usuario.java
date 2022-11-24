package dio.aulaspringdatajpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tab_usuario")
public class Usuario {
    @Id  //define que esse é meu id de identificação única dessa entidade
    @GeneratedValue(strategy =  GenerationType.IDENTITY)  //define que a cada inserção de usuário, o banco irá criar IDs de forma automática por incremento
    @Column(name = "id_usuario") //define que o nome da coluna no banco para o atributo 'id' será 'id_usuario'
                                // caso não tenha definição, a coluna no banco tem o mesmo nome do atributo
    private Integer id;

    @Column(length = 50, nullable = false) //o tamanho máximo da coluna nome do banco de dados é de 50 caracteres e não permire valores nulos
    private String nome;

    @Column(length = 20, nullable = false)
    private String usuario;

    @Column(length = 100, nullable = false)
    private String senha;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + ", usuario=" + usuario + ", senha=" + senha + "]";
    }
    
}
