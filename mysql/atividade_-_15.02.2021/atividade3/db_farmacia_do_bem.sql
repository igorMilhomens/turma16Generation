create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment,
tipo varchar(255) not null,
solicitacao_medica boolean not null,
obs varchar(255) ,
primary key(id)
);

create table tb_produto(
id bigint auto_increment,
categoria_id bigint,
nome varchar(255) not null,
preco float not null, 
entrega boolean not null,
valor_entrega float,
primary key(id),
foreign key (categoria_id) references tb_categoria(id)
);