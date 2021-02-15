create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
id bigint auto_increment,
cla varchar(255) not null,
instrumento varchar(255) not null,
vestimenta varchar(255) not null,
habilidade varchar(255) not null,
primary key(id)
);

create table tb_personagem (
id bigint auto_increment,
nome varchar(255) not null,
nivel int  not null,
sexo varchar(9),
classe_id bigint not null,
poder_ataque int ,
poder_defesa int ,
primary key(id),
foreign key (classe_id) references tb_classe(id)
);