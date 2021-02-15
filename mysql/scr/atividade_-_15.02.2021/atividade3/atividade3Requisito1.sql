use db_farmacia_do_bem;

insert tb_categoria (tipo, solicitacao_medica, obs) values ("Antibiotico", true,"Necessário Receita Médica" );
insert tb_categoria (tipo, solicitacao_medica, obs) values ("Medicamento", false,"Livre Comercio");
insert tb_categoria (tipo, solicitacao_medica, obs) values ("Baby", false,"Livre Comercio");
insert tb_categoria (tipo, solicitacao_medica, obs) values ("Outros", false,"Livre Comercio");