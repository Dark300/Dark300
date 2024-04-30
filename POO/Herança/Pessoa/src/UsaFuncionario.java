public class UsaFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Pedro");
        funcionario.setRg("66.666.666-x");
        funcionario.setCartao("RH845");
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getRg());
        System.out.println(funcionario.getCartao());

    }


}
