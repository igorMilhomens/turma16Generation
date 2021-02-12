create database db_ecommerce_chocobyte;

use db_ecommerce_chocobyte;

create table tb_sabores(
id bigint auto_increment,
nome varchar(255) not null,
primary key(id)
);

create table tb_produtos(
id bigint auto_increment,
nome varchar (255) not null,
sabor bigint not null,
preco float not null,
estoque int not null,
primary key(id),
foreign key(sabor) references tb_sabores(id)
);

insert into tb_sabores (nome) values ("Ao leite");
insert into tb_sabores (nome) values ("Branco");
insert into tb_sabores (nome) values ("Airado");
insert into tb_sabores (nome) values ("Meio amargo");
insert into tb_sabores (nome) values ("Amargo");
insert into tb_sabores (nome) values ("Avelã");
insert into tb_sabores (nome) values ("Trufado");
insert into tb_sabores (nome) values ("Sem lactose");
insert into tb_sabores (nome) values ("Chocowhey");
insert into tb_sabores (nome) values ("Vegan");

insert into tb_produtos(nome,sabor,preco,estoque) values("Ovo de pascoa", 1, 80.99, 2000);
insert into tb_produtos(nome,sabor,preco,estoque) values("Barra de Chocolate", 7, 16.99, 10000);
insert into tb_produtos(nome,sabor,preco,estoque) values("Trufa Recheada", 1, 4.99, 9000);
insert into tb_produtos(nome,sabor,preco,estoque) values("Kit Namorados", 1, 349.99, 100);
insert into tb_produtos(nome,sabor,preco,estoque) values("Kit Desculpa Vida", 1, 499.99, 10);
insert into tb_produtos(nome,sabor,preco,estoque) values("Kit Perdão meu Amor", 1, 549.99, 10);

select * from tb_produtos;

select nome,sabor,preco from  tb_produtos where preco > 500;

select nome,sabor,preco from  tb_produtos where preco < 500;



