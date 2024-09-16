<?php

class FormaDeBolo
{
    private array $ingredientes = ["leite","ovo","Manteiga","Fermento"];
    private int $tempoForno = 1;

    public function __construct(private Cliente $cliente)
    {

    }

    public function retornaNomeCliente()
    {
        return $this->cliente->cliente();
    }

    public function listaIngredientes()
    {
        echo json_encode($this->ingredientes) . "<br>";
    }

    public function fazerBolo()
    {
        $this->misturarIngredientes();
    }
    public function misturarIngredientes()
    {
        echo '<pre>';print_r($this->ingredientes);exit;
        if(count($this->ingredientes) === 0) {
            echo "Não temos ingredientes suficientes <br>";
            return;
        }
    
        echo "Misturando os ingredientes" . json_encode($this->ingredientes) . "<br>";
    }
    
    public function colocarNoForno(int $tempoForno = 1)
    {
        $this->tempoForno = $tempoForno;
        echo "Colocando no forno o bolo, tempo para ficar pronto é de $this->tempoForno horas <br>";
    }

    public function adicionaIngredientes(array $novosIngredientes)
    {
        foreach($novosIngredientes as $ingrediente)
        {
            array_push($this->ingredientes, $ingrediente);
        }
        echo "Ingredientes adicionados com sucesso <br>";
    }

    public function transferirIngredientes(string $ingrediente, FormaDeBolo $boloAReceberIngrediente)
    {

    }
}