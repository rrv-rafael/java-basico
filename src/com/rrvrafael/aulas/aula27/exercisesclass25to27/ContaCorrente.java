package com.rrvrafael.aulas.aula27.exercisesclass25to27;

public class ContaCorrente {

    String numeroConta;
    double saldo;
    boolean contaEspecial;
    double limiteEspecial;

    boolean realizarSaque(double valorSaque)
    {
        if (valorSaque <= saldo)
        {
            debitarConta(valorSaque);
            return true;
        }
        else if (contaEspecial)
        {
            if (saldo > 0)
            {
                if (valorSaque <= (limiteEspecial + saldo))
                {
                    limiteEspecial = limiteEspecial - (valorSaque - saldo);
                    debitarConta(valorSaque);
                    return true;
                }
            }
            else
            {
                if (valorSaque <= limiteEspecial)
                {
                    limiteEspecial -= valorSaque;
                    debitarConta(valorSaque);
                    return true;
                }
            }
        }

        return false;
    }

    void debitarConta(double valorSaque)
    {
        saldo -= valorSaque;
    }

    void realizarDeposito(double deposito)
    {
        saldo += deposito;

        if (deposito + limiteEspecial > 700)
        {
            limiteEspecial = 700;
        }
        else
        {
            limiteEspecial += deposito;
        }
    }

    double consultarSaldo()
    {
        return saldo;
    }

    boolean consultarStatusLimite()
    {
        return limiteEspecial < 700;
    }
}