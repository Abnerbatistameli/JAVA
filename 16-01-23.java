import Atividade1.Cliente;
import Atividade2.Funcionario;
import Atividade3.Produto;

public class Atividades123 {

    public class Cliente {

        public String nome;
        public String local;
        public String tel;
        public String cpf;
        public String endereco;

        public Cliente(String nome, String local, String tel, String cpf, String endereco) {
            this.nome = nome;
            this.local = local;
            this.tel = tel;
            this.cpf = cpf;
            this.endereco = endereco;
        }

        public void setNome(String nome){
            this.nome = nome;
        }
        public void setLocal(String local) {
            this.local = local;
        }
        public void setTel(String tel) {
            this.tel = tel;
        }
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public void visualiza() {
        }
    }

    public class TestaCliente {
        public static void main(String[] args){

            Atividade1.Cliente c1 = new Atividade1.Cliente("Abner", "Barra Mansa", "24981157684", "32443657645", "Rua Frederico");
            c1.visualiza();

            c1.setNome("Abner");
            c1.setLocal("Barra Mansa");
            c1.visualiza();


        }
    }

    public class Funcionario {

        public String nome;
        public String funcao;
        public String salario;
        public String dependente;
        public String endereco;

        public Funcionario(String nome, String funcao, String salario, String dependente, String endereco) {
            this.nome = nome;
            this.funcao = funcao;
            this.salario = salario;
            this.dependente = dependente;
            this.endereco = endereco;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setFuncao(String funcao) {
            this.funcao = funcao;
        }

        public void setSalario(String salario) {
            this.salario = salario;
        }

        public void setDependente(String dependente) {
            this.dependente = dependente;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public void visualiza() {
        }

        public class TestaFuncionario {
            public static void main(String[] args) {

                Atividade2.Funcionario c1 = new Atividade2.Funcionario("Abner", "DEV", "R$2.000,00", "Ra", "Rua Frederico");
                c1.visualiza();

                c1.setNome("Abner");
                c1.setSalario("R$2.000,00");
                c1.visualiza();


            }
        }

        public class Produto {

            public String durabilidade;
            public String classificacao;
            public String vendas;
            public String avalicoes;
            public String condicao;

            public Produto(String durabilidade, String classificacao, String vendas, String avalicoes, String condicao) {
                this.durabilidade = durabilidade;
                this.classificacao = classificacao;
                this.vendas = vendas;
                this.avalicoes = avalicoes;
                this.condicao = condicao;
            }

            public void setDurabilidade(String durabilidade) {
                this.durabilidade = durabilidade;
            }

            public void setClassificacao(String classificacao) {
                this.classificacao = classificacao;
            }

            public void setVendas(String vendas) {
                this.vendas = vendas;
            }

            public void setAvalicoes(String avalicoes) {
                this.avalicoes = avalicoes;
            }

            public void setCondicao(String condicao) {
                this.condicao = condicao;
            }

            public void visualiza() {
            }
        }

        public class TestaGame {
            public static void main(String[] args) {

                Atividade3.Produto c1 = new Atividade3.Produto("Boa", "5 estrelas", "1.000", "Excelente", "Novos");
                c1.visualiza();

                c1.setDurabilidade("Boa");
                c1.setClassificacao("5 estrelas");
                c1.visualiza();


            }
        }

    }
}
