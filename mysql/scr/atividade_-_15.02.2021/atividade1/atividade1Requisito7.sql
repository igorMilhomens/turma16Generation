use db_generation_game_online;

select  nome,tb_classe.cla,tb_classe.instrumento, nivel, poder_ataque, poder_defesa, tb_classe.habilidade 
	from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.classe_id
		where cla = "Arqueiro";