use db_pizzaria_legal;

select  sabor, tb_categoria.tipo, tb_categoria.borda_recheada, tb_categoria.recheio_borda, tamanho, preco
	from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id ;