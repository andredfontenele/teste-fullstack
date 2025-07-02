-- Inserções para a tabela USUARIO (primeiro pois é referenciada pelas outras)
INSERT INTO usuarios (nome, login, senha) VALUES 
('Administrador Principal', 'admin', '$2a$10$XptVsk7JZ4Z3o.Qz8HrB5eY9L0wN7J2mY1xX6vW8cR9sT0pL1kK2'),
('Gerente de Operações', 'gerente', '$2a$10$YqtHsk7JZ4Z3o.Qz8HrB5eY9L0wN7J2mY1xX6vW8cR9sT0pL1kK2'),
('Atendente Comum', 'atendente', '$2a$10$ZrtHsk7JZ4Z3o.Qz8HrB5eY9L0wN7J2mY1xX6vW8cR9sT0pL1kK2');

-- Inserções para a tabela PLANO (referencia USUARIO)
INSERT INTO planos (nome, valor, id_usuario) VALUES 
('Plano Básico Saúde', 150.00, 1),
('Plano Familiar Plus', 320.00, 1),
('Plano Empresarial', 500.00, 2);

-- Inserções para a tabela BENEFICIARIO (referencia PLANO e USUARIO)
INSERT INTO beneficiarios (id_plano, id_usuario, nome, cpf, email, idade) VALUES 
(1, 1, 'Carlos Alberto Silva', '123.456.789-01', 'carlos.silva@email.com', 35),
(1, 1, 'Maria Oliveira Santos', '987.654.321-02', 'maria.santos@email.com', 28),
(2, 2, 'Pedro Henrique Costa', '456.123.789-03', 'pedro.costa@email.com', 42),
(3, 3, 'Ana Paula Rodrigues', '789.321.654-04', 'ana.rodrigues@email.com', 31),
(2, 1, 'João Miguel Pereira', '321.654.987-05', 'joao.pereira@email.com', 19);