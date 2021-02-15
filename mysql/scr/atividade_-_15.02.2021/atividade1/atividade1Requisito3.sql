use db_generation_game_online;

select nome,tb_classe.cla,tb_classe.instrumento, nivel, poder_ataque 
	from tb_personagem left join tb_classe on tb_classe.id = tb_personagem.classe_id 
		where poder_ataque > 2000 ;