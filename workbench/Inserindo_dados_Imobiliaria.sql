insert into Imobiliaria.Condominio values
	(1, "CL","Shopping Legal", "Tim Maia", "41999999999", "Rua da Paz", "Centro", "35");
    
insert into Imobiliaria.Condominio(idCondominio, sigla, nome) values
	(2, "SML", "Shopping Muito Legal");
    
insert into Imobiliaria.Condominio(idCondominio, sigla, nome) values
	(3, "SHL", "Shopping Hiper Legal"),
    (4, "SSL", "Shopping Super Legal");
    
insert into Imobiliaria.Cliente values
	(3, "John Snow", "05555555555"),
    (4, "Bob Esponja", "055554433"),
    (5, "John Wick", "33442211");

insert into Imobiliaria.Contrato(idContrato, valor, idCliente) values
	(2, 500.00, 3), (3, 500.00, 5), (4, 500.00, 4);
    
insert into Imobiliaria.Contrato(idContrato, valor, idCliente) values
	(55, 50.00, 20);