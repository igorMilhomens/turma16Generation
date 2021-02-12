use db_servicos_rh;

select * from tb_informacoes_funcionarios;

-- atualizando salario da  Mariana;
update tb_informacoes_funcionarios set salario =  1950.80 where id = 3;

select * from tb_informacoes_funcionarios;
