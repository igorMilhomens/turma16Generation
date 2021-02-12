create database db_servicos_rh;

use db_servicos_rh;

create table tb_informacoes_funcionarios(
id bigint auto_increment,
nome varchar(255) not null,
idade int not null,
salario float not null,
matricula int not null,
primary key(id)
);

insert into tb_informacoes_funcionarios (nome, idade, salario, matricula) values ("Maria", 40, 5700.90, 87);
insert into tb_informacoes_funcionarios (nome, idade, salario, matricula) values ("João", 43, 4010.50, 988);
insert into tb_informacoes_funcionarios (nome, idade, salario, matricula) values ("Mariana", 35, 1080.88, 989);
insert into tb_informacoes_funcionarios (nome, idade, salario, matricula) values ("José", 37, 1589.90, 990);
insert into tb_informacoes_funcionarios (nome, idade, salario, matricula) values ("Penha", 47, 3350.70, 991);

select * from tb_informacoes_funcionarios;

select nome,salario from  tb_informacoes_funcionarios where salario > 2000;

select nome,salario from  tb_informacoes_funcionarios where salario < 2000;

