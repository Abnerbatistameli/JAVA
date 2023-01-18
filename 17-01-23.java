package Atividade1;

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
    public int getNome() {
        return getNome();
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getLocal() {
        return getLocal();
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public int getTel() {
        return getTel();
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public int getCpf() {
        return getCpf();
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getEndereco() {
        return getEndereco();
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void visualiza() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Local: " + this.local);
        System.out.println("Tel: " + this.tel);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereco: " + this.endereco);

    }

public class PessoaFisica extends Cliente{
        public String nome;
        public String local;
        public String tel;
        public String cpf;
        public String endereco;
        private String sobrenome;

        public PessoaFisica(String nome, String local, String tel, String cpf, String endereco, String sobrenome) {
            super(nome, local, tel, cpf, endereco);
            this.nome = nome;
            this.local = local;
            this.tel = tel;
            this.cpf = cpf;
            this.endereco = endereco;
            this.sobrenome = sobrenome;
        }

        public int getNome() {
            return getNome();
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        public int getLocal() {
            return getLocal();
        }
        public void setLocal(String local) {
            this.local = local;
        }
        public int getTel() {
            return getTel();
        }
        public void setTel(String tel) {
            this.tel = tel;
        }
        public int getCpf() {
            return getCpf();
        }
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        public int getEndereco() {
            return getEndereco();
        }
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
        public void getSobrenome(){
            getSobrenome();
        }
        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }

        public void visualiza() {
            System.out.println("Nome: " + this.nome);
            System.out.println("Local: " + this.local);
            System.out.println("Tel: " + this.tel);
            System.out.println("CPF: " + this.cpf);
            System.out.println("Endereco: " + this.endereco);

        }

public class PessoaJuridica extends Cliente {
        public String nome;
        public String local;
        public String tel;
        public String cpf;
        public String endereco;
        private String sobrenome;
        private String capital;

        public PessoaJuridica(String nome, String local, String tel, String cpf, String endereco, String sobrenome, String capital) {
            super(nome, local, tel, cpf, endereco);
            this.nome = nome;
            this.local = local;
            this.tel = tel;
            this.cpf = cpf;
            this.endereco = endereco;
            this.sobrenome = sobrenome;
            this.capital = capital;
        }

        public int getNome() {
            return getNome();
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        public int getLocal() {
            return getLocal();
        }
        public void setLocal(String local) {
            this.local = local;
        }
        public int getTel() {
            return getTel();
        }
        public void setTel(String tel) {
            this.tel = tel;
        }
        public int getCpf() {
            return getCpf();
        }
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        public int getEndereco() {
            return getEndereco();
        }
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
        public void getSobrenome(){
            getSobrenome();
        }
        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }
        public void getCapital(){
            getCapital();
        }
        public void setCapital(String capital) {
            this.capital = capital;
        }

        public void visualiza() {
            System.out.println("Nome: " + this.nome);
            System.out.println("Local: " + this.local);
            System.out.println("Tel: " + this.tel);
            System.out.println("CPF: " + this.cpf);
            System.out.println("Endereco: " + this.endereco);
            System.out.println("Capital: " + this.capital);

        }

public class TestaCliente {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Abner", "Barra Mansa", "24981157684", "32443657645", "Rua Frederico");
        c1.visualiza();

        c1.setNome("Abner");
        c1.setLocal("Barra Mansa");
        c1.visualiza();

        Atividade1.PessoaFisica c2 = new Atividade1.PessoaFisica("Abner", "Barra Mansa", "24981157684", "32443657645", "Rua Frederico", "Batista");
        c2.visualiza();

        Atividade1.PessoaJuridica c3 = new Atividade1.PessoaJuridica("Abner", "Barra Mansa", "24981157684", "32443657645", "Rua Frederico", "Batista", "30.000");
        c3.visualiza();

    }

}
}