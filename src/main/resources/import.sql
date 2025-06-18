-- =======================
-- CLIENTES
-- =======================

-- João da Silva - Cliente Individual
INSERT INTO cliente (numero, nome, endereco, cpf) VALUES (1, 'João da Silva', 'Rua A, 100', '11111111111');

-- Maria Souza - Cliente Individual
INSERT INTO cliente (numero, nome, endereco, cpf) VALUES (2, 'Maria Souza', 'Rua B, 200', '22222222222');

-- TechCorp - Cliente Empresarial
INSERT INTO cliente (numero, nome, endereco, nome_fantasia, cnpj) VALUES (3, 'TechCorp', 'Av. Central, 500', 'TechCorp Ltda', '12345678000100');

-- Games LTDA - Cliente Empresarial
INSERT INTO cliente (numero, nome, endereco, nome_fantasia, cnpj) VALUES (4, 'Games LTDA', 'Rua XPTO, 123', 'Games Brasil', '98765432000199');

-- =======================
-- JOGOS
-- =======================

-- Banco Imobiliário - Jogo de Mesa
INSERT INTO jogo (codigo, nome, valor_base, tipo, numero_pecas) VALUES (10, 'Banco Imobiliário', 50.0, 'TABULEIRO', 100);

-- PlayStation 5 - Jogo Eletrônico
INSERT INTO jogo (codigo, nome, valor_base, plataforma, tipo) VALUES (11, 'Far Cry 5', 120.0, 'PS5', 'AVENTURA');

-- =======================
-- ALUGUEIS
-- =======================

INSERT INTO aluguel (identificador, data_inicial, periodo, numero_cliente, codigo_jogo) VALUES (1, '2025-06-16', 7, 1, 10);

INSERT INTO aluguel (identificador, data_inicial, periodo, numero_cliente, codigo_jogo) VALUES (2, '2025-06-17', 5, 1, 11);