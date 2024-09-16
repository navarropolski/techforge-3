<?php

class Cliente{
    public function __construct(
        private string $nome,
        private int $idade)
    {
        
    }

    public function cliente()
    {
        echo "O nome do cliente desse bolo é: " . $this->nome . "<br>";
        echo "Esse cliente tem " . $this->$idade . "anos de idade <br>";
    }
}