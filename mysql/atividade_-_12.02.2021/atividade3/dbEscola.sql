create database db_servicos_escola;

use db_servicos_escola;

create table tb_turmas(
id bigint auto_increment,
nome varchar(50) not null,
primary key(id)
);

insert into tb_turmas (nome) values ("Turma 1°A");
insert into tb_turmas (nome) values ("Turma 1°B");
insert into tb_turmas (nome) values ("Turma 2°A");
insert into tb_turmas (nome) values ("Turma 2°B");
insert into tb_turmas (nome) values ("Turma 3°A");
insert into tb_turmas (nome) values ("Turma 3°B");
insert into tb_turmas (nome) values ("Turma 4°A");
insert into tb_turmas (nome) values ("Turma 4°B");

create table tb_aluno(
id bigint auto_increment,
nome varchar(100) not null,
turma bigint not null,
nota float not null,
matricula_Ativa boolean,
primary key(id),
foreign key(turma) references tb_turmas(id)
);

insert into tb_aluno (nome,turma,nota) values ("Carlos José",7,7.8);
insert into tb_aluno (nome,turma,nota) values ("Maria Conceição",5,9.4);
insert into tb_aluno (nome,turma,nota) values ("José Carlos",1,5.5);
insert into tb_aluno (nome,turma,nota) values ("Maria Antonieta",2,8.9);
insert into tb_aluno (nome,turma,nota) values ("José Eduardo",8,9.5);
insert into tb_aluno (nome,turma,nota) values ("Maria das Graças",4,6.3);

select * from tb_aluno;

select nome,nota from tb_aluno where nota > 7;
select nome,nota from tb_aluno where nota < 7;

