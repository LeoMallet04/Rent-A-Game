-- CLIENTES BASE (tabela mãe)
INSERT INTO CLIENTE_ENTITY (numero, nome, endereco) VALUES (1, 'João da Silva', 'Rua A');
INSERT INTO CLIENTE_ENTITY (numero, nome, endereco) VALUES (2, 'Maria Souza', 'Rua B');
INSERT INTO CLIENTE_ENTITY (numero, nome, endereco) VALUES (3, 'TechCorp', 'Av. Central');
INSERT INTO CLIENTE_ENTITY (numero, nome, endereco) VALUES (4, 'Games Ltda', 'Rua XPTO');
INSERT INTO CLIENTE_ENTITY (numero, nome, endereco) VALUES (5, 'Carlos Alberto', 'Rua C');

-- CLIENTES INDIVIDUAIS
INSERT INTO INDIVIDUAL_ENTITY (numero, cpf) VALUES (1, '11111111111');
INSERT INTO INDIVIDUAL_ENTITY (numero, cpf) VALUES (2, '22222222222');
INSERT INTO INDIVIDUAL_ENTITY (numero, cpf) VALUES (5, '33333333333');

-- CLIENTES EMPRESARIAIS
INSERT INTO EMPRESARIAL_ENTITY (numero, nome_fantasia, cnpj)
VALUES (12, 'TechCorp Ltda', '12345678000100');

INSERT INTO EMPRESARIAL_ENTITY (numero, nome_fantasia, cnpj)
VALUES (10, 'Games Brasil', '98765432000199');
