use db_pizzaria_legal;

insert tb_pizza(categoria_id,tamanho,sabor,preco,entrega) values (1, "Grande", "Portuguesa", 39.99,false);
insert tb_pizza(categoria_id,tamanho,sabor,preco,entrega, valor_entrega) values (2, "Grande", "Calabresa", 49.99,true,7.99);
insert tb_pizza(categoria_id,tamanho,sabor,preco,entrega) values (3, "Media", "Bahiana", 39.99,false);
insert tb_pizza(categoria_id,tamanho,sabor,preco,entrega,valor_entrega) values (1, "Media", "4 Queijos", 29.99,true, 8.99);
insert tb_pizza(categoria_id,tamanho,sabor,preco,entrega) values (4, "Pequena", "Camarão", 29.99,false);
insert tb_pizza(categoria_id,tamanho,sabor,preco,entrega) values (1, "Pequena", "Mussarela", 19.99,false);
insert tb_pizza(categoria_id,tamanho,sabor,preco,entrega,valor_entrega) values (5, "Media", "Chocolate", 29.99,true, 9.99);
insert tb_pizza(categoria_id,tamanho,sabor,preco,entrega) values (6, "Media", "Morango", 39.99,false);
insert tb_pizza(categoria_id,tamanho,sabor,preco,entrega,valor_entrega) values (7, "Grande", "Morango c/ Chocolate", 49.99,true,0);