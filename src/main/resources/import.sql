-- Inserindo projetos
INSERT INTO tb_project (id, name, description, start_date, end_date) VALUES (1, 'Projeto Alpha', 'Projeto para desenvolvimento do sistema Alpha.', '2024-01-01', '2024-12-31');
INSERT INTO tb_project (id, name, description, start_date, end_date) VALUES (2, 'Projeto Beta', 'Projeto para implementação do sistema Beta.', '2024-02-01', '2024-11-30');

-- Inserindo tarefas
INSERT INTO tb_task (id, name, description, status, created_date, completed_date, project_id) VALUES (1, 'Tarefa 1', 'Desenvolvimento do módulo de autenticação.', 'Pendente', '2024-01-15', NULL, 1);
INSERT INTO tb_task (id, name, description, status, created_date, completed_date, project_id) VALUES (2, 'Tarefa 2', 'Implementação da interface do usuário.', 'Em Progresso', '2024-02-01', NULL, 1);
INSERT INTO tb_task (id, name, description, status, created_date, completed_date, project_id) VALUES (3, 'Tarefa 3', 'Teste de integração.', 'Concluída', '2024-03-01', '2024-03-15', 1);
INSERT INTO tb_task (id, name, description, status, created_date, completed_date, project_id) VALUES (4, 'Tarefa 4', 'Desenvolvimento do backend.', 'Pendente', '2024-02-15', NULL, 2);
INSERT INTO tb_task (id, name, description, status, created_date, completed_date, project_id) VALUES (5, 'Tarefa 5', 'Configuração do banco de dados.', 'Em Progresso', '2024-03-01', NULL, 2);
