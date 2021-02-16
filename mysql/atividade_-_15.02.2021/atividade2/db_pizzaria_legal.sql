create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
tipo varchar(255) not null,
borda_recheada boolean not null,
recheio_borda varchar(255) ,
primary key(id)
);

create table tb_pizza(
id bigint auto_increment,
categoria_id bigint,
tamanho varchar(255) not null,
sabor varchar(255) not null,
preco float not null, 
entrega boolean not null,
valor_entrega float,
primary key(id),
foreign key (categoria_id) references tb_categoria(id)
);