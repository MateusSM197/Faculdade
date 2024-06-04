create database db_liveRoutine;
use db_liveRoutine;

CREATE TABLE tb_pessoa(
	id INT PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(100),
    usuario VARCHAR(30),
    senha VARCHAR(30),
    nome VARCHAR(60),
    idade INT(3),
    sexo CHAR(1),
    peso DOUBLE(3,1),
    altura DOUBLE
);

CREATE TABLE tb_habito(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30),
    descricao VARCHAR(200),
    grau INT,
    habilitado boolean
);

CREATE TABLE tb_pessoa_habito(
	fk_pessoa_id INT,
    fk_habito_id INT,
	FOREIGN KEY (fk_pessoa_id) REFERENCES tb_pessoa(id),
    FOREIGN KEY (fk_habito_id) REFERENCES tb_habito(id)
);

CREATE TABLE tb_timer(
	id INT PRIMARY KEY AUTO_INCREMENT,
    fk_habito_id INT,
    hora_toque TIME,
    FOREIGN KEY (fk_habito_id) REFERENCES tb_habito(id)
);

CREATE TABLE tb_habito_timer(
	fk_habito_id INT,
    fk_timer_id INT,
    FOREIGN KEY (fk_habito_id) REFERENCES tb_habito(id),
    FOREIGN KEY (fk_timer_id) REFERENCES tb_timer(id)
);

INSERT INTO tb_pessoa(usuario, senha, tipo, nome, idade, sexo, peso, altura) VALUES(
	'admin',
    'adminPass',
    'administrador',
    'administrador',
    '0',
    'M',
    '0',
    '0'
);

INSERT INTO tb_habito(nome, descricao, grau, habilitado) VALUES(
	'Beber água',
    'Lembrete para beber água',
    '1',
    true
);

INSERT INTO tb_timer(fk_habito_id, hora_toque) VALUES(
	'1',
	'10:00'
);

INSERT INTO tb_habito_timer(fk_habito_id, fk_timer_id) VALUES(
	'1',
    '1'
);

select * from tb_pessoa;
select * from tb_habito;
select * from tb_timer;
select * from tb_habito_timer;