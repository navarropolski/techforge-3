<?php

require require_once "./Classes/FormaDeBolo.php";
require require_once "./Classes/Cliente.php";

$fabio - new Cliente("Fabio", 22);
$paulo - new Cliente("Paulo", 35);

$primeiroBolo = new FormaDeBolo($fabio);
$primeiroBolo = new FormaDeBolo($paulo);
$primeiroBolo->adicionaIngredientes(["Achocolatado","Maracujá"]);
$primeiroBolo->fazerBolo();
$primeiroBolo->colocarNoForno(3);
$primeiroBolo->cliente();
$primeiroBolo->listaIngredientes();

echo "<pre>"; print_r($primeiroBolo);
echo "<pre>"; print_r($segundoBolo);

$primeiroBolo->retornaNomeCliente();
$segundoBolo->retornaNomeCliente();

// $segundoBolo = new FormaDeBolo();

// echo "<pre>"; print_r($segundoBolo);

// $primeiroBolo->transferirIngredientes("Achocolatado", $segundoBolo);

// echo "<pre>"; print_r($primeiroBolo);

// echo "<pre>"; print_r($segundoBolo);