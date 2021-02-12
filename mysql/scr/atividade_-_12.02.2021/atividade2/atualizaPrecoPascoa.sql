use db_ecommerce_chocobyte;

select * from tb_produtos;

-- atualizando Preço promocional de Pascoa;
update tb_produtos set preco =  49.95 where id = 1;

select * from tb_produtos;