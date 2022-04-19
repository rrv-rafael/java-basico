package com.rrvrafael.aulas.aula36;

public class TesteContato {
    public static void main(String[] args) {
        Contato contato = new Contato();
        Endereco endereco = new Endereco();
        Telefone telefone = new Telefone();
        Telefone telefone2 = new Telefone();
        Telefone[] telefones = new Telefone[2];

        contato.setNome("Rafael");

        telefone.setTipo("Celular");
        telefone.setDdd("19");
        telefone.setNumero("99214-3881");

        telefone2.setTipo("Fixo");
        telefone2.setDdd("19");
        telefone2.setNumero("3289-7352");

        telefones[0] = telefone;
        telefones[1] = telefone2;

        endereco.setNomeRua("Rua Aguinaldo dos Santos Filho");
        endereco.setCep("13082-791");
        endereco.setNumero("46");
        endereco.setCidade("Campinas");
        endereco.setEstado("São Paulo");
        endereco.setComplemento("Não possui");

        contato.setTelefones(telefones);
        contato.setEndereco(endereco);

        System.out.println("Nome: " + contato.getNome());

        System.out.println("\nEndereço:");

        if (contato.getEndereco() != null) {
            System.out.println("Rua: " + contato.getEndereco().getNomeRua());
            System.out.println("CEP: " + contato.getEndereco().getCep());
            System.out.println("Número: " + contato.getEndereco().getNumero());
            System.out.println("Cidade: " + contato.getEndereco().getCidade());
            System.out.println("Estado: " + contato.getEndereco().getEstado());
            System.out.println("Complemento: " + contato.getEndereco().getComplemento());
        } else {
            System.out.println("O endereço está nulo!");
        }

        System.out.println("\nDados telefonicos: ");

        if (contato.getTelefones() != null) {
            for (int i = 0; i < telefones.length; i++) {
                System.out.println("Tipo: " + contato.getTelefones()[i].getTipo());
                System.out.println("DDD: " + contato.getTelefones()[i].getDdd());
                System.out.println("Número: " + contato.getTelefones()[i].getNumero() + "\n");
            }

        } else {
            System.out.println("Dados telefonicos nulos!");
        }
    }
}
