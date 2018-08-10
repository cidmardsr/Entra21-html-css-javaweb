DROP DATABASE IF EXISTS exercicio_web_00;
CREATE DATABASE IF NOT EXISTS exercicio_web_00;
USE exercicio_web_00;

CREATE TABLE alunos(

    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    codigo_da_matricula VARCHAR(7),
    nota_1 FLOAT,
    nota_2 FLOAT,
    nota_3 FLOAT,
    frequencia SMALLINT
);

INSERT INTO alunos(nome, codigo_da_matricula, nota_1, nota_2, nota_3, frequencia)

VALUES("Joao", "1", 5.7, 7, 4, 12);