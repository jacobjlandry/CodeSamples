<?php

$firstName = "Jacob";
$lastName = "Landry";

echo hello($firstName, $lastName);

function hello(string $firstName, string $lastName): string
{
  return "Hello " . $firstName . " " . $lastName . ", how are you doing today?";
}

?>