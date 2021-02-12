use db_servicos_escola;

select * from tb_aluno;

-- Atualizando status das matriculas
update tb_aluno set matricula_Ativa =  true where id = 1;
update tb_aluno set matricula_Ativa =  true where id = 2;
update tb_aluno set matricula_Ativa =  true where id = 3;
update tb_aluno set matricula_Ativa =  true where id = 4;
update tb_aluno set matricula_Ativa =  true where id = 5;
update tb_aluno set matricula_Ativa =  true where id = 6;

select * from tb_aluno;
