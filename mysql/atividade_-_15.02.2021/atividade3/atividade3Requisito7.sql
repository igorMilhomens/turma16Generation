use db_farmacia_do_bem;

select  nome, tb_categoria.tipo, tb_categoria.obs, preco, entrega, valor_entrega
	from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
    where tb_categoria.obs = "Livre Comercio";