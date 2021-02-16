use db_cidade_das_carnes;

select nome,tb_categoria.descricao,preco  from tb_produtos inner join tb_categoria
	on tb_categoria.id = tb_produtos.categoria_id
		where tb_categoria.descricao = "Aves" ;